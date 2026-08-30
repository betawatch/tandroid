package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.vg0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements h5.j, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
    }

    @Override // p.a
    public ic c(qc qcVar) {
        return qcVar.k(this.b);
    }

    @Override // h5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((y1) obj).onShuffleModeEnabledChanged(this.b);
                break;
            default:
                ((y1) obj).onSkipSilenceEnabledChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        Bundle i10 = android.support.v4.media.a.i("afterSignup", this.b);
        vg0 vg0Var = new vg0();
        vg0Var.l0(i10);
        return vg0Var;
    }
}
