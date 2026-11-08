package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zb implements ls {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] b;

    public zb(boolean[] zArr, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.a = zArr;
        this.b = v2VarArr;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.v2 v2Var;
        if (i7 == qs.A3 && this.a[0] && (v2Var = this.b[0]) != null) {
            v2Var.dismiss();
        }
    }
}
