package fh;

import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ a(int i10, g6 g6Var) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // eh.d
    public final int i(g6 g6Var, boolean z10) {
        switch (this.a) {
            case 0:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return k6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.Sd, g6Var));
                }
                return i0.a.o(k6.w0(k6.Sd, g6Var), 255);
            case 1:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return k6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.ce, g6Var));
                }
                return i0.a.o(k6.w0(z10 ? k6.s8 : k6.ce, g6Var), 255);
            default:
                if (c.c(UserConfig.selectedAccount, this.b)) {
                    return k6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.ce, g6Var));
                }
                return i0.a.o(k6.w0(z10 ? k6.s8 : k6.ce, g6Var), 255);
        }
    }
}
