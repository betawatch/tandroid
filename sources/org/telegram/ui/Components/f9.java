package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ im a;

    public f9(im imVar) {
        this.a = imVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai.l4 l4Var;
        im imVar = this.a;
        AndroidUtilities.runOnUIThread(imVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = imVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || imVar.w != 1.0f) {
            return;
        }
        if (imVar.x || ((l4Var = imVar.b.k) != null && l4Var.hasImageLoaded())) {
            int i10 = imVar.v + 1;
            imVar.v = i10;
            imVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                imVar.v = 0;
            }
            if (imVar.s > 6) {
                imVar.s = 0;
            }
            q5 q5Var = new q5(4, imVar.r, tL_emojiList.document_id.get(imVar.v).longValue());
            imVar.a = q5Var;
            imVar.d.setAnimatedEmojiDrawable(q5Var);
            int[] iArr = e9.c0[imVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            r20 r20Var = new r20();
            imVar.f = r20Var;
            r20Var.d(i11, i12, i13, i14);
            imVar.w = 0.0f;
            imVar.b();
            imVar.invalidate();
        }
    }
}
