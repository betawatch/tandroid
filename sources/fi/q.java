package fi;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import r0.l1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        s.U(this.a, (h51) obj);
    }
}
