package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import mh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yb0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                q70 q70Var = (q70) obj;
                or0 or0Var = ((n3) frameLayout).a;
                if (z4) {
                    or0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    qc.a0(or0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, mh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    j7 j7Var = or0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    j7Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j7Var.a(i12, arrayList);
                    qc.a0(or0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, mh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                q70Var.u();
                or0Var.n();
                break;
            default:
                sb0 sb0Var = (sb0) frameLayout;
                Context context = (Context) obj3;
                xb0 xb0Var = (xb0) obj2;
                xb0 xb0Var2 = (xb0) obj;
                yb0 yb0Var = sb0Var.W;
                MessagePreviewParams messagePreviewParams = yb0Var.d;
                if (!z4) {
                    new qc(yb0Var, yb0Var.C).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new db0(sb0Var, context, i11))).j();
                    break;
                } else {
                    boolean z10 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z10;
                    yb0Var.x = false;
                    if (z10) {
                        messagePreviewParams.hideCaption = false;
                        if (xb0Var != null) {
                            xb0Var.a(false, true);
                        }
                    }
                    xb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    sb0Var.h();
                    sb0Var.k(true);
                    break;
                }
        }
    }
}
