package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xv extends FrameLayout {
    public final /* synthetic */ yy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(yy yyVar, Context context) {
        super(context);
        this.a = yyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        yy yyVar = this.a;
        bw bwVar = yyVar.k0;
        if (view != yyVar.d0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, bwVar.getY() + bwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
