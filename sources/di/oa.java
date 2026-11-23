package di;

import org.telegram.messenger.gs;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class oa implements gs {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] b;

    public oa(boolean[] zArr, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.a = zArr;
        this.b = w2VarArr;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.w2 w2Var;
        if (i7 == ls.C3 && this.a[0] && (w2Var = this.b[0]) != null) {
            w2Var.dismiss();
        }
    }
}
