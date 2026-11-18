package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x2 extends org.telegram.ui.Components.m5 {
    public final /* synthetic */ y2 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = y2Var;
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
