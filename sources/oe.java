// default package

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ oe(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent2);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent3);
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 3:
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent4);
                    break;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            default:
                Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent5.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent5);
                break;
        }
    }
}
