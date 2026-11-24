// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lfa implements View.OnLayoutChangeListener {
    public final /* synthetic */ nha a;

    public lfa(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        r7 r7Var = this.a.q0;
        if (r7Var == null) {
            return;
        }
        r7Var.setTranslationX(((View) r7Var.getParent()).getMeasuredWidth() - r7Var.getRight());
    }
}
