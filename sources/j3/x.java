package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        wg0 wg0Var = new wg0();
        wg0Var.l0(i10);
        return wg0Var;
    }
}
