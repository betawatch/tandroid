package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class wa {
    public final org.telegram.ui.Components.c6 a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final /* synthetic */ db l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public wa(db dbVar, String str, int i7) {
        this.l = dbVar;
        this.a = new org.telegram.ui.Components.c6(dbVar, 0L, 600L, lr.h);
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
        int min = Math.min(Math.round((((this.h * 1000) / Math.min(dbVar.h != null ? r8.e : !dbVar.s.isEmpty() ? dbVar.getBaseDuration() : dbVar.F ? dbVar.I : this.h * 1000, dbVar.getMaxScrollDuration())) * i7) / Math.round(org.telegram.messenger.g0.N(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h <= 0 || this.g == null) {
            return;
        }
        if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || "audio/mp4a-latm".equals(str2)) {
            this.k = new FfmpegAudioWaveformLoader(str, min, new e7(this, 2));
        } else {
            Utilities.h.c(new k(this, 22));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.h.a(new k(this, 22));
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
