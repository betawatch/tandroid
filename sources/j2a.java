// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j2a extends h21 {
    public int c;

    @Override // z11, snb
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(aob.yj);
            de0 de0Var = this.a;
            if (de0Var != null && themedColor != this.c) {
                this.c = themedColor;
                de0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
