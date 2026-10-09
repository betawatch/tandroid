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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cc0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                pc0 pc0Var = (pc0) frameLayout;
                Context context = (Context) obj3;
                uc0 uc0Var = (uc0) obj2;
                uc0 uc0Var2 = (uc0) obj;
                vc0 vc0Var = pc0Var.c0;
                MessagePreviewParams messagePreviewParams = vc0Var.d;
                if (!z10) {
                    new ad(vc0Var, vc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ac0(pc0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    vc0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (uc0Var != null) {
                            uc0Var.a(false, true);
                        }
                    }
                    uc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    pc0Var.h();
                    pc0Var.k(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                p80 p80Var = (p80) obj;
                rs0 rs0Var = ((xh.o2) frameLayout).a;
                if (z10) {
                    rs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    ad.a0(rs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    yh.d5 d5Var = rs0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    d5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    d5Var.a(i12, arrayList);
                    ad.a0(rs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                p80Var.u();
                rs0Var.n();
                break;
        }
    }
}
