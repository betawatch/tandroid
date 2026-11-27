// default package

import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bd3 implements pj8 {
    public final /* synthetic */ ld3 a;
    public final /* synthetic */ gd3 b;

    public /* synthetic */ bd3(ld3 ld3Var, gd3 gd3Var) {
        this.a = ld3Var;
        this.b = gd3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r7.b != false) goto L37;
     */
    @Override // pj8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        moa moaVar;
        ko4 ko4Var = (ko4) obj;
        ld3 ld3Var = this.a;
        ld3Var.getClass();
        if (this.b.A0 && ((bool = ld3Var.k) == null || !bool.booleanValue())) {
            int i = ko4Var.N;
            if (i != -1 && i > 2) {
                String str = ko4Var.t;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                moa moaVar2 = ld3Var.i;
                                if (moaVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (moaVar = ld3Var.i) == null || !moaVar.b || !moaVar.c() || !ld3Var.i.d() || !ld3Var.i.a(ld3Var.j, ko4Var)) {
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
