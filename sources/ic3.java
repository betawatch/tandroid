// default package

import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic3 implements bg8 {
    public final /* synthetic */ sc3 a;
    public final /* synthetic */ nc3 b;

    public /* synthetic */ ic3(sc3 sc3Var, nc3 nc3Var) {
        this.a = sc3Var;
        this.b = nc3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r7.b != false) goto L37;
     */
    @Override // bg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        ska skaVar;
        fm4 fm4Var = (fm4) obj;
        sc3 sc3Var = this.a;
        sc3Var.getClass();
        if (this.b.A0 && ((bool = sc3Var.k) == null || !bool.booleanValue())) {
            int i = fm4Var.N;
            if (i != -1 && i > 2) {
                String str = fm4Var.t;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                ska skaVar2 = sc3Var.i;
                                if (skaVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (skaVar = sc3Var.i) == null || !skaVar.b || !skaVar.c() || !sc3Var.i.d() || !sc3Var.i.a(sc3Var.j, fm4Var)) {
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
