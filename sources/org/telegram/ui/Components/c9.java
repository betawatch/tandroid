package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c9 implements Runnable {
    public final /* synthetic */ bm a;

    public c9(bm bmVar) {
        this.a = bmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.x2 x2Var;
        bm bmVar = this.a;
        AndroidUtilities.runOnUIThread(bmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = bmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || bmVar.w != 1.0f) {
            return;
        }
        if (bmVar.x || ((x2Var = bmVar.b.k) != null && x2Var.hasImageLoaded())) {
            int i10 = bmVar.v + 1;
            bmVar.v = i10;
            bmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                bmVar.v = 0;
            }
            if (bmVar.s > 6) {
                bmVar.s = 0;
            }
            p5 p5Var = new p5(4, bmVar.r, tL_emojiList.document_id.get(bmVar.v).longValue());
            bmVar.a = p5Var;
            bmVar.d.setAnimatedEmojiDrawable(p5Var);
            int[] iArr = b9.Y[bmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            k20 k20Var = new k20();
            bmVar.f = k20Var;
            k20Var.d(i11, i12, i13, i14);
            bmVar.w = 0.0f;
            bmVar.b();
            bmVar.invalidate();
        }
    }
}
