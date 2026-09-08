package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ y1 a;

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y1.W(this.a, (h51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (h51Var.a == 16) {
            Object obj6 = h51Var.G;
            if (!(obj6 instanceof a2) || !((a2) obj6).g) {
                this.a.e0(h51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
