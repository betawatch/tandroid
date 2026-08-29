package nh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;
    public final /* synthetic */ b0 c;

    public /* synthetic */ j7(o7 o7Var, b0 b0Var, int i10) {
        this.a = i10;
        this.b = o7Var;
        this.c = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j7 j7Var;
        switch (this.a) {
            case 0:
                b0 b0Var = this.c;
                o7 o7Var = this.b;
                o7Var.getClass();
                try {
                    try {
                        n7 n7Var = o7Var.d1;
                        if (n7Var == null) {
                            n7Var = new n7();
                            o7Var.d1 = n7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(o7Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            n7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            n7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        o7Var.d1 = o7Var.d1;
                        j7Var = new j7(o7Var, b0Var, 1);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        o7Var.d1 = o7Var.d1;
                        j7Var = new j7(o7Var, b0Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(j7Var);
                    return;
                } catch (Throwable th2) {
                    o7Var.d1 = o7Var.d1;
                    AndroidUtilities.runOnUIThread(new j7(o7Var, b0Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
