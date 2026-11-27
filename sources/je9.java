// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class je9 {
    public static final je9 a;
    public static final je9 b;
    public static final je9 c;
    public static final je9 d;
    public static final je9 e;
    public static final je9 f;
    public static final /* synthetic */ je9[] h;

    /* JADX INFO: Fake field, exist only in values array */
    je9 EF0;

    static {
        je9 je9Var = new je9("OTHER", 0);
        je9 je9Var2 = new je9("ORIENTATION", 1);
        je9 je9Var3 = new je9("BYTE_SEGMENTS", 2);
        a = je9Var3;
        je9 je9Var4 = new je9("ERROR_CORRECTION_LEVEL", 3);
        b = je9Var4;
        je9 je9Var5 = new je9("ERRORS_CORRECTED", 4);
        c = je9Var5;
        je9 je9Var6 = new je9("ERASURES_CORRECTED", 5);
        je9 je9Var7 = new je9("ISSUE_NUMBER", 6);
        je9 je9Var8 = new je9("SUGGESTED_PRICE", 7);
        je9 je9Var9 = new je9("POSSIBLE_COUNTRY", 8);
        je9 je9Var10 = new je9("UPC_EAN_EXTENSION", 9);
        je9 je9Var11 = new je9("PDF417_EXTRA_METADATA", 10);
        je9 je9Var12 = new je9("STRUCTURED_APPEND_SEQUENCE", 11);
        d = je9Var12;
        je9 je9Var13 = new je9("STRUCTURED_APPEND_PARITY", 12);
        e = je9Var13;
        je9 je9Var14 = new je9("SYMBOLOGY_IDENTIFIER", 13);
        f = je9Var14;
        h = new je9[]{je9Var, je9Var2, je9Var3, je9Var4, je9Var5, je9Var6, je9Var7, je9Var8, je9Var9, je9Var10, je9Var11, je9Var12, je9Var13, je9Var14};
    }

    public static je9 valueOf(String str) {
        return (je9) Enum.valueOf(je9.class, str);
    }

    public static je9[] values() {
        return (je9[]) h.clone();
    }
}
