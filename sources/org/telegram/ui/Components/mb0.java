package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mb0 extends wm0 {
    public final /* synthetic */ sb0 d;

    public mb0(sb0 sb0Var) {
        this.d = sb0Var;
    }

    @Override // org.telegram.ui.Components.wm0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.wm0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.wm0
    public final CharSequence d() {
        sb0 sb0Var = this.d;
        org.telegram.messenger.y10 y10Var = sb0Var.v0;
        return y10Var != null ? (CharSequence) y10Var.a(Integer.valueOf(sb0Var.I)) : sb0Var.d(sb0Var.I);
    }
}
