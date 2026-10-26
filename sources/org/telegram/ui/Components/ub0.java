package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ub0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                hc0 hc0Var = (hc0) frameLayout;
                Context context = (Context) obj3;
                mc0 mc0Var = (mc0) obj2;
                mc0 mc0Var2 = (mc0) obj;
                nc0 nc0Var = hc0Var.c0;
                MessagePreviewParams messagePreviewParams = nc0Var.d;
                if (!z10) {
                    new wc(nc0Var, nc0Var.F).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new sb0(hc0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    nc0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (mc0Var != null) {
                            mc0Var.a(false, true);
                        }
                    }
                    mc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    hc0Var.i();
                    hc0Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                k80 k80Var = (k80) obj;
                vs0 vs0Var = ((zh.m2) frameLayout).a;
                if (z10) {
                    vs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    wc.b0(vs0Var.a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    bi.q9 q9Var = vs0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    q9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    q9Var.a(i12, arrayList);
                    wc.b0(vs0Var.a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                k80Var.u();
                vs0Var.o();
                break;
        }
    }
}
