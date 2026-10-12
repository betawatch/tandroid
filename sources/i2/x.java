package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.kh0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.o, e2.j, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((m4.n1) obj).X(this.b);
                break;
            case 3:
                ((m4.n1) obj).q0(this.b);
                break;
            default:
                ((m4.n1) obj).w(this.b);
                break;
        }
    }

    @Override // p.a
    public sc c(zc zcVar) {
        return zcVar.k(this.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.e1) obj).onShuffleModeEnabledChanged(this.b);
                break;
            default:
                ((b2.e1) obj).onSkipSilenceEnabledChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        Bundle h = a1.g.h("afterSignup", this.b);
        kh0 kh0Var = new kh0();
        kh0Var.l0(h);
        return kh0Var;
    }
}
