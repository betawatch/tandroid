package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ bi.o1 c;

    public /* synthetic */ f8(k8 k8Var, bi.o1 o1Var, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f8 f8Var;
        switch (this.a) {
            case 0:
                bi.o1 o1Var = this.c;
                k8 k8Var = this.b;
                k8Var.getClass();
                try {
                    try {
                        j8 j8Var = k8Var.d1;
                        if (j8Var == null) {
                            j8Var = new j8();
                            k8Var.d1 = j8Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(k8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            j8Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            j8Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        k8Var.d1 = k8Var.d1;
                        f8Var = new f8(k8Var, o1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        k8Var.d1 = k8Var.d1;
                        f8Var = new f8(k8Var, o1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(f8Var);
                    return;
                } catch (Throwable th2) {
                    k8Var.d1 = k8Var.d1;
                    AndroidUtilities.runOnUIThread(new f8(k8Var, o1Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
