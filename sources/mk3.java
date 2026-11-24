// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mk3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mt9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ mk3(mt9 mt9Var, int i, String str, String str2) {
        this.a = (byte) 1;
        this.b = mt9Var;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        String str;
        int i2;
        byte b = this.a;
        String str2 = this.e;
        switch (b) {
            case 0:
                mt9 mt9Var = this.b;
                mt9Var.f = null;
                byte b2 = mt9Var.W;
                String str3 = this.d;
                int i3 = this.c;
                if (b2 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        i = i3;
                        str = str3;
                        ad7.Y(mt9Var.t0).a.c(new mk3(mt9Var, lowerCase, i, str, (byte) 2));
                        if (mt9Var.i0 == 15) {
                            mk3 mk3Var = new mk3(mt9Var, i, str, str2);
                            mt9Var.h = mk3Var;
                            gl.c3(mk3Var);
                            break;
                        } else {
                            mt9Var.E0 -= 2;
                            break;
                        }
                    } else {
                        mt9Var.e0 = 0;
                        gl.c3(new i57((Object) mt9Var, mt9Var.e0, (Object) new ArrayList(), (Object) new ArrayList(), (Object) new ArrayList(), (byte) 12));
                    }
                }
                i = i3;
                str = str3;
                if (mt9Var.i0 == 15) {
                }
            case 1:
                mt9 mt9Var2 = this.b;
                byte b3 = mt9Var2.W;
                int i4 = mt9Var2.i0;
                mt9Var2.h = null;
                int i5 = mt9Var2.e0;
                int i6 = this.c;
                if (i6 == i5) {
                    if (b3 == 2 || i4 == 6 || i4 == 5 || mt9Var2.V.a() != 0) {
                        i2 = i6;
                        mt9Var2.E0 -= 2;
                    } else {
                        uk3 uk3Var = mt9Var2.k0;
                        boolean z = i4 != 4;
                        boolean z2 = (i4 == 4 || i4 == 11) ? false : true;
                        boolean z3 = i4 == 2 || i4 == 1;
                        boolean z4 = i4 == 0;
                        ji3 ji3Var = mt9Var2.V;
                        uk3Var.h(this.d, true, z, true, z2, z3, 0L, z4, 0, i6, ji3Var != null ? ji3Var.a() : 0L, null);
                        i2 = i6;
                    }
                    if (b3 != 0 && i4 != 15) {
                        mt9Var2.W(str2);
                        mt9Var2.V(i2, str2);
                        mt9Var2.U(i2, str2);
                        break;
                    } else {
                        mt9Var2.E0--;
                        break;
                    }
                }
                break;
            default:
                mt9 mt9Var3 = this.b;
                mt9Var3.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ad7 Y = ad7.Y(mt9Var3.t0);
                int i7 = mt9Var3.i0;
                ArrayList arrayList4 = mt9Var3.r0;
                String str4 = this.d;
                Y.J0(i7, str4, arrayList, arrayList2, arrayList3, arrayList4, -1);
                gl.c3(new i57((Object) mt9Var3, this.c, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, (byte) 12));
                tf4.B1(str4, mt9Var3.z0);
                mt9Var3.A0 = false;
                if (str4.length() >= 3 && (k96.M0(2131754147, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    mt9Var3.A0 = true;
                }
                gl.c3(new li3(mt9Var3, (byte) 5));
                break;
        }
    }

    public /* synthetic */ mk3(mt9 mt9Var, String str, int i, String str2, byte b) {
        this.a = b;
        this.b = mt9Var;
        this.d = str;
        this.c = i;
        this.e = str2;
    }
}
