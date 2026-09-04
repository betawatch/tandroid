package com.google.android.gms.internal.clearcut;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class t {
    public static final t b;
    public static final t c;
    public static final t d;
    public static final t e;
    public static final t f;
    public static final t h;
    public static final t n;
    public static final t r;
    public static final t s;
    public static final t[] v;
    public static final /* synthetic */ t[] w;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    t EF0;

    static {
        d0 d0Var = d0.e;
        t tVar = new t("DOUBLE", 0, 0, 1, d0Var);
        d0 d0Var2 = d0.d;
        t tVar2 = new t("FLOAT", 1, 1, 1, d0Var2);
        d0 d0Var3 = d0.c;
        t tVar3 = new t("INT64", 2, 2, 1, d0Var3);
        t tVar4 = new t("UINT64", 3, 3, 1, d0Var3);
        d0 d0Var4 = d0.b;
        t tVar5 = new t("INT32", 4, 4, 1, d0Var4);
        t tVar6 = new t("FIXED64", 5, 5, 1, d0Var3);
        t tVar7 = new t("FIXED32", 6, 6, 1, d0Var4);
        d0 d0Var5 = d0.f;
        t tVar8 = new t("BOOL", 7, 7, 1, d0Var5);
        d0 d0Var6 = d0.h;
        t tVar9 = new t("STRING", 8, 8, 1, d0Var6);
        d0 d0Var7 = d0.s;
        t tVar10 = new t("MESSAGE", 9, 9, 1, d0Var7);
        b = tVar10;
        d0 d0Var8 = d0.n;
        t tVar11 = new t("BYTES", 10, 10, 1, d0Var8);
        t tVar12 = new t("UINT32", 11, 11, 1, d0Var4);
        d0 d0Var9 = d0.r;
        t tVar13 = new t("ENUM", 12, 12, 1, d0Var9);
        c = tVar13;
        t tVar14 = new t("SFIXED32", 13, 13, 1, d0Var4);
        t tVar15 = new t("SFIXED64", 14, 14, 1, d0Var3);
        t tVar16 = new t("SINT32", 15, 15, 1, d0Var4);
        t tVar17 = new t("SINT64", 16, 16, 1, d0Var3);
        t tVar18 = new t("GROUP", 17, 17, 1, d0Var7);
        d = tVar18;
        t tVar19 = new t("DOUBLE_LIST", 18, 18, 2, d0Var);
        e = tVar19;
        t tVar20 = new t("FLOAT_LIST", 19, 19, 2, d0Var2);
        t tVar21 = new t("INT64_LIST", 20, 20, 2, d0Var3);
        t tVar22 = new t("UINT64_LIST", 21, 21, 2, d0Var3);
        t tVar23 = new t("INT32_LIST", 22, 22, 2, d0Var4);
        t tVar24 = new t("FIXED64_LIST", 23, 23, 2, d0Var3);
        t tVar25 = new t("FIXED32_LIST", 24, 24, 2, d0Var4);
        t tVar26 = new t("BOOL_LIST", 25, 25, 2, d0Var5);
        t tVar27 = new t("STRING_LIST", 26, 26, 2, d0Var6);
        t tVar28 = new t("MESSAGE_LIST", 27, 27, 2, d0Var7);
        f = tVar28;
        t tVar29 = new t("BYTES_LIST", 28, 28, 2, d0Var8);
        t tVar30 = new t("UINT32_LIST", 29, 29, 2, d0Var4);
        t tVar31 = new t("ENUM_LIST", 30, 30, 2, d0Var9);
        h = tVar31;
        t tVar32 = new t("SFIXED32_LIST", 31, 31, 2, d0Var4);
        t tVar33 = new t("SFIXED64_LIST", 32, 32, 2, d0Var3);
        t tVar34 = new t("SINT32_LIST", 33, 33, 2, d0Var4);
        t tVar35 = new t("SINT64_LIST", 34, 34, 2, d0Var3);
        t tVar36 = new t("DOUBLE_LIST_PACKED", 35, 35, 3, d0Var);
        t tVar37 = new t("FLOAT_LIST_PACKED", 36, 36, 3, d0Var2);
        t tVar38 = new t("INT64_LIST_PACKED", 37, 37, 3, d0Var3);
        t tVar39 = new t("UINT64_LIST_PACKED", 38, 38, 3, d0Var3);
        t tVar40 = new t("INT32_LIST_PACKED", 39, 39, 3, d0Var4);
        t tVar41 = new t("FIXED64_LIST_PACKED", 40, 40, 3, d0Var3);
        t tVar42 = new t("FIXED32_LIST_PACKED", 41, 41, 3, d0Var4);
        t tVar43 = new t("BOOL_LIST_PACKED", 42, 42, 3, d0Var5);
        t tVar44 = new t("UINT32_LIST_PACKED", 43, 43, 3, d0Var4);
        t tVar45 = new t("ENUM_LIST_PACKED", 44, 44, 3, d0Var9);
        n = tVar45;
        t tVar46 = new t("SFIXED32_LIST_PACKED", 45, 45, 3, d0Var4);
        t tVar47 = new t("SFIXED64_LIST_PACKED", 46, 46, 3, d0Var3);
        t tVar48 = new t("SINT32_LIST_PACKED", 47, 47, 3, d0Var4);
        t tVar49 = new t("SINT64_LIST_PACKED", 48, 48, 3, d0Var3);
        t tVar50 = new t("GROUP_LIST", 49, 49, 2, d0Var7);
        r = tVar50;
        t tVar51 = new t("MAP", 50, 50, 4, d0.a);
        s = tVar51;
        w = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15, tVar16, tVar17, tVar18, tVar19, tVar20, tVar21, tVar22, tVar23, tVar24, tVar25, tVar26, tVar27, tVar28, tVar29, tVar30, tVar31, tVar32, tVar33, tVar34, tVar35, tVar36, tVar37, tVar38, tVar39, tVar40, tVar41, tVar42, tVar43, tVar44, tVar45, tVar46, tVar47, tVar48, tVar49, tVar50, tVar51};
        t[] values = values();
        v = new t[values.length];
        for (t tVar52 : values) {
            v[tVar52.a] = tVar52;
        }
    }

    public t(String str, int i10, int i11, int i12, d0 d0Var) {
        this.a = i11;
        int i13 = u.a[m1.j.c(i12)];
        if (i13 == 1 || i13 == 2) {
            d0Var.getClass();
        }
        if (i12 == 1) {
            int i14 = u.b[d0Var.ordinal()];
        }
    }

    public static t[] values() {
        return (t[]) w.clone();
    }
}
