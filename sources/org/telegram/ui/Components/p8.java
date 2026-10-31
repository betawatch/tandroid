package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p8 implements Runnable {
    public final /* synthetic */ am a;

    public p8(am amVar) {
        this.a = amVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag.c2 c2Var;
        am amVar = this.a;
        org.telegram.messenger.i0.h3(amVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = amVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || amVar.x != 1.0f) {
            return;
        }
        if (amVar.y || ((c2Var = amVar.b.k) != null && c2Var.J())) {
            int i10 = amVar.w + 1;
            amVar.w = i10;
            amVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                amVar.w = 0;
            }
            if (amVar.s > 6) {
                amVar.s = 0;
            }
            f5 f5Var = new f5(4, amVar.r, tL_emojiList.document_id.get(amVar.w).longValue());
            amVar.a = f5Var;
            amVar.d.setAnimatedEmojiDrawable(f5Var);
            int[] iArr = o8.c0[amVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            u10 u10Var = new u10();
            amVar.f = u10Var;
            u10Var.d(i11, i12, i13, i14);
            amVar.x = 0.0f;
            amVar.b();
            amVar.invalidate();
        }
    }
}
