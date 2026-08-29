package mb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i {
    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final /* synthetic */ i[] h;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("OTHER", 0);
        i iVar2 = new i("ORIENTATION", 1);
        i iVar3 = new i("BYTE_SEGMENTS", 2);
        a = iVar3;
        i iVar4 = new i("ERROR_CORRECTION_LEVEL", 3);
        b = iVar4;
        i iVar5 = new i("ERRORS_CORRECTED", 4);
        c = iVar5;
        i iVar6 = new i("ERASURES_CORRECTED", 5);
        i iVar7 = new i("ISSUE_NUMBER", 6);
        i iVar8 = new i("SUGGESTED_PRICE", 7);
        i iVar9 = new i("POSSIBLE_COUNTRY", 8);
        i iVar10 = new i("UPC_EAN_EXTENSION", 9);
        i iVar11 = new i("PDF417_EXTRA_METADATA", 10);
        i iVar12 = new i("STRUCTURED_APPEND_SEQUENCE", 11);
        d = iVar12;
        i iVar13 = new i("STRUCTURED_APPEND_PARITY", 12);
        e = iVar13;
        i iVar14 = new i("SYMBOLOGY_IDENTIFIER", 13);
        f = iVar14;
        h = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) h.clone();
    }
}
