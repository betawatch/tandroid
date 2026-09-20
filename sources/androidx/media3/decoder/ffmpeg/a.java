package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import h2.i;
import h2.j;
import h2.l;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements i {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // h2.i
    public final void g(j jVar) {
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
