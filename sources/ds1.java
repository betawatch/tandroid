// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ds1 extends cm1 {
    public final /* synthetic */ yv1 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds1(yv1 yv1Var, ylb ylbVar, Context context) {
        super(ylbVar, context, false);
        this.z2 = yv1Var;
    }

    @Override // cm1, android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        yv1 yv1Var = this.z2;
        if (yv1Var.R8 == null) {
            float y = ((yv1Var.A0.getY() + yv1Var.P9) - getY()) - gm.L(4.0f);
            aVar = ((d) yv1Var).actionBar;
            if (aVar.getVisibility() == 0 || yv1Var.Aa != null) {
                y -= a.getCurrentActionBarHeight() / 2.0f;
            }
            if (y <= 0.0f) {
                super.onDraw(canvas);
            } else if (y < getMeasuredHeight()) {
                canvas.save();
                canvas.clipRect(0.0f, y, getMeasuredWidth(), getMeasuredHeight());
                super.onDraw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        yv1 yv1Var = this.z2;
        aVar = ((d) yv1Var).actionBar;
        if (aVar.y() || yv1Var.c8()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // cm1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        yv1 yv1Var = this.z2;
        aVar = ((d) yv1Var).actionBar;
        if (aVar.y() || yv1Var.c8()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        setVisibility(f > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
