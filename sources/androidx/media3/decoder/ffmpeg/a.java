package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import k2.i;
import k2.j;
import k2.l;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements i {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // k2.i
    public final void a(j jVar) {
        switch (this.a) {
            case 0:
                ((ExperimentalFfmpegVideoDecoder) this.b).n((VideoDecoderOutputBuffer) jVar);
                break;
            default:
                ((FfmpegAudioDecoder) this.b).n((SimpleDecoderOutputBuffer) jVar);
                break;
        }
    }
}
