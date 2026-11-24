package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                dq9.o(e);
                return null;
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    public OpenMicrophoneResponse(ps7 ps7Var) {
        throw null;
    }
}
