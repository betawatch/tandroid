package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ox extends FrameLayout {
    public final /* synthetic */ rz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(rz rzVar, Context context) {
        super(context);
        this.a = rzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        rz rzVar = this.a;
        ow owVar = rzVar.I;
        pw pwVar = rzVar.V;
        px pxVar = rzVar.P;
        if (view != pxVar && view != pwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = owVar.getY() + owVar.getMeasuredHeight() + 1.0f;
        if (view == pxVar && pwVar != null) {
            y3 = Math.max(y3, pwVar.getY() + pwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * rzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
