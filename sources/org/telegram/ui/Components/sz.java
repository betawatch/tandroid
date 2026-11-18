package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
