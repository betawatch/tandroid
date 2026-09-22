package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ix extends FrameLayout {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.a;
        nx nxVar = kzVar.I;
        jw jwVar = kzVar.V;
        vx vxVar = kzVar.P;
        if (view != vxVar && view != jwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = nxVar.getY() + nxVar.getMeasuredHeight() + 1.0f;
        if (view == vxVar && jwVar != null) {
            y3 = Math.max(y3, jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
