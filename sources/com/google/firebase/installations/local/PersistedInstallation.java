package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PersistedInstallation {
    private File dataFile;
    private final FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    private File getDataFile() {
        if (this.dataFile == null) {
            synchronized (this) {
                try {
                    if (this.dataFile == null) {
                        this.dataFile = new File(this.firebaseApp.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.firebaseApp.getPersistenceKey() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.dataFile;
    }

    private JSONObject readJSONFromFile() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(getDataFile());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put("Status", persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.getAuthToken());
            jSONObject.put("RefreshToken", persistedInstallationEntry.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put("FisError", persistedInstallationEntry.getFisError());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(getDataFile())) {
            return persistedInstallationEntry;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject readJSONFromFile = readJSONFromFile();
        String optString = readJSONFromFile.optString("Fid", null);
        int optInt = readJSONFromFile.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = readJSONFromFile.optString("AuthToken", null);
        String optString3 = readJSONFromFile.optString("RefreshToken", null);
        long optLong = readJSONFromFile.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = readJSONFromFile.optLong("ExpiresInSecs", 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(readJSONFromFile.optString("FisError", null)).build();
    }
}
