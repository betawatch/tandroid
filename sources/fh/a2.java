package fh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a2 extends org.telegram.ui.Components.i5 {
    public final /* synthetic */ b2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, ViewGroup viewGroup, int i9) {
        super(i9, viewGroup);
        this.I = b2Var;
    }

    @Override // org.telegram.ui.Components.i5, org.telegram.ui.Components.q5
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.I;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
