package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l8 extends org.telegram.ui.g11 {
    public boolean f2;
    public final /* synthetic */ r8 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(r8 r8Var, r8 r8Var2, Activity activity, int i3) {
        super(r8Var2, activity, false, null, 4, true, null, 16, i3);
        this.g2 = r8Var;
        this.f2 = true;
    }

    @Override // org.telegram.ui.g11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.s(null);
        }
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i3;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i10;
        boolean z11 = this.S;
        r8 r8Var = this.g2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.d2) r8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.li.b0(i10).K1;
        } else {
            i3 = ((org.telegram.ui.ActionBar.d2) r8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.li.b0(i3).L1;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l10 != null ? l10.longValue() : 0L));
        } else {
            z10 = false;
        }
        r8Var.m0(z10, l10 != null ? l10.longValue() : 0L, document);
    }
}
