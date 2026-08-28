package nh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
import r0.m1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final /* synthetic */ r a;

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        this.a.U(m1Var.a.f(519).d);
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
        r.T(this.a, (l41) obj);
    }
}
