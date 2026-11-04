package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s8 implements Runnable {
    public final /* synthetic */ rl a;

    public s8(rl rlVar) {
        this.a = rlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ei.c3 c3Var;
        rl rlVar = this.a;
        org.telegram.messenger.g0.i3(rlVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rlVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || rlVar.x != 1.0f) {
            return;
        }
        if (rlVar.y || ((c3Var = rlVar.b.k) != null && c3Var.J())) {
            int i3 = rlVar.w + 1;
            rlVar.w = i3;
            rlVar.s++;
            if (i3 > tL_emojiList.document_id.size() - 1) {
                rlVar.w = 0;
            }
            if (rlVar.s > 6) {
                rlVar.s = 0;
            }
            g5 g5Var = new g5(4, rlVar.r, tL_emojiList.document_id.get(rlVar.w).longValue());
            rlVar.a = g5Var;
            rlVar.d.setAnimatedEmojiDrawable(g5Var);
            int[] iArr = r8.d0[rlVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            b10 b10Var = new b10();
            rlVar.f = b10Var;
            b10Var.d(i10, i11, i12, i13);
            rlVar.x = 0.0f;
            rlVar.b();
            rlVar.invalidate();
        }
    }
}
