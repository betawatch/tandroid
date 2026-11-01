package ag;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.u1, p20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ o1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.f0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.f0();
                break;
        }
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t1.b0(this.b, (b51) obj, (View) obj2);
    }
}
