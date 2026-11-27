// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class in6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ id c;

    public /* synthetic */ in6(id idVar, boolean[] zArr, byte b) {
        this.a = b;
        this.c = idVar;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        id idVar = this.c;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    idVar.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    idVar.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (idVar.isShowing()) {
                        idVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (idVar.isShowing()) {
                        idVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }

    public /* synthetic */ in6(boolean[] zArr, id idVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = idVar;
    }
}
