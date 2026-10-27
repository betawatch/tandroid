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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                ic0 ic0Var = (ic0) frameLayout;
                Context context = (Context) obj3;
                nc0 nc0Var = (nc0) obj2;
                nc0 nc0Var2 = (nc0) obj;
                oc0 oc0Var = ic0Var.c0;
                MessagePreviewParams messagePreviewParams = oc0Var.d;
                if (!z10) {
                    new wc(oc0Var, oc0Var.F).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new tb0(ic0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    oc0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (nc0Var != null) {
                            nc0Var.a(false, true);
                        }
                    }
                    nc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    ic0Var.i();
                    ic0Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                l80 l80Var = (l80) obj;
                ws0 ws0Var = ((zh.m2) frameLayout).a;
                if (z10) {
                    ws0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    wc.b0(ws0Var.a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    bi.q9 q9Var = ws0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    q9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    q9Var.a(i12, arrayList);
                    wc.b0(ws0Var.a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                l80Var.u();
                ws0Var.o();
                break;
        }
    }
}
