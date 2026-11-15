package ci;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements q1 {
    public final /* synthetic */ i0 a;

    public /* synthetic */ b0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        i0 i0Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            i0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
