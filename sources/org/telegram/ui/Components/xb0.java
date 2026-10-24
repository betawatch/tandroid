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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                lc0 lc0Var = (lc0) frameLayout;
                Context context = (Context) obj3;
                qc0 qc0Var = (qc0) obj2;
                qc0 qc0Var2 = (qc0) obj;
                rc0 rc0Var = lc0Var.c0;
                MessagePreviewParams messagePreviewParams = rc0Var.d;
                if (!z10) {
                    new xc(rc0Var, rc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new vb0(lc0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    rc0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (qc0Var != null) {
                            qc0Var.a(false, true);
                        }
                    }
                    qc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    lc0Var.i();
                    lc0Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                j80 j80Var = (j80) obj;
                ns0 ns0Var = ((yh.l2) frameLayout).a;
                if (z10) {
                    ns0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(ns0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, ai.l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    ai.v9 v9Var = ns0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    v9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    v9Var.a(i12, arrayList);
                    xc.a0(ns0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, ai.l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                j80Var.u();
                ns0Var.n();
                break;
        }
    }
}
