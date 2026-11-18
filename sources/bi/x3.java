package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bt;
import org.telegram.ui.cw;
import org.telegram.ui.cx;
import org.telegram.ui.ve;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x3(aa.r rVar, long j3, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.a = 0;
        this.c = rVar;
        this.b = j3;
        this.d = tL_messageActionStarGiftOnchainOffer;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7;
        int i10 = this.a;
        boolean z10 = true;
        long j3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((aa.r) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    f4.f(j3);
                    f4.r(2131749551, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                }
                break;
            case 1:
                String str = (String) obj2;
                v4.s((TL_stars.TL_starGiftUnique) obj3, ((Boolean) obj).booleanValue() ? gd.a0(null, null, 2131749543, str, v4.k(j3)) : gd.a0(null, null, 2131749620, str));
                break;
            case 2:
                di.f6 f6Var = (di.f6) obj3;
                mp mpVar = (mp) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < mpVar.v5) {
                    org.telegram.messenger.h3 I0 = mpVar.I0();
                    long j10 = this.b;
                    I0.b(j10, tL_premium_boostsStatus, new e2(f6Var, tL_premium_boostsStatus, j10, mpVar, 1));
                    break;
                } else {
                    f6Var.g2.setLoading(false);
                    f6Var.I2(true);
                    break;
                }
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((bt) obj2);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - j3 <= 120) {
                    z10 = false;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l10.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (i7 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    break;
                }
                break;
            case 4:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) obj2).r(150L);
                cx cxVar = ((cw) obj3).b;
                Boolean bool = cxVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    cxVar.getMessagesController().m(this.b, cxVar.getMessagesController().c2(Long.valueOf(cxVar.I)), 0, null, cxVar, false, runnable, new ve(6, runnable), null);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                ProfileActivity.g0((ProfileActivity) obj3, (Context) obj2, j3, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }

    public /* synthetic */ x3(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
