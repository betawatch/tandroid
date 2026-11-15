package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;
    public final /* synthetic */ ai.f0 c;

    public /* synthetic */ y6(d7 d7Var, ai.f0 f0Var, int i7) {
        this.a = i7;
        this.b = d7Var;
        this.c = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y6 y6Var;
        switch (this.a) {
            case 0:
                ai.f0 f0Var = this.c;
                d7 d7Var = this.b;
                d7Var.getClass();
                try {
                    try {
                        c7 c7Var = d7Var.d1;
                        if (c7Var == null) {
                            c7Var = new c7();
                            d7Var.d1 = c7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(d7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            c7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            c7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        d7Var.d1 = d7Var.d1;
                        y6Var = new y6(d7Var, f0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        d7Var.d1 = d7Var.d1;
                        y6Var = new y6(d7Var, f0Var, 1);
                    }
                    org.telegram.messenger.g0.h3(y6Var);
                    return;
                } catch (Throwable th2) {
                    d7Var.d1 = d7Var.d1;
                    org.telegram.messenger.g0.h3(new y6(d7Var, f0Var, 1));
                    throw th2;
                }
            default:
                this.c.a(this.b.d1);
                return;
        }
    }
}
