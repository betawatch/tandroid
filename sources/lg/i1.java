package lg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements s10, t10 {
    public final /* synthetic */ r1 a;

    public /* synthetic */ i1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (r31Var.a == 16) {
            Object obj = r31Var.G;
            if (!(obj instanceof t1) || !((t1) obj).g) {
                this.a.j0(r31Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r1.b0(this.a, (r31) obj, (View) obj2);
    }
}
