package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ gm a;

    public f9(gm gmVar) {
        this.a = gmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai.l4 l4Var;
        gm gmVar = this.a;
        AndroidUtilities.runOnUIThread(gmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || gmVar.w != 1.0f) {
            return;
        }
        if (gmVar.x || ((l4Var = gmVar.b.k) != null && l4Var.hasImageLoaded())) {
            int i10 = gmVar.v + 1;
            gmVar.v = i10;
            gmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                gmVar.v = 0;
            }
            if (gmVar.s > 6) {
                gmVar.s = 0;
            }
            q5 q5Var = new q5(4, gmVar.r, tL_emojiList.document_id.get(gmVar.v).longValue());
            gmVar.a = q5Var;
            gmVar.d.setAnimatedEmojiDrawable(q5Var);
            int[] iArr = e9.c0[gmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            o20 o20Var = new o20();
            gmVar.f = o20Var;
            o20Var.d(i11, i12, i13, i14);
            gmVar.w = 0.0f;
            gmVar.b();
            gmVar.invalidate();
        }
    }
}
