// default package

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g6b b;
    public final /* synthetic */ ci7 c;

    public /* synthetic */ b6b(g6b g6bVar, ci7 ci7Var, byte b) {
        this.a = b;
        this.b = g6bVar;
        this.c = ci7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6b b6bVar;
        byte b = this.a;
        ci7 ci7Var = this.c;
        g6b g6bVar = this.b;
        switch (b) {
            case 0:
                g6bVar.getClass();
                byte b2 = 1;
                try {
                    try {
                        f6b f6bVar = g6bVar.d1;
                        if (f6bVar == null) {
                            f6bVar = new f6b();
                            g6bVar.d1 = f6bVar;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(g6bVar.L.getAbsolutePath());
                        int r = MediaController.r(mediaExtractor, false);
                        mediaExtractor.selectTrack(r);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(r);
                        if (trackFormat.containsKey("color-transfer")) {
                            f6bVar.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            f6bVar.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        g6bVar.d1 = g6bVar.d1;
                        b6bVar = new b6b(g6bVar, ci7Var, b2);
                    } catch (Exception e) {
                        fc4.g(e, true);
                        g6bVar.d1 = g6bVar.d1;
                        b6bVar = new b6b(g6bVar, ci7Var, b2);
                    }
                    gm.c3(b6bVar);
                    return;
                } catch (Throwable th) {
                    g6bVar.d1 = g6bVar.d1;
                    gm.c3(new b6b(g6bVar, ci7Var, b2));
                    throw th;
                }
            default:
                ci7Var.a(g6bVar.d1);
                return;
        }
    }
}
