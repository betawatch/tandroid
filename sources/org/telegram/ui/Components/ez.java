package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ez {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(sh.b bVar, boolean z10) {
        r4.u uVar = (r4.u) this.d;
        if (((sh.b) this.c) != bVar) {
            org.telegram.messenger.g0.r(uVar);
            this.c = bVar;
            if (z10) {
                ((gi.j8) this.b).a(bVar);
            }
            if (bVar == sh.b.b || bVar == sh.b.c) {
                org.telegram.messenger.g0.i3(uVar, this.a);
            }
        }
    }
}
