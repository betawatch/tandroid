package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vw extends FrameLayout {
    public final /* synthetic */ yy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(yy yyVar, Context context) {
        super(context);
        this.a = yyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        yy yyVar = this.a;
        uv uvVar = yyVar.E;
        vv vvVar = yyVar.R;
        ww wwVar = yyVar.L;
        if (view != wwVar && view != vvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = uvVar.getY() + uvVar.getMeasuredHeight() + 1.0f;
        if (view == wwVar && vvVar != null) {
            y10 = Math.max(y10, vvVar.getY() + vvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * yyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
