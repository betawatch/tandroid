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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ob0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
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
                bc0 bc0Var = (bc0) frameLayout;
                Context context = (Context) obj3;
                gc0 gc0Var = (gc0) obj2;
                gc0 gc0Var2 = (gc0) obj;
                hc0 hc0Var = bc0Var.c0;
                MessagePreviewParams messagePreviewParams = hc0Var.d;
                if (!z10) {
                    new yc(hc0Var, hc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new mb0(bc0Var, context, i11))).j();
                    break;
                } else {
                    boolean z11 = messagePreviewParams.hideForwardSendersName;
                    messagePreviewParams.hideForwardSendersName = !z11;
                    hc0Var.x = false;
                    if (z11) {
                        messagePreviewParams.hideCaption = false;
                        if (gc0Var != null) {
                            gc0Var.a(false, true);
                        }
                    }
                    gc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                    bc0Var.h();
                    bc0Var.k(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                a80 a80Var = (a80) obj;
                bs0 bs0Var = ((xh.o2) frameLayout).a;
                if (z10) {
                    bs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    yc.a0(bs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    yh.j5 j5Var = bs0Var.e;
                    int i12 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i12, arrayList);
                    yc.a0(bs0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                a80Var.u();
                bs0Var.n();
                break;
        }
    }
}
