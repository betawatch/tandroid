package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p8 extends org.telegram.ui.a61 {
    public boolean Z1;
    public final /* synthetic */ v8 a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(v8 v8Var, v8 v8Var2, Activity activity, int i10) {
        super(v8Var2, activity, false, null, 4, true, null, 16, i10);
        this.a2 = v8Var;
        this.Z1 = true;
    }

    @Override // org.telegram.ui.a61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.b.s(null);
        }
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i11;
        boolean z11 = this.N;
        v8 v8Var = this.a2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.n2) v8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) v8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l10 != null ? l10.longValue() : 0L));
        } else {
            z10 = false;
        }
        v8Var.h0(z10, l10 != null ? l10.longValue() : 0L, document);
    }
}
