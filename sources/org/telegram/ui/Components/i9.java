package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i9 implements Runnable {
    public final /* synthetic */ um a;

    public i9(um umVar) {
        this.a = umVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bi.b4 b4Var;
        um umVar = this.a;
        AndroidUtilities.runOnUIThread(umVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = umVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || umVar.w != 1.0f) {
            return;
        }
        if (umVar.x || ((b4Var = umVar.b.k) != null && b4Var.hasImageLoaded())) {
            int i10 = umVar.v + 1;
            umVar.v = i10;
            umVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                umVar.v = 0;
            }
            if (umVar.s > 6) {
                umVar.s = 0;
            }
            s5 s5Var = new s5(4, umVar.r, tL_emojiList.document_id.get(umVar.v).longValue());
            umVar.a = s5Var;
            umVar.d.setAnimatedEmojiDrawable(s5Var);
            int[] iArr = h9.c0[umVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            b30 b30Var = new b30();
            umVar.f = b30Var;
            b30Var.d(i11, i12, i13, i14);
            umVar.w = 0.0f;
            umVar.b();
            umVar.invalidate();
        }
    }
}
