// default package

import android.app.Activity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dh3 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ dh3(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Activity activity = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (!jve.a()) {
                        jve.f();
                        break;
                    } else {
                        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (!jve.a()) {
                        jve.f();
                        break;
                    } else {
                        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                        break;
                    }
                }
                break;
        }
    }
}
