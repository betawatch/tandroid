package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.Components.n5 {
    public final /* synthetic */ c3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = c3Var;
    }

    @Override // org.telegram.ui.Components.n5, org.telegram.ui.Components.v5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
