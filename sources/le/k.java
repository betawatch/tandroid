package le;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class k {
    public static final je.d[] a = new je.d[0];

    public static final void a(int i3, int i10, je.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i3) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.g(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.j.e(serialName, "serialName");
        throw new he.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
