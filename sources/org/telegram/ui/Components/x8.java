package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x8 implements Runnable {
    public final /* synthetic */ dm a;

    public x8(dm dmVar) {
        this.a = dmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nh.y2 y2Var;
        dm dmVar = this.a;
        AndroidUtilities.runOnUIThread(dmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = dmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || dmVar.w != 1.0f) {
            return;
        }
        if (dmVar.x || ((y2Var = dmVar.b.k) != null && y2Var.hasImageLoaded())) {
            int i10 = dmVar.v + 1;
            dmVar.v = i10;
            dmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                dmVar.v = 0;
            }
            if (dmVar.s > 6) {
                dmVar.s = 0;
            }
            l5 l5Var = new l5(4, dmVar.r, tL_emojiList.document_id.get(dmVar.v).longValue());
            dmVar.a = l5Var;
            dmVar.d.setAnimatedEmojiDrawable(l5Var);
            int[] iArr = w8.Z[dmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            p20 p20Var = new p20();
            dmVar.f = p20Var;
            p20Var.d(i11, i12, i13, i14);
            dmVar.w = 0.0f;
            dmVar.b();
            dmVar.invalidate();
        }
    }
}
