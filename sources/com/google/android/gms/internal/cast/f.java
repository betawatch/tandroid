package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final String b;
    public final d6.j c;
    public final d6.b d;
    public final r e;

    public f(Context context, d6.b bVar, r rVar) {
        String N;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            N = c6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            N = n4.y.N(new n4.y(8, str, unmodifiableList));
        }
        this.c = new d6.j(this);
        this.a = context.getApplicationContext();
        n6.l.f(N);
        this.b = N;
        this.d = bVar;
        this.e = rVar;
    }
}
