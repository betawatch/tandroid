package oh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;
import r0.m1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final /* synthetic */ r a;

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        this.a.V(m1Var.a.f(519).d);
        return m1.b;
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
        r.U(this.a, (n41) obj);
    }
}
