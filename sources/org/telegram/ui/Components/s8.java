package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class s8 extends org.telegram.ui.s11 {
    public boolean f2;
    public final /* synthetic */ y8 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(y8 y8Var, y8 y8Var2, Activity activity, int i7) {
        super(y8Var2, activity, false, null, 4, true, null, 16, i7);
        this.g2 = y8Var;
        this.f2 = true;
    }

    @Override // org.telegram.ui.s11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f2) {
            this.f2 = false;
            this.g2.b.s(null);
        }
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i10;
        boolean z11 = this.S;
        y8 y8Var = this.g2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.g2) y8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.si.d0(i10).M1;
        } else {
            i7 = ((org.telegram.ui.ActionBar.g2) y8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.si.d0(i7).N1;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l10 != null ? l10.longValue() : 0L));
        } else {
            z10 = false;
        }
        y8Var.m0(z10, l10 != null ? l10.longValue() : 0L, document);
    }
}
