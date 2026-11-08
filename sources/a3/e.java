package a3;

import android.os.Build;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements g9.m {
    public final /* synthetic */ s a;
    public final /* synthetic */ n b;

    public /* synthetic */ e(s sVar, n nVar) {
        this.a = sVar;
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r1.b != false) goto L42;
     */
    @Override // g9.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        c3.d dVar;
        e2.u uVar = (e2.u) obj;
        s sVar = this.a;
        sVar.getClass();
        if (this.b.A0 && ((bool = sVar.k) == null || !bool.booleanValue())) {
            int i7 = uVar.K;
            if (i7 != -1 && i7 > 2) {
                String str = uVar.s;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                c3.d dVar2 = sVar.i;
                                if (dVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (dVar = sVar.i) == null || !dVar.b || !dVar.c() || !sVar.i.d() || !sVar.i.a(sVar.j, uVar)) {
                                return false;
                            }
                            break;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                }
                return false;
            }
        }
        return true;
    }
}
