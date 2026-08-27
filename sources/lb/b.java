package lb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b h;
    public static final /* synthetic */ b[] n;

    static {
        b bVar = new b("ERROR_CORRECTION", 0);
        a = bVar;
        b bVar2 = new b("CHARACTER_SET", 1);
        b = bVar2;
        b bVar3 = new b("DATA_MATRIX_SHAPE", 2);
        b bVar4 = new b("DATA_MATRIX_COMPACT", 3);
        b bVar5 = new b("MIN_SIZE", 4);
        b bVar6 = new b("MAX_SIZE", 5);
        b bVar7 = new b("MARGIN", 6);
        c = bVar7;
        b bVar8 = new b("PDF417_COMPACT", 7);
        b bVar9 = new b("PDF417_COMPACTION", 8);
        b bVar10 = new b("PDF417_DIMENSIONS", 9);
        b bVar11 = new b("PDF417_AUTO_ECI", 10);
        b bVar12 = new b("AZTEC_LAYERS", 11);
        b bVar13 = new b("QR_VERSION", 12);
        d = bVar13;
        b bVar14 = new b("QR_MASK_PATTERN", 13);
        e = bVar14;
        b bVar15 = new b("QR_COMPACT", 14);
        f = bVar15;
        b bVar16 = new b("GS1_FORMAT", 15);
        h = bVar16;
        n = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, new b("FORCE_CODE_SET", 16), new b("FORCE_C40", 17), new b("CODE128_COMPACT", 18)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) n.clone();
    }
}
