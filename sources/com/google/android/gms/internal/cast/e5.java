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
/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e5 {
    public static final e5 b;
    public static final e5 c;
    public static final e5[] d;
    public static final /* synthetic */ e5[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    e5 EF0;

    static {
        o5 o5Var = o5.e;
        e5 e5Var = new e5("DOUBLE", 0, 0, 1, o5Var);
        o5 o5Var2 = o5.d;
        e5 e5Var2 = new e5("FLOAT", 1, 1, 1, o5Var2);
        o5 o5Var3 = o5.c;
        e5 e5Var3 = new e5("INT64", 2, 2, 1, o5Var3);
        e5 e5Var4 = new e5("UINT64", 3, 3, 1, o5Var3);
        o5 o5Var4 = o5.b;
        e5 e5Var5 = new e5("INT32", 4, 4, 1, o5Var4);
        e5 e5Var6 = new e5("FIXED64", 5, 5, 1, o5Var3);
        e5 e5Var7 = new e5("FIXED32", 6, 6, 1, o5Var4);
        o5 o5Var5 = o5.f;
        e5 e5Var8 = new e5("BOOL", 7, 7, 1, o5Var5);
        o5 o5Var6 = o5.h;
        e5 e5Var9 = new e5("STRING", 8, 8, 1, o5Var6);
        o5 o5Var7 = o5.s;
        e5 e5Var10 = new e5("MESSAGE", 9, 9, 1, o5Var7);
        o5 o5Var8 = o5.n;
        e5 e5Var11 = new e5("BYTES", 10, 10, 1, o5Var8);
        e5 e5Var12 = new e5("UINT32", 11, 11, 1, o5Var4);
        o5 o5Var9 = o5.r;
        e5 e5Var13 = new e5("ENUM", 12, 12, 1, o5Var9);
        e5 e5Var14 = new e5("SFIXED32", 13, 13, 1, o5Var4);
        e5 e5Var15 = new e5("SFIXED64", 14, 14, 1, o5Var3);
        e5 e5Var16 = new e5("SINT32", 15, 15, 1, o5Var4);
        e5 e5Var17 = new e5("SINT64", 16, 16, 1, o5Var3);
        e5 e5Var18 = new e5("GROUP", 17, 17, 1, o5Var7);
        e5 e5Var19 = new e5("DOUBLE_LIST", 18, 18, 2, o5Var);
        e5 e5Var20 = new e5("FLOAT_LIST", 19, 19, 2, o5Var2);
        e5 e5Var21 = new e5("INT64_LIST", 20, 20, 2, o5Var3);
        e5 e5Var22 = new e5("UINT64_LIST", 21, 21, 2, o5Var3);
        e5 e5Var23 = new e5("INT32_LIST", 22, 22, 2, o5Var4);
        e5 e5Var24 = new e5("FIXED64_LIST", 23, 23, 2, o5Var3);
        e5 e5Var25 = new e5("FIXED32_LIST", 24, 24, 2, o5Var4);
        e5 e5Var26 = new e5("BOOL_LIST", 25, 25, 2, o5Var5);
        e5 e5Var27 = new e5("STRING_LIST", 26, 26, 2, o5Var6);
        e5 e5Var28 = new e5("MESSAGE_LIST", 27, 27, 2, o5Var7);
        e5 e5Var29 = new e5("BYTES_LIST", 28, 28, 2, o5Var8);
        e5 e5Var30 = new e5("UINT32_LIST", 29, 29, 2, o5Var4);
        e5 e5Var31 = new e5("ENUM_LIST", 30, 30, 2, o5Var9);
        e5 e5Var32 = new e5("SFIXED32_LIST", 31, 31, 2, o5Var4);
        e5 e5Var33 = new e5("SFIXED64_LIST", 32, 32, 2, o5Var3);
        e5 e5Var34 = new e5("SINT32_LIST", 33, 33, 2, o5Var4);
        e5 e5Var35 = new e5("SINT64_LIST", 34, 34, 2, o5Var3);
        e5 e5Var36 = new e5("DOUBLE_LIST_PACKED", 35, 35, 3, o5Var);
        b = e5Var36;
        e5 e5Var37 = new e5("FLOAT_LIST_PACKED", 36, 36, 3, o5Var2);
        e5 e5Var38 = new e5("INT64_LIST_PACKED", 37, 37, 3, o5Var3);
        e5 e5Var39 = new e5("UINT64_LIST_PACKED", 38, 38, 3, o5Var3);
        e5 e5Var40 = new e5("INT32_LIST_PACKED", 39, 39, 3, o5Var4);
        e5 e5Var41 = new e5("FIXED64_LIST_PACKED", 40, 40, 3, o5Var3);
        e5 e5Var42 = new e5("FIXED32_LIST_PACKED", 41, 41, 3, o5Var4);
        e5 e5Var43 = new e5("BOOL_LIST_PACKED", 42, 42, 3, o5Var5);
        e5 e5Var44 = new e5("UINT32_LIST_PACKED", 43, 43, 3, o5Var4);
        e5 e5Var45 = new e5("ENUM_LIST_PACKED", 44, 44, 3, o5Var9);
        e5 e5Var46 = new e5("SFIXED32_LIST_PACKED", 45, 45, 3, o5Var4);
        e5 e5Var47 = new e5("SFIXED64_LIST_PACKED", 46, 46, 3, o5Var3);
        e5 e5Var48 = new e5("SINT32_LIST_PACKED", 47, 47, 3, o5Var4);
        e5 e5Var49 = new e5("SINT64_LIST_PACKED", 48, 48, 3, o5Var3);
        c = e5Var49;
        e = new e5[]{e5Var, e5Var2, e5Var3, e5Var4, e5Var5, e5Var6, e5Var7, e5Var8, e5Var9, e5Var10, e5Var11, e5Var12, e5Var13, e5Var14, e5Var15, e5Var16, e5Var17, e5Var18, e5Var19, e5Var20, e5Var21, e5Var22, e5Var23, e5Var24, e5Var25, e5Var26, e5Var27, e5Var28, e5Var29, e5Var30, e5Var31, e5Var32, e5Var33, e5Var34, e5Var35, e5Var36, e5Var37, e5Var38, e5Var39, e5Var40, e5Var41, e5Var42, e5Var43, e5Var44, e5Var45, e5Var46, e5Var47, e5Var48, e5Var49, new e5("GROUP_LIST", 49, 49, 2, o5Var7), new e5("MAP", 50, 50, 4, o5.a)};
        e5[] values = values();
        d = new e5[values.length];
        for (e5 e5Var50 : values) {
            d[e5Var50.a] = e5Var50;
        }
    }

    public e5(String str, int i10, int i11, int i12, o5 o5Var) {
        this.a = i11;
        int i13 = i12 - 1;
        if (i13 == 1) {
            o5Var.getClass();
        } else if (i13 == 3) {
            o5Var.getClass();
        }
        if (i12 == 1) {
            o5 o5Var2 = o5.a;
            o5Var.ordinal();
        }
    }

    public static e5[] values() {
        return (e5[]) e.clone();
    }
}
