package di;

import org.telegram.messenger.x10;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ g8(int i7, x10 x10Var, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
        this.c = x10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x10 x10Var;
        x10 x10Var2;
        x10 x10Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (x10Var = this.c) != null) {
                    x10Var.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (x10Var2 = this.c) != null) {
                    zArr2[0] = true;
                    x10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (x10Var3 = this.c) != null) {
                    zArr3[0] = true;
                    x10Var3.a(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g8(y8 y8Var, boolean[] zArr, x10 x10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = x10Var;
    }
}
