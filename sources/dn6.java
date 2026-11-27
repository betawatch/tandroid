// default package

import android.media.AudioRecord;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class dn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dn6(MediaController mediaController, boolean z, byte b) {
        this.a = b;
        this.b = mediaController;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        MediaController mediaController = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                to3 to3Var = mediaController.N1;
                if (mediaController.g1 != null && mediaController.k1 != null) {
                    boolean z2 = mediaController.e1;
                    mediaController.e1 = !z2;
                    if (!z2) {
                        AudioRecord audioRecord = mediaController.f1;
                        if (audioRecord != null) {
                            mediaController.C1 = (byte) 4;
                            audioRecord.stop();
                            mediaController.f1.release();
                            mediaController.f1 = null;
                            to3Var.c(new dn6(mediaController, z, (byte) 1));
                            break;
                        }
                    } else {
                        to3Var.a(mediaController.P1);
                        to3Var.c(new cn6(mediaController, (byte) 5));
                        break;
                    }
                }
                break;
            default:
                String[] strArr2 = MediaController.W1;
                mediaController.P(z);
                break;
        }
    }
}
