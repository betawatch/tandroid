// default package

import android.view.View;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ zo7 c;
    public final /* synthetic */ View d;

    public /* synthetic */ mo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, zo7 zo7Var, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = zo7Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.d;
        zo7 zo7Var = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                notificationsCustomSettingsActivity.p0(zo7Var, view, false);
                break;
            case 1:
                notificationsCustomSettingsActivity.f0(zo7Var, view);
                break;
            case 2:
                notificationsCustomSettingsActivity.l0(zo7Var, view);
                break;
            case 3:
                notificationsCustomSettingsActivity.m0(zo7Var, view);
                break;
            case 4:
                notificationsCustomSettingsActivity.f0(zo7Var, view);
                break;
            default:
                notificationsCustomSettingsActivity.p0(zo7Var, view, true);
                break;
        }
    }

    public /* synthetic */ mo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, zo7 zo7Var, View view, boolean z, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = zo7Var;
        this.d = view;
    }
}
