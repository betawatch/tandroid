package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x8 implements Runnable {
    public final /* synthetic */ xl a;

    public x8(xl xlVar) {
        this.a = xlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih.z2 z2Var;
        xl xlVar = this.a;
        AndroidUtilities.runOnUIThread(xlVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = xlVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || xlVar.w != 1.0f) {
            return;
        }
        if (xlVar.x || ((z2Var = xlVar.b.k) != null && z2Var.hasImageLoaded())) {
            int i9 = xlVar.v + 1;
            xlVar.v = i9;
            xlVar.s++;
            if (i9 > tL_emojiList.document_id.size() - 1) {
                xlVar.v = 0;
            }
            if (xlVar.s > 6) {
                xlVar.s = 0;
            }
            k5 k5Var = new k5(4, xlVar.r, tL_emojiList.document_id.get(xlVar.v).longValue());
            xlVar.a = k5Var;
            xlVar.d.setAnimatedEmojiDrawable(k5Var);
            int[] iArr = w8.Y[xlVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            z10 z10Var = new z10();
            xlVar.f = z10Var;
            z10Var.d(i10, i11, i12, i13);
            xlVar.w = 0.0f;
            xlVar.b();
            xlVar.invalidate();
        }
    }
}
