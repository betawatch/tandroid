package lh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ n6 c;

    public /* synthetic */ u7(z7 z7Var, n6 n6Var, int i10) {
        this.a = i10;
        this.b = z7Var;
        this.c = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u7 u7Var;
        switch (this.a) {
            case 0:
                n6 n6Var = this.c;
                z7 z7Var = this.b;
                z7Var.getClass();
                try {
                    try {
                        y7 y7Var = z7Var.d1;
                        if (y7Var == null) {
                            y7Var = new y7();
                            z7Var.d1 = y7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(z7Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            y7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            y7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        z7Var.d1 = z7Var.d1;
                        u7Var = new u7(z7Var, n6Var, 1);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        z7Var.d1 = z7Var.d1;
                        u7Var = new u7(z7Var, n6Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(u7Var);
                    return;
                } catch (Throwable th) {
                    z7Var.d1 = z7Var.d1;
                    AndroidUtilities.runOnUIThread(new u7(z7Var, n6Var, 1));
                    throw th;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
