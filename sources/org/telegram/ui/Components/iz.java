package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class iz {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(rh.b bVar, boolean z9) {
        org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) this.d;
        if (((rh.b) this.c) != bVar) {
            org.telegram.messenger.g0.r(o5Var);
            this.c = bVar;
            if (z9) {
                ((ii.c) this.b).a(bVar);
            }
            if (bVar == rh.b.b || bVar == rh.b.c) {
                org.telegram.messenger.g0.i3(o5Var, this.a);
            }
        }
    }
}
