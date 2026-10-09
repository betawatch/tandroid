package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h9 implements Runnable {
    public final /* synthetic */ xm a;

    public h9(xm xmVar) {
        this.a = xmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai.m4 m4Var;
        xm xmVar = this.a;
        AndroidUtilities.runOnUIThread(xmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = xmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || xmVar.w != 1.0f) {
            return;
        }
        if (xmVar.x || ((m4Var = xmVar.b.k) != null && m4Var.hasImageLoaded())) {
            int i10 = xmVar.v + 1;
            xmVar.v = i10;
            xmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                xmVar.v = 0;
            }
            if (xmVar.s > 6) {
                xmVar.s = 0;
            }
            s5 s5Var = new s5(4, xmVar.r, tL_emojiList.document_id.get(xmVar.v).longValue());
            xmVar.a = s5Var;
            xmVar.d.setAnimatedEmojiDrawable(s5Var);
            int[] iArr = g9.c0[xmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            f30 f30Var = new f30();
            xmVar.f = f30Var;
            f30Var.d(i11, i12, i13, i14);
            xmVar.w = 0.0f;
            xmVar.b();
            xmVar.invalidate();
        }
    }
}
