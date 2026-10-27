package gh;

import fh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ b(int i10, u6 u6Var) {
        this.a = i10;
        this.b = u6Var;
    }

    @Override // fh.d
    public final int i(u6 u6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return y6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.Sd, u6Var));
                }
                return i0.a.o(y6.w0(y6.Sd, u6Var), 255);
            case 1:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return y6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.ce, u6Var));
                }
                return i0.a.o(y6.w0(z10 ? y6.s8 : y6.ce, u6Var), 255);
            default:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return y6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.ce, u6Var));
                }
                return i0.a.o(y6.w0(z10 ? y6.s8 : y6.ce, u6Var), 255);
        }
    }
}
