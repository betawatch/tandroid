package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jf implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ nw0 c;

    public jf(float f7, nw0 nw0Var) {
        this.b = f7;
        this.c = nw0Var;
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
