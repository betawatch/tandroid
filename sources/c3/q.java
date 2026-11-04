package c3;

import android.content.res.Resources;
import android.util.Base64;
import g9.x1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements f9.t {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i3) {
        this.a = i3;
    }

    @Override // f9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                throw new IllegalStateException();
            case 2:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof l9.z) {
                    return (l9.z) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new l9.d0((ScheduledExecutorService) newSingleThreadExecutor) : new l9.a0(newSingleThreadExecutor);
            case 3:
                return new k2.h(new a3.e(), 1000, 1000, 1000, 2000, 1000, true, x1.h);
            case 4:
                byte[] bArr = new byte[12];
                l2.h.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Resources system = Resources.getSystem();
                int i3 = system.getDisplayMetrics().widthPixels;
                try {
                    i3 = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i3);
        }
    }
}
