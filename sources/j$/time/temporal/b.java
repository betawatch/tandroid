package j$.time.temporal;

/* loaded from: classes2.dex */
abstract /* synthetic */ class b {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[h.values().length];
        a = iArr;
        try {
            iArr[h.WEEK_BASED_YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[h.QUARTER_YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
