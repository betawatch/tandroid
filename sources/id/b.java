package id;

import a1.g;
import ed.d;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends d implements a, Serializable {
    public final Enum[] a;

    public b(Enum[] entries) {
        j.e(entries, "entries");
        this.a = entries;
    }

    @Override // ed.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.a;
        j.e(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i3 < 0 || i3 >= length) {
            throw new IndexOutOfBoundsException(g.n(i3, length, "index: ", ", size: "));
        }
        return enumArr[i3];
    }

    @Override // ed.d
    public final int h() {
        return this.a.length;
    }

    @Override // ed.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.a;
        j.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42) {
            return ordinal;
        }
        return -1;
    }

    @Override // ed.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
