package ai;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements r1 {
    public final /* synthetic */ s0 a;

    public /* synthetic */ j0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        s0 s0Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            s0Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
