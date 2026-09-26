package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ z1 a;

    public /* synthetic */ n1(z1 z1Var) {
        this.a = z1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.a, (v51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (v51Var.a == 16) {
            Object obj6 = v51Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).g) {
                this.a.e0(v51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
