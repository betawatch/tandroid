package ei;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ ai.r0 c;

    public /* synthetic */ v7(a8 a8Var, ai.r0 r0Var, int i10) {
        this.a = i10;
        this.b = a8Var;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v7 v7Var;
        switch (this.a) {
            case 0:
                ai.r0 r0Var = this.c;
                a8 a8Var = this.b;
                a8Var.getClass();
                try {
                    try {
                        z7 z7Var = a8Var.d1;
                        if (z7Var == null) {
                            z7Var = new z7();
                            a8Var.d1 = z7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(a8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            z7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            z7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        a8Var.d1 = a8Var.d1;
                        v7Var = new v7(a8Var, r0Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        a8Var.d1 = a8Var.d1;
                        v7Var = new v7(a8Var, r0Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(v7Var);
                    return;
                } catch (Throwable th2) {
                    a8Var.d1 = a8Var.d1;
                    AndroidUtilities.runOnUIThread(new v7(a8Var, r0Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
