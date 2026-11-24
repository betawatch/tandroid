// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay8 implements ee {
    public final /* synthetic */ iy8 a;

    public /* synthetic */ ay8(iy8 iy8Var) {
        this.a = iy8Var;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        iy8 iy8Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            iy8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
