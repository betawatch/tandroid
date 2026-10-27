package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
