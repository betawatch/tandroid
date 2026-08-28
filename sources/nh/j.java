package nh;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
import r0.m1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Utilities.Callback5, Utilities.Callback5Return, r0.o, MessagesStorage.BooleanCallback {
    public final /* synthetic */ o a;

    public /* synthetic */ j(o oVar) {
        this.a = oVar;
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        i0.b f10 = m1Var.a.f(519);
        this.a.d.setPadding(0, f10.b, 0, f10.d);
        return m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o.T(this.a, (l41) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o.U(this.a, (l41) obj);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        o oVar = this.a;
        oVar.finishFragment();
        oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-oVar.b), null, oVar.D, Boolean.valueOf(z10));
    }
}
