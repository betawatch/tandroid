package i2;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ch0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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

    @Override // p.a
    public rc c(yc ycVar) {
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
        ch0 ch0Var = new ch0();
        ch0Var.l0(i10);
        return ch0Var;
    }
}
