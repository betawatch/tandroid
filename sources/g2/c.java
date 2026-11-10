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
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements k, l5.e, u9.d, gh.d, b20, kt0, lt0 {
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

    @Override // org.telegram.ui.Components.lt0
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

    @Override // org.telegram.ui.Components.kt0
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
    public int k(h6 h6Var, boolean z9) {
        switch (this.a) {
            case 6:
                return z9 ? m6.r1(0.9f, -15658735) : g0.m(sc.e(262144) ? 0.82f : 0.76f, m6.w0(m6.d6, h6Var), -14145496);
            case 7:
                if (!sc.e(256)) {
                    return m6.x0(null, m6.G8, false);
                }
                return m6.r1(z9 ? 0.85f : 0.825f, m6.x0(null, m6.G8, false));
            case 8:
                return g0.m(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var), m6.w0(m6.Nl, h6Var));
            case 9:
                return m6.r1(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.tj, h6Var));
            case 10:
                return g0.m(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var), m6.w0(m6.Ge, h6Var));
            case 11:
                return g0.m(sc.e(262144) ? 0.85f : 0.8f, m6.w0(m6.a7, h6Var), m6.w0(m6.d6, h6Var));
            case 12:
                return 855638016;
            case 13:
                return TLObject.FLAG_30;
            case 14:
                return m6.r1(z9 ? 0.82f : 0.78f, m6.w0(m6.h5, h6Var));
            case 15:
                return m6.r1(0.075f, -16777216);
            case 16:
                return m6.r1(z9 ? 0.85f : 0.825f, m6.w0(m6.G8, h6Var));
            case 17:
                return m6.r1(0.88f, m6.w0(m6.d6, h6Var));
            case 18:
                return g0.m(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var), m6.w0(m6.Ml, h6Var));
            case 19:
                return m6.r1(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var));
            case 20:
                return m6.r1(0.78f, m6.w0(m6.h5, h6Var));
            case 21:
                return m6.r1(0.7f, m6.w0(m6.d6, h6Var));
            case 22:
                sc.e(262144);
                return 0;
            default:
                return m6.r1(sc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var));
        }
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
    }
}
