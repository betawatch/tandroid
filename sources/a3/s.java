package a3;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements d9.i {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i10) {
        this.a = i10;
    }

    @Override // d9.i
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
                return new i2.k(new y2.d(), MediaDataController.MAX_STYLE_RUNS_COUNT, 2000);
            default:
                byte[] bArr = new byte[12];
                j2.h.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
