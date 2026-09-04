package a3;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements d9.j {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i10) {
        this.a = i10;
    }

    @Override // d9.j
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
            case 1:
                throw new IllegalStateException();
            case 2:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof i9.x) {
                    return (i9.x) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new i9.b0((ScheduledExecutorService) newSingleThreadExecutor) : new i9.y(newSingleThreadExecutor);
            case 3:
                return new i2.l(new y2.d(), MediaDataController.MAX_STYLE_RUNS_COUNT, 2000);
            default:
                byte[] bArr = new byte[12];
                j2.h.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
