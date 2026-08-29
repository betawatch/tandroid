package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cx extends FrameLayout {
    public final /* synthetic */ fz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(fz fzVar, Context context) {
        super(context);
        this.a = fzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fz fzVar = this.a;
        bw bwVar = fzVar.E;
        cw cwVar = fzVar.R;
        dx dxVar = fzVar.L;
        if (view != dxVar && view != cwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y8 = bwVar.getY() + bwVar.getMeasuredHeight() + 1.0f;
        if (view == dxVar && cwVar != null) {
            y8 = Math.max(y8, cwVar.getY() + cwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y8 - (AndroidUtilities.dp(16.0f) * fzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
