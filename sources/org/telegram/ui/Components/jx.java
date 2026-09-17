package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class jx extends FrameLayout {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.a;
        jw jwVar = kzVar.I;
        kw kwVar = kzVar.V;
        kx kxVar = kzVar.P;
        if (view != kxVar && view != kwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f;
        if (view == kxVar && kwVar != null) {
            y3 = Math.max(y3, kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
