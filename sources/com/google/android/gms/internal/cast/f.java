package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final String b;
    public final d6.j c;
    public final d6.b d;
    public final r e;

    public f(Context context, d6.b bVar, r rVar) {
        String g02;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            g02 = c6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            g02 = qf.b.g0(new qf.b(9, str, unmodifiableList));
        }
        this.c = new d6.j(this);
        this.a = context.getApplicationContext();
        n6.l.f(g02);
        this.b = g02;
        this.d = bVar;
        this.e = rVar;
    }
}
