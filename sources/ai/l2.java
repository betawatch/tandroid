package ai;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l2 extends org.telegram.ui.Components.e5 {
    public final /* synthetic */ m2 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, ViewGroup viewGroup, int i3) {
        super(i3, viewGroup);
        this.N = m2Var;
    }

    @Override // org.telegram.ui.Components.e5, org.telegram.ui.Components.m5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
