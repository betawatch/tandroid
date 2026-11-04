package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k81 extends g11 {
    public boolean f2;
    public final /* synthetic */ l81 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k81(l81 l81Var, l81 l81Var2, Activity activity) {
        super(l81Var2, activity, false, null, 3, null);
        this.g2 = l81Var;
        this.f2 = true;
    }

    @Override // org.telegram.ui.g11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.s(null);
        }
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i3;
        int i10;
        l81 l81Var = this.g2;
        i3 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.h10.i(i3).f0)) {
            org.telegram.messenger.li mediaDataController = l81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.h10.i(i10).f0);
            if ((n02 == null ? 0L : n02.set.id) == org.telegram.messenger.li.q0(document)) {
                z10 = true;
            }
        }
        l81Var.g0(l10, z10);
    }
}
