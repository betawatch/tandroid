package h3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final AudioManager a;
    public final c b;
    public h0 c;
    public j3.e d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public d(Context context, Handler handler, h0 h0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.a = audioManager;
        this.c = h0Var;
        this.b = new c(this, handler);
        this.e = 0;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        int i9 = d5.f0.a;
        AudioManager audioManager = this.a;
        if (i9 >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.b);
        }
        c(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r7.a == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j3.e eVar) {
        int i9;
        if (d5.f0.a(this.d, eVar)) {
            return;
        }
        this.d = eVar;
        if (eVar != null) {
            int i10 = eVar.c;
            i9 = 3;
            switch (i10) {
                case 0:
                    d5.a.K("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i9 = 1;
                    break;
                case 1:
                case 14:
                    i9 = 1;
                    break;
                case 2:
                case 4:
                    i9 = 2;
                    break;
                case 3:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    break;
                case 11:
                    break;
                case 15:
                default:
                    e2.c.t(i10, "Unidentified audio usage: ", "AudioFocusManager");
                    break;
                case 16:
                    if (d5.f0.a >= 19) {
                        i9 = 4;
                        break;
                    }
                    i9 = 2;
                    break;
            }
            this.f = i9;
            d5.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i9 != 1 || i9 == 0);
        }
        i9 = 0;
        this.f = i9;
        d5.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i9 != 1 || i9 == 0);
    }

    public final void c(int i9) {
        if (this.e == i9) {
            return;
        }
        this.e = i9;
        float f10 = i9 == 3 ? 0.2f : 1.0f;
        if (this.g == f10) {
            return;
        }
        this.g = f10;
        h0 h0Var = this.c;
        if (h0Var != null) {
            k0 k0Var = h0Var.a;
            k0Var.c0(1, 2, Float.valueOf(k0Var.a0 * k0Var.A.g));
        }
    }

    public final int d(int i9, boolean z10) {
        int requestAudioFocus;
        if (i9 == 1 || this.f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.e != 1) {
                int i10 = d5.f0.a;
                AudioManager audioManager = this.a;
                c cVar = this.b;
                if (i10 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.h;
                    if (audioFocusRequest == null) {
                        AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.h);
                        j3.e eVar = this.d;
                        boolean z11 = eVar != null && eVar.a == 1;
                        eVar.getClass();
                        this.h = builder.setAudioAttributes((AudioAttributes) eVar.a().b).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(cVar).build();
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.h);
                } else {
                    j3.e eVar2 = this.d;
                    eVar2.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(cVar, d5.f0.y(eVar2.c), this.f);
                }
                if (requestAudioFocus == 1) {
                    c(1);
                    return 1;
                }
                c(0);
                return -1;
            }
        }
    }
}
