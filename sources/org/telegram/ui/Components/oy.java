package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oy extends q9 {
    public final /* synthetic */ py H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(py pyVar, Context context) {
        super(context);
        this.H = pyVar;
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        py pyVar = this.H;
        ry ryVar = pyVar.d;
        boolean z10 = pyVar.c;
        if (z10) {
            return;
        }
        if (!org.telegram.messenger.ri.d0(ryVar.d1).v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || ryVar.t1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), ryVar.t1);
    }
}
