package com.google.android.gms.internal.cast;

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
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class y4 {
    public static final y4 b;
    public static final y4 c;
    public static final y4[] d;
    public static final /* synthetic */ y4[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    y4 EF0;

    static {
        i5 i5Var = i5.e;
        y4 y4Var = new y4("DOUBLE", 0, 0, 1, i5Var);
        i5 i5Var2 = i5.d;
        y4 y4Var2 = new y4("FLOAT", 1, 1, 1, i5Var2);
        i5 i5Var3 = i5.c;
        y4 y4Var3 = new y4("INT64", 2, 2, 1, i5Var3);
        y4 y4Var4 = new y4("UINT64", 3, 3, 1, i5Var3);
        i5 i5Var4 = i5.b;
        y4 y4Var5 = new y4("INT32", 4, 4, 1, i5Var4);
        y4 y4Var6 = new y4("FIXED64", 5, 5, 1, i5Var3);
        y4 y4Var7 = new y4("FIXED32", 6, 6, 1, i5Var4);
        i5 i5Var5 = i5.f;
        y4 y4Var8 = new y4("BOOL", 7, 7, 1, i5Var5);
        i5 i5Var6 = i5.h;
        y4 y4Var9 = new y4("STRING", 8, 8, 1, i5Var6);
        i5 i5Var7 = i5.s;
        y4 y4Var10 = new y4("MESSAGE", 9, 9, 1, i5Var7);
        i5 i5Var8 = i5.n;
        y4 y4Var11 = new y4("BYTES", 10, 10, 1, i5Var8);
        y4 y4Var12 = new y4("UINT32", 11, 11, 1, i5Var4);
        i5 i5Var9 = i5.r;
        y4 y4Var13 = new y4("ENUM", 12, 12, 1, i5Var9);
        y4 y4Var14 = new y4("SFIXED32", 13, 13, 1, i5Var4);
        y4 y4Var15 = new y4("SFIXED64", 14, 14, 1, i5Var3);
        y4 y4Var16 = new y4("SINT32", 15, 15, 1, i5Var4);
        y4 y4Var17 = new y4("SINT64", 16, 16, 1, i5Var3);
        y4 y4Var18 = new y4("GROUP", 17, 17, 1, i5Var7);
        y4 y4Var19 = new y4("DOUBLE_LIST", 18, 18, 2, i5Var);
        y4 y4Var20 = new y4("FLOAT_LIST", 19, 19, 2, i5Var2);
        y4 y4Var21 = new y4("INT64_LIST", 20, 20, 2, i5Var3);
        y4 y4Var22 = new y4("UINT64_LIST", 21, 21, 2, i5Var3);
        y4 y4Var23 = new y4("INT32_LIST", 22, 22, 2, i5Var4);
        y4 y4Var24 = new y4("FIXED64_LIST", 23, 23, 2, i5Var3);
        y4 y4Var25 = new y4("FIXED32_LIST", 24, 24, 2, i5Var4);
        y4 y4Var26 = new y4("BOOL_LIST", 25, 25, 2, i5Var5);
        y4 y4Var27 = new y4("STRING_LIST", 26, 26, 2, i5Var6);
        y4 y4Var28 = new y4("MESSAGE_LIST", 27, 27, 2, i5Var7);
        y4 y4Var29 = new y4("BYTES_LIST", 28, 28, 2, i5Var8);
        y4 y4Var30 = new y4("UINT32_LIST", 29, 29, 2, i5Var4);
        y4 y4Var31 = new y4("ENUM_LIST", 30, 30, 2, i5Var9);
        y4 y4Var32 = new y4("SFIXED32_LIST", 31, 31, 2, i5Var4);
        y4 y4Var33 = new y4("SFIXED64_LIST", 32, 32, 2, i5Var3);
        y4 y4Var34 = new y4("SINT32_LIST", 33, 33, 2, i5Var4);
        y4 y4Var35 = new y4("SINT64_LIST", 34, 34, 2, i5Var3);
        y4 y4Var36 = new y4("DOUBLE_LIST_PACKED", 35, 35, 3, i5Var);
        b = y4Var36;
        y4 y4Var37 = new y4("FLOAT_LIST_PACKED", 36, 36, 3, i5Var2);
        y4 y4Var38 = new y4("INT64_LIST_PACKED", 37, 37, 3, i5Var3);
        y4 y4Var39 = new y4("UINT64_LIST_PACKED", 38, 38, 3, i5Var3);
        y4 y4Var40 = new y4("INT32_LIST_PACKED", 39, 39, 3, i5Var4);
        y4 y4Var41 = new y4("FIXED64_LIST_PACKED", 40, 40, 3, i5Var3);
        y4 y4Var42 = new y4("FIXED32_LIST_PACKED", 41, 41, 3, i5Var4);
        y4 y4Var43 = new y4("BOOL_LIST_PACKED", 42, 42, 3, i5Var5);
        y4 y4Var44 = new y4("UINT32_LIST_PACKED", 43, 43, 3, i5Var4);
        y4 y4Var45 = new y4("ENUM_LIST_PACKED", 44, 44, 3, i5Var9);
        y4 y4Var46 = new y4("SFIXED32_LIST_PACKED", 45, 45, 3, i5Var4);
        y4 y4Var47 = new y4("SFIXED64_LIST_PACKED", 46, 46, 3, i5Var3);
        y4 y4Var48 = new y4("SINT32_LIST_PACKED", 47, 47, 3, i5Var4);
        y4 y4Var49 = new y4("SINT64_LIST_PACKED", 48, 48, 3, i5Var3);
        c = y4Var49;
        e = new y4[]{y4Var, y4Var2, y4Var3, y4Var4, y4Var5, y4Var6, y4Var7, y4Var8, y4Var9, y4Var10, y4Var11, y4Var12, y4Var13, y4Var14, y4Var15, y4Var16, y4Var17, y4Var18, y4Var19, y4Var20, y4Var21, y4Var22, y4Var23, y4Var24, y4Var25, y4Var26, y4Var27, y4Var28, y4Var29, y4Var30, y4Var31, y4Var32, y4Var33, y4Var34, y4Var35, y4Var36, y4Var37, y4Var38, y4Var39, y4Var40, y4Var41, y4Var42, y4Var43, y4Var44, y4Var45, y4Var46, y4Var47, y4Var48, y4Var49, new y4("GROUP_LIST", 49, 49, 2, i5Var7), new y4("MAP", 50, 50, 4, i5.a)};
        y4[] values = values();
        d = new y4[values.length];
        for (y4 y4Var50 : values) {
            d[y4Var50.a] = y4Var50;
        }
    }

    public y4(String str, int i7, int i10, int i11, i5 i5Var) {
        this.a = i10;
        int i12 = i11 - 1;
        if (i12 == 1) {
            i5Var.getClass();
        } else if (i12 == 3) {
            i5Var.getClass();
        }
        if (i11 == 1) {
            i5 i5Var2 = i5.a;
            i5Var.ordinal();
        }
    }

    public static y4[] values() {
        return (y4[]) e.clone();
    }
}
