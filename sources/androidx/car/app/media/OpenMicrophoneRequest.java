package androidx.car.app.media;

import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
