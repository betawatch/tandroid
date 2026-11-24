// default package

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class kyc {
    public static final gyc c;
    public static final hyc d;
    public static final iyc e;
    public static final /* synthetic */ kyc[] f;
    public final lyc a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    kyc EF0;

    /* JADX INFO: Fake field, exist only in values array */
    kyc EF1;

    /* JADX INFO: Fake field, exist only in values array */
    kyc EF2;

    static {
        kyc kycVar = new kyc("DOUBLE", 0, lyc.d, 1);
        kyc kycVar2 = new kyc("FLOAT", 1, lyc.c, 5);
        lyc lycVar = lyc.b;
        kyc kycVar3 = new kyc("INT64", 2, lycVar, 0);
        kyc kycVar4 = new kyc("UINT64", 3, lycVar, 0);
        lyc lycVar2 = lyc.a;
        kyc kycVar5 = new kyc("INT32", 4, lycVar2, 0);
        kyc kycVar6 = new kyc("FIXED64", 5, lycVar, 1);
        kyc kycVar7 = new kyc("FIXED32", 6, lycVar2, 5);
        kyc kycVar8 = new kyc("BOOL", 7, lyc.e, 0);
        gyc gycVar = new gyc("STRING", 8, lyc.f, 2);
        c = gycVar;
        lyc lycVar3 = lyc.r;
        hyc hycVar = new hyc("GROUP", 9, lycVar3, 3);
        d = hycVar;
        iyc iycVar = new iyc("MESSAGE", 10, lycVar3, 2);
        e = iycVar;
        f = new kyc[]{kycVar, kycVar2, kycVar3, kycVar4, kycVar5, kycVar6, kycVar7, kycVar8, gycVar, hycVar, iycVar, new jyc("BYTES", 11, lyc.h, 2), new kyc("UINT32", 12, lycVar2, 0), new kyc("ENUM", 13, lyc.n, 0), new kyc("SFIXED32", 14, lycVar2, 5), new kyc("SFIXED64", 15, lycVar, 1), new kyc("SINT32", 16, lycVar2, 0), new kyc("SINT64", 17, lycVar, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kyc(String str, int i, lyc lycVar, int i2) {
        this.a = lycVar;
        this.b = i2;
    }

    public static kyc valueOf(String str) {
        return (kyc) Enum.valueOf(kyc.class, str);
    }

    public static kyc[] values() {
        return (kyc[]) f.clone();
    }
}
