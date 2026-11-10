package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hz {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.p5 p5Var = (org.telegram.ui.ActionBar.p5) this.d;
        if (((rh.b) this.c) != bVar) {
            org.telegram.messenger.g0.r(p5Var);
            this.c = bVar;
            if (z9) {
                ((ii.c) this.b).a(bVar);
            }
            if (bVar == rh.b.b || bVar == rh.b.c) {
                org.telegram.messenger.g0.i3(p5Var, this.a);
            }
        }
    }
}
