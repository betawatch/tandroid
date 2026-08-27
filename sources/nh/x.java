package nh;

import org.telegram.ui.ActionBar.c5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x extends c5 {
    public final /* synthetic */ a0 p;

    public x(a0 a0Var) {
        this.p = a0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
