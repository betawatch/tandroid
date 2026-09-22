package fi;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;
import r0.l1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final /* synthetic */ s a;

    @Override // r0.n
    public l1 P0(View view, l1 l1Var) {
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
        s.U(this.a, (y51) obj);
    }
}
