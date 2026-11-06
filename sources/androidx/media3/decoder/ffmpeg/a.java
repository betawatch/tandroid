package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import k2.i;
import k2.j;
import k2.l;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
