package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oa implements fs {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] b;

    public oa(boolean[] zArr, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.a = zArr;
        this.b = x2VarArr;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.x2 x2Var;
        if (i7 == ks.C3 && this.a[0] && (x2Var = this.b[0]) != null) {
            x2Var.dismiss();
        }
    }
}
