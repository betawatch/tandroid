package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e9 implements Runnable {
    public final /* synthetic */ mm a;

    public e9(mm mmVar) {
        this.a = mmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg.h1 h1Var;
        mm mmVar = this.a;
        AndroidUtilities.runOnUIThread(mmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = mmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || mmVar.w != 1.0f) {
            return;
        }
        if (mmVar.x || ((h1Var = mmVar.b.k) != null && h1Var.hasImageLoaded())) {
            int i10 = mmVar.v + 1;
            mmVar.v = i10;
            mmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                mmVar.v = 0;
            }
            if (mmVar.s > 6) {
                mmVar.s = 0;
            }
            p5 p5Var = new p5(4, mmVar.r, tL_emojiList.document_id.get(mmVar.v).longValue());
            mmVar.a = p5Var;
            mmVar.d.setAnimatedEmojiDrawable(p5Var);
            int[] iArr = d9.c0[mmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            x20 x20Var = new x20();
            mmVar.f = x20Var;
            x20Var.d(i11, i12, i13, i14);
            mmVar.w = 0.0f;
            mmVar.b();
            mmVar.invalidate();
        }
    }
}
