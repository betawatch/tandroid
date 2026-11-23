package di;

import org.telegram.messenger.w10;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ w10 c;

    public /* synthetic */ g8(int i7, w10 w10Var, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
        this.c = w10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w10 w10Var;
        w10 w10Var2;
        w10 w10Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (w10Var = this.c) != null) {
                    w10Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (w10Var2 = this.c) != null) {
                    zArr2[0] = true;
                    w10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (w10Var3 = this.c) != null) {
                    zArr3[0] = true;
                    w10Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g8(y8 y8Var, boolean[] zArr, w10 w10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = w10Var;
    }
}
