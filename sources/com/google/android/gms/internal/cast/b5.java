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
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b5 {
    public static final b5 b;
    public static final b5 c;
    public static final b5[] d;
    public static final /* synthetic */ b5[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    b5 EF0;

    static {
        l5 l5Var = l5.e;
        b5 b5Var = new b5("DOUBLE", 0, 0, 1, l5Var);
        l5 l5Var2 = l5.d;
        b5 b5Var2 = new b5("FLOAT", 1, 1, 1, l5Var2);
        l5 l5Var3 = l5.c;
        b5 b5Var3 = new b5("INT64", 2, 2, 1, l5Var3);
        b5 b5Var4 = new b5("UINT64", 3, 3, 1, l5Var3);
        l5 l5Var4 = l5.b;
        b5 b5Var5 = new b5("INT32", 4, 4, 1, l5Var4);
        b5 b5Var6 = new b5("FIXED64", 5, 5, 1, l5Var3);
        b5 b5Var7 = new b5("FIXED32", 6, 6, 1, l5Var4);
        l5 l5Var5 = l5.f;
        b5 b5Var8 = new b5("BOOL", 7, 7, 1, l5Var5);
        l5 l5Var6 = l5.h;
        b5 b5Var9 = new b5("STRING", 8, 8, 1, l5Var6);
        l5 l5Var7 = l5.s;
        b5 b5Var10 = new b5("MESSAGE", 9, 9, 1, l5Var7);
        l5 l5Var8 = l5.n;
        b5 b5Var11 = new b5("BYTES", 10, 10, 1, l5Var8);
        b5 b5Var12 = new b5("UINT32", 11, 11, 1, l5Var4);
        l5 l5Var9 = l5.r;
        b5 b5Var13 = new b5("ENUM", 12, 12, 1, l5Var9);
        b5 b5Var14 = new b5("SFIXED32", 13, 13, 1, l5Var4);
        b5 b5Var15 = new b5("SFIXED64", 14, 14, 1, l5Var3);
        b5 b5Var16 = new b5("SINT32", 15, 15, 1, l5Var4);
        b5 b5Var17 = new b5("SINT64", 16, 16, 1, l5Var3);
        b5 b5Var18 = new b5("GROUP", 17, 17, 1, l5Var7);
        b5 b5Var19 = new b5("DOUBLE_LIST", 18, 18, 2, l5Var);
        b5 b5Var20 = new b5("FLOAT_LIST", 19, 19, 2, l5Var2);
        b5 b5Var21 = new b5("INT64_LIST", 20, 20, 2, l5Var3);
        b5 b5Var22 = new b5("UINT64_LIST", 21, 21, 2, l5Var3);
        b5 b5Var23 = new b5("INT32_LIST", 22, 22, 2, l5Var4);
        b5 b5Var24 = new b5("FIXED64_LIST", 23, 23, 2, l5Var3);
        b5 b5Var25 = new b5("FIXED32_LIST", 24, 24, 2, l5Var4);
        b5 b5Var26 = new b5("BOOL_LIST", 25, 25, 2, l5Var5);
        b5 b5Var27 = new b5("STRING_LIST", 26, 26, 2, l5Var6);
        b5 b5Var28 = new b5("MESSAGE_LIST", 27, 27, 2, l5Var7);
        b5 b5Var29 = new b5("BYTES_LIST", 28, 28, 2, l5Var8);
        b5 b5Var30 = new b5("UINT32_LIST", 29, 29, 2, l5Var4);
        b5 b5Var31 = new b5("ENUM_LIST", 30, 30, 2, l5Var9);
        b5 b5Var32 = new b5("SFIXED32_LIST", 31, 31, 2, l5Var4);
        b5 b5Var33 = new b5("SFIXED64_LIST", 32, 32, 2, l5Var3);
        b5 b5Var34 = new b5("SINT32_LIST", 33, 33, 2, l5Var4);
        b5 b5Var35 = new b5("SINT64_LIST", 34, 34, 2, l5Var3);
        b5 b5Var36 = new b5("DOUBLE_LIST_PACKED", 35, 35, 3, l5Var);
        b = b5Var36;
        b5 b5Var37 = new b5("FLOAT_LIST_PACKED", 36, 36, 3, l5Var2);
        b5 b5Var38 = new b5("INT64_LIST_PACKED", 37, 37, 3, l5Var3);
        b5 b5Var39 = new b5("UINT64_LIST_PACKED", 38, 38, 3, l5Var3);
        b5 b5Var40 = new b5("INT32_LIST_PACKED", 39, 39, 3, l5Var4);
        b5 b5Var41 = new b5("FIXED64_LIST_PACKED", 40, 40, 3, l5Var3);
        b5 b5Var42 = new b5("FIXED32_LIST_PACKED", 41, 41, 3, l5Var4);
        b5 b5Var43 = new b5("BOOL_LIST_PACKED", 42, 42, 3, l5Var5);
        b5 b5Var44 = new b5("UINT32_LIST_PACKED", 43, 43, 3, l5Var4);
        b5 b5Var45 = new b5("ENUM_LIST_PACKED", 44, 44, 3, l5Var9);
        b5 b5Var46 = new b5("SFIXED32_LIST_PACKED", 45, 45, 3, l5Var4);
        b5 b5Var47 = new b5("SFIXED64_LIST_PACKED", 46, 46, 3, l5Var3);
        b5 b5Var48 = new b5("SINT32_LIST_PACKED", 47, 47, 3, l5Var4);
        b5 b5Var49 = new b5("SINT64_LIST_PACKED", 48, 48, 3, l5Var3);
        c = b5Var49;
        e = new b5[]{b5Var, b5Var2, b5Var3, b5Var4, b5Var5, b5Var6, b5Var7, b5Var8, b5Var9, b5Var10, b5Var11, b5Var12, b5Var13, b5Var14, b5Var15, b5Var16, b5Var17, b5Var18, b5Var19, b5Var20, b5Var21, b5Var22, b5Var23, b5Var24, b5Var25, b5Var26, b5Var27, b5Var28, b5Var29, b5Var30, b5Var31, b5Var32, b5Var33, b5Var34, b5Var35, b5Var36, b5Var37, b5Var38, b5Var39, b5Var40, b5Var41, b5Var42, b5Var43, b5Var44, b5Var45, b5Var46, b5Var47, b5Var48, b5Var49, new b5("GROUP_LIST", 49, 49, 2, l5Var7), new b5("MAP", 50, 50, 4, l5.a)};
        b5[] values = values();
        d = new b5[values.length];
        for (b5 b5Var50 : values) {
            d[b5Var50.a] = b5Var50;
        }
    }

    public b5(String str, int i10, int i11, int i12, l5 l5Var) {
        this.a = i11;
        int i13 = i12 - 1;
        if (i13 == 1) {
            l5Var.getClass();
        } else if (i13 == 3) {
            l5Var.getClass();
        }
        if (i12 == 1) {
            l5 l5Var2 = l5.a;
            l5Var.ordinal();
        }
    }

    public static b5[] values() {
        return (b5[]) e.clone();
    }
}
