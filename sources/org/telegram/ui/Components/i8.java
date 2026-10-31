package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i8 extends org.telegram.ui.i31 {
    public boolean e2;
    public final /* synthetic */ o8 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(o8 o8Var, o8 o8Var2, Activity activity, int i10) {
        super(o8Var2, activity, false, null, 4, true, null, 16, i10);
        this.f2 = o8Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.i31, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.e2) {
            this.e2 = false;
            this.f2.b.s(null);
        }
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i11;
        boolean z11 = this.R;
        o8 o8Var = this.f2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.k2) o8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ui.b0(i11).J1;
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) o8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ui.b0(i10).K1;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l4 != null ? l4.longValue() : 0L));
        } else {
            z10 = false;
        }
        o8Var.l0(z10, l4 != null ? l4.longValue() : 0L, document);
    }
}
