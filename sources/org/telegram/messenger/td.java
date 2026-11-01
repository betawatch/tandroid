package org.telegram.messenger;

import android.media.AudioRecord;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ td(MediaController mediaController, boolean z10, int i10) {
        this.a = i10;
        this.b = mediaController;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                r5 r5Var = mediaController.L1;
                if (mediaController.e1 != null && mediaController.i1 != null) {
                    boolean z10 = mediaController.c1;
                    mediaController.c1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.d1;
                        if (audioRecord != null) {
                            mediaController.A1 = 4;
                            audioRecord.stop();
                            mediaController.d1.release();
                            mediaController.d1 = null;
                            r5Var.c(new td(mediaController, this.c, 1));
                            break;
                        }
                    } else {
                        r5Var.a(mediaController.N1);
                        r5Var.c(new rd(mediaController, 6));
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
