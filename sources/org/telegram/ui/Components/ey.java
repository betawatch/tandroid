package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ey extends l9 {
    public final /* synthetic */ fy G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(fy fyVar, Context context) {
        super(context);
        this.G = fyVar;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fy fyVar = this.G;
        hy hyVar = fyVar.d;
        boolean z9 = fyVar.c;
        if (z9) {
            return;
        }
        if (!org.telegram.messenger.ui.b0(hyVar.c1).u0[z9 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || hyVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), hyVar.s1);
    }
}
