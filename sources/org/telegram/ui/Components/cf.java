package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cf implements o1.h {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ xu0 c;

    public cf(float f9, xu0 xu0Var) {
        this.b = f9;
        this.c = xu0Var;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        if (this.a || f9 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
