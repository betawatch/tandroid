package androidx.car.app.media;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    OpenMicrophoneRequest(Builder builder) {
        this.mCarAudioCallbackDelegate = builder.mCarAudioCallbackDelegate;
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    public static final class Builder {
        final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

        public Builder(CarAudioCallback carAudioCallback) {
            Objects.requireNonNull(carAudioCallback);
            this.mCarAudioCallbackDelegate = CarAudioCallbackDelegate.create(carAudioCallback);
        }

        public OpenMicrophoneRequest build() {
            return new OpenMicrophoneRequest(this);
        }
    }
}
