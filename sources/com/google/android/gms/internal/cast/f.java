package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final String b;
    public final d6.j c;
    public final d6.b d;
    public final r e;

    public f(Context context, d6.b bVar, r rVar) {
        String c02;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            c02 = c6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            c02 = n4.y.c0(new n4.y(8, str, unmodifiableList));
        }
        this.c = new d6.j(this);
        this.a = context.getApplicationContext();
        n6.l.f(c02);
        this.b = c02;
        this.d = bVar;
        this.e = rVar;
    }
}
