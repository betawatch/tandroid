package j$.time.chrono;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
