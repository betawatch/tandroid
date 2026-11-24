// default package

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ oe(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                l11.u(context, e21.g);
                break;
            case 2:
                try {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
