package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final r5.j c;
    public final r5.b d;
    public final o e;

    public e(Context context, r5.b bVar, o oVar) {
        String K;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            K = q5.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            K = q5.g0.K(new q5.g0(0, str, unmodifiableList));
        }
        this.c = new r5.j(this);
        this.a = context.getApplicationContext();
        b6.m.f(K);
        this.b = K;
        this.d = bVar;
        this.e = oVar;
    }
}
