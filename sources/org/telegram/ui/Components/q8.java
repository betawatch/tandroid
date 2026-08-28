package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q8 extends org.telegram.ui.b61 {
    public boolean Z1;
    public final /* synthetic */ w8 a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(w8 w8Var, w8 w8Var2, Activity activity, int i9) {
        super(w8Var2, activity, false, null, 4, true, null, 16, i9);
        this.a2 = w8Var;
        this.Z1 = true;
    }

    @Override // org.telegram.ui.b61, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.b.s(null);
        }
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i9;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        int i10;
        boolean z11 = this.N;
        w8 w8Var = this.a2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.o2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).profileAvatarConstructorDefault;
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i9).groupAvatarConstructorDefault;
        }
        if (tL_emojiList != null) {
            z10 = tL_emojiList.document_id.contains(Long.valueOf(document != null ? document.id : l10 != null ? l10.longValue() : 0L));
        } else {
            z10 = false;
        }
        w8Var.g0(z10, l10 != null ? l10.longValue() : 0L, document);
    }
}
