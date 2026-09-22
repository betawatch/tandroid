package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.gh0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.m, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // p.a
    public pc c(xc xcVar) {
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
        gh0 gh0Var = new gh0();
        gh0Var.l0(i10);
        return gh0Var;
    }
}
