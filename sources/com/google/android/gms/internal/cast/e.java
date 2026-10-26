package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final e6.j c;
    public final e6.b d;
    public final p e;

    public e(Context context, e6.b bVar, p pVar) {
        String K;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            K = d6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            K = n4.s.K(new n4.s(13, str, unmodifiableList));
        }
        this.c = new e6.j(this);
        this.a = context.getApplicationContext();
        o6.l.f(K);
        this.b = K;
        this.d = bVar;
        this.e = pVar;
    }
}
