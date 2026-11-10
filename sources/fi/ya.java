package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ya {
    public final org.telegram.ui.Components.v5 a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final /* synthetic */ fb l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public ya(fb fbVar, String str, int i7) {
        this.l = fbVar;
        this.a = new org.telegram.ui.Components.v5(fbVar, 0L, 600L, wq.h);
        int i10 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i10 < trackCount) {
                    MediaFormat trackFormat = this.f.getTrackFormat(i10);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f.selectTrack(i10);
                        this.g = trackFormat;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int min = Math.min(Math.round((((this.h * 1000) / Math.min(fbVar.h != null ? r8.e : !fbVar.s.isEmpty() ? fbVar.getBaseDuration() : fbVar.E ? fbVar.H : this.h * 1000, fbVar.getMaxScrollDuration())) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h <= 0 || this.g == null) {
            return;
        }
        if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || "audio/mp4a-latm".equals(str2)) {
            this.k = new FfmpegAudioWaveformLoader(str, min, new ai.e(this, 23));
        } else {
            Utilities.h.c(new v9(this, 4));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new v9(this, 4));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s5 = this.e;
            short s9 = sArr[i10];
            if (s5 < s9) {
                this.e = s9;
            }
        }
        this.c += i7;
        this.l.invalidate();
    }
}
