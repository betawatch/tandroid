package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.m, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // p.a
    public oc c(vc vcVar) {
        return vcVar.k(this.b);
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
        eh0 eh0Var = new eh0();
        eh0Var.l0(i10);
        return eh0Var;
    }
}
