package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q8 extends org.telegram.ui.w61 {
    public boolean a2;
    public final /* synthetic */ w8 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(w8 w8Var, w8 w8Var2, Activity activity, int i10) {
        super(w8Var2, activity, false, null, 4, true, null, 16, i10);
        this.b2 = w8Var;
        this.a2 = true;
    }

    @Override // org.telegram.ui.w61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.b2.b.s(null);
        }
    }

    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z4;
        int i11;
        boolean z10 = this.O;
        w8 w8Var = this.b2;
        if (z10) {
            i11 = ((org.telegram.ui.ActionBar.p2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        if (tL_emojiList != null) {
            z4 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l10 != null ? l10.longValue() : 0L));
        } else {
            z4 = false;
        }
        w8Var.h0(z4, l10 != null ? l10.longValue() : 0L, document);
    }
}
