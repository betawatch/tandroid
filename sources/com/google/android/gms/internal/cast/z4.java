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
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z4 {
    public static final z4 b;
    public static final z4 c;
    public static final z4[] d;
    public static final /* synthetic */ z4[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    z4 EF0;

    static {
        j5 j5Var = j5.e;
        z4 z4Var = new z4("DOUBLE", 0, 0, 1, j5Var);
        j5 j5Var2 = j5.d;
        z4 z4Var2 = new z4("FLOAT", 1, 1, 1, j5Var2);
        j5 j5Var3 = j5.c;
        z4 z4Var3 = new z4("INT64", 2, 2, 1, j5Var3);
        z4 z4Var4 = new z4("UINT64", 3, 3, 1, j5Var3);
        j5 j5Var4 = j5.b;
        z4 z4Var5 = new z4("INT32", 4, 4, 1, j5Var4);
        z4 z4Var6 = new z4("FIXED64", 5, 5, 1, j5Var3);
        z4 z4Var7 = new z4("FIXED32", 6, 6, 1, j5Var4);
        j5 j5Var5 = j5.f;
        z4 z4Var8 = new z4("BOOL", 7, 7, 1, j5Var5);
        j5 j5Var6 = j5.h;
        z4 z4Var9 = new z4("STRING", 8, 8, 1, j5Var6);
        j5 j5Var7 = j5.s;
        z4 z4Var10 = new z4("MESSAGE", 9, 9, 1, j5Var7);
        j5 j5Var8 = j5.n;
        z4 z4Var11 = new z4("BYTES", 10, 10, 1, j5Var8);
        z4 z4Var12 = new z4("UINT32", 11, 11, 1, j5Var4);
        j5 j5Var9 = j5.r;
        z4 z4Var13 = new z4("ENUM", 12, 12, 1, j5Var9);
        z4 z4Var14 = new z4("SFIXED32", 13, 13, 1, j5Var4);
        z4 z4Var15 = new z4("SFIXED64", 14, 14, 1, j5Var3);
        z4 z4Var16 = new z4("SINT32", 15, 15, 1, j5Var4);
        z4 z4Var17 = new z4("SINT64", 16, 16, 1, j5Var3);
        z4 z4Var18 = new z4("GROUP", 17, 17, 1, j5Var7);
        z4 z4Var19 = new z4("DOUBLE_LIST", 18, 18, 2, j5Var);
        z4 z4Var20 = new z4("FLOAT_LIST", 19, 19, 2, j5Var2);
        z4 z4Var21 = new z4("INT64_LIST", 20, 20, 2, j5Var3);
        z4 z4Var22 = new z4("UINT64_LIST", 21, 21, 2, j5Var3);
        z4 z4Var23 = new z4("INT32_LIST", 22, 22, 2, j5Var4);
        z4 z4Var24 = new z4("FIXED64_LIST", 23, 23, 2, j5Var3);
        z4 z4Var25 = new z4("FIXED32_LIST", 24, 24, 2, j5Var4);
        z4 z4Var26 = new z4("BOOL_LIST", 25, 25, 2, j5Var5);
        z4 z4Var27 = new z4("STRING_LIST", 26, 26, 2, j5Var6);
        z4 z4Var28 = new z4("MESSAGE_LIST", 27, 27, 2, j5Var7);
        z4 z4Var29 = new z4("BYTES_LIST", 28, 28, 2, j5Var8);
        z4 z4Var30 = new z4("UINT32_LIST", 29, 29, 2, j5Var4);
        z4 z4Var31 = new z4("ENUM_LIST", 30, 30, 2, j5Var9);
        z4 z4Var32 = new z4("SFIXED32_LIST", 31, 31, 2, j5Var4);
        z4 z4Var33 = new z4("SFIXED64_LIST", 32, 32, 2, j5Var3);
        z4 z4Var34 = new z4("SINT32_LIST", 33, 33, 2, j5Var4);
        z4 z4Var35 = new z4("SINT64_LIST", 34, 34, 2, j5Var3);
        z4 z4Var36 = new z4("DOUBLE_LIST_PACKED", 35, 35, 3, j5Var);
        b = z4Var36;
        z4 z4Var37 = new z4("FLOAT_LIST_PACKED", 36, 36, 3, j5Var2);
        z4 z4Var38 = new z4("INT64_LIST_PACKED", 37, 37, 3, j5Var3);
        z4 z4Var39 = new z4("UINT64_LIST_PACKED", 38, 38, 3, j5Var3);
        z4 z4Var40 = new z4("INT32_LIST_PACKED", 39, 39, 3, j5Var4);
        z4 z4Var41 = new z4("FIXED64_LIST_PACKED", 40, 40, 3, j5Var3);
        z4 z4Var42 = new z4("FIXED32_LIST_PACKED", 41, 41, 3, j5Var4);
        z4 z4Var43 = new z4("BOOL_LIST_PACKED", 42, 42, 3, j5Var5);
        z4 z4Var44 = new z4("UINT32_LIST_PACKED", 43, 43, 3, j5Var4);
        z4 z4Var45 = new z4("ENUM_LIST_PACKED", 44, 44, 3, j5Var9);
        z4 z4Var46 = new z4("SFIXED32_LIST_PACKED", 45, 45, 3, j5Var4);
        z4 z4Var47 = new z4("SFIXED64_LIST_PACKED", 46, 46, 3, j5Var3);
        z4 z4Var48 = new z4("SINT32_LIST_PACKED", 47, 47, 3, j5Var4);
        z4 z4Var49 = new z4("SINT64_LIST_PACKED", 48, 48, 3, j5Var3);
        c = z4Var49;
        e = new z4[]{z4Var, z4Var2, z4Var3, z4Var4, z4Var5, z4Var6, z4Var7, z4Var8, z4Var9, z4Var10, z4Var11, z4Var12, z4Var13, z4Var14, z4Var15, z4Var16, z4Var17, z4Var18, z4Var19, z4Var20, z4Var21, z4Var22, z4Var23, z4Var24, z4Var25, z4Var26, z4Var27, z4Var28, z4Var29, z4Var30, z4Var31, z4Var32, z4Var33, z4Var34, z4Var35, z4Var36, z4Var37, z4Var38, z4Var39, z4Var40, z4Var41, z4Var42, z4Var43, z4Var44, z4Var45, z4Var46, z4Var47, z4Var48, z4Var49, new z4("GROUP_LIST", 49, 49, 2, j5Var7), new z4("MAP", 50, 50, 4, j5.a)};
        z4[] values = values();
        d = new z4[values.length];
        for (z4 z4Var50 : values) {
            d[z4Var50.a] = z4Var50;
        }
    }

    public z4(String str, int i10, int i11, int i12, j5 j5Var) {
        this.a = i11;
        int i13 = i12 - 1;
        if (i13 == 1) {
            j5Var.getClass();
        } else if (i13 == 3) {
            j5Var.getClass();
        }
        if (i12 == 1) {
            j5 j5Var2 = j5.a;
            j5Var.ordinal();
        }
    }

    public static z4[] values() {
        return (z4[]) e.clone();
    }
}
