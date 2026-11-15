package di;

import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ka implements is {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] b;

    public ka(boolean[] zArr, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.a = zArr;
        this.b = u2VarArr;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.u2 u2Var;
        if (i7 == ns.A3 && this.a[0] && (u2Var = this.b[0]) != null) {
            u2Var.dismiss();
        }
    }
}
