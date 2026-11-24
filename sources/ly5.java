// default package

import android.content.DialogInterface;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.d3(new rx5(launchActivity, (byte) 7), 30000L);
                break;
            default:
                String str3 = LaunchActivity.C1;
                gl.d3(new rx5(launchActivity, (byte) 10), 30000L);
                break;
        }
    }
}
