package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mf implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ iw0 c;

    public mf(float f7, iw0 iw0Var) {
        this.b = f7;
        this.c = iw0Var;
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
