package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qe implements r1.d {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ jt0 c;

    public qe(float f10, jt0 jt0Var) {
        this.b = f10;
        this.c = jt0Var;
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
