package com.google.android.gms.internal.cast;

import a8.q8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p0 extends a8.v {
    public static final p0 n = new p0(null, new Object[0], 0);
    public final transient Object e;
    public final transient Object[] f;
    public final transient int h;

    public p0(Object obj, Object[] objArr, int i7) {
        super(2);
        this.e = obj;
        this.f = objArr;
        this.h = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // a8.v, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i7 = this.h;
            Object[] objArr = this.f;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else {
                Object obj4 = this.e;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int a10 = q8.a(obj.hashCode());
                        while (true) {
                            int i10 = a10 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            a10 = i10 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a11 = q8.a(obj.hashCode());
                        while (true) {
                            int i12 = a11 & length2;
                            char c10 = (char) sArr[i12];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            a11 = i12 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a12 = q8.a(obj.hashCode());
                        while (true) {
                            int i13 = a12 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            a12 = i13 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }
}
