package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ ai.i c;

    public /* synthetic */ r7(w7 w7Var, ai.i iVar, int i10) {
        this.a = i10;
        this.b = w7Var;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r7 r7Var;
        switch (this.a) {
            case 0:
                ai.i iVar = this.c;
                w7 w7Var = this.b;
                w7Var.getClass();
                try {
                    try {
                        v7 v7Var = w7Var.d1;
                        if (v7Var == null) {
                            v7Var = new v7();
                            w7Var.d1 = v7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(w7Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            v7Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            v7Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        w7Var.d1 = w7Var.d1;
                        r7Var = new r7(w7Var, iVar, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        w7Var.d1 = w7Var.d1;
                        r7Var = new r7(w7Var, iVar, 1);
                    }
                    AndroidUtilities.runOnUIThread(r7Var);
                    return;
                } catch (Throwable th2) {
                    w7Var.d1 = w7Var.d1;
                    AndroidUtilities.runOnUIThread(new r7(w7Var, iVar, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
