package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zg0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.m, e2.h, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((m4.f1) obj).X(this.b);
                break;
            case 3:
                ((m4.f1) obj).o0(this.b);
                break;
            default:
                ((m4.f1) obj).x(this.b);
                break;
        }
    }

    @Override // p.a
    public qc b(xc xcVar) {
        return xcVar.k(this.b);
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
        zg0 zg0Var = new zg0();
        zg0Var.l0(i10);
        return zg0Var;
    }
}
