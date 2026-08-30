package f5;

import h5.d0;
import j3.n0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements r8.f {
    public final /* synthetic */ p a;

    public /* synthetic */ d(p pVar) {
        this.a = pVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r2.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r2.equals("audio/ac4") == false) goto L16;
     */
    @Override // r8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z4;
        k kVar;
        p pVar = this.a;
        n0 n0Var = (n0) obj;
        synchronized (pVar.d) {
            try {
                z4 = true;
                if (pVar.h.W && !pVar.g) {
                    char c3 = 2;
                    if (n0Var.P > 2) {
                        String str = n0Var.C;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 187078297:
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (d0.a >= 32) {
                                        k kVar2 = pVar.i;
                                        if (kVar2 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (d0.a >= 32 || (kVar = pVar.i) == null || !kVar.b || !kVar.c() || !pVar.i.d() || !pVar.i.a(n0Var, pVar.j)) {
                                        z4 = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (d0.a >= 32) {
                        }
                        z4 = false;
                    }
                }
            } finally {
            }
        }
        return z4;
    }
}
