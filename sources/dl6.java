// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class dl6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hd c;

    public /* synthetic */ dl6(hd hdVar, boolean[] zArr, byte b) {
        this.a = b;
        this.c = hdVar;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        hd hdVar = this.c;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    hdVar.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    hdVar.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (hdVar.isShowing()) {
                        hdVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (hdVar.isShowing()) {
                        hdVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }

    public /* synthetic */ dl6(boolean[] zArr, hd hdVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = hdVar;
    }
}
