package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qy extends q9 {
    public final /* synthetic */ ry H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(ry ryVar, Context context) {
        super(context);
        this.H = ryVar;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ry ryVar = this.H;
        ty tyVar = ryVar.d;
        boolean z10 = ryVar.c;
        if (z10) {
            return;
        }
        if (!org.telegram.messenger.si.d0(tyVar.d1).v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || tyVar.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), tyVar.t1);
    }
}
