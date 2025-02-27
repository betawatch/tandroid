package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes mAudioAttributes;
    public int mLegacyStreamType;

    static class Builder implements AudioAttributesImpl.Builder {
        final AudioAttributes.Builder mFwkBuilder = new AudioAttributes.Builder();

        Builder() {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public AudioAttributesImpl build() {
            AudioAttributes build;
            build = this.mFwkBuilder.build();
            return new AudioAttributesImplApi21(build);
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public Builder setLegacyStreamType(int i) {
            this.mFwkBuilder.setLegacyStreamType(i);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.mLegacyStreamType = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.mAudioAttributes = audioAttributes;
        this.mLegacyStreamType = i;
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        equals = this.mAudioAttributes.equals(((AudioAttributesImplApi21) obj).mAudioAttributes);
        return equals;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.mAudioAttributes.hashCode();
        return hashCode;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.mAudioAttributes;
    }
}
