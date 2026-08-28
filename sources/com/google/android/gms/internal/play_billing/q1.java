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
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q1 {
    public static final q1 b;
    public static final q1 c;
    public static final q1[] d;
    public static final /* synthetic */ q1[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    q1 EF0;

    static {
        d2 d2Var = d2.e;
        q1 q1Var = new q1("DOUBLE", 0, 0, 1, d2Var);
        d2 d2Var2 = d2.d;
        q1 q1Var2 = new q1("FLOAT", 1, 1, 1, d2Var2);
        d2 d2Var3 = d2.c;
        q1 q1Var3 = new q1("INT64", 2, 2, 1, d2Var3);
        q1 q1Var4 = new q1("UINT64", 3, 3, 1, d2Var3);
        d2 d2Var4 = d2.b;
        q1 q1Var5 = new q1("INT32", 4, 4, 1, d2Var4);
        q1 q1Var6 = new q1("FIXED64", 5, 5, 1, d2Var3);
        q1 q1Var7 = new q1("FIXED32", 6, 6, 1, d2Var4);
        d2 d2Var5 = d2.f;
        q1 q1Var8 = new q1("BOOL", 7, 7, 1, d2Var5);
        d2 d2Var6 = d2.h;
        q1 q1Var9 = new q1("STRING", 8, 8, 1, d2Var6);
        d2 d2Var7 = d2.s;
        q1 q1Var10 = new q1("MESSAGE", 9, 9, 1, d2Var7);
        d2 d2Var8 = d2.n;
        q1 q1Var11 = new q1("BYTES", 10, 10, 1, d2Var8);
        q1 q1Var12 = new q1("UINT32", 11, 11, 1, d2Var4);
        d2 d2Var9 = d2.r;
        q1 q1Var13 = new q1("ENUM", 12, 12, 1, d2Var9);
        q1 q1Var14 = new q1("SFIXED32", 13, 13, 1, d2Var4);
        q1 q1Var15 = new q1("SFIXED64", 14, 14, 1, d2Var3);
        q1 q1Var16 = new q1("SINT32", 15, 15, 1, d2Var4);
        q1 q1Var17 = new q1("SINT64", 16, 16, 1, d2Var3);
        q1 q1Var18 = new q1("GROUP", 17, 17, 1, d2Var7);
        q1 q1Var19 = new q1("DOUBLE_LIST", 18, 18, 2, d2Var);
        q1 q1Var20 = new q1("FLOAT_LIST", 19, 19, 2, d2Var2);
        q1 q1Var21 = new q1("INT64_LIST", 20, 20, 2, d2Var3);
        q1 q1Var22 = new q1("UINT64_LIST", 21, 21, 2, d2Var3);
        q1 q1Var23 = new q1("INT32_LIST", 22, 22, 2, d2Var4);
        q1 q1Var24 = new q1("FIXED64_LIST", 23, 23, 2, d2Var3);
        q1 q1Var25 = new q1("FIXED32_LIST", 24, 24, 2, d2Var4);
        q1 q1Var26 = new q1("BOOL_LIST", 25, 25, 2, d2Var5);
        q1 q1Var27 = new q1("STRING_LIST", 26, 26, 2, d2Var6);
        q1 q1Var28 = new q1("MESSAGE_LIST", 27, 27, 2, d2Var7);
        q1 q1Var29 = new q1("BYTES_LIST", 28, 28, 2, d2Var8);
        q1 q1Var30 = new q1("UINT32_LIST", 29, 29, 2, d2Var4);
        q1 q1Var31 = new q1("ENUM_LIST", 30, 30, 2, d2Var9);
        q1 q1Var32 = new q1("SFIXED32_LIST", 31, 31, 2, d2Var4);
        q1 q1Var33 = new q1("SFIXED64_LIST", 32, 32, 2, d2Var3);
        q1 q1Var34 = new q1("SINT32_LIST", 33, 33, 2, d2Var4);
        q1 q1Var35 = new q1("SINT64_LIST", 34, 34, 2, d2Var3);
        q1 q1Var36 = new q1("DOUBLE_LIST_PACKED", 35, 35, 3, d2Var);
        b = q1Var36;
        q1 q1Var37 = new q1("FLOAT_LIST_PACKED", 36, 36, 3, d2Var2);
        q1 q1Var38 = new q1("INT64_LIST_PACKED", 37, 37, 3, d2Var3);
        q1 q1Var39 = new q1("UINT64_LIST_PACKED", 38, 38, 3, d2Var3);
        q1 q1Var40 = new q1("INT32_LIST_PACKED", 39, 39, 3, d2Var4);
        q1 q1Var41 = new q1("FIXED64_LIST_PACKED", 40, 40, 3, d2Var3);
        q1 q1Var42 = new q1("FIXED32_LIST_PACKED", 41, 41, 3, d2Var4);
        q1 q1Var43 = new q1("BOOL_LIST_PACKED", 42, 42, 3, d2Var5);
        q1 q1Var44 = new q1("UINT32_LIST_PACKED", 43, 43, 3, d2Var4);
        q1 q1Var45 = new q1("ENUM_LIST_PACKED", 44, 44, 3, d2Var9);
        q1 q1Var46 = new q1("SFIXED32_LIST_PACKED", 45, 45, 3, d2Var4);
        q1 q1Var47 = new q1("SFIXED64_LIST_PACKED", 46, 46, 3, d2Var3);
        q1 q1Var48 = new q1("SINT32_LIST_PACKED", 47, 47, 3, d2Var4);
        q1 q1Var49 = new q1("SINT64_LIST_PACKED", 48, 48, 3, d2Var3);
        c = q1Var49;
        e = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7, q1Var8, q1Var9, q1Var10, q1Var11, q1Var12, q1Var13, q1Var14, q1Var15, q1Var16, q1Var17, q1Var18, q1Var19, q1Var20, q1Var21, q1Var22, q1Var23, q1Var24, q1Var25, q1Var26, q1Var27, q1Var28, q1Var29, q1Var30, q1Var31, q1Var32, q1Var33, q1Var34, q1Var35, q1Var36, q1Var37, q1Var38, q1Var39, q1Var40, q1Var41, q1Var42, q1Var43, q1Var44, q1Var45, q1Var46, q1Var47, q1Var48, q1Var49, new q1("GROUP_LIST", 49, 49, 2, d2Var7), new q1("MAP", 50, 50, 4, d2.a)};
        q1[] values = values();
        d = new q1[values.length];
        for (q1 q1Var50 : values) {
            d[q1Var50.a] = q1Var50;
        }
    }

    public q1(String str, int i9, int i10, int i11, d2 d2Var) {
        this.a = i10;
        int i12 = i11 - 1;
        if (i12 == 1) {
            d2Var.getClass();
        } else if (i12 == 3) {
            d2Var.getClass();
        }
        if (i11 == 1) {
            d2 d2Var2 = d2.a;
            d2Var.ordinal();
        }
    }

    public static q1[] values() {
        return (q1[]) e.clone();
    }
}
