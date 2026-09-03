package j3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d {
    public final AudioManager a;
    public final c b;
    public c0 c;
    public l3.d d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public d(Context context, Handler handler, c0 c0Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.a = audioManager;
        this.c = c0Var;
        this.b = new c(this, handler);
        this.e = 0;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        int i10 = h5.d0.a;
        AudioManager audioManager = this.a;
        if (i10 >= 26) {
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
    public final void b(l3.d dVar) {
        int i10;
        if (h5.d0.a(this.d, dVar)) {
            return;
        }
        this.d = dVar;
        if (dVar != null) {
            int i11 = dVar.c;
            i10 = 3;
            switch (i11) {
                case 0:
                    h5.a.K("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i10 = 1;
                    break;
                case 1:
                case 14:
                    i10 = 1;
                    break;
                case 2:
                case 4:
                    i10 = 2;
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
                    e2.c.q(i11, "Unidentified audio usage: ", "AudioFocusManager");
                    break;
                case 16:
                    if (h5.d0.a >= 19) {
                        i10 = 4;
                        break;
                    }
                    i10 = 2;
                    break;
            }
            this.f = i10;
            h5.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
        }
        i10 = 0;
        this.f = i10;
        h5.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
    }

    public final void c(int i10) {
        if (this.e == i10) {
            return;
        }
        this.e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.g == f10) {
            return;
        }
        this.g = f10;
        c0 c0Var = this.c;
        if (c0Var != null) {
            f0 f0Var = c0Var.a;
            f0Var.V(1, 2, Float.valueOf(f0Var.Y * f0Var.z.g));
        }
    }

    public final int d(int i10, boolean z4) {
        int i11;
        int requestAudioFocus;
        if (i10 == 1 || this.f != 1) {
            a();
            return z4 ? 1 : -1;
        }
        if (z4) {
            if (this.e != 1) {
                int i12 = h5.d0.a;
                AudioManager audioManager = this.a;
                c cVar = this.b;
                if (i12 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.h;
                    if (audioFocusRequest == null) {
                        AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.h);
                        l3.d dVar = this.d;
                        boolean z10 = dVar != null && dVar.a == 1;
                        dVar.getClass();
                        this.h = builder.setAudioAttributes((AudioAttributes) dVar.a().b).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(cVar).build();
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.h);
                } else {
                    l3.d dVar2 = this.d;
                    dVar2.getClass();
                    int i13 = dVar2.c;
                    if (i13 != 13) {
                        switch (i13) {
                            case 2:
                                i11 = 0;
                                break;
                            case 3:
                                i11 = 8;
                                break;
                            case 4:
                                i11 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i11 = 5;
                                break;
                            case 6:
                                i11 = 2;
                                break;
                            default:
                                i11 = 3;
                                break;
                        }
                    } else {
                        i11 = 1;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(cVar, i11, this.f);
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
