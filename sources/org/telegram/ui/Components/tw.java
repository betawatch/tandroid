package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class tw extends FrameLayout {
    public final /* synthetic */ ty a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(ty tyVar, Context context) {
        super(context);
        this.a = tyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.a;
        yw ywVar = tyVar.J;
        vv vvVar = tyVar.W;
        gx gxVar = tyVar.Q;
        if (view != gxVar && view != vvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f;
        if (view == gxVar && vvVar != null) {
            y10 = Math.max(y10, vvVar.getY() + vvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * tyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
