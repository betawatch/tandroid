package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ze implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ gv0 c;

    public ze(float f10, gv0 gv0Var) {
        this.b = f10;
        this.c = gv0Var;
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
