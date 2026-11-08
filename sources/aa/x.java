package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class x {
    public final SharedPreferences a;
    public final o9.g b;
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
    public x(o9.g gVar) {
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
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
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
        boolean z9;
        Boolean bool = this.g;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            try {
                z9 = this.b.h();
            } catch (IllegalStateException unused) {
                z9 = false;
            }
        }
        String m10 = f1.m("Crashlytics automatic data collection ", z9 ? "ENABLED" : "DISABLED", " by ", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", m10, null);
        }
        return z9;
    }
}
