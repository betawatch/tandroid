package b5;

import d5.g0;
import h3.t0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements o8.f {
    public final /* synthetic */ q a;

    public /* synthetic */ e(q qVar) {
        this.a = qVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r2.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r2.equals("audio/ac4") == false) goto L16;
     */
    @Override // o8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z10;
        l lVar;
        q qVar = this.a;
        t0 t0Var = (t0) obj;
        synchronized (qVar.d) {
            try {
                z10 = true;
                if (qVar.h.V && !qVar.g) {
                    char c10 = 2;
                    if (t0Var.O > 2) {
                        String str = t0Var.B;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 187078297:
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (g0.a >= 32) {
                                        l lVar2 = qVar.i;
                                        if (lVar2 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (g0.a >= 32 || (lVar = qVar.i) == null || !lVar.b || !lVar.c() || !qVar.i.d() || !qVar.i.a(t0Var, qVar.j)) {
                                        z10 = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (g0.a >= 32) {
                        }
                        z10 = false;
                    }
                }
            } finally {
            }
        }
        return z10;
    }
}
