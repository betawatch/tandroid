package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final g6.j c;
    public final g6.b d;
    public final p e;

    public e(Context context, g6.b bVar, p pVar) {
        String n02;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            n02 = f6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            n02 = wf.b.n0(new wf.b(18, str, unmodifiableList));
        }
        this.c = new g6.j(this);
        this.a = context.getApplicationContext();
        q6.m.e(n02);
        this.b = n02;
        this.d = bVar;
        this.e = pVar;
    }
}
