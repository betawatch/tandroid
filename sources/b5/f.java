package b5;

import d5.f0;
import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements n8.f {
    public final /* synthetic */ r a;

    public /* synthetic */ f(r rVar) {
        this.a = rVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r2.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r2.equals("audio/ac4") == false) goto L16;
     */
    @Override // n8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z10;
        m mVar;
        r rVar = this.a;
        t0 t0Var = (t0) obj;
        synchronized (rVar.d) {
            try {
                z10 = true;
                if (rVar.h.V && !rVar.g) {
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
                                    if (f0.a >= 32) {
                                        m mVar2 = rVar.i;
                                        if (mVar2 != null) {
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (f0.a >= 32 || (mVar = rVar.i) == null || !mVar.b || !mVar.c() || !rVar.i.d() || !rVar.i.a(t0Var, rVar.j)) {
                                        z10 = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (f0.a >= 32) {
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
