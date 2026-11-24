// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ he c;

    public /* synthetic */ gn6(he heVar, boolean[] zArr, byte b) {
        this.a = b;
        this.c = heVar;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        he heVar = this.c;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    heVar.show();
                    break;
                }
                break;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    heVar.show();
                    break;
                }
                break;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (heVar.isShowing()) {
                        heVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (heVar.isShowing()) {
                        heVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }

    public /* synthetic */ gn6(boolean[] zArr, he heVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = heVar;
    }
}
