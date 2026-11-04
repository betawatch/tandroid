package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.se;
import org.telegram.ui.us;
import org.telegram.ui.uv;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u1(Object obj, Object obj2, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                hp hpVar = (hp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < hpVar.s5) {
                    org.telegram.messenger.f3 G0 = hpVar.G0();
                    long j10 = this.b;
                    G0.b(j10, tL_premium_boostsStatus, new ai.m1(l6Var, tL_premium_boostsStatus, j10, hpVar, 1));
                    break;
                } else {
                    l6Var.d2.setLoading(false);
                    l6Var.t2(true);
                    break;
                }
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((us) this.d);
                dataSettingsActivity.W = dataSettingsActivity.W || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.Y = l10.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (i3 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i3);
                    break;
                }
                break;
            case 2:
                uv uvVar = (uv) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.s1) this.d).r(150L);
                uw uwVar = uvVar.b;
                Boolean bool = uwVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uwVar.getMessagesController().m(this.b, uwVar.getMessagesController().a2(Long.valueOf(uwVar.I)), 0, null, uwVar, false, runnable, new se(6, runnable), null);
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
