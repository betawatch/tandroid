package com.google.android.gms.internal.vision;

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
public final class x0 {
    public static final x0 b;
    public static final x0 c;
    public static final x0[] d;
    public static final /* synthetic */ x0[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    x0 EF0;

    static {
        p1 p1Var = p1.e;
        x0 x0Var = new x0("DOUBLE", 0, 0, 1, p1Var);
        p1 p1Var2 = p1.d;
        x0 x0Var2 = new x0("FLOAT", 1, 1, 1, p1Var2);
        p1 p1Var3 = p1.c;
        x0 x0Var3 = new x0("INT64", 2, 2, 1, p1Var3);
        x0 x0Var4 = new x0("UINT64", 3, 3, 1, p1Var3);
        p1 p1Var4 = p1.b;
        x0 x0Var5 = new x0("INT32", 4, 4, 1, p1Var4);
        x0 x0Var6 = new x0("FIXED64", 5, 5, 1, p1Var3);
        x0 x0Var7 = new x0("FIXED32", 6, 6, 1, p1Var4);
        p1 p1Var5 = p1.f;
        x0 x0Var8 = new x0("BOOL", 7, 7, 1, p1Var5);
        p1 p1Var6 = p1.h;
        x0 x0Var9 = new x0("STRING", 8, 8, 1, p1Var6);
        p1 p1Var7 = p1.s;
        x0 x0Var10 = new x0("MESSAGE", 9, 9, 1, p1Var7);
        p1 p1Var8 = p1.n;
        x0 x0Var11 = new x0("BYTES", 10, 10, 1, p1Var8);
        x0 x0Var12 = new x0("UINT32", 11, 11, 1, p1Var4);
        p1 p1Var9 = p1.r;
        x0 x0Var13 = new x0("ENUM", 12, 12, 1, p1Var9);
        x0 x0Var14 = new x0("SFIXED32", 13, 13, 1, p1Var4);
        x0 x0Var15 = new x0("SFIXED64", 14, 14, 1, p1Var3);
        x0 x0Var16 = new x0("SINT32", 15, 15, 1, p1Var4);
        x0 x0Var17 = new x0("SINT64", 16, 16, 1, p1Var3);
        x0 x0Var18 = new x0("GROUP", 17, 17, 1, p1Var7);
        x0 x0Var19 = new x0("DOUBLE_LIST", 18, 18, 2, p1Var);
        x0 x0Var20 = new x0("FLOAT_LIST", 19, 19, 2, p1Var2);
        x0 x0Var21 = new x0("INT64_LIST", 20, 20, 2, p1Var3);
        x0 x0Var22 = new x0("UINT64_LIST", 21, 21, 2, p1Var3);
        x0 x0Var23 = new x0("INT32_LIST", 22, 22, 2, p1Var4);
        x0 x0Var24 = new x0("FIXED64_LIST", 23, 23, 2, p1Var3);
        x0 x0Var25 = new x0("FIXED32_LIST", 24, 24, 2, p1Var4);
        x0 x0Var26 = new x0("BOOL_LIST", 25, 25, 2, p1Var5);
        x0 x0Var27 = new x0("STRING_LIST", 26, 26, 2, p1Var6);
        x0 x0Var28 = new x0("MESSAGE_LIST", 27, 27, 2, p1Var7);
        x0 x0Var29 = new x0("BYTES_LIST", 28, 28, 2, p1Var8);
        x0 x0Var30 = new x0("UINT32_LIST", 29, 29, 2, p1Var4);
        x0 x0Var31 = new x0("ENUM_LIST", 30, 30, 2, p1Var9);
        x0 x0Var32 = new x0("SFIXED32_LIST", 31, 31, 2, p1Var4);
        x0 x0Var33 = new x0("SFIXED64_LIST", 32, 32, 2, p1Var3);
        x0 x0Var34 = new x0("SINT32_LIST", 33, 33, 2, p1Var4);
        x0 x0Var35 = new x0("SINT64_LIST", 34, 34, 2, p1Var3);
        x0 x0Var36 = new x0("DOUBLE_LIST_PACKED", 35, 35, 3, p1Var);
        b = x0Var36;
        x0 x0Var37 = new x0("FLOAT_LIST_PACKED", 36, 36, 3, p1Var2);
        x0 x0Var38 = new x0("INT64_LIST_PACKED", 37, 37, 3, p1Var3);
        x0 x0Var39 = new x0("UINT64_LIST_PACKED", 38, 38, 3, p1Var3);
        x0 x0Var40 = new x0("INT32_LIST_PACKED", 39, 39, 3, p1Var4);
        x0 x0Var41 = new x0("FIXED64_LIST_PACKED", 40, 40, 3, p1Var3);
        x0 x0Var42 = new x0("FIXED32_LIST_PACKED", 41, 41, 3, p1Var4);
        x0 x0Var43 = new x0("BOOL_LIST_PACKED", 42, 42, 3, p1Var5);
        x0 x0Var44 = new x0("UINT32_LIST_PACKED", 43, 43, 3, p1Var4);
        x0 x0Var45 = new x0("ENUM_LIST_PACKED", 44, 44, 3, p1Var9);
        x0 x0Var46 = new x0("SFIXED32_LIST_PACKED", 45, 45, 3, p1Var4);
        x0 x0Var47 = new x0("SFIXED64_LIST_PACKED", 46, 46, 3, p1Var3);
        x0 x0Var48 = new x0("SINT32_LIST_PACKED", 47, 47, 3, p1Var4);
        x0 x0Var49 = new x0("SINT64_LIST_PACKED", 48, 48, 3, p1Var3);
        c = x0Var49;
        e = new x0[]{x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8, x0Var9, x0Var10, x0Var11, x0Var12, x0Var13, x0Var14, x0Var15, x0Var16, x0Var17, x0Var18, x0Var19, x0Var20, x0Var21, x0Var22, x0Var23, x0Var24, x0Var25, x0Var26, x0Var27, x0Var28, x0Var29, x0Var30, x0Var31, x0Var32, x0Var33, x0Var34, x0Var35, x0Var36, x0Var37, x0Var38, x0Var39, x0Var40, x0Var41, x0Var42, x0Var43, x0Var44, x0Var45, x0Var46, x0Var47, x0Var48, x0Var49, new x0("GROUP_LIST", 49, 49, 2, p1Var7), new x0("MAP", 50, 50, 4, p1.a)};
        x0[] values = values();
        d = new x0[values.length];
        for (x0 x0Var50 : values) {
            d[x0Var50.a] = x0Var50;
        }
    }

    public x0(String str, int i10, int i11, int i12, p1 p1Var) {
        this.a = i11;
        int i13 = y0.a[m1.j.b(i12)];
        if (i13 == 1) {
            p1Var.getClass();
        } else if (i13 == 2) {
            p1Var.getClass();
        }
        if (i12 == 1) {
            int i14 = y0.b[p1Var.ordinal()];
        }
    }

    public static x0[] values() {
        return (x0[]) e.clone();
    }
}
