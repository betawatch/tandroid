package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ia1 extends g31 {
    public boolean e2;
    public final /* synthetic */ ja1 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(ja1 ja1Var, ja1 ja1Var2, Activity activity) {
        super(ja1Var2, activity, false, null, 3, null);
        this.f2 = ja1Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.g31, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.e2) {
            this.e2 = false;
            this.f2.f.s(null);
        }
    }

    @Override // org.telegram.ui.g31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        ja1 ja1Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.e20.i(i10).e0)) {
            org.telegram.messenger.vi mediaDataController = ja1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.e20.i(i11).e0);
            if ((n02 == null ? 0L : n02.set.id) == org.telegram.messenger.vi.q0(document)) {
                z10 = true;
            }
        }
        ja1Var.g0(l4, z10);
    }
}
