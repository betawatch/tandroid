package c8;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class e1 {
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
