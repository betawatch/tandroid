// default package

import android.content.DialogInterface;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ ly5(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.w1 = false;
                break;
            case 1:
                String str2 = LaunchActivity.C1;
                gl.e3(new rx5(launchActivity, (byte) 7), 30000L);
                break;
            default:
                String str3 = LaunchActivity.C1;
                gl.e3(new rx5(launchActivity, (byte) 10), 30000L);
                break;
        }
    }
}
