package d5;

import f5.d0;
import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p8.f {
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
    @Override // p8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z10;
        k kVar;
        p pVar = this.a;
        t0 t0Var = (t0) obj;
        synchronized (pVar.d) {
            try {
                z10 = true;
                if (pVar.h.V && !pVar.g) {
                    char c3 = 2;
                    if (t0Var.O > 2) {
                        String str = t0Var.B;
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
                                    if (d0.a >= 32 || (kVar = pVar.i) == null || !kVar.b || !kVar.c() || !pVar.i.d() || !pVar.i.a(t0Var, pVar.j)) {
                                        z10 = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                        if (d0.a >= 32) {
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
