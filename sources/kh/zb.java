package kh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class zb {
    public final org.telegram.ui.Components.y5 a;
    public final int b;
    public final short[] d;
    public short e;
    public final MediaExtractor f;
    public final MediaFormat g;
    public final long h;
    public final FfmpegAudioWaveformLoader k;
    public final /* synthetic */ gc l;
    public int c = 0;
    public final Object i = new Object();
    public boolean j = false;

    public zb(gc gcVar, String str, int i9) {
        this.l = gcVar;
        this.a = new org.telegram.ui.Components.y5(gcVar, 0L, 600L, gr.h);
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
            FileLog.e(e10);
        }
        int min = Math.min(Math.round((((this.h * 1000) / Math.min(gcVar.h != null ? r8.e : !gcVar.s.isEmpty() ? gcVar.getBaseDuration() : gcVar.A ? gcVar.D : this.h * 1000, gcVar.getMaxScrollDuration())) * i9) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
        this.b = min;
        this.d = new short[min];
        if (this.h <= 0 || this.g == null) {
            return;
        }
        if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || MediaController.AUDIO_MIME_TYPE.equals(str2)) {
            this.k = new FfmpegAudioWaveformLoader(str, min, new b8(this, 2));
        } else {
            Utilities.phoneBookQueue.postRunnable(new f1(this, 18));
        }
    }

    public final void a() {
        FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.k;
        if (ffmpegAudioWaveformLoader != null) {
            ffmpegAudioWaveformLoader.destroy();
        }
        Utilities.phoneBookQueue.cancelRunnable(new f1(this, 18));
        synchronized (this.i) {
            this.j = true;
        }
    }

    public final void b(short[] sArr, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.c;
            int i12 = i11 + i10;
            short[] sArr2 = this.d;
            if (i12 >= sArr2.length) {
                break;
            }
            sArr2[i11 + i10] = sArr[i10];
            short s10 = this.e;
            short s11 = sArr[i10];
            if (s10 < s11) {
                this.e = s11;
            }
        }
        this.c += i9;
        this.l.invalidate();
    }
}
