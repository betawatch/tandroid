package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class kx extends FrameLayout {
    public final /* synthetic */ lz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(lz lzVar, Context context) {
        super(context);
        this.a = lzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.a;
        px pxVar = lzVar.I;
        kw kwVar = lzVar.V;
        xx xxVar = lzVar.P;
        if (view != xxVar && view != kwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = pxVar.getY() + pxVar.getMeasuredHeight() + 1.0f;
        if (view == xxVar && kwVar != null) {
            y3 = Math.max(y3, kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
