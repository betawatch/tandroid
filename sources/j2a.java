// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
