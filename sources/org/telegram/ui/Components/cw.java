package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(yy yyVar, Context context, boolean z10) {
        super(context);
        this.b = yyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        yy yyVar = this.b;
        iw iwVar = yyVar.x0;
        ew ewVar = yyVar.z0;
        hw hwVar = yyVar.C0;
        if (this.a || !(view == ewVar || view == hwVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = iwVar.getY() + iwVar.getMeasuredHeight() + 1.0f;
        if (view == ewVar) {
            y10 = Math.max(y10, hwVar.getY() + hwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * yyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yy yyVar = this.b;
        yyVar.G0 = true;
        yyVar.a0();
        ow owVar = yyVar.P0;
        if (owVar != null) {
            owVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yy yyVar = this.b;
        yyVar.G0 = false;
        yyVar.a0();
        ow owVar = yyVar.P0;
        if (owVar != null) {
            owVar.a();
        }
    }
}
