package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hz {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.d;
        if (((rh.b) this.c) != bVar) {
            org.telegram.messenger.g0.r(m5Var);
            this.c = bVar;
            if (z9) {
                ((ii.c) this.b).a(bVar);
            }
            if (bVar == rh.b.b || bVar == rh.b.c) {
                org.telegram.messenger.g0.i3(m5Var, this.a);
            }
        }
    }
}
