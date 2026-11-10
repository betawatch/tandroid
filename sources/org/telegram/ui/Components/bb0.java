package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bb0 extends km0 {
    public final /* synthetic */ hb0 d;

    public bb0(hb0 hb0Var) {
        this.d = hb0Var;
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.km0
    public final void c(boolean z9) {
        this.d.a(!z9);
    }

    @Override // org.telegram.ui.Components.km0
    public final CharSequence d() {
        hb0 hb0Var = this.d;
        org.telegram.messenger.d20 d20Var = hb0Var.u0;
        return d20Var != null ? (CharSequence) d20Var.a(Integer.valueOf(hb0Var.H)) : hb0Var.d(hb0Var.H);
    }
}
