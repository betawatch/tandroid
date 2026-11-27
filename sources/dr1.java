// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
