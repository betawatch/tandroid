package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x8 implements Runnable {
    public final /* synthetic */ cm a;

    public x8(cm cmVar) {
        this.a = cmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nh.y2 y2Var;
        cm cmVar = this.a;
        AndroidUtilities.runOnUIThread(cmVar.y, 1000L);
        TLRPC.TL_emojiList tL_emojiList = cmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || cmVar.w != 1.0f) {
            return;
        }
        if (cmVar.x || ((y2Var = cmVar.b.k) != null && y2Var.hasImageLoaded())) {
            int i10 = cmVar.v + 1;
            cmVar.v = i10;
            cmVar.s++;
            if (i10 > tL_emojiList.document_id.size() - 1) {
                cmVar.v = 0;
            }
            if (cmVar.s > 6) {
                cmVar.s = 0;
            }
            l5 l5Var = new l5(4, cmVar.r, tL_emojiList.document_id.get(cmVar.v).longValue());
            cmVar.a = l5Var;
            cmVar.d.setAnimatedEmojiDrawable(l5Var);
            int[] iArr = w8.Z[cmVar.s];
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            q20 q20Var = new q20();
            cmVar.f = q20Var;
            q20Var.d(i11, i12, i13, i14);
            cmVar.w = 0.0f;
            cmVar.b();
            cmVar.invalidate();
        }
    }
}
