package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d3 extends org.telegram.ui.Components.m5 {
    public final /* synthetic */ e3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(e3 e3Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = e3Var;
    }

    @Override // org.telegram.ui.Components.m5, org.telegram.ui.Components.u5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
