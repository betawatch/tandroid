package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class jf implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ rv0 c;

    public jf(float f7, rv0 rv0Var) {
        this.b = f7;
        this.c = rv0Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        if (this.a || f7 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
