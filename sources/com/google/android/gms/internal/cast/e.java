package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final r5.j c;
    public final r5.b d;
    public final p e;

    public e(Context context, r5.b bVar, p pVar) {
        String G;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            G = q5.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            G = q5.c0.G(new q5.c0(str, unmodifiableList, false, 1));
        }
        this.c = new r5.j(this);
        this.a = context.getApplicationContext();
        b6.m.f(G);
        this.b = G;
        this.d = bVar;
        this.e = pVar;
    }
}
