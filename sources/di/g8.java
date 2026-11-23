package di;

import org.telegram.messenger.y10;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ y10 c;

    public /* synthetic */ g8(int i7, y10 y10Var, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
        this.c = y10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y10 y10Var;
        y10 y10Var2;
        y10 y10Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (y10Var = this.c) != null) {
                    y10Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (y10Var2 = this.c) != null) {
                    zArr2[0] = true;
                    y10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (y10Var3 = this.c) != null) {
                    zArr3[0] = true;
                    y10Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g8(y8 y8Var, boolean[] zArr, y10 y10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = y10Var;
    }
}
