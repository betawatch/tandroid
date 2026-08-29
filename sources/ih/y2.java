package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import jh.i7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y2(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = z10;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.b;
        FrameLayout frameLayout = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                j70 j70Var = (j70) obj;
                gr0 gr0Var = ((n3) frameLayout).a;
                if (z10) {
                    gr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    tc.a0(gr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, jh.h5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    i7 i7Var = gr0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    i7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    i7Var.a(i12, arrayList);
                    tc.a0(gr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, jh.h5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                j70Var.u();
                gr0Var.n();
                break;
            default:
                lb0 lb0Var = (lb0) frameLayout;
                Context context = (Context) obj3;
                qb0 qb0Var = (qb0) obj2;
                qb0 qb0Var2 = (qb0) obj;
                rb0 rb0Var = lb0Var.V;
                MessagePreviewParams messagePreviewParams = rb0Var.d;
                if (!z10) {
                    new tc(rb0Var, rb0Var.B).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new wa0(lb0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    rb0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (qb0Var != null) {
                            qb0Var.a(false, true);
                        }
                    }
                    qb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    lb0Var.h();
                    lb0Var.k(true);
                    break;
                }
        }
    }
}
