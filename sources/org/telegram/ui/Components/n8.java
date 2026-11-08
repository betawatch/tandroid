package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.q11 {
    public boolean e2;
    public final /* synthetic */ t8 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(t8 t8Var, t8 t8Var2, Activity activity, int i7) {
        super(t8Var2, activity, false, null, 4, true, null, 16, i7);
        this.f2 = t8Var;
        this.e2 = true;
    }

    @Override // org.telegram.ui.q11, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.e2) {
            this.e2 = false;
            this.f2.b.s(null);
        }
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z9;
        int i10;
        boolean z10 = this.R;
        t8 t8Var = this.f2;
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.f2) t8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ui.b0(i10).J1;
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) t8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ui.b0(i7).K1;
        }
        if (tL_emojiList != null) {
            z9 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l10 != null ? l10.longValue() : 0L));
        } else {
            z9 = false;
        }
        t8Var.m0(z9, l10 != null ? l10.longValue() : 0L, document);
    }
}
