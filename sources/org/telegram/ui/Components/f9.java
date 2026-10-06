package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ jm a;

    public f9(jm jmVar) {
        this.a = jmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai.l4 l4Var;
        jm jmVar = this.a;
        AndroidUtilities.runOnUIThread(jmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = jmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || jmVar.w != 1.0f) {
            return;
        }
        if (jmVar.x || ((l4Var = jmVar.b.k) != null && l4Var.hasImageLoaded())) {
            int i10 = jmVar.v + 1;
            jmVar.v = i10;
            jmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                jmVar.v = 0;
            }
            if (jmVar.s > 6) {
                jmVar.s = 0;
            }
            q5 q5Var = new q5(4, jmVar.r, tL_emojiList.document_id.get(jmVar.v).longValue());
            jmVar.a = q5Var;
            jmVar.d.setAnimatedEmojiDrawable(q5Var);
            int[] iArr = e9.c0[jmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            s20 s20Var = new s20();
            jmVar.f = s20Var;
            s20Var.d(i11, i12, i13, i14);
            jmVar.w = 0.0f;
            jmVar.b();
            jmVar.invalidate();
        }
    }
}
