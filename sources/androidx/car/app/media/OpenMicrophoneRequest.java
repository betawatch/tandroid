package androidx.car.app.media;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    public OpenMicrophoneRequest(rt7 rt7Var) {
        throw null;
    }
}
