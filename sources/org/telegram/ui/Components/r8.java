package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r8 implements Runnable {
    public final /* synthetic */ zl a;

    public r8(zl zlVar) {
        this.a = zlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fi.u2 u2Var;
        zl zlVar = this.a;
        org.telegram.messenger.g0.i3(zlVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = zlVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || zlVar.x != 1.0f) {
            return;
        }
        if (zlVar.y || ((u2Var = zlVar.b.k) != null && u2Var.J())) {
            int i7 = zlVar.w + 1;
            zlVar.w = i7;
            zlVar.s++;
            if (i7 > tL_emojiList.document_id.size() - 1) {
                zlVar.w = 0;
            }
            if (zlVar.s > 6) {
                zlVar.s = 0;
            }
            g5 g5Var = new g5(4, zlVar.r, tL_emojiList.document_id.get(zlVar.w).longValue());
            zlVar.a = g5Var;
            zlVar.d.setAnimatedEmojiDrawable(g5Var);
            int[] iArr = q8.d0[zlVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            i10 i10Var = new i10();
            zlVar.f = i10Var;
            i10Var.d(i10, i11, i12, i13);
            zlVar.x = 0.0f;
            zlVar.b();
            zlVar.invalidate();
        }
    }
}
