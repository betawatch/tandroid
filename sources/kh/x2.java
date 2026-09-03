package kh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import lh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x2(FrameLayout frameLayout, boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = z4;
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
        boolean z4 = this.b;
        FrameLayout frameLayout = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                p70 p70Var = (p70) obj;
                or0 or0Var = ((m3) frameLayout).a;
                if (z4) {
                    or0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    qc.a0(or0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    j7 j7Var = or0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    j7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j7Var.a(i12, arrayList);
                    qc.a0(or0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, lh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                p70Var.u();
                or0Var.n();
                break;
            default:
                rb0 rb0Var = (rb0) frameLayout;
                Context context = (Context) obj3;
                wb0 wb0Var = (wb0) obj2;
                wb0 wb0Var2 = (wb0) obj;
                xb0 xb0Var = rb0Var.W;
                MessagePreviewParams messagePreviewParams = xb0Var.d;
                if (!z4) {
                    new qc(xb0Var, xb0Var.C).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new cb0(rb0Var, context, i11))).j();
                    break;
                } else {
                    boolean z10 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z10;
                    xb0Var.x = false;
                    if (z10) {
                        messagePreviewParams.hideCaption = false;
                        if (wb0Var != null) {
                            wb0Var.a(false, true);
                        }
                    }
                    wb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    rb0Var.h();
                    rb0Var.k(true);
                    break;
                }
        }
    }
}
