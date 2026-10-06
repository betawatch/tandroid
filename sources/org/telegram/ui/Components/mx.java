package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class mx extends FrameLayout {
    public final /* synthetic */ nz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(nz nzVar, Context context) {
        super(context);
        this.a = nzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nz nzVar = this.a;
        rx rxVar = nzVar.I;
        nw nwVar = nzVar.V;
        zx zxVar = nzVar.P;
        if (view != zxVar && view != nwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = rxVar.getY() + rxVar.getMeasuredHeight() + 1.0f;
        if (view == zxVar && nwVar != null) {
            y3 = Math.max(y3, nwVar.getY() + nwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * nzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
