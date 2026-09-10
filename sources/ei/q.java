package ei;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
import r0.l1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ s a;

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        this.a.V(l1Var.a.f(519).d);
        return l1.b;
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
        s.U(this.a, (v51) obj);
    }
}
