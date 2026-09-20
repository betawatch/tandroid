package n4;

import android.media.AudioAttributes;
import j$.util.Objects;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class a {
    public final AudioAttributes a;

    public a(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Objects.equals(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
