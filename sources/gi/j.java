package gi;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import r0.l1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Utilities.Callback5, Utilities.Callback5Return, r0.n, MessagesStorage.BooleanCallback {
    public final /* synthetic */ p a;

    public /* synthetic */ j(p pVar) {
        this.a = pVar;
    }

    @Override // r0.n
    public l1 T0(View view, l1 l1Var) {
        i0.c f7 = l1Var.a.f(519);
        this.a.d.setPadding(0, f7.b, 0, f7.d);
        return l1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(p.U(this.a, (h51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p.V(this.a, (h51) obj);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        p pVar = this.a;
        pVar.finishFragment();
        pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-pVar.b), null, pVar.H, Boolean.valueOf(z10));
    }
}
