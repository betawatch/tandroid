package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x8 extends org.telegram.ui.l71 {
    public boolean d2;
    public final /* synthetic */ d9 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(d9 d9Var, d9 d9Var2, Activity activity, int i10) {
        super(d9Var2, activity, false, null, 4, true, null, 16, i10);
        this.e2 = d9Var;
        this.d2 = true;
    }

    @Override // org.telegram.ui.l71, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.b.s(null);
        }
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i11;
        boolean z11 = this.R;
        d9 d9Var = this.e2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.p2) d9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) d9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l4 != null ? l4.longValue() : 0L));
        } else {
            z10 = false;
        }
        d9Var.h0(z10, l4 != null ? l4.longValue() : 0L, document);
    }
}
