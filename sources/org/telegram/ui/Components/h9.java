package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h9 implements Runnable {
    public final /* synthetic */ sm a;

    public h9(sm smVar) {
        this.a = smVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di.f3 f3Var;
        sm smVar = this.a;
        AndroidUtilities.runOnUIThread(smVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = smVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || smVar.w != 1.0f) {
            return;
        }
        if (smVar.x || ((f3Var = smVar.b.k) != null && f3Var.hasImageLoaded())) {
            int i10 = smVar.v + 1;
            smVar.v = i10;
            smVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                smVar.v = 0;
            }
            if (smVar.s > 6) {
                smVar.s = 0;
            }
            t5 t5Var = new t5(4, smVar.r, tL_emojiList.document_id.get(smVar.v).longValue());
            smVar.a = t5Var;
            smVar.d.setAnimatedEmojiDrawable(t5Var);
            int[] iArr = g9.c0[smVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            z20 z20Var = new z20();
            smVar.f = z20Var;
            z20Var.d(i11, i12, i13, i14);
            smVar.w = 0.0f;
            smVar.b();
            smVar.invalidate();
        }
    }
}
