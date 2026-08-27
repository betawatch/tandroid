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
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a5 {
    public static final a5 b;
    public static final a5 c;
    public static final a5[] d;
    public static final /* synthetic */ a5[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    a5 EF0;

    static {
        k5 k5Var = k5.e;
        a5 a5Var = new a5("DOUBLE", 0, 0, 1, k5Var);
        k5 k5Var2 = k5.d;
        a5 a5Var2 = new a5("FLOAT", 1, 1, 1, k5Var2);
        k5 k5Var3 = k5.c;
        a5 a5Var3 = new a5("INT64", 2, 2, 1, k5Var3);
        a5 a5Var4 = new a5("UINT64", 3, 3, 1, k5Var3);
        k5 k5Var4 = k5.b;
        a5 a5Var5 = new a5("INT32", 4, 4, 1, k5Var4);
        a5 a5Var6 = new a5("FIXED64", 5, 5, 1, k5Var3);
        a5 a5Var7 = new a5("FIXED32", 6, 6, 1, k5Var4);
        k5 k5Var5 = k5.f;
        a5 a5Var8 = new a5("BOOL", 7, 7, 1, k5Var5);
        k5 k5Var6 = k5.h;
        a5 a5Var9 = new a5("STRING", 8, 8, 1, k5Var6);
        k5 k5Var7 = k5.s;
        a5 a5Var10 = new a5("MESSAGE", 9, 9, 1, k5Var7);
        k5 k5Var8 = k5.n;
        a5 a5Var11 = new a5("BYTES", 10, 10, 1, k5Var8);
        a5 a5Var12 = new a5("UINT32", 11, 11, 1, k5Var4);
        k5 k5Var9 = k5.r;
        a5 a5Var13 = new a5("ENUM", 12, 12, 1, k5Var9);
        a5 a5Var14 = new a5("SFIXED32", 13, 13, 1, k5Var4);
        a5 a5Var15 = new a5("SFIXED64", 14, 14, 1, k5Var3);
        a5 a5Var16 = new a5("SINT32", 15, 15, 1, k5Var4);
        a5 a5Var17 = new a5("SINT64", 16, 16, 1, k5Var3);
        a5 a5Var18 = new a5("GROUP", 17, 17, 1, k5Var7);
        a5 a5Var19 = new a5("DOUBLE_LIST", 18, 18, 2, k5Var);
        a5 a5Var20 = new a5("FLOAT_LIST", 19, 19, 2, k5Var2);
        a5 a5Var21 = new a5("INT64_LIST", 20, 20, 2, k5Var3);
        a5 a5Var22 = new a5("UINT64_LIST", 21, 21, 2, k5Var3);
        a5 a5Var23 = new a5("INT32_LIST", 22, 22, 2, k5Var4);
        a5 a5Var24 = new a5("FIXED64_LIST", 23, 23, 2, k5Var3);
        a5 a5Var25 = new a5("FIXED32_LIST", 24, 24, 2, k5Var4);
        a5 a5Var26 = new a5("BOOL_LIST", 25, 25, 2, k5Var5);
        a5 a5Var27 = new a5("STRING_LIST", 26, 26, 2, k5Var6);
        a5 a5Var28 = new a5("MESSAGE_LIST", 27, 27, 2, k5Var7);
        a5 a5Var29 = new a5("BYTES_LIST", 28, 28, 2, k5Var8);
        a5 a5Var30 = new a5("UINT32_LIST", 29, 29, 2, k5Var4);
        a5 a5Var31 = new a5("ENUM_LIST", 30, 30, 2, k5Var9);
        a5 a5Var32 = new a5("SFIXED32_LIST", 31, 31, 2, k5Var4);
        a5 a5Var33 = new a5("SFIXED64_LIST", 32, 32, 2, k5Var3);
        a5 a5Var34 = new a5("SINT32_LIST", 33, 33, 2, k5Var4);
        a5 a5Var35 = new a5("SINT64_LIST", 34, 34, 2, k5Var3);
        a5 a5Var36 = new a5("DOUBLE_LIST_PACKED", 35, 35, 3, k5Var);
        b = a5Var36;
        a5 a5Var37 = new a5("FLOAT_LIST_PACKED", 36, 36, 3, k5Var2);
        a5 a5Var38 = new a5("INT64_LIST_PACKED", 37, 37, 3, k5Var3);
        a5 a5Var39 = new a5("UINT64_LIST_PACKED", 38, 38, 3, k5Var3);
        a5 a5Var40 = new a5("INT32_LIST_PACKED", 39, 39, 3, k5Var4);
        a5 a5Var41 = new a5("FIXED64_LIST_PACKED", 40, 40, 3, k5Var3);
        a5 a5Var42 = new a5("FIXED32_LIST_PACKED", 41, 41, 3, k5Var4);
        a5 a5Var43 = new a5("BOOL_LIST_PACKED", 42, 42, 3, k5Var5);
        a5 a5Var44 = new a5("UINT32_LIST_PACKED", 43, 43, 3, k5Var4);
        a5 a5Var45 = new a5("ENUM_LIST_PACKED", 44, 44, 3, k5Var9);
        a5 a5Var46 = new a5("SFIXED32_LIST_PACKED", 45, 45, 3, k5Var4);
        a5 a5Var47 = new a5("SFIXED64_LIST_PACKED", 46, 46, 3, k5Var3);
        a5 a5Var48 = new a5("SINT32_LIST_PACKED", 47, 47, 3, k5Var4);
        a5 a5Var49 = new a5("SINT64_LIST_PACKED", 48, 48, 3, k5Var3);
        c = a5Var49;
        e = new a5[]{a5Var, a5Var2, a5Var3, a5Var4, a5Var5, a5Var6, a5Var7, a5Var8, a5Var9, a5Var10, a5Var11, a5Var12, a5Var13, a5Var14, a5Var15, a5Var16, a5Var17, a5Var18, a5Var19, a5Var20, a5Var21, a5Var22, a5Var23, a5Var24, a5Var25, a5Var26, a5Var27, a5Var28, a5Var29, a5Var30, a5Var31, a5Var32, a5Var33, a5Var34, a5Var35, a5Var36, a5Var37, a5Var38, a5Var39, a5Var40, a5Var41, a5Var42, a5Var43, a5Var44, a5Var45, a5Var46, a5Var47, a5Var48, a5Var49, new a5("GROUP_LIST", 49, 49, 2, k5Var7), new a5("MAP", 50, 50, 4, k5.a)};
        a5[] values = values();
        d = new a5[values.length];
        for (a5 a5Var50 : values) {
            d[a5Var50.a] = a5Var50;
        }
    }

    public a5(String str, int i10, int i11, int i12, k5 k5Var) {
        this.a = i11;
        int i13 = i12 - 1;
        if (i13 == 1) {
            k5Var.getClass();
        } else if (i13 == 3) {
            k5Var.getClass();
        }
        if (i12 == 1) {
            k5 k5Var2 = k5.a;
            k5Var.ordinal();
        }
    }

    public static a5[] values() {
        return (a5[]) e.clone();
    }
}
