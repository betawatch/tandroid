package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qx extends FrameLayout {
    public final /* synthetic */ tz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(tz tzVar, Context context) {
        super(context);
        this.a = tzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tz tzVar = this.a;
        vx vxVar = tzVar.I;
        rw rwVar = tzVar.V;
        ey eyVar = tzVar.P;
        if (view != eyVar && view != rwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = vxVar.getY() + vxVar.getMeasuredHeight() + 1.0f;
        if (view == eyVar && rwVar != null) {
            y3 = Math.max(y3, rwVar.getY() + rwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * tzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
