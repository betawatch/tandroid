package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ka1 extends i31 {
    public boolean e2;
    public final /* synthetic */ la1 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka1(la1 la1Var, la1 la1Var2, Activity activity) {
        super(la1Var2, activity, false, null, 3, null);
        this.f2 = la1Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.i31, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.e2) {
            this.e2 = false;
            this.f2.f.s(null);
        }
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        la1 la1Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.d20.i(i10).e0)) {
            org.telegram.messenger.ui mediaDataController = la1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.d20.i(i11).e0);
            if ((n02 == null ? 0L : n02.set.id) == org.telegram.messenger.ui.q0(document)) {
                z10 = true;
            }
        }
        la1Var.f0(l4, z10);
    }
}
