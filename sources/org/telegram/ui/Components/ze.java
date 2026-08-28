package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ze implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ mu0 c;

    public ze(float f10, mu0 mu0Var) {
        this.b = f10;
        this.c = mu0Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
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
