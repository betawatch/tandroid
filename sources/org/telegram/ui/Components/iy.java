package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class iy extends i9 {
    public final /* synthetic */ jy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(jy jyVar, Context context) {
        super(context);
        this.H = jyVar;
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jy jyVar = this.H;
        ly lyVar = jyVar.d;
        boolean z10 = jyVar.c;
        if (z10) {
            return;
        }
        if (!org.telegram.messenger.si.b0(lyVar.d1).v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || lyVar.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), lyVar.t1);
    }
}
