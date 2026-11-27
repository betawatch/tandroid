// default package

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class dsb {
    public final mm a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final /* synthetic */ ksb l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public dsb(ksb ksbVar, String str, int i) {
        this.l = ksbVar;
        this.a = new mm(ksbVar, 0L, 600L, k43.h);
        int i2 = 0;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f = mediaExtractor;
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            while (true) {
                if (i2 < trackCount) {
                    MediaFormat trackFormat = this.f.getTrackFormat(i2);
                    str2 = trackFormat.getString("mime");
                    if (str2 != null && str2.startsWith("audio/")) {
                        this.f.selectTrack(i2);
                        this.g = trackFormat;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            MediaFormat mediaFormat = this.g;
            if (mediaFormat != null) {
                this.h = mediaFormat.getLong("durationUs") / 1000000;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        int min = Math.min(Math.round((((this.h * 1000) / Math.min(ksbVar.h != null ? r8.e : !ksbVar.s.isEmpty() ? ksbVar.getBaseDuration() : ksbVar.F ? ksbVar.I : this.h * 1000, ksbVar.getMaxScrollDuration())) * i) / Math.round(hl.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h <= 0 || this.g == null) {
            return;
        }
        if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || "audio/mp4a-latm".equals(str2)) {
            this.k = new FfmpegAudioWaveformLoader(str, min, new l8b(this, (byte) 5));
        } else {
            Utilities.h.c(new s8b(this, (byte) 24));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new s8b(this, (byte) 24));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.c + i2;
            short[] sArr2 = this.d;
            if (i3 >= sArr2.length) {
                break;
            }
            sArr2[i3] = sArr[i2];
            short s = this.e;
            short s2 = sArr[i2];
            if (s < s2) {
                this.e = s2;
            }
        }
        this.c += i;
        this.l.invalidate();
    }
}
