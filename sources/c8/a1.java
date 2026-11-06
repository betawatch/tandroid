package c8;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class a1 {
    public static final Object a(q1.b bVar, q1.e key, Serializable serializable) {
        kotlin.jvm.internal.j.e(bVar, "<this>");
        kotlin.jvm.internal.j.e(key, "key");
        Object obj = bVar.a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.j.d(obj, "copyOf(this, size)");
        }
        return obj == null ? serializable : obj;
    }
}
