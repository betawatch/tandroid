package ei;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ q0(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                Activity activity = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Activity activity2 = this.b;
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                activity2.startActivity(intent2);
                break;
        }
    }
}
