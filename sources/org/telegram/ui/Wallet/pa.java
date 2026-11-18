package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class pa extends FrameLayout {
    public final /* synthetic */ ra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(ra raVar, Context context) {
        super(context);
        this.a = raVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        ra raVar = this.a;
        raVar.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (raVar.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
