// default package

import android.app.Activity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ id c;

    public /* synthetic */ gb7(Activity activity, id idVar, byte b) {
        this.a = b;
        this.b = activity;
        this.c = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        id idVar = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    try {
                        idVar.dismiss();
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                break;
            default:
                try {
                    if (!activity.isFinishing()) {
                        idVar.dismiss();
                        break;
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
                break;
        }
    }
}
