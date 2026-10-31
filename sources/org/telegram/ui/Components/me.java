package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class me implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ lu0 c;

    public me(float f7, lu0 lu0Var) {
        this.b = f7;
        this.c = lu0Var;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
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
