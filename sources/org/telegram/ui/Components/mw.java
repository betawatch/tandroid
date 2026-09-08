package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mw extends FrameLayout {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.a;
        qw qwVar = kzVar.o0;
        if (view != kzVar.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, qwVar.getY() + qwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
