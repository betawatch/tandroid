package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class uz {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
        if (((rh.b) this.c) != bVar) {
            org.telegram.messenger.g0.r(z0Var);
            this.c = bVar;
            if (z10) {
                ((hi.s6) this.b).a(bVar);
            }
            if (bVar == rh.b.b || bVar == rh.b.c) {
                org.telegram.messenger.g0.h3(z0Var, this.a);
            }
        }
    }
}
