package n4;

import android.media.AudioAttributes;
import j$.util.Objects;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
