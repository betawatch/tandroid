package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class MetaDataStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    public void writeUserData(String str, String str2) {
        String userIdToJson;
        BufferedWriter bufferedWriter;
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                userIdToJson = userIdToJson(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(userIdToJson);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Logger.getLogger().w("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String readUserId(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream2 = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            Logger.getLogger().d("No userId set for session " + str);
            safeDeleteCorruptFile(userDataFileForSession);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(userDataFileForSession);
            try {
                try {
                    String jsonToUserId = jsonToUserId(CommonUtils.streamToString(fileInputStream));
                    Logger.getLogger().d("Loaded userId " + jsonToUserId + " for session " + str);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return jsonToUserId;
                } catch (Exception e) {
                    e = e;
                    Logger.getLogger().w("Error deserializing user metadata.", e);
                    safeDeleteCorruptFile(userDataFileForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map map) {
        writeKeyData(str, map, false);
    }

    public void writeKeyData(String str, Map map, boolean z) {
        String keysDataToJson;
        BufferedWriter bufferedWriter;
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                keysDataToJson = keysDataToJson(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), UTF_8));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(keysDataToJson);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Logger.getLogger().w("Error serializing key/value metadata.", e);
            safeDeleteCorruptFile(internalKeysFileForSession);
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    Map readKeyData(String str, boolean z) {
        FileInputStream fileInputStream;
        Exception e;
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (internalKeysFileForSession.exists()) {
            ?? length = internalKeysFileForSession.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(internalKeysFileForSession);
                        try {
                            Map jsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream));
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return jsonToKeysData;
                        } catch (Exception e2) {
                            e = e2;
                            Logger.getLogger().w("Error deserializing user metadata.", e);
                            safeDeleteCorruptFile(internalKeysFileForSession);
                            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        CommonUtils.closeOrLog(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e3) {
                    fileInputStream = null;
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.closeOrLog(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        safeDeleteCorruptFile(internalKeysFileForSession);
        return Collections.EMPTY_MAP;
    }

    public List readRolloutsState(String str) {
        FileInputStream fileInputStream;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(rolloutsStateForSession);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List jsonToRolloutsState = jsonToRolloutsState(CommonUtils.streamToString(fileInputStream));
            Logger.getLogger().d("Loaded rollouts state:\n" + jsonToRolloutsState + "\nfor session " + str);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
            return jsonToRolloutsState;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            Logger.getLogger().w("Error deserializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void writeRolloutState(String str, List list) {
        String rolloutsStateToJson;
        BufferedWriter bufferedWriter;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                rolloutsStateToJson = rolloutsStateToJson(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), UTF_8));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(rolloutsStateToJson);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Logger.getLogger().w("Error serializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public File getUserDataFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "user-data");
    }

    public File getKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "keys");
    }

    public File getInternalKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "internal-keys");
    }

    public File getRolloutsStateForSession(String str) {
        return this.fileStore.getSessionFile(str, "rollouts-state");
    }

    private String jsonToUserId(String str) {
        return valueOrNull(new JSONObject(str), "userId");
    }

    private static String userIdToJson(String str) {
        return new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1
            final /* synthetic */ String val$userId;

            {
                this.val$userId = str;
                put("userId", str);
            }
        }.toString();
    }

    private static Map jsonToKeysData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static String keysDataToJson(Map map) {
        return new JSONObject(map).toString();
    }

    private static List jsonToRolloutsState(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.create(string));
            } catch (Exception e) {
                Logger.getLogger().w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    private static String rolloutsStateToJson(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (JSONException e) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void safeDeleteCorruptFile(File file) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }
}
