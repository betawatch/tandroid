package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zb implements ls {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] b;

    public zb(boolean[] zArr, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.a = zArr;
        this.b = w2VarArr;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.w2 w2Var;
        if (i7 == qs.A3 && this.a[0] && (w2Var = this.b[0]) != null) {
            w2Var.dismiss();
        }
    }
}
