// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gx9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ dl3(gx9 gx9Var, int i, String str, String str2) {
        this.a = (byte) 1;
        this.b = gx9Var;
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
                gx9 gx9Var = this.b;
                gx9Var.f = null;
                byte b2 = gx9Var.W;
                String str3 = this.d;
                int i3 = this.c;
                if (b2 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        i = i3;
                        str = str3;
                        jf7.Y(gx9Var.t0).a.c(new dl3(gx9Var, lowerCase, i, str, (byte) 2));
                        if (gx9Var.i0 == 15) {
                            dl3 dl3Var = new dl3(gx9Var, i, str, str2);
                            gx9Var.h = dl3Var;
                            hl.c3(dl3Var);
                            break;
                        } else {
                            gx9Var.E0 -= 2;
                            break;
                        }
                    } else {
                        gx9Var.e0 = 0;
                        hl.c3(new l77((Object) gx9Var, gx9Var.e0, (Object) new ArrayList(), (Object) new ArrayList(), (Object) new ArrayList(), (byte) 12));
                    }
                }
                i = i3;
                str = str3;
                if (gx9Var.i0 == 15) {
                }
            case 1:
                gx9 gx9Var2 = this.b;
                byte b3 = gx9Var2.W;
                int i4 = gx9Var2.i0;
                gx9Var2.h = null;
                int i5 = gx9Var2.e0;
                int i6 = this.c;
                if (i6 == i5) {
                    if (b3 == 2 || i4 == 6 || i4 == 5 || gx9Var2.V.a() != 0) {
                        i2 = i6;
                        gx9Var2.E0 -= 2;
                    } else {
                        ml3 ml3Var = gx9Var2.k0;
                        boolean z = i4 != 4;
                        boolean z2 = (i4 == 4 || i4 == 11) ? false : true;
                        boolean z3 = i4 == 2 || i4 == 1;
                        boolean z4 = i4 == 0;
                        dj3 dj3Var = gx9Var2.V;
                        ml3Var.h(this.d, true, z, true, z2, z3, 0L, z4, 0, i6, dj3Var != null ? dj3Var.a() : 0L, null);
                        i2 = i6;
                    }
                    if (b3 != 0 && i4 != 15) {
                        gx9Var2.W(str2);
                        gx9Var2.V(i2, str2);
                        gx9Var2.U(i2, str2);
                        break;
                    } else {
                        gx9Var2.E0--;
                        break;
                    }
                }
                break;
            default:
                gx9 gx9Var3 = this.b;
                gx9Var3.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                jf7 Y = jf7.Y(gx9Var3.t0);
                int i7 = gx9Var3.i0;
                ArrayList arrayList4 = gx9Var3.r0;
                String str4 = this.d;
                Y.J0(i7, str4, arrayList, arrayList2, arrayList3, arrayList4, -1);
                hl.c3(new l77((Object) gx9Var3, this.c, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, (byte) 12));
                rh4.C1(str4, gx9Var3.z0);
                gx9Var3.A0 = false;
                if (str4.length() >= 3 && (ob6.M0(2131754143, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    gx9Var3.A0 = true;
                }
                hl.c3(new zg3(gx9Var3, (byte) 11));
                break;
        }
    }

    public /* synthetic */ dl3(gx9 gx9Var, String str, int i, String str2, byte b) {
        this.a = b;
        this.b = gx9Var;
        this.d = str;
        this.c = i;
        this.e = str2;
    }
}
