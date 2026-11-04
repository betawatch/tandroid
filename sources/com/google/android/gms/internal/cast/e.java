package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final f6.j c;
    public final f6.b d;
    public final q e;

    public e(Context context, f6.b bVar, q qVar) {
        String I;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            I = e6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            I = p4.q.I(new p4.q(str, unmodifiableList));
        }
        this.c = new f6.j(this);
        this.a = context.getApplicationContext();
        p6.m.e(I);
        this.b = I;
        this.d = bVar;
        this.e = qVar;
    }
}
