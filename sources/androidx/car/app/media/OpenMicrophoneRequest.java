package androidx.car.app.media;

import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    public OpenMicrophoneRequest(c cVar) {
        throw null;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
