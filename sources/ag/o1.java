package ag;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements org.telegram.ui.ActionBar.u1, o20 {
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
                this.b.e0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.e0();
                break;
        }
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t1.a0(this.b, (a51) obj, (View) obj2);
    }
}
