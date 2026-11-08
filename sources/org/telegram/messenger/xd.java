package org.telegram.messenger;

import android.media.AudioRecord;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xd(MediaController mediaController, boolean z9, int i7) {
        this.a = i7;
        this.b = mediaController;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                p5 p5Var = mediaController.M1;
                if (mediaController.f1 != null && mediaController.j1 != null) {
                    boolean z9 = mediaController.d1;
                    mediaController.d1 = !z9;
                    if (!z9) {
                        AudioRecord audioRecord = mediaController.e1;
                        if (audioRecord != null) {
                            mediaController.B1 = 4;
                            audioRecord.stop();
                            mediaController.e1.release();
                            mediaController.e1 = null;
                            p5Var.c(new xd(mediaController, this.c, 1));
                            break;
                        }
                    } else {
                        p5Var.a(mediaController.O1);
                        p5Var.c(new vd(mediaController, 6));
                        break;
                    }
                }
                break;
            default:
                MediaController.a(this.b, this.c);
                break;
        }
    }
}
