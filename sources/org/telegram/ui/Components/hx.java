package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hx extends FrameLayout {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kz kzVar = this.a;
        fw fwVar = kzVar.F;
        gw gwVar = kzVar.S;
        ix ixVar = kzVar.M;
        if (view != ixVar && view != gwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = fwVar.getY() + fwVar.getMeasuredHeight() + 1.0f;
        if (view == ixVar && gwVar != null) {
            y10 = Math.max(y10, gwVar.getY() + gwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * kzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
