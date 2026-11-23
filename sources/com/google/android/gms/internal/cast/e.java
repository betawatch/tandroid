package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final g6.j c;
    public final g6.b d;
    public final p e;

    public e(Context context, g6.b bVar, p pVar) {
        String h;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            h = f6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            h = q4.q.h(new q4.q(str, unmodifiableList, false, 20));
        }
        this.c = new g6.j(this);
        this.a = context.getApplicationContext();
        q6.m.f(h);
        this.b = h;
        this.d = bVar;
        this.e = pVar;
    }
}
