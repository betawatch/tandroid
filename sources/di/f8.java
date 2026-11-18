package di;

import org.telegram.messenger.x10;
import org.telegram.ui.dd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ f8(int i7, x10 x10Var, boolean[] zArr) {
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
                org.telegram.messenger.g0.h3(new dd0(4), 220L);
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

    public /* synthetic */ f8(x8 x8Var, boolean[] zArr, x10 x10Var) {
        this.a = 0;
        this.b = zArr;
        this.c = x10Var;
    }
}
