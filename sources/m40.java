// default package

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class m40 implements mfb {
    public final /* synthetic */ byte a;

    public /* synthetic */ m40(byte b) {
        this.a = b;
    }

    @Override // mfb
    public final Object get() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Build.VERSION.SDK_INT > 37 && Objects.equals(gcc.J("persist.audio.compressed_offload_implicit_aac"), "false"));
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof ah7) {
                    return (ah7) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new dh7((ScheduledExecutorService) newSingleThreadExecutor) : new ah7(newSingleThreadExecutor);
            case 2:
                byte[] bArr = new byte[12];
                nc3.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new ec3(new cf0(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, true, o99.h);
            case 4:
                String J = gcc.J("ro.vendor.api_level");
                if (J == null) {
                    J = "";
                }
                return ype.f(J);
            case 5:
                Resources system = Resources.getSystem();
                int i = system.getDisplayMetrics().widthPixels;
                try {
                    i = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i);
            case 6:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    vr9.l(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
