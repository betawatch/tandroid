package d3;

import android.content.res.Resources;
import android.util.Base64;
import h9.x1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements g9.t {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i7) {
        this.a = i7;
    }

    @Override // g9.t
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
                if (newSingleThreadExecutor instanceof m9.z) {
                    return (m9.z) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new m9.d0((ScheduledExecutorService) newSingleThreadExecutor) : new m9.a0(newSingleThreadExecutor);
            case 3:
                return new l2.i(new b3.e(), 1000, 1000, 1000, 2000, 1000, true, x1.h);
            case 4:
                byte[] bArr = new byte[12];
                m2.f.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Resources system = Resources.getSystem();
                int i7 = system.getDisplayMetrics().widthPixels;
                try {
                    i7 = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i7);
        }
    }
}
