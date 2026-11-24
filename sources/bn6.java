// default package

import android.media.AudioRecord;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class bn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bn6(MediaController mediaController, boolean z, byte b) {
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
                mp3 mp3Var = mediaController.N1;
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
                            mp3Var.c(new bn6(mediaController, z, (byte) 1));
                            break;
                        }
                    } else {
                        mp3Var.a(mediaController.P1);
                        mp3Var.c(new zm6(mediaController, (byte) 6));
                        break;
                    }
                }
                break;
            default:
                String[] strArr2 = MediaController.W1;
                mediaController.L(z);
                break;
        }
    }
}
