package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements org.telegram.ui.ActionBar.r1, a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ n0(q0 q0Var, int i7) {
        this.a = i7;
        this.b = q0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        q0.b0(this.b, (x31) obj, (View) obj2);
    }
}
