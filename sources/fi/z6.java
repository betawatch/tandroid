package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;
    public final /* synthetic */ ai.i c;

    public /* synthetic */ z6(e7 e7Var, ai.i iVar, int i7) {
        this.a = i7;
        this.b = e7Var;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z6 z6Var;
        switch (this.a) {
            case 0:
                ai.i iVar = this.c;
                e7 e7Var = this.b;
                e7Var.getClass();
                try {
                    try {
                        d7 d7Var = e7Var.d1;
                        if (d7Var == null) {
                            d7Var = new d7();
                            e7Var.d1 = d7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(e7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            d7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            d7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        e7Var.d1 = e7Var.d1;
                        z6Var = new z6(e7Var, iVar, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        e7Var.d1 = e7Var.d1;
                        z6Var = new z6(e7Var, iVar, 1);
                    }
                    org.telegram.messenger.g0.h3(z6Var);
                    return;
                } catch (Throwable th2) {
                    e7Var.d1 = e7Var.d1;
                    org.telegram.messenger.g0.h3(new z6(e7Var, iVar, 1));
                    throw th2;
                }
            default:
                this.c.a(this.b.d1);
                return;
        }
    }
}
