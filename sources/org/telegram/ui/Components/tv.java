package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tv extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(ly lyVar, Context context, boolean z10) {
        super(context);
        this.b = lyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ly lyVar = this.b;
        zv zvVar = lyVar.C0;
        vv vvVar = lyVar.E0;
        yv yvVar = lyVar.H0;
        if (this.a || !(view == vvVar || view == yvVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = zvVar.getY() + zvVar.getMeasuredHeight() + 1.0f;
        if (view == vvVar) {
            y10 = Math.max(y10, yvVar.getY() + yvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * lyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ly lyVar = this.b;
        lyVar.L0 = true;
        lyVar.Z();
        jg.d1 d1Var = lyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ly lyVar = this.b;
        lyVar.L0 = false;
        lyVar.Z();
        jg.d1 d1Var = lyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
