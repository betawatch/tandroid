package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dy extends l9 {
    public final /* synthetic */ ey G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(ey eyVar, Context context) {
        super(context);
        this.G = eyVar;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ey eyVar = this.G;
        gy gyVar = eyVar.d;
        boolean z9 = eyVar.c;
        if (z9) {
            return;
        }
        if (!org.telegram.messenger.ui.b0(gyVar.c1).u0[z9 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) || gyVar.s1 == null) {
            return;
        }
        canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), gyVar.s1);
    }
}
