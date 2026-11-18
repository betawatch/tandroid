package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sz {
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
                ((hi.t6) this.b).a(bVar);
            }
            if (bVar == rh.b.b || bVar == rh.b.c) {
                org.telegram.messenger.g0.h3(z0Var, this.a);
            }
        }
    }
}
