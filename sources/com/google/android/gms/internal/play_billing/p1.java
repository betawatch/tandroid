package com.google.android.gms.internal.play_billing;

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
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 b;
    public static final p1 c;
    public static final p1[] d;
    public static final /* synthetic */ p1[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    p1 EF0;

    static {
        c2 c2Var = c2.e;
        p1 p1Var = new p1("DOUBLE", 0, 0, 1, c2Var);
        c2 c2Var2 = c2.d;
        p1 p1Var2 = new p1("FLOAT", 1, 1, 1, c2Var2);
        c2 c2Var3 = c2.c;
        p1 p1Var3 = new p1("INT64", 2, 2, 1, c2Var3);
        p1 p1Var4 = new p1("UINT64", 3, 3, 1, c2Var3);
        c2 c2Var4 = c2.b;
        p1 p1Var5 = new p1("INT32", 4, 4, 1, c2Var4);
        p1 p1Var6 = new p1("FIXED64", 5, 5, 1, c2Var3);
        p1 p1Var7 = new p1("FIXED32", 6, 6, 1, c2Var4);
        c2 c2Var5 = c2.f;
        p1 p1Var8 = new p1("BOOL", 7, 7, 1, c2Var5);
        c2 c2Var6 = c2.h;
        p1 p1Var9 = new p1("STRING", 8, 8, 1, c2Var6);
        c2 c2Var7 = c2.s;
        p1 p1Var10 = new p1("MESSAGE", 9, 9, 1, c2Var7);
        c2 c2Var8 = c2.n;
        p1 p1Var11 = new p1("BYTES", 10, 10, 1, c2Var8);
        p1 p1Var12 = new p1("UINT32", 11, 11, 1, c2Var4);
        c2 c2Var9 = c2.r;
        p1 p1Var13 = new p1("ENUM", 12, 12, 1, c2Var9);
        p1 p1Var14 = new p1("SFIXED32", 13, 13, 1, c2Var4);
        p1 p1Var15 = new p1("SFIXED64", 14, 14, 1, c2Var3);
        p1 p1Var16 = new p1("SINT32", 15, 15, 1, c2Var4);
        p1 p1Var17 = new p1("SINT64", 16, 16, 1, c2Var3);
        p1 p1Var18 = new p1("GROUP", 17, 17, 1, c2Var7);
        p1 p1Var19 = new p1("DOUBLE_LIST", 18, 18, 2, c2Var);
        p1 p1Var20 = new p1("FLOAT_LIST", 19, 19, 2, c2Var2);
        p1 p1Var21 = new p1("INT64_LIST", 20, 20, 2, c2Var3);
        p1 p1Var22 = new p1("UINT64_LIST", 21, 21, 2, c2Var3);
        p1 p1Var23 = new p1("INT32_LIST", 22, 22, 2, c2Var4);
        p1 p1Var24 = new p1("FIXED64_LIST", 23, 23, 2, c2Var3);
        p1 p1Var25 = new p1("FIXED32_LIST", 24, 24, 2, c2Var4);
        p1 p1Var26 = new p1("BOOL_LIST", 25, 25, 2, c2Var5);
        p1 p1Var27 = new p1("STRING_LIST", 26, 26, 2, c2Var6);
        p1 p1Var28 = new p1("MESSAGE_LIST", 27, 27, 2, c2Var7);
        p1 p1Var29 = new p1("BYTES_LIST", 28, 28, 2, c2Var8);
        p1 p1Var30 = new p1("UINT32_LIST", 29, 29, 2, c2Var4);
        p1 p1Var31 = new p1("ENUM_LIST", 30, 30, 2, c2Var9);
        p1 p1Var32 = new p1("SFIXED32_LIST", 31, 31, 2, c2Var4);
        p1 p1Var33 = new p1("SFIXED64_LIST", 32, 32, 2, c2Var3);
        p1 p1Var34 = new p1("SINT32_LIST", 33, 33, 2, c2Var4);
        p1 p1Var35 = new p1("SINT64_LIST", 34, 34, 2, c2Var3);
        p1 p1Var36 = new p1("DOUBLE_LIST_PACKED", 35, 35, 3, c2Var);
        b = p1Var36;
        p1 p1Var37 = new p1("FLOAT_LIST_PACKED", 36, 36, 3, c2Var2);
        p1 p1Var38 = new p1("INT64_LIST_PACKED", 37, 37, 3, c2Var3);
        p1 p1Var39 = new p1("UINT64_LIST_PACKED", 38, 38, 3, c2Var3);
        p1 p1Var40 = new p1("INT32_LIST_PACKED", 39, 39, 3, c2Var4);
        p1 p1Var41 = new p1("FIXED64_LIST_PACKED", 40, 40, 3, c2Var3);
        p1 p1Var42 = new p1("FIXED32_LIST_PACKED", 41, 41, 3, c2Var4);
        p1 p1Var43 = new p1("BOOL_LIST_PACKED", 42, 42, 3, c2Var5);
        p1 p1Var44 = new p1("UINT32_LIST_PACKED", 43, 43, 3, c2Var4);
        p1 p1Var45 = new p1("ENUM_LIST_PACKED", 44, 44, 3, c2Var9);
        p1 p1Var46 = new p1("SFIXED32_LIST_PACKED", 45, 45, 3, c2Var4);
        p1 p1Var47 = new p1("SFIXED64_LIST_PACKED", 46, 46, 3, c2Var3);
        p1 p1Var48 = new p1("SINT32_LIST_PACKED", 47, 47, 3, c2Var4);
        p1 p1Var49 = new p1("SINT64_LIST_PACKED", 48, 48, 3, c2Var3);
        c = p1Var49;
        e = new p1[]{p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7, p1Var8, p1Var9, p1Var10, p1Var11, p1Var12, p1Var13, p1Var14, p1Var15, p1Var16, p1Var17, p1Var18, p1Var19, p1Var20, p1Var21, p1Var22, p1Var23, p1Var24, p1Var25, p1Var26, p1Var27, p1Var28, p1Var29, p1Var30, p1Var31, p1Var32, p1Var33, p1Var34, p1Var35, p1Var36, p1Var37, p1Var38, p1Var39, p1Var40, p1Var41, p1Var42, p1Var43, p1Var44, p1Var45, p1Var46, p1Var47, p1Var48, p1Var49, new p1("GROUP_LIST", 49, 49, 2, c2Var7), new p1("MAP", 50, 50, 4, c2.a)};
        p1[] values = values();
        d = new p1[values.length];
        for (p1 p1Var50 : values) {
            d[p1Var50.a] = p1Var50;
        }
    }

    public p1(String str, int i10, int i11, int i12, c2 c2Var) {
        this.a = i11;
        int i13 = i12 - 1;
        if (i13 == 1) {
            c2Var.getClass();
        } else if (i13 == 3) {
            c2Var.getClass();
        }
        if (i12 == 1) {
            c2 c2Var2 = c2.a;
            c2Var.ordinal();
        }
    }

    public static p1[] values() {
        return (p1[]) e.clone();
    }
}
