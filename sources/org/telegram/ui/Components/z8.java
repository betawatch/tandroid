package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class z8 extends org.telegram.ui.j71 {
    public boolean d2;
    public final /* synthetic */ f9 e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(f9 f9Var, f9 f9Var2, Activity activity, int i10) {
        super(f9Var2, activity, false, null, 4, true, null, 16, i10);
        this.e2 = f9Var;
        this.d2 = true;
    }

    @Override // org.telegram.ui.j71, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d2) {
            this.d2 = false;
            this.e2.b.s(null);
        }
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i11;
        boolean z11 = this.R;
        f9 f9Var = this.e2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.n2) f9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) f9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l4 != null ? l4.longValue() : 0L));
        } else {
            z10 = false;
        }
        f9Var.h0(z10, l4 != null ? l4.longValue() : 0L, document);
    }
}
