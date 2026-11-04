package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import j2.i;
import j2.j;
import j2.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements i {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i3) {
        this.a = i3;
        this.b = lVar;
    }

    @Override // j2.i
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
