package n2;

import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.m3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static final /* synthetic */ int a = 0;

    static {
        int i9 = a0.u;
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
            int i9 = com.google.android.gms.internal.play_billing.u.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static g3 b(int i9, int i10, g gVar, String str, m3 m3Var) {
        try {
            j3 s10 = k3.s();
            int i11 = gVar.a;
            s10.c();
            k3.r((k3) s10.b, i11);
            String str2 = gVar.c;
            s10.c();
            k3.o((k3) s10.b, str2);
            int i12 = gVar.b;
            if (i12 != 0) {
                s10.c();
                k3.p((k3) s10.b, i12);
            }
            if (i9 != 0) {
                s10.c();
                k3.q((k3) s10.b, i9);
            }
            if (str != null) {
                s10.c();
                k3.n((k3) s10.b, str);
            }
            f3 u10 = g3.u();
            u10.d(s10);
            u10.c();
            g3.t((g3) u10.b, i10);
            if (!m3Var.equals(m3.b)) {
                u10.c();
                g3.p((g3) u10.b, m3Var);
            }
            return (g3) u10.a();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static i3 c(int i9, m3 m3Var) {
        try {
            h3 s10 = i3.s();
            s10.c();
            i3.r((i3) s10.b, i9);
            if (!m3Var.equals(m3.b)) {
                s10.c();
                i3.o((i3) s10.b, m3Var);
            }
            return (i3) s10.a();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
