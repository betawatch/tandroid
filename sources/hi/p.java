package hi;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
import r0.k1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ r a;

    @Override // r0.n
    public k1 B0(View view, k1 k1Var) {
        this.a.V(k1Var.a.f(519).d);
        return k1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r.U(this.a, (m61) obj);
    }
}
