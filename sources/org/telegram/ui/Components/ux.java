package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ux extends FrameLayout {
    public final /* synthetic */ wz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(wz wzVar, Context context) {
        super(context);
        this.a = wzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wz wzVar = this.a;
        zx zxVar = wzVar.I;
        vw vwVar = wzVar.V;
        iy iyVar = wzVar.P;
        if (view != iyVar && view != vwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = zxVar.getY() + zxVar.getMeasuredHeight() + 1.0f;
        if (view == iyVar && vwVar != null) {
            y3 = Math.max(y3, vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * wzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
