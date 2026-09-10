package bi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;
    public final /* synthetic */ ai.b c;

    public /* synthetic */ m9(r9 r9Var, ai.b bVar, int i10) {
        this.a = i10;
        this.b = r9Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m9 m9Var;
        switch (this.a) {
            case 0:
                ai.b bVar = this.c;
                r9 r9Var = this.b;
                r9Var.getClass();
                try {
                    try {
                        q9 q9Var = r9Var.d1;
                        if (q9Var == null) {
                            q9Var = new q9();
                            r9Var.d1 = q9Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(r9Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            q9Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            q9Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        r9Var.d1 = r9Var.d1;
                        m9Var = new m9(r9Var, bVar, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        r9Var.d1 = r9Var.d1;
                        m9Var = new m9(r9Var, bVar, 1);
                    }
                    AndroidUtilities.runOnUIThread(m9Var);
                    return;
                } catch (Throwable th2) {
                    r9Var.d1 = r9Var.d1;
                    AndroidUtilities.runOnUIThread(new m9(r9Var, bVar, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
