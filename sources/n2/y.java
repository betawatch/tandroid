package n2;

import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static final /* synthetic */ int a = 0;

    static {
        int i10 = z.u;
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
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static f3 b(int i10, int i11, g gVar, String str, l3 l3Var) {
        try {
            i3 s10 = j3.s();
            int i12 = gVar.a;
            s10.c();
            j3.r((j3) s10.b, i12);
            String str2 = gVar.c;
            s10.c();
            j3.o((j3) s10.b, str2);
            int i13 = gVar.b;
            if (i13 != 0) {
                s10.c();
                j3.p((j3) s10.b, i13);
            }
            if (i10 != 0) {
                s10.c();
                j3.q((j3) s10.b, i10);
            }
            if (str != null) {
                s10.c();
                j3.n((j3) s10.b, str);
            }
            e3 u10 = f3.u();
            u10.d(s10);
            u10.c();
            f3.t((f3) u10.b, i11);
            if (!l3Var.equals(l3.b)) {
                u10.c();
                f3.p((f3) u10.b, l3Var);
            }
            return (f3) u10.a();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static h3 c(int i10, l3 l3Var) {
        try {
            g3 s10 = h3.s();
            s10.c();
            h3.r((h3) s10.b, i10);
            if (!l3Var.equals(l3.b)) {
                s10.c();
                h3.o((h3) s10.b, l3Var);
            }
            return (h3) s10.a();
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to create logging payload", e9);
            return null;
        }
    }
}
