package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final String b;
    public final n5.k c;
    public final n5.b d;
    public final p e;

    public f(Context context, n5.b bVar, p pVar) {
        String v;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            v = m5.z.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            v = g5.b.v(new g5.b(str, unmodifiableList, false, 21));
        }
        this.c = new n5.k(this);
        this.a = context.getApplicationContext();
        y5.l.f(v);
        this.b = v;
        this.d = bVar;
        this.e = pVar;
    }
}
