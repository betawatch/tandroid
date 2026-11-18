package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
