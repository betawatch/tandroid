package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.Components.e5 {
    public final /* synthetic */ e2 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = e2Var;
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
