// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class er1 extends dl1 {
    public final /* synthetic */ zu1 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er1(zu1 zu1Var, vnb vnbVar, Context context) {
        super(vnbVar, context, false);
        this.z2 = zu1Var;
    }

    @Override // dl1, android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        zu1 zu1Var = this.z2;
        if (zu1Var.R8 == null) {
            float y = ((zu1Var.A0.getY() + zu1Var.P9) - getY()) - hl.L(4.0f);
            aVar = ((e) zu1Var).actionBar;
            if (aVar.getVisibility() == 0 || zu1Var.Aa != null) {
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
        zu1 zu1Var = this.z2;
        aVar = ((e) zu1Var).actionBar;
        if (aVar.z() || zu1Var.c8()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // dl1, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        zu1 zu1Var = this.z2;
        aVar = ((e) zu1Var).actionBar;
        if (aVar.z() || zu1Var.c8()) {
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
