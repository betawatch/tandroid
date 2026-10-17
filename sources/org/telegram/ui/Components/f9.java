package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ rm a;

    public f9(rm rmVar) {
        this.a = rmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.g3 g3Var;
        rm rmVar = this.a;
        AndroidUtilities.runOnUIThread(rmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = rmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || rmVar.w != 1.0f) {
            return;
        }
        if (rmVar.x || ((g3Var = rmVar.b.k) != null && g3Var.hasImageLoaded())) {
            int i10 = rmVar.v + 1;
            rmVar.v = i10;
            rmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                rmVar.v = 0;
            }
            if (rmVar.s > 6) {
                rmVar.s = 0;
            }
            r5 r5Var = new r5(4, rmVar.r, tL_emojiList.document_id.get(rmVar.v).longValue());
            rmVar.a = r5Var;
            rmVar.d.setAnimatedEmojiDrawable(r5Var);
            int[] iArr = e9.c0[rmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            x20 x20Var = new x20();
            rmVar.f = x20Var;
            x20Var.d(i11, i12, i13, i14);
            rmVar.w = 0.0f;
            rmVar.b();
            rmVar.invalidate();
        }
    }
}
