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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                ac0 ac0Var = (ac0) frameLayout;
                Context context = (Context) obj3;
                fc0 fc0Var = (fc0) obj2;
                fc0 fc0Var2 = (fc0) obj;
                gc0 gc0Var = ac0Var.c0;
                MessagePreviewParams messagePreviewParams = gc0Var.d;
                if (!z10) {
                    new xc(gc0Var, gc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new kb0(ac0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    gc0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (fc0Var != null) {
                            fc0Var.a(false, true);
                        }
                    }
                    fc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    ac0Var.h();
                    ac0Var.k(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                y70 y70Var = (y70) obj;
                bs0 bs0Var = ((xh.o2) frameLayout).a;
                if (z10) {
                    bs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(bs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    yh.k5 k5Var = bs0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    k5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k5Var.a(i12, arrayList);
                    xc.a0(bs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                y70Var.u();
                bs0Var.n();
                break;
        }
    }
}
