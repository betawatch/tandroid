package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x8 implements Runnable {
    public final /* synthetic */ em a;

    public x8(em emVar) {
        this.a = emVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh.z2 z2Var;
        em emVar = this.a;
        AndroidUtilities.runOnUIThread(emVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = emVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || emVar.w != 1.0f) {
            return;
        }
        if (emVar.x || ((z2Var = emVar.b.k) != null && z2Var.hasImageLoaded())) {
            int i10 = emVar.v + 1;
            emVar.v = i10;
            emVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                emVar.v = 0;
            }
            if (emVar.s > 6) {
                emVar.s = 0;
            }
            l5 l5Var = new l5(4, emVar.r, tL_emojiList.document_id.get(emVar.v).longValue());
            emVar.a = l5Var;
            emVar.d.setAnimatedEmojiDrawable(l5Var);
            int[] iArr = w8.Z[emVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            q20 q20Var = new q20();
            emVar.f = q20Var;
            q20Var.d(i11, i12, i13, i14);
            emVar.w = 0.0f;
            emVar.b();
            emVar.invalidate();
        }
    }
}
