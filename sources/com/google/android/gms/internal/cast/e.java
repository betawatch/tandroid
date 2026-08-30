package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final r5.j c;
    public final r5.b d;
    public final p e;

    public e(Context context, r5.b bVar, p pVar) {
        String L;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            L = q5.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            L = q5.g0.L(new q5.g0(0, str, unmodifiableList));
        }
        this.c = new r5.j(this);
        this.a = context.getApplicationContext();
        b6.m.f(L);
        this.b = L;
        this.d = bVar;
        this.e = pVar;
    }
}
