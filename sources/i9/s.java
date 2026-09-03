package i9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s {
    public final SharedPreferences a;
    public final w8.g b;
    public final Object c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final TaskCompletionSource h;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(w8.g gVar) {
        Boolean bool;
        Boolean bool2;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.c = obj;
        this.d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource();
        gVar.a();
        Context context = gVar.a;
        this.b = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e6);
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                if (bool2 != null) {
                    this.f = false;
                    bool = null;
                } else {
                    this.f = true;
                    bool = Boolean.valueOf(Boolean.TRUE.equals(bool2));
                }
            }
            bool2 = null;
            if (bool2 != null) {
            }
        }
        this.g = bool;
        synchronized (obj) {
            try {
                if (a()) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean a() {
        boolean z4;
        Boolean bool = this.g;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            try {
                z4 = this.b.h();
            } catch (IllegalStateException unused) {
                z4 = false;
            }
        }
        String l10 = yh.l("Crashlytics automatic data collection ", z4 ? "ENABLED" : "DISABLED", " by ", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l10, null);
        }
        return z4;
    }
}
