package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ hm a;

    public f9(hm hmVar) {
        this.a = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai.l4 l4Var;
        hm hmVar = this.a;
        AndroidUtilities.runOnUIThread(hmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = hmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || hmVar.w != 1.0f) {
            return;
        }
        if (hmVar.x || ((l4Var = hmVar.b.k) != null && l4Var.hasImageLoaded())) {
            int i10 = hmVar.v + 1;
            hmVar.v = i10;
            hmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                hmVar.v = 0;
            }
            if (hmVar.s > 6) {
                hmVar.s = 0;
            }
            q5 q5Var = new q5(4, hmVar.r, tL_emojiList.document_id.get(hmVar.v).longValue());
            hmVar.a = q5Var;
            hmVar.d.setAnimatedEmojiDrawable(q5Var);
            int[] iArr = e9.c0[hmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            p20 p20Var = new p20();
            hmVar.f = p20Var;
            p20Var.d(i11, i12, i13, i14);
            hmVar.w = 0.0f;
            hmVar.b();
            hmVar.invalidate();
        }
    }
}
