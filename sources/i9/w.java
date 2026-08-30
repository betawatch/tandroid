package i9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final i5.c a;
    public final Context b;
    public final String c;
    public final ca.d d;
    public final s e;
    public c f;

    public w(Context context, String str, ca.d dVar, s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = sVar;
        this.a = new i5.c(1);
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized c b() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.b != null || !this.e.a())) {
            return this.f;
        }
        f9.b bVar = f9.b.a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) y.a(((ca.c) this.d).d());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            bVar.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f = new c(a(str, sharedPreferences), str);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a("SYN_" + UUID.randomUUID().toString(), sharedPreferences), null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        }
        bVar.c("Install IDs: " + this.f);
        return this.f;
    }

    public final String c() {
        String str;
        i5.c cVar = this.a;
        Context context = this.b;
        synchronized (cVar) {
            try {
                if (cVar.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    cVar.b = installerPackageName;
                }
                str = "".equals(cVar.b) ? null : cVar.b;
            } finally {
            }
        }
        return str;
    }
}
