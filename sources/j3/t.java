package j3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements f5.j, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ t(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // p.a
    public mc c(tc tcVar) {
        return tcVar.k(this.b);
    }

    @Override // f5.j
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a2) obj).onShuffleModeEnabledChanged(this.b);
                break;
            default:
                ((a2) obj).onSkipSilenceEnabledChanged(this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        Bundle i10 = a4.w.i("afterSignup", this.b);
        ng0 ng0Var = new ng0();
        ng0Var.l0(i10);
        return ng0Var;
    }
}
