package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final g6.j c;
    public final g6.b d;
    public final p e;

    public e(Context context, g6.b bVar, p pVar) {
        String g10;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            g10 = f6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            g10 = q4.q.g(new q4.q(str, unmodifiableList, false, 20));
        }
        this.c = new g6.j(this);
        this.a = context.getApplicationContext();
        q6.m.f(g10);
        this.b = g10;
        this.d = bVar;
        this.e = pVar;
    }
}
