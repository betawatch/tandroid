package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements org.telegram.ui.ActionBar.q1, x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ n0(q0 q0Var, int i7) {
        this.a = i7;
        this.b = q0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        q0.b0(this.b, (b41) obj, (View) obj2);
    }
}
