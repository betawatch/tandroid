// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o8 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ o8(u8 u8Var, byte b) {
        this.a = b;
        this.b = u8Var;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        u8 u8Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    u8Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                mh6 mh6Var = new mh6();
                mh6Var.G = (byte) 2;
                u8Var.presentFragment(mh6Var, true);
                break;
        }
    }
}
