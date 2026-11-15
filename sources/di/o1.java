package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.te;
import org.telegram.ui.yw;
import org.telegram.ui.zs;
import org.telegram.ui.zv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o1(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.c;
                np npVar = (np) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < npVar.t5) {
                    org.telegram.messenger.f3 G0 = npVar.G0();
                    long j3 = this.b;
                    G0.b(j3, tL_premium_boostsStatus, new bi.i1(c6Var, tL_premium_boostsStatus, j3, npVar, 1));
                    break;
                } else {
                    c6Var.g2.setLoading(false);
                    c6Var.u2(true);
                    break;
                }
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((zs) this.d);
                dataSettingsActivity.W = dataSettingsActivity.W || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.Y = l10.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (i7 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    break;
                }
                break;
            case 2:
                zv zvVar = (zv) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) this.d).r(150L);
                yw ywVar = zvVar.b;
                Boolean bool = ywVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    ywVar.getMessagesController().m(this.b, ywVar.getMessagesController().a2(Long.valueOf(ywVar.I)), 0, null, ywVar, false, runnable, new te(6, runnable), null);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                ProfileActivity.g0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }
}
