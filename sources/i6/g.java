package i6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import f6.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.b8;
import q6.m;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g extends s {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i7) {
        super(0);
        this.g = i7;
        this.h = obj;
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j3) {
        int i7 = this.g;
        Object obj = this.h;
        switch (i7) {
            case 0:
                h.v.b("onSeekTo %d", Long.valueOf(j3));
                h6.h hVar = ((h) obj).n;
                if (hVar != null) {
                    hVar.q(new p(j3));
                    break;
                }
                break;
            default:
                ij ijVar = MediaController.B().u0;
                if (ijVar != null) {
                    MediaController.B().i0(ijVar, (j3 / 1000) / ((float) ijVar.L0()));
                    boolean z9 = MusicPlayerService.w;
                    ((MusicPlayerService) obj).f(j3);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public void M(int i7) {
        switch (this.g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                iz.E(i7 != 1 ? (i7 == 2 || i7 == 3) ? 1 : 0 : 2);
                boolean z9 = MusicPlayerService.w;
                musicPlayerService.g();
                ij ijVar = MediaController.B().u0;
                if (ijVar != null) {
                    musicPlayerService.a(ijVar, false);
                    break;
                }
                break;
            default:
                super.M(i7);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public void P(int i7) {
        switch (this.g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i7 == 1 || i7 == 2) {
                    if (!iz.N0) {
                        MediaController.B().l0(2);
                    }
                } else if (iz.N0) {
                    MediaController.B().l0(0);
                }
                boolean z9 = MusicPlayerService.w;
                a0 a0Var = musicPlayerService.c;
                if (a0Var != null) {
                    a0Var.x(iz.N0 ? 1 : 0);
                }
                ij ijVar = MediaController.B().u0;
                if (ijVar != null) {
                    musicPlayerService.a(ijVar, false);
                    break;
                }
                break;
            default:
                super.P(i7);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        switch (this.g) {
            case 0:
                h.v.b("onSkipToNext", new Object[0]);
                h6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        h6.h.t();
                        break;
                    } else {
                        h6.h.x(new h6.i(hVar, 2));
                        break;
                    }
                }
                break;
            default:
                ij ijVar = MediaController.B().u0;
                if (ijVar != null && ijVar.J3()) {
                    MediaController.B().U(false);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        switch (this.g) {
            case 0:
                h.v.b("onSkipToPrevious", new Object[0]);
                h6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        h6.h.t();
                        break;
                    } else {
                        h6.h.x(new h6.i(hVar, 1));
                        break;
                    }
                }
                break;
            default:
                ij ijVar = MediaController.B().u0;
                if (ijVar != null && ijVar.J3()) {
                    MediaController.B().V();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.s
    public final void f(String str) {
        int i7 = this.g;
        Object obj = this.h;
        switch (i7) {
            case 0:
                h hVar = (h) obj;
                h.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j3 = -hVar.e.c;
                            h6.h hVar2 = hVar.n;
                            if (hVar2 != null) {
                                long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j3));
                                h6.h hVar3 = hVar.n;
                                if (hVar3 != null) {
                                    hVar3.q(new p(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            g6.g gVar = hVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            g6.g gVar2 = hVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j10 = hVar.e.c;
                            h6.h hVar4 = hVar.n;
                            if (hVar4 != null) {
                                long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j10));
                                h6.h hVar5 = hVar.n;
                                if (hVar5 != null) {
                                    hVar5.q(new p(min2));
                                    break;
                                }
                            }
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(hVar.g);
                hVar.a.sendBroadcast(intent);
                break;
            default:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    iz.E((iz.S0 + 1) % 3);
                    boolean z9 = MusicPlayerService.w;
                    musicPlayerService.g();
                    b8 b8Var = b8.P2;
                    if (b8Var != null) {
                        b8Var.c1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (iz.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    boolean z10 = MusicPlayerService.w;
                    a0 a0Var = musicPlayerService.c;
                    if (a0Var != null) {
                        a0Var.x(iz.N0 ? 1 : 0);
                    }
                    b8 b8Var2 = b8.P2;
                    if (b8Var2 != null) {
                        b8Var2.c1();
                    }
                }
                ij ijVar = MediaController.B().u0;
                if (ijVar != null) {
                    boolean z11 = MusicPlayerService.w;
                    musicPlayerService.a(ijVar, false);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public boolean i(Intent intent) {
        h6.h hVar;
        switch (this.g) {
            case 0:
                h.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    return true;
                }
                if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (hVar = ((h) this.h).n) == null) {
                    return true;
                }
                hVar.r();
                return true;
            default:
                return super.i(intent);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        switch (this.g) {
            case 0:
                h.v.b("onPause", new Object[0]);
                h6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    hVar.r();
                    break;
                }
                break;
            default:
                MediaController.B().R(MediaController.B().u0, true);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        switch (this.g) {
            case 0:
                h.v.b("onPlay", new Object[0]);
                h6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    hVar.r();
                    break;
                }
                break;
            default:
                MediaController.B().S(MediaController.B().u0);
                break;
        }
    }
}
