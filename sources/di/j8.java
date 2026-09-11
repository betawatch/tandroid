package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;
    public final /* synthetic */ bi.o1 c;

    public /* synthetic */ j8(o8 o8Var, bi.o1 o1Var, int i10) {
        this.a = i10;
        this.b = o8Var;
        this.c = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 j8Var;
        switch (this.a) {
            case 0:
                bi.o1 o1Var = this.c;
                o8 o8Var = this.b;
                o8Var.getClass();
                try {
                    try {
                        n8 n8Var = o8Var.d1;
                        if (n8Var == null) {
                            n8Var = new n8();
                            o8Var.d1 = n8Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(o8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            n8Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            n8Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        o8Var.d1 = o8Var.d1;
                        j8Var = new j8(o8Var, o1Var, 1);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        o8Var.d1 = o8Var.d1;
                        j8Var = new j8(o8Var, o1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(j8Var);
                    return;
                } catch (Throwable th2) {
                    o8Var.d1 = o8Var.d1;
                    AndroidUtilities.runOnUIThread(new j8(o8Var, o1Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
