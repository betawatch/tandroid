package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class px extends FrameLayout {
    public final /* synthetic */ sz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(sz szVar, Context context) {
        super(context);
        this.a = szVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sz szVar = this.a;
        ux uxVar = szVar.I;
        rw rwVar = szVar.V;
        dy dyVar = szVar.P;
        if (view != dyVar && view != rwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = uxVar.getY() + uxVar.getMeasuredHeight() + 1.0f;
        if (view == dyVar && rwVar != null) {
            y3 = Math.max(y3, rwVar.getY() + rwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * szVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
