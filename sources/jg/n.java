package jg;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.vr;
import org.telegram.ui.jw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ n(h0 h0Var, int i7, String str, String str2) {
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
                int i12 = h0Var.W;
                String str3 = this.d;
                int i13 = this.c;
                if (i12 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str3;
                        i7 = i13;
                        vr.a0(h0Var.t0).a.c(new n(h0Var, lowerCase, i7, str, 2));
                        if (h0Var.i0 == 15) {
                            n nVar = new n(h0Var, i7, str, str2);
                            h0Var.h = nVar;
                            org.telegram.messenger.g0.h3(nVar);
                            break;
                        } else {
                            h0Var.E0 -= 2;
                            break;
                        }
                    } else {
                        h0Var.e0 = 0;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        new ArrayList();
                        org.telegram.messenger.g0.h3(new ai.g1(h0Var, h0Var.e0, arrayList, arrayList2, arrayList3, 4));
                    }
                }
                str = str3;
                i7 = i13;
                if (h0Var.i0 == 15) {
                }
            case 1:
                h0 h0Var2 = this.b;
                int i14 = h0Var2.W;
                int i15 = h0Var2.i0;
                h0Var2.h = null;
                int i16 = h0Var2.e0;
                int i17 = this.c;
                if (i17 == i16) {
                    if (i14 == 2 || i15 == 6 || i15 == 5 || h0Var2.V.a() != 0) {
                        i10 = i17;
                        h0Var2.E0 -= 2;
                    } else {
                        z zVar = h0Var2.k0;
                        long j3 = 0;
                        boolean z10 = i15 != 4;
                        boolean z11 = (i15 == 4 || i15 == 11) ? false : true;
                        boolean z12 = i15 == 2 || i15 == 1;
                        boolean z13 = i15 == 0;
                        jw jwVar = h0Var2.V;
                        if (jwVar != null) {
                            j3 = jwVar.a();
                        }
                        zVar.h(this.d, true, z10, true, z11, z12, 0L, z13, 0, i17, j3, null);
                        i10 = i17;
                    }
                    if (i14 != 0 && i15 != 15) {
                        h0Var2.W(str2);
                        h0Var2.V(i10, str2);
                        h0Var2.U(i10, str2);
                        break;
                    } else {
                        h0Var2.E0--;
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
                vr a02 = vr.a0(h0Var3.t0);
                int i18 = h0Var3.i0;
                ArrayList arrayList7 = h0Var3.r0;
                String str4 = this.d;
                a02.M0(i18, str4, arrayList4, arrayList5, arrayList6, arrayList7, -1);
                org.telegram.messenger.g0.h3(new ai.g1(h0Var3, this.c, arrayList4, arrayList5, arrayList6, 4));
                q0.B1(str4, h0Var3.z0);
                h0Var3.A0 = false;
                if (str4.length() >= 3 && (hd.M0(2131754150, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    h0Var3.A0 = true;
                }
                org.telegram.messenger.g0.h3(new v(h0Var3, 0));
                break;
        }
    }

    public /* synthetic */ n(h0 h0Var, String str, int i7, String str2, int i10) {
        this.a = i10;
        this.b = h0Var;
        this.d = str;
        this.c = i7;
        this.e = str2;
    }
}
