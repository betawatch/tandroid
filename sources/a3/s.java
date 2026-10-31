package a3;

import android.content.res.Resources;
import android.util.Base64;
import e9.c2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements d9.t {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i10) {
        this.a = i10;
    }

    @Override // d9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                throw new IllegalStateException();
            case 2:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof j9.z) {
                    return (j9.z) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new j9.d0((ScheduledExecutorService) newSingleThreadExecutor) : new j9.a0(newSingleThreadExecutor);
            case 3:
                return new i2.h(new y2.d(), 1000, 1000, 1000, 2000, 1000, true, c2.h);
            case 4:
                byte[] bArr = new byte[12];
                j2.i.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Resources system = Resources.getSystem();
                int i10 = system.getDisplayMetrics().widthPixels;
                try {
                    i10 = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i10);
        }
    }
}
