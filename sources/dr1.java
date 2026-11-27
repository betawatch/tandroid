// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dr1 extends ayb {
    public final /* synthetic */ zu1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr1(zu1 zu1Var, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context);
        this.e = zu1Var;
    }

    @Override // ayb, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        zu1 zu1Var = this.e;
        aVar = ((e) zu1Var).actionBar;
        if (aVar.z() || zu1Var.c8()) {
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
