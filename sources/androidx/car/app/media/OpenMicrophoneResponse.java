package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    public OpenMicrophoneResponse(d dVar) {
        throw null;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    public InputStream getCarMicrophoneInputStream() {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] createReliablePipe = ParcelFileDescriptor.createReliablePipe();
                createReliablePipe[1].close();
                parcelFileDescriptor = createReliablePipe[0];
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}
