package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ze implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ fv0 c;

    public ze(float f10, fv0 fv0Var) {
        this.b = f10;
        this.c = fv0Var;
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
