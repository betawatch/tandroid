package n4;

import android.media.AudioAttributes;
import j$.util.Objects;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
