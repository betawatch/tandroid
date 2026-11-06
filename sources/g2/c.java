package g2;

import a8.r7;
import android.util.Log;
import android.view.View;
import c8.g0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import da.u2;
import g9.k;
import gb.n;
import gb.o;
import gb.p0;
import gb.q0;
import gb.s;
import hi.a3;
import hi.b4;
import hi.v3;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.telegram.messenger.b20;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements k, l5.e, u9.d, gh.d, b20, jt0, kt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((b) obj).r);
            case 1:
                p0 p0Var = (p0) obj;
                String u10 = q0.b.u(p0Var);
                j.d(u10, "encode(...)");
                p0Var.getClass();
                n nVar = n.b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = u10.getBytes(xd.a.a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.b.getClass();
                return ea.a.a.u((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        o components$lambda$0;
        s components$lambda$1;
        switch (this.a) {
            case 3:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(r7Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(r7Var);
                return components$lambda$1;
        }
    }

    @Override // org.telegram.ui.Components.kt0
    public void f(Object obj, float f10) {
        switch (this.a) {
            case 26:
                a3 a3Var = (a3) obj;
                a3Var.c = f10;
                a3Var.f.invalidate();
                a3Var.X.setAlpha(f10);
                a3Var.J();
                a3Var.H();
                break;
            default:
                ((v3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public float get(Object obj) {
        switch (this.a) {
            case 25:
                return ((a3) obj).c;
            case 26:
            default:
                return ((b4) obj).getSwipeOffsetY();
            case 27:
                return ((v3) obj).c;
        }
    }

    @Override // gh.d
    public int k(f6 f6Var, boolean z9) {
        switch (this.a) {
            case 6:
                return z9 ? k6.r1(0.9f, -15658735) : g0.n(rc.e(262144) ? 0.82f : 0.76f, k6.w0(k6.d6, f6Var), -14145496);
            case 7:
                if (!rc.e(256)) {
                    return k6.x0(null, k6.G8, false);
                }
                return k6.r1(z9 ? 0.85f : 0.825f, k6.x0(null, k6.G8, false));
            case 8:
                return g0.n(rc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, f6Var), k6.w0(k6.Nl, f6Var));
            case 9:
                return k6.r1(rc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.tj, f6Var));
            case 10:
                return g0.n(rc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, f6Var), k6.w0(k6.Ge, f6Var));
            case 11:
                return g0.n(rc.e(262144) ? 0.85f : 0.8f, k6.w0(k6.a7, f6Var), k6.w0(k6.d6, f6Var));
            case 12:
                return 855638016;
            case 13:
                return TLObject.FLAG_30;
            case 14:
                return k6.r1(z9 ? 0.82f : 0.78f, k6.w0(k6.h5, f6Var));
            case 15:
                return k6.r1(0.075f, -16777216);
            case 16:
                return k6.r1(z9 ? 0.85f : 0.825f, k6.w0(k6.G8, f6Var));
            case 17:
                return k6.r1(0.88f, k6.w0(k6.d6, f6Var));
            case 18:
                return g0.n(rc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, f6Var), k6.w0(k6.Ml, f6Var));
            case 19:
                return k6.r1(rc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, f6Var));
            case 20:
                return k6.r1(0.78f, k6.w0(k6.h5, f6Var));
            case 21:
                return k6.r1(0.7f, k6.w0(k6.d6, f6Var));
            case 22:
                rc.e(262144);
                return 0;
            default:
                return k6.r1(rc.e(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, f6Var));
        }
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
    }
}
