package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ z1 a;

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.a, (i51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (i51Var.a == 16) {
            Object obj6 = i51Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).g) {
                this.a.e0(i51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
