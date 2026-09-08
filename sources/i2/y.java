package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.m, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // p.a
    public qc c(yc ycVar) {
        return ycVar.k(this.b);
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
