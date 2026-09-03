package lh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class t1 extends org.telegram.ui.Components.j5 {
    public final /* synthetic */ u1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.J = u1Var;
    }

    @Override // org.telegram.ui.Components.j5, org.telegram.ui.Components.r5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.J;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
