// default package

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class li4 {
    public final zc1 a;

    public li4(zc1 zc1Var) {
        this.a = zc1Var;
    }

    public final void a() {
        zc1 zc1Var = this.a;
        Boolean bool = Boolean.TRUE;
        p63 p63Var = (p63) zc1Var.b;
        synchronized (p63Var) {
            p63Var.f = false;
            p63Var.g = bool;
            SharedPreferences.Editor edit = p63Var.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (p63Var.c) {
                try {
                    boolean a = p63Var.a();
                    boolean z = p63Var.e;
                    if (a) {
                        if (!z) {
                            p63Var.d.trySetResult(null);
                            p63Var.e = true;
                        }
                    } else if (z) {
                        p63Var.d = new TaskCompletionSource();
                        p63Var.e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void b(String str, String str2) {
        zc1 zc1Var = this.a;
        ((i03) ((rx6) zc1Var.n).b).a(new cv2(zc1Var, str, str2, (byte) 2));
    }
}
