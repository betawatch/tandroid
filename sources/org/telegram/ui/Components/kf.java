package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kf implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ ev0 c;

    public kf(float f7, ev0 ev0Var) {
        this.b = f7;
        this.c = ev0Var;
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
