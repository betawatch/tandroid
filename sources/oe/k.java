package oe;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class k {
    public static final me.d[] a = new me.d[0];

    public static final void a(int i7, int i10, me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i7) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.g(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.j.e(serialName, "serialName");
        throw new ke.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
