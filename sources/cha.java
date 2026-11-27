// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
