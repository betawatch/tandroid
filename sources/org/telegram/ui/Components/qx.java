package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
