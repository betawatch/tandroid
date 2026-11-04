package ci;

import org.telegram.messenger.cs;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class va implements cs {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] b;

    public va(boolean[] zArr, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.a = zArr;
        this.b = t2VarArr;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.t2 t2Var;
        if (i3 == hs.A3 && this.a[0] && (t2Var = this.b[0]) != null) {
            t2Var.dismiss();
        }
    }
}
