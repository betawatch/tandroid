package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u8 implements Runnable {
    public final /* synthetic */ sl a;

    public u8(sl slVar) {
        this.a = slVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di.z2 z2Var;
        sl slVar = this.a;
        org.telegram.messenger.g0.i3(slVar.D, 1000L);
        TLRPC.TL_emojiList tL_emojiList = slVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || slVar.x != 1.0f) {
            return;
        }
        if (slVar.y || ((z2Var = slVar.b.k) != null && z2Var.J())) {
            int i7 = slVar.w + 1;
            slVar.w = i7;
            slVar.s++;
            if (i7 > tL_emojiList.document_id.size() - 1) {
                slVar.w = 0;
            }
            if (slVar.s > 6) {
                slVar.s = 0;
            }
            i5 i5Var = new i5(4, slVar.r, tL_emojiList.document_id.get(slVar.w).longValue());
            slVar.a = i5Var;
            slVar.d.setAnimatedEmojiDrawable(i5Var);
            int[] iArr = t8.c0[slVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            e10 e10Var = new e10();
            slVar.f = e10Var;
            e10Var.d(i10, i11, i12, i13);
            slVar.x = 0.0f;
            slVar.b();
            slVar.invalidate();
        }
    }
}
