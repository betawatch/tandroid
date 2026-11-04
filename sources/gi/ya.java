package gi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ya {
    public final org.telegram.ui.Components.u5 a;
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

    public ya(fb fbVar, String str, int i3) {
        this.l = fbVar;
        this.a = new org.telegram.ui.Components.u5(fbVar, 0L, 600L, xq.h);
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
        int min = Math.min(Math.round((((this.h * 1000) / Math.min(fbVar.h != null ? r8.e : !fbVar.s.isEmpty() ? fbVar.getBaseDuration() : fbVar.F ? fbVar.I : this.h * 1000, fbVar.getMaxScrollDuration())) * i3) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h <= 0 || this.g == null) {
            return;
        }
        if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || "audio/mp4a-latm".equals(str2)) {
            this.k = new FfmpegAudioWaveformLoader(str, min, new q4(this, 3));
        } else {
            Utilities.h.c(new f6(this, 9));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new f6(this, 9));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = this.c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s6 = this.e;
            short s10 = sArr[i10];
            if (s6 < s10) {
                this.e = s10;
            }
        }
        this.c += i3;
        this.l.invalidate();
    }
}
