package fd;

import a1.g;
import bd.e;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b extends e implements a, Serializable {
    public final Enum[] a;

    public b(Enum[] entries) {
        i.e(entries, "entries");
        this.a = entries;
    }

    @Override // bd.e, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.a;
        i.e(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(g.j(i10, length, "index: ", ", size: "));
        }
        return enumArr[i10];
    }

    @Override // bd.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.a;
        i.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42) {
            return ordinal;
        }
        return -1;
    }

    @Override // bd.e
    public final int l() {
        return this.a.length;
    }

    @Override // bd.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
