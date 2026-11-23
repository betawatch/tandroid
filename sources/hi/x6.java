package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ ai.h0 c;

    public /* synthetic */ x6(c7 c7Var, ai.h0 h0Var, int i7) {
        this.a = i7;
        this.b = c7Var;
        this.c = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x6 x6Var;
        switch (this.a) {
            case 0:
                ai.h0 h0Var = this.c;
                c7 c7Var = this.b;
                c7Var.getClass();
                try {
                    try {
                        b7 b7Var = c7Var.d1;
                        if (b7Var == null) {
                            b7Var = new b7();
                            c7Var.d1 = b7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(c7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            b7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            b7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        c7Var.d1 = c7Var.d1;
                        x6Var = new x6(c7Var, h0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        c7Var.d1 = c7Var.d1;
                        x6Var = new x6(c7Var, h0Var, 1);
                    }
                    org.telegram.messenger.g0.g3(x6Var);
                    return;
                } catch (Throwable th2) {
                    c7Var.d1 = c7Var.d1;
                    org.telegram.messenger.g0.g3(new x6(c7Var, h0Var, 1));
                    throw th2;
                }
            default:
                this.c.a(this.b.d1);
                return;
        }
    }
}
