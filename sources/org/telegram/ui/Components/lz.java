package org.telegram.ui.Components;

import java.io.Serializable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lz {
    public long a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(rh.b bVar, boolean z10) {
        q2.d dVar = (q2.d) this.d;
        if (((rh.b) this.c) != bVar) {
            org.telegram.messenger.g0.r(dVar);
            this.c = bVar;
            if (z10) {
                ((hi.g7) this.b).a(bVar);
            }
            if (bVar == rh.b.b || bVar == rh.b.c) {
                org.telegram.messenger.g0.i3(dVar, this.a);
            }
        }
    }
}
