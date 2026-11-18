package org.telegram.messenger;

import android.media.AudioRecord;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vd(MediaController mediaController, boolean z10, int i7) {
        this.a = i7;
        this.b = mediaController;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = this.b;
                q5 q5Var = mediaController.N1;
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
                            q5Var.c(new vd(mediaController, this.c, 1));
                            break;
                        }
                    } else {
                        q5Var.a(mediaController.P1);
                        q5Var.c(new td(mediaController, 6));
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
