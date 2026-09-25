package ci;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ ai.y1 c;

    public /* synthetic */ g8(l8 l8Var, ai.y1 y1Var, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g8 g8Var;
        switch (this.a) {
            case 0:
                ai.y1 y1Var = this.c;
                l8 l8Var = this.b;
                l8Var.getClass();
                try {
                    try {
                        k8 k8Var = l8Var.d1;
                        if (k8Var == null) {
                            k8Var = new k8();
                            l8Var.d1 = k8Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(l8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            k8Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            k8Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        l8Var.d1 = l8Var.d1;
                        g8Var = new g8(l8Var, y1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        l8Var.d1 = l8Var.d1;
                        g8Var = new g8(l8Var, y1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(g8Var);
                    return;
                } catch (Throwable th2) {
                    l8Var.d1 = l8Var.d1;
                    AndroidUtilities.runOnUIThread(new g8(l8Var, y1Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
