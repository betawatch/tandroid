// default package

import android.content.DialogInterface;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class l06 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ l06(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        byte b2 = 0;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.w1 = false;
                break;
            case 1:
                String str2 = LaunchActivity.C1;
                hl.d3(new sz5(launchActivity, (byte) 10), 30000L);
                break;
            default:
                String str3 = LaunchActivity.C1;
                hl.d3(new sz5(launchActivity, b2), 30000L);
                break;
        }
    }
}
