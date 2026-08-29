package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f {
    public final Context a;
    public final String b;
    public final p5.j c;
    public final p5.b d;
    public final q e;

    public f(Context context, p5.b bVar, q qVar) {
        String r6;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            r6 = o5.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            r6 = g9.l.r(new g9.l(str, unmodifiableList, false, 28));
        }
        this.c = new p5.j(this);
        this.a = context.getApplicationContext();
        z5.l.f(r6);
        this.b = r6;
        this.d = bVar;
        this.e = qVar;
    }
}
