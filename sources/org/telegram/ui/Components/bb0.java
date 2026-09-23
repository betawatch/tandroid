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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                ob0 ob0Var = (ob0) frameLayout;
                Context context = (Context) obj3;
                tb0 tb0Var = (tb0) obj2;
                tb0 tb0Var2 = (tb0) obj;
                ub0 ub0Var = ob0Var.c0;
                MessagePreviewParams messagePreviewParams = ub0Var.d;
                if (!z10) {
                    new xc(ub0Var, ub0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new za0(ob0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    ub0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (tb0Var != null) {
                            tb0Var.a(false, true);
                        }
                    }
                    tb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    ob0Var.h();
                    ob0Var.k(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                o70 o70Var = (o70) obj;
                nr0 nr0Var = ((xh.o2) frameLayout).a;
                if (z10) {
                    nr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(nr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    yh.k5 k5Var = nr0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    k5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k5Var.a(i12, arrayList);
                    xc.a0(nr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                o70Var.u();
                nr0Var.n();
                break;
        }
    }
}
