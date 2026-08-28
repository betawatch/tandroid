package kh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ bg.i c;

    public /* synthetic */ v7(a8 a8Var, bg.i iVar, int i9) {
        this.a = i9;
        this.b = a8Var;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v7 v7Var;
        switch (this.a) {
            case 0:
                bg.i iVar = this.c;
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
                        v7Var = new v7(a8Var, iVar, 1);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        a8Var.d1 = a8Var.d1;
                        v7Var = new v7(a8Var, iVar, 1);
                    }
                    AndroidUtilities.runOnUIThread(v7Var);
                    return;
                } catch (Throwable th) {
                    a8Var.d1 = a8Var.d1;
                    AndroidUtilities.runOnUIThread(new v7(a8Var, iVar, 1));
                    throw th;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
