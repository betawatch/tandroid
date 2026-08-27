package gh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x1 extends org.telegram.ui.Components.i5 {
    public final /* synthetic */ y1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.I = y1Var;
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
