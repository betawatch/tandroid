package org.telegram.messenger;

import android.media.AudioRecord;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wd(MediaController mediaController, boolean z10, int i7) {
        this.a = i7;
        this.b = mediaController;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                p5 p5Var = mediaController.N1;
                if (mediaController.g1 != null && mediaController.k1 != null) {
                    boolean z10 = mediaController.e1;
                    mediaController.e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f1.release();
                            mediaController.f1 = null;
                            p5Var.c(new wd(mediaController, this.c, 1));
                            break;
                        }
                    } else {
                        p5Var.a(mediaController.P1);
                        p5Var.c(new ud(mediaController, 6));
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
