// default package

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bi6 {
    public final HashSet a = new HashSet();
    public LoudnessCodecController b;

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            jte.p(this.a.add(mediaCodec));
        }
    }

    public final void b() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.b = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, fp3.a, new ai6());
        this.b = create;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
