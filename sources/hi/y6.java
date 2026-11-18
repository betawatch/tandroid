package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;
    public final /* synthetic */ ai.g0 c;

    public /* synthetic */ y6(d7 d7Var, ai.g0 g0Var, int i7) {
        this.a = i7;
        this.b = d7Var;
        this.c = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y6 y6Var;
        switch (this.a) {
            case 0:
                ai.g0 g0Var = this.c;
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
                        y6Var = new y6(d7Var, g0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        d7Var.d1 = d7Var.d1;
                        y6Var = new y6(d7Var, g0Var, 1);
                    }
                    org.telegram.messenger.g0.g3(y6Var);
                    return;
                } catch (Throwable th2) {
                    d7Var.d1 = d7Var.d1;
                    org.telegram.messenger.g0.g3(new y6(d7Var, g0Var, 1));
                    throw th2;
                }
            default:
                this.c.a(this.b.d1);
                return;
        }
    }
}
