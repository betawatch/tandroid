// default package

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f4b b;
    public final /* synthetic */ zf7 c;

    public /* synthetic */ a4b(f4b f4bVar, zf7 zf7Var, byte b) {
        this.a = b;
        this.b = f4bVar;
        this.c = zf7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a4b a4bVar;
        byte b = this.a;
        zf7 zf7Var = this.c;
        f4b f4bVar = this.b;
        switch (b) {
            case 0:
                f4bVar.getClass();
                byte b2 = 1;
                try {
                    try {
                        e4b e4bVar = f4bVar.d1;
                        if (e4bVar == null) {
                            e4bVar = new e4b();
                            f4bVar.d1 = e4bVar;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(f4bVar.L.getAbsolutePath());
                        int r = MediaController.r(mediaExtractor, false);
                        mediaExtractor.selectTrack(r);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(r);
                        if (trackFormat.containsKey("color-transfer")) {
                            e4bVar.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            e4bVar.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        f4bVar.d1 = f4bVar.d1;
                        a4bVar = new a4b(f4bVar, zf7Var, b2);
                    } catch (Exception e) {
                        fa4.g(e, true);
                        f4bVar.d1 = f4bVar.d1;
                        a4bVar = new a4b(f4bVar, zf7Var, b2);
                    }
                    gl.d3(a4bVar);
                    return;
                } catch (Throwable th) {
                    f4bVar.d1 = f4bVar.d1;
                    gl.d3(new a4b(f4bVar, zf7Var, b2));
                    throw th;
                }
            default:
                zf7Var.a(f4bVar.d1);
                return;
        }
    }
}
