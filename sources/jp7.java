// default package

import android.view.View;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jp7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ vp7 c;
    public final /* synthetic */ View d;

    public /* synthetic */ jp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vp7 vp7Var, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = vp7Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.d;
        vp7 vp7Var = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                notificationsCustomSettingsActivity.o0(vp7Var, view, false);
                break;
            case 1:
                notificationsCustomSettingsActivity.e0(vp7Var, view);
                break;
            case 2:
                notificationsCustomSettingsActivity.k0(vp7Var, view);
                break;
            case 3:
                notificationsCustomSettingsActivity.l0(vp7Var, view);
                break;
            case 4:
                notificationsCustomSettingsActivity.e0(vp7Var, view);
                break;
            default:
                notificationsCustomSettingsActivity.o0(vp7Var, view, true);
                break;
        }
    }

    public /* synthetic */ jp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vp7 vp7Var, View view, boolean z, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = vp7Var;
        this.d = view;
    }
}
