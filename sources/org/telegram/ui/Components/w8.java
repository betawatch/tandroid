package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w8 implements Runnable {
    public final /* synthetic */ tl a;

    public w8(tl tlVar) {
        this.a = tlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jh.y2 y2Var;
        tl tlVar = this.a;
        AndroidUtilities.runOnUIThread(tlVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = tlVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || tlVar.w != 1.0f) {
            return;
        }
        if (tlVar.x || ((y2Var = tlVar.b.k) != null && y2Var.hasImageLoaded())) {
            int i10 = tlVar.v + 1;
            tlVar.v = i10;
            tlVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                tlVar.v = 0;
            }
            if (tlVar.s > 6) {
                tlVar.s = 0;
            }
            k5 k5Var = new k5(4, tlVar.r, tL_emojiList.document_id.get(tlVar.v).longValue());
            tlVar.a = k5Var;
            tlVar.d.setAnimatedEmojiDrawable(k5Var);
            int[] iArr = v8.Y[tlVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            c20 c20Var = new c20();
            tlVar.f = c20Var;
            c20Var.d(i11, i12, i13, i14);
            tlVar.w = 0.0f;
            tlVar.b();
            tlVar.invalidate();
        }
    }
}
