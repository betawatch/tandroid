package h3;

import android.os.Bundle;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements d5.k, p.a, GenericProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ t(int i9, boolean z10) {
        this.a = i9;
        this.b = z10;
    }

    @Override // p.a
    public gc c(oc ocVar) {
        return ocVar.k(this.b);
    }

    @Override // d5.k
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
        Bundle i9 = aa.d.i("afterSignup", this.b);
        ng0 ng0Var = new ng0();
        ng0Var.k0(i9);
        return ng0Var;
    }
}
