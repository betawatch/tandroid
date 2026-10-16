package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i9 implements Runnable {
    public final /* synthetic */ tm a;

    public i9(tm tmVar) {
        this.a = tmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bi.b4 b4Var;
        tm tmVar = this.a;
        AndroidUtilities.runOnUIThread(tmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = tmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || tmVar.w != 1.0f) {
            return;
        }
        if (tmVar.x || ((b4Var = tmVar.b.k) != null && b4Var.hasImageLoaded())) {
            int i10 = tmVar.v + 1;
            tmVar.v = i10;
            tmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                tmVar.v = 0;
            }
            if (tmVar.s > 6) {
                tmVar.s = 0;
            }
            s5 s5Var = new s5(4, tmVar.r, tL_emojiList.document_id.get(tmVar.v).longValue());
            tmVar.a = s5Var;
            tmVar.d.setAnimatedEmojiDrawable(s5Var);
            int[] iArr = h9.c0[tmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            b30 b30Var = new b30();
            tmVar.f = b30Var;
            b30Var.d(i11, i12, i13, i14);
            tmVar.w = 0.0f;
            tmVar.b();
            tmVar.invalidate();
        }
    }
}
