package kg;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.qr;
import org.telegram.ui.ew;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ n(e0 e0Var, int i3, String str, String str2) {
        this.a = 1;
        this.b = e0Var;
        this.c = i3;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i3;
        int i10;
        int i11 = this.a;
        String str2 = this.e;
        switch (i11) {
            case 0:
                e0 e0Var = this.b;
                e0Var.f = null;
                int i12 = e0Var.W;
                String str3 = this.d;
                int i13 = this.c;
                if (i12 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str3;
                        i3 = i13;
                        qr.a0(e0Var.t0).a.c(new n(e0Var, lowerCase, i3, str, 2));
                        if (e0Var.i0 == 15) {
                            n nVar = new n(e0Var, i3, str, str2);
                            e0Var.h = nVar;
                            org.telegram.messenger.g0.h3(nVar);
                            break;
                        } else {
                            e0Var.E0 -= 2;
                            break;
                        }
                    } else {
                        e0Var.e0 = 0;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        new ArrayList();
                        org.telegram.messenger.g0.h3(new ai.p1(e0Var, e0Var.e0, arrayList, arrayList2, arrayList3, 6));
                    }
                }
                str = str3;
                i3 = i13;
                if (e0Var.i0 == 15) {
                }
            case 1:
                e0 e0Var2 = this.b;
                int i14 = e0Var2.W;
                int i15 = e0Var2.i0;
                e0Var2.h = null;
                int i16 = e0Var2.e0;
                int i17 = this.c;
                if (i17 == i16) {
                    if (i14 == 2 || i15 == 6 || i15 == 5 || e0Var2.V.a() != 0) {
                        i10 = i17;
                        e0Var2.E0 -= 2;
                    } else {
                        w wVar = e0Var2.k0;
                        long j10 = 0;
                        boolean z10 = i15 != 4;
                        boolean z11 = (i15 == 4 || i15 == 11) ? false : true;
                        boolean z12 = i15 == 2 || i15 == 1;
                        boolean z13 = i15 == 0;
                        ew ewVar = e0Var2.V;
                        if (ewVar != null) {
                            j10 = ewVar.a();
                        }
                        wVar.h(this.d, true, z10, true, z11, z12, 0L, z13, 0, i17, j10, null);
                        i10 = i17;
                    }
                    if (i14 != 0 && i15 != 15) {
                        e0Var2.W(str2);
                        e0Var2.V(i10, str2);
                        e0Var2.U(i10, str2);
                        break;
                    } else {
                        e0Var2.E0--;
                        break;
                    }
                }
                break;
            default:
                e0 e0Var3 = this.b;
                e0Var3.getClass();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                new ArrayList();
                qr a02 = qr.a0(e0Var3.t0);
                int i18 = e0Var3.i0;
                ArrayList arrayList7 = e0Var3.r0;
                String str4 = this.d;
                a02.M0(i18, str4, arrayList4, arrayList5, arrayList6, arrayList7, -1);
                org.telegram.messenger.g0.h3(new ai.p1(e0Var3, this.c, arrayList4, arrayList5, arrayList6, 6));
                n0.B1(str4, e0Var3.z0);
                e0Var3.A0 = false;
                if (str4.length() >= 3 && (bd.M0(2131754150, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    e0Var3.A0 = true;
                }
                org.telegram.messenger.g0.h3(new u(e0Var3, 0));
                break;
        }
    }

    public /* synthetic */ n(e0 e0Var, String str, int i3, String str2, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.d = str;
        this.c = i3;
        this.e = str2;
    }
}
