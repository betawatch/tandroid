// default package

import android.view.View;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jm7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ vm7 c;
    public final /* synthetic */ View d;

    public /* synthetic */ jm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vm7 vm7Var, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = vm7Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.d;
        vm7 vm7Var = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                notificationsCustomSettingsActivity.o0(vm7Var, view, false);
                break;
            case 1:
                notificationsCustomSettingsActivity.e0(vm7Var, view);
                break;
            case 2:
                notificationsCustomSettingsActivity.k0(vm7Var, view);
                break;
            case 3:
                notificationsCustomSettingsActivity.l0(vm7Var, view);
                break;
            case 4:
                notificationsCustomSettingsActivity.e0(vm7Var, view);
                break;
            default:
                notificationsCustomSettingsActivity.o0(vm7Var, view, true);
                break;
        }
    }

    public /* synthetic */ jm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vm7 vm7Var, View view, boolean z, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = vm7Var;
        this.d = view;
    }
}
