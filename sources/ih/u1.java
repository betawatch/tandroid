package ih;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u1 extends org.telegram.ui.Components.n5 {
    public final /* synthetic */ v1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.I = v1Var;
    }

    @Override // org.telegram.ui.Components.n5, org.telegram.ui.Components.v5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.I;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
