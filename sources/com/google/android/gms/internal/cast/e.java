package com.google.android.gms.internal.cast;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final String b;
    public final d6.j c;
    public final d6.b d;
    public final q e;

    public e(Context context, d6.b bVar, q qVar) {
        String I;
        ArrayList arrayList = bVar.b;
        String str = bVar.a;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            I = c6.y.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(bVar.b);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            I = n4.q.I(new n4.q(str, unmodifiableList));
        }
        this.c = new d6.j(this);
        this.a = context.getApplicationContext();
        n6.l.e(I);
        this.b = I;
        this.d = bVar;
        this.e = qVar;
    }
}
