package g0;

import a8.r7;
import android.content.pm.ShortcutManager;
import android.util.Log;
import c8.g0;
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
import org.telegram.messenger.b20;
import org.telegram.messenger.hd;
import org.telegram.messenger.j9;
import org.telegram.messenger.qc;
import org.telegram.messenger.t10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements k, l5.e, u9.d, gh.d, j9, t10, b20 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return Integer.valueOf(((g2.b) obj).r);
            case 3:
                o0 o0Var = (o0) obj;
                String o4 = p0.b.o(o0Var);
                j.d(o4, "encode(...)");
                o0Var.getClass();
                m mVar = m.b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = o4.getBytes(xd.a.a);
                j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                ha.a.b.getClass();
                return ea.a.a.o((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return num.intValue() == 0 ? hd.M0(2131748805, null) : hd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // u9.d
    public Object i(r7 r7Var) {
        n components$lambda$0;
        r components$lambda$1;
        switch (this.a) {
            case 5:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(r7Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(r7Var);
                return components$lambda$1;
        }
    }

    @Override // gh.d
    public int j(e6 e6Var, boolean z10) {
        switch (this.a) {
            case 8:
                return z10 ? j6.r1(0.9f, -15658735) : g0.m(qc.e(262144) ? 0.82f : 0.76f, j6.w0(j6.d6, e6Var), -14145496);
            case 9:
                if (!qc.e(256)) {
                    return j6.x0(null, j6.G8, false);
                }
                return j6.r1(z10 ? 0.85f : 0.825f, j6.x0(null, j6.G8, false));
            case 10:
                return g0.m(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.d6, e6Var), j6.w0(j6.Ql, e6Var));
            case 11:
                return j6.r1(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.wj, e6Var));
            case 12:
                return g0.m(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.d6, e6Var), j6.w0(j6.Je, e6Var));
            case 13:
                return g0.m(qc.e(262144) ? 0.85f : 0.8f, j6.w0(j6.a7, e6Var), j6.w0(j6.d6, e6Var));
            case 14:
                return 855638016;
            case 15:
                return TLObject.FLAG_30;
            case 16:
                return j6.r1(z10 ? 0.82f : 0.78f, j6.w0(j6.h5, e6Var));
            case 17:
                return j6.r1(0.075f, -16777216);
            case 18:
                return j6.r1(z10 ? 0.85f : 0.825f, j6.w0(j6.G8, e6Var));
            case 19:
                return j6.r1(0.88f, j6.w0(j6.d6, e6Var));
            case 20:
                return g0.m(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.d6, e6Var), j6.w0(j6.Pl, e6Var));
            case 21:
                return j6.r1(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.d6, e6Var));
            case 22:
                return j6.r1(0.78f, j6.w0(j6.h5, e6Var));
            case 23:
                return j6.r1(0.7f, j6.w0(j6.d6, e6Var));
            case 24:
                qc.e(262144);
                return 0;
            default:
                return j6.r1(qc.e(262144) ? 0.85f : 0.76f, j6.w0(j6.d6, e6Var));
        }
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        ve veVar = d3.k0;
        return 0;
    }

    public /* synthetic */ e(l lVar) {
        this.a = 3;
    }
}
