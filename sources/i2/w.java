package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.pg0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.o, e2.j, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((m4.m1) obj).X(this.b);
                break;
            case 3:
                ((m4.m1) obj).q0(this.b);
                break;
            default:
                ((m4.m1) obj).w(this.b);
                break;
        }
    }

    @Override // p.a
    public qc c(xc xcVar) {
        return xcVar.k(this.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).onShuffleModeEnabledChanged(this.b);
                break;
            default:
                ((b2.d1) obj).onSkipSilenceEnabledChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        Bundle h = a1.g.h("afterSignup", this.b);
        pg0 pg0Var = new pg0();
        pg0Var.l0(h);
        return pg0Var;
    }
}
