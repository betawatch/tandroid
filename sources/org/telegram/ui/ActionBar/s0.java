package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s0 extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ int e0;
    public final /* synthetic */ w0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(w0 w0Var, int i7) {
        super(false, true, true);
        this.e0 = i7;
        this.f0 = w0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.e0) {
            case 0:
                this.f0.invalidate();
                break;
            default:
                this.f0.invalidate();
                break;
        }
    }
}
