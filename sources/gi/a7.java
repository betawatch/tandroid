package gi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;
    public final /* synthetic */ ai.v2 c;

    public /* synthetic */ a7(f7 f7Var, ai.v2 v2Var, int i3) {
        this.a = i3;
        this.b = f7Var;
        this.c = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a7 a7Var;
        switch (this.a) {
            case 0:
                ai.v2 v2Var = this.c;
                f7 f7Var = this.b;
                f7Var.getClass();
                try {
                    try {
                        e7 e7Var = f7Var.d1;
                        if (e7Var == null) {
                            e7Var = new e7();
                            f7Var.d1 = e7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(f7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            e7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            e7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        f7Var.d1 = f7Var.d1;
                        a7Var = new a7(f7Var, v2Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        f7Var.d1 = f7Var.d1;
                        a7Var = new a7(f7Var, v2Var, 1);
                    }
                    org.telegram.messenger.g0.h3(a7Var);
                    return;
                } catch (Throwable th2) {
                    f7Var.d1 = f7Var.d1;
                    org.telegram.messenger.g0.h3(new a7(f7Var, v2Var, 1));
                    throw th2;
                }
            default:
                this.c.a(this.b.d1);
                return;
        }
    }
}
