package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t8 implements Runnable {
    public final /* synthetic */ rl a;

    public t8(rl rlVar) {
        this.a = rlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di.z2 z2Var;
        rl rlVar = this.a;
        org.telegram.messenger.g0.i3(rlVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rlVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || rlVar.x != 1.0f) {
            return;
        }
        if (rlVar.y || ((z2Var = rlVar.b.k) != null && z2Var.J())) {
            int i7 = rlVar.w + 1;
            rlVar.w = i7;
            rlVar.s++;
            if (i7 > tL_emojiList.document_id.size() - 1) {
                rlVar.w = 0;
            }
            if (rlVar.s > 6) {
                rlVar.s = 0;
            }
            h5 h5Var = new h5(4, rlVar.r, tL_emojiList.document_id.get(rlVar.w).longValue());
            rlVar.a = h5Var;
            rlVar.d.setAnimatedEmojiDrawable(h5Var);
            int[] iArr = s8.c0[rlVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            e10 e10Var = new e10();
            rlVar.f = e10Var;
            e10Var.d(i10, i11, i12, i13);
            rlVar.x = 0.0f;
            rlVar.b();
            rlVar.invalidate();
        }
    }
}
