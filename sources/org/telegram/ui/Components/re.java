package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class re implements r1.d {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ it0 c;

    public re(float f10, it0 it0Var) {
        this.b = f10;
        this.c = it0Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        if (this.a || f10 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
