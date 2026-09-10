package c5;

import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.m3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i10 = f0.q;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i10 = com.google.android.gms.internal.play_billing.u.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static g3 b(int i10, int i11, h hVar, String str, m3 m3Var) {
        try {
            j3 s10 = k3.s();
            int i12 = hVar.a;
            s10.c();
            k3.r((k3) s10.b, i12);
            String str2 = hVar.c;
            s10.c();
            k3.o((k3) s10.b, str2);
            int i13 = hVar.b;
            if (i13 != 0) {
                s10.c();
                k3.p((k3) s10.b, i13);
            }
            if (i10 != 0) {
                s10.c();
                k3.q((k3) s10.b, i10);
            }
            if (str != null) {
                s10.c();
                k3.n((k3) s10.b, str);
            }
            f3 u10 = g3.u();
            u10.d(s10);
            u10.c();
            g3.t((g3) u10.b, i11);
            if (!m3Var.equals(m3.b)) {
                u10.c();
                g3.p((g3) u10.b, m3Var);
            }
            return (g3) u10.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static i3 c(int i10, m3 m3Var) {
        try {
            h3 s10 = i3.s();
            s10.c();
            i3.r((i3) s10.b, i10);
            if (!m3Var.equals(m3.b)) {
                s10.c();
                i3.o((i3) s10.b, m3Var);
            }
            return (i3) s10.a();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
