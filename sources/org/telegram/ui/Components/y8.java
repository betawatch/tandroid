package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y8 implements Runnable {
    public final /* synthetic */ gm a;

    public y8(gm gmVar) {
        this.a = gmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fi.s2 s2Var;
        gm gmVar = this.a;
        org.telegram.messenger.g0.h3(gmVar.E, 1000L);
        TLRPC.TL_emojiList tL_emojiList = gmVar.n;
        if (tL_emojiList == null || tL_emojiList.document_id.isEmpty() || gmVar.x != 1.0f) {
            return;
        }
        if (gmVar.y || ((s2Var = gmVar.b.k) != null && s2Var.K())) {
            int i7 = gmVar.w + 1;
            gmVar.w = i7;
            gmVar.s++;
            if (i7 > tL_emojiList.document_id.size() - 1) {
                gmVar.w = 0;
            }
            if (gmVar.s > 6) {
                gmVar.s = 0;
            }
            o5 o5Var = new o5(4, gmVar.r, tL_emojiList.document_id.get(gmVar.w).longValue());
            gmVar.a = o5Var;
            gmVar.d.setAnimatedEmojiDrawable(o5Var);
            int[] iArr = x8.d0[gmVar.s];
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            q10 q10Var = new q10();
            gmVar.f = q10Var;
            q10Var.d(i10, i11, i12, i13);
            gmVar.x = 0.0f;
            gmVar.b();
            gmVar.invalidate();
        }
    }
}
