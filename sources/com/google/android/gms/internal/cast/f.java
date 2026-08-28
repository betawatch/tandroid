package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final String b;
    public final n5.j c;
    public final n5.b d;
    public final q e;

    public f(Context context, n5.b bVar, q qVar) {
        String v;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            v = m5.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            v = g5.b.v(new g5.b(str, unmodifiableList, false, 20));
        }
        this.c = new n5.j(this);
        this.a = context.getApplicationContext();
        x5.l.f(v);
        this.b = v;
        this.d = bVar;
        this.e = qVar;
    }
}
