package ch;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final /* synthetic */ b0 d;

    public y(b0 b0Var) {
        this.d = b0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.g0.T1(b0Var.e, org.telegram.messenger.g0.L(8.0f), b0Var.j);
        float measuredWidth = view.getMeasuredWidth();
        float measuredHeight = view.getMeasuredHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        RectF rectF2 = b0Var.f;
        float f10 = b0Var.j;
        RectF rectF3 = this.c;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
