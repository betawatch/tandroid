package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z8 implements Runnable {
    public final /* synthetic */ im a;

    public z8(im imVar) {
        this.a = imVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fi.s2 s2Var;
        im imVar = this.a;
        org.telegram.messenger.g0.h3(imVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = imVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || imVar.x != 1.0f) {
            return;
        }
        if (imVar.y || ((s2Var = imVar.b.k) != null && s2Var.J())) {
            int i7 = imVar.w + 1;
            imVar.w = i7;
            imVar.s++;
            if (i7 > tL_emojiList.document_id.size() - 1) {
                imVar.w = 0;
            }
            if (imVar.s > 6) {
                imVar.s = 0;
            }
            p5 p5Var = new p5(4, imVar.r, tL_emojiList.document_id.get(imVar.w).longValue());
            imVar.a = p5Var;
            imVar.d.setAnimatedEmojiDrawable(p5Var);
            int[] iArr = y8.d0[imVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            s10 s10Var = new s10();
            imVar.f = s10Var;
            s10Var.d(i10, i11, i12, i13);
            imVar.x = 0.0f;
            imVar.b();
            imVar.invalidate();
        }
    }
}
