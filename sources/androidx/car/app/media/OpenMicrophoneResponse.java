package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
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
            } catch (IOException e) {
                ho9.n(e);
                return null;
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    public OpenMicrophoneResponse(mq7 mq7Var) {
        throw null;
    }
}
