package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ y1 a;

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y1.U(this.a, (h61) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (h61Var.a == 16) {
            Object obj6 = h61Var.G;
            if (!(obj6 instanceof a2) || !((a2) obj6).g) {
                this.a.e0(h61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
