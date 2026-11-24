// default package

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class od implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ od(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                d01.t(context, w01.g);
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
