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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                yb0 yb0Var = (yb0) frameLayout;
                Context context = (Context) obj3;
                dc0 dc0Var = (dc0) obj2;
                dc0 dc0Var2 = (dc0) obj;
                ec0 ec0Var = yb0Var.c0;
                MessagePreviewParams messagePreviewParams = ec0Var.d;
                if (!z10) {
                    new wc(ec0Var, ec0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new jb0(yb0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    ec0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (dc0Var != null) {
                            dc0Var.a(false, true);
                        }
                    }
                    dc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    yb0Var.h();
                    yb0Var.k(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                w70 w70Var = (w70) obj;
                wr0 wr0Var = ((wh.m2) frameLayout).a;
                if (z10) {
                    wr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    wc.a0(wr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, xh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    xh.l5 l5Var = wr0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    l5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    l5Var.a(i12, arrayList);
                    wc.a0(wr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, xh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                w70Var.u();
                wr0Var.n();
                break;
        }
    }
}
