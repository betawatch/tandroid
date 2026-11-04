package lg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements org.telegram.ui.ActionBar.p1, s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ o0(r0 r0Var, int i3) {
        this.a = i3;
        this.b = r0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r0.b0(this.b, (r31) obj, (View) obj2);
    }
}
