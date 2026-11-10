package jg;

import bi.ub;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.yr;
import org.telegram.ui.kw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ o(h0 h0Var, int i7, String str, String str2) {
        this.a = 1;
        this.b = h0Var;
        this.c = i7;
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
        int i7;
        int i10;
        int i11 = this.a;
        String str2 = this.e;
        switch (i11) {
            case 0:
                h0 h0Var = this.b;
                h0Var.f = null;
                int i12 = h0Var.V;
                String str3 = this.d;
                int i13 = this.c;
                if (i12 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str3;
                        i7 = i13;
                        yr.a0(h0Var.s0).a.c(new o(h0Var, lowerCase, i7, str, 2));
                        if (h0Var.h0 == 15) {
                            o oVar = new o(h0Var, i7, str, str2);
                            h0Var.h = oVar;
                            org.telegram.messenger.g0.h3(oVar);
                            break;
                        } else {
                            h0Var.D0 -= 2;
                            break;
                        }
                    } else {
                        h0Var.d0 = 0;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        new ArrayList();
                        org.telegram.messenger.g0.h3(new ub(h0Var, h0Var.d0, arrayList, arrayList2, arrayList3, 4));
                    }
                }
                str = str3;
                i7 = i13;
                if (h0Var.h0 == 15) {
                }
            case 1:
                h0 h0Var2 = this.b;
                int i14 = h0Var2.V;
                int i15 = h0Var2.h0;
                h0Var2.h = null;
                int i16 = h0Var2.d0;
                int i17 = this.c;
                if (i17 == i16) {
                    if (i14 == 2 || i15 == 6 || i15 == 5 || h0Var2.U.a() != 0) {
                        i10 = i17;
                        h0Var2.D0 -= 2;
                    } else {
                        z zVar = h0Var2.j0;
                        long j3 = 0;
                        boolean z9 = i15 != 4;
                        boolean z10 = (i15 == 4 || i15 == 11) ? false : true;
                        boolean z11 = i15 == 2 || i15 == 1;
                        boolean z12 = i15 == 0;
                        kw kwVar = h0Var2.U;
                        if (kwVar != null) {
                            j3 = kwVar.a();
                        }
                        zVar.h(this.d, true, z9, true, z10, z11, 0L, z12, 0, i17, j3, null);
                        i10 = i17;
                    }
                    if (i14 != 0 && i15 != 15) {
                        h0Var2.W(str2);
                        h0Var2.V(i10, str2);
                        h0Var2.U(i10, str2);
                        break;
                    } else {
                        h0Var2.D0--;
                        break;
                    }
                }
                break;
            default:
                h0 h0Var3 = this.b;
                h0Var3.getClass();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                new ArrayList();
                yr a02 = yr.a0(h0Var3.s0);
                int i18 = h0Var3.h0;
                ArrayList arrayList7 = h0Var3.q0;
                String str4 = this.d;
                a02.M0(i18, str4, arrayList4, arrayList5, arrayList6, arrayList7, -1);
                org.telegram.messenger.g0.h3(new ub(h0Var3, this.c, arrayList4, arrayList5, arrayList6, 4));
                q0.B1(str4, h0Var3.y0);
                h0Var3.z0 = false;
                if (str4.length() >= 3 && (id.M0(2131754150, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    h0Var3.z0 = true;
                }
                org.telegram.messenger.g0.h3(new w(h0Var3, 0));
                break;
        }
    }

    public /* synthetic */ o(h0 h0Var, String str, int i7, String str2, int i10) {
        this.a = i10;
        this.b = h0Var;
        this.d = str;
        this.c = i7;
        this.e = str2;
    }
}
