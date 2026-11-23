package g0;

import a8.r7;
import android.content.pm.ShortcutManager;
import android.util.Log;
import c8.i0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import da.u2;
import g9.k;
import gb.l;
import gb.m;
import gb.n;
import gb.o0;
import gb.p0;
import gb.r;
import hi.d3;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.telegram.messenger.hd;
import org.telegram.messenger.j9;
import org.telegram.messenger.qc;
import org.telegram.messenger.s10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements k, l5.e, u9.d, gh.d, j9, s10 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return ShortcutManager.class;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return Integer.valueOf(((g2.b) obj).r);
            case 4:
                o0 o0Var = (o0) obj;
                String v = p0.b.v(o0Var);
                j.d(v, "encode(...)");
                o0Var.getClass();
                m mVar = m.b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = v.getBytes(xd.a.a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.b.getClass();
                return ea.a.a.v((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        n components$lambda$0;
        r components$lambda$1;
        switch (this.a) {
            case 6:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(r7Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(r7Var);
                return components$lambda$1;
        }
    }

    @Override // org.telegram.messenger.s10
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return num.intValue() == 0 ? hd.N0(2131748612, null) : hd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // gh.d
    public int j(h6 h6Var, boolean z10) {
        switch (this.a) {
            case 9:
                return z10 ? m6.r1(0.9f, -15658735) : i0.n(qc.e(262144) ? 0.82f : 0.76f, m6.w0(m6.d6, h6Var), -14145496);
            case 10:
                return m6.r1(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var));
            case 11:
                if (!qc.e(256)) {
                    return m6.x0(null, m6.G8, false);
                }
                return m6.r1(z10 ? 0.85f : 0.825f, m6.x0(null, m6.G8, false));
            case 12:
                return i0.n(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var), m6.w0(m6.Ql, h6Var));
            case 13:
                return i0.n(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var), m6.w0(m6.Je, h6Var));
            case 14:
                return i0.n(qc.e(262144) ? 0.85f : 0.8f, m6.w0(m6.a7, h6Var), m6.w0(m6.d6, h6Var));
            case 15:
                return 855638016;
            case 16:
                return TLObject.FLAG_30;
            case 17:
                return m6.r1(z10 ? 0.82f : 0.78f, m6.w0(m6.h5, h6Var));
            case 18:
                return m6.r1(0.075f, -16777216);
            case 19:
                return m6.r1(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.wj, h6Var));
            case 20:
                return m6.r1(0.88f, m6.w0(m6.d6, h6Var));
            case 21:
                return m6.r1(z10 ? 0.85f : 0.825f, m6.w0(m6.G8, h6Var));
            case 22:
                return i0.n(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var), m6.w0(m6.Pl, h6Var));
            case 23:
                return m6.r1(qc.e(262144) ? 0.85f : 0.76f, m6.w0(m6.d6, h6Var));
            case 24:
                return m6.r1(0.78f, m6.w0(m6.h5, h6Var));
            case 25:
                return m6.r1(0.7f, m6.w0(m6.d6, h6Var));
            default:
                qc.e(262144);
                return 0;
        }
    }

    @Override // org.telegram.messenger.j9
    public Object m(Object obj) {
        ve veVar = d3.k0;
        return 0;
    }

    public /* synthetic */ e(l lVar) {
        this.a = 4;
    }
}
