// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n34 extends y2 implements m34, Serializable {
    public final Enum[] a;

    public n34(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    @Override // y2, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        Enum[] enumArr = this.a;
        enumArr.getClass();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        k93.i(b00.g(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // y2
    public final int h() {
        return this.a.length;
    }

    @Override // y2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.a;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // y2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.a;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }
}
