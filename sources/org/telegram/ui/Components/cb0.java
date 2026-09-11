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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                qb0 qb0Var = (qb0) frameLayout;
                Context context = (Context) obj3;
                vb0 vb0Var = (vb0) obj2;
                vb0 vb0Var2 = (vb0) obj;
                wb0 wb0Var = qb0Var.c0;
                MessagePreviewParams messagePreviewParams = wb0Var.d;
                if (!z10) {
                    new yc(wb0Var, wb0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ab0(qb0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    wb0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (vb0Var != null) {
                            vb0Var.a(false, true);
                        }
                    }
                    vb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    qb0Var.h();
                    qb0Var.k(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                n70 n70Var = (n70) obj;
                nr0 nr0Var = ((yh.m2) frameLayout).a;
                if (z10) {
                    nr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    yc.a0(nr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, zh.w3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    zh.i5 i5Var = nr0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    i5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    i5Var.a(i12, arrayList);
                    yc.a0(nr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.w3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                n70Var.u();
                nr0Var.n();
                break;
        }
    }
}
