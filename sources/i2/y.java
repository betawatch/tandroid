package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.m, e2.h, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // p.a
    public qc a(yc ycVar) {
        return ycVar.k(this.b);
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((m4.e1) obj).X(this.b);
                break;
            case 3:
                ((m4.e1) obj).o0(this.b);
                break;
            default:
                ((m4.e1) obj).x(this.b);
                break;
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.z0) obj).onShuffleModeEnabledChanged(this.b);
                break;
            default:
                ((b2.z0) obj).onSkipSilenceEnabledChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        Bundle i10 = a4.a.i("afterSignup", this.b);
        yg0 yg0Var = new yg0();
        yg0Var.l0(i10);
        return yg0Var;
    }
}
