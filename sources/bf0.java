// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bf0 {
    public static final bf0 a;
    public static final bf0 b;
    public static final bf0 c;
    public static final bf0 d;
    public static final /* synthetic */ bf0[] e;

    static {
        bf0 bf0Var = new bf0("AZTEC", 0);
        a = bf0Var;
        bf0 bf0Var2 = new bf0("CODABAR", 1);
        bf0 bf0Var3 = new bf0("CODE_39", 2);
        bf0 bf0Var4 = new bf0("CODE_93", 3);
        bf0 bf0Var5 = new bf0("CODE_128", 4);
        b = bf0Var5;
        bf0 bf0Var6 = new bf0("DATA_MATRIX", 5);
        bf0 bf0Var7 = new bf0("EAN_8", 6);
        bf0 bf0Var8 = new bf0("EAN_13", 7);
        bf0 bf0Var9 = new bf0("ITF", 8);
        bf0 bf0Var10 = new bf0("MAXICODE", 9);
        bf0 bf0Var11 = new bf0("PDF_417", 10);
        c = bf0Var11;
        bf0 bf0Var12 = new bf0("QR_CODE", 11);
        d = bf0Var12;
        e = new bf0[]{bf0Var, bf0Var2, bf0Var3, bf0Var4, bf0Var5, bf0Var6, bf0Var7, bf0Var8, bf0Var9, bf0Var10, bf0Var11, bf0Var12, new bf0("RSS_14", 12), new bf0("RSS_EXPANDED", 13), new bf0("UPC_A", 14), new bf0("UPC_E", 15), new bf0("UPC_EAN_EXTENSION", 16)};
    }

    public static bf0 valueOf(String str) {
        return (bf0) Enum.valueOf(bf0.class, str);
    }

    public static bf0[] values() {
        return (bf0[]) e.clone();
    }
}
