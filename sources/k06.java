// default package

import android.content.DialogInterface;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k06 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ k06(LaunchActivity launchActivity, byte b) {
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
                gm.d3(new rz5(launchActivity, (byte) 7), 30000L);
                break;
            default:
                String str3 = LaunchActivity.C1;
                gm.d3(new rz5(launchActivity, (byte) 10), 30000L);
                break;
        }
    }
}
