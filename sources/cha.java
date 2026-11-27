// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cha implements View.OnLayoutChangeListener {
    public final /* synthetic */ eja a;

    public cha(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        s7 s7Var = this.a.q0;
        if (s7Var == null) {
            return;
        }
        s7Var.setTranslationX(((View) s7Var.getParent()).getMeasuredWidth() - s7Var.getRight());
    }
}
