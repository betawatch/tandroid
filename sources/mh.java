// default package

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mh implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ mh(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
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
                    fa4.g(e, true);
                    return;
                }
            case 1:
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent2);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent3);
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 3:
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + a.b.getPackageName()));
                    activity.startActivity(intent4);
                    break;
                } catch (Exception e4) {
                    fa4.g(e4, true);
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
