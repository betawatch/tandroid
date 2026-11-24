// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cs1 extends awb {
    public final /* synthetic */ yv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs1(yv1 yv1Var, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context);
        this.e = yv1Var;
    }

    @Override // awb, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        yv1 yv1Var = this.e;
        aVar = ((d) yv1Var).actionBar;
        if (aVar.y() || yv1Var.c8()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
