package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.o, e2.j, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y(int i10, boolean z10) {
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
    public qc c(wc wcVar) {
        return wcVar.k(this.b);
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
        Bundle i10 = a1.g.i("afterSignup", this.b);
        rg0 rg0Var = new rg0();
        rg0Var.i0(i10);
        return rg0Var;
    }
}
