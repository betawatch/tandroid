package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements org.telegram.ui.ActionBar.r1, v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ q0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t0.b0(this.b, (l41) obj, (View) obj2);
    }
}
