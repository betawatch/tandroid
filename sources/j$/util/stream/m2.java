package j$.util.stream;

/* loaded from: classes2.dex */
abstract /* synthetic */ class m2 {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[R2.values().length];
        a = iArr;
        try {
            iArr[R2.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[R2.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[R2.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[R2.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
