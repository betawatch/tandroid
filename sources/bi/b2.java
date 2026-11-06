package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ve;
import org.telegram.ui.ws;
import org.telegram.ui.ww;
import org.telegram.ui.xv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b2(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                qp qpVar = (qp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < qpVar.s5) {
                    org.telegram.messenger.f3 G0 = qpVar.G0();
                    long j3 = this.b;
                    G0.b(j3, tL_premium_boostsStatus, new r2(k7Var, tL_premium_boostsStatus, j3, qpVar, 0));
                    break;
                } else {
                    k7Var.c2.setLoading(false);
                    k7Var.t2(true);
                    break;
                }
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((ws) this.d);
                dataSettingsActivity.V = dataSettingsActivity.V || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.X = l10.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.a != null && (i7 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    break;
                }
                break;
            case 2:
                xv xvVar = (xv) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) this.d).r(150L);
                ww wwVar = xvVar.b;
                Boolean bool = wwVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    wwVar.getMessagesController().m(this.b, wwVar.getMessagesController().a2(Long.valueOf(wwVar.H)), 0, null, wwVar, false, runnable, new ve(6, runnable), null);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                ProfileActivity.i0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }
}
