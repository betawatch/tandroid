package h6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import e6.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.az;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.z7;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends s {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i3) {
        super(0);
        this.g = i3;
        this.h = obj;
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        int i3 = this.g;
        Object obj = this.h;
        switch (i3) {
            case 0:
                h.v.b("onSeekTo %d", Long.valueOf(j10));
                g6.h hVar = ((h) obj).n;
                if (hVar != null) {
                    hVar.q(new p(j10));
                    break;
                }
                break;
            default:
                zi ziVar = MediaController.B().v0;
                if (ziVar != null) {
                    MediaController.B().i0(ziVar, (j10 / 1000) / ((float) ziVar.L0()));
                    boolean z10 = MusicPlayerService.w;
                    ((MusicPlayerService) obj).f(j10);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public void M(int i3) {
        switch (this.g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                az.E(i3 != 1 ? (i3 == 2 || i3 == 3) ? 1 : 0 : 2);
                boolean z10 = MusicPlayerService.w;
                musicPlayerService.g();
                zi ziVar = MediaController.B().v0;
                if (ziVar != null) {
                    musicPlayerService.a(ziVar, false);
                    break;
                }
                break;
            default:
                super.M(i3);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public void P(int i3) {
        switch (this.g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i3 == 1 || i3 == 2) {
                    if (!az.N0) {
                        MediaController.B().l0(2);
                    }
                } else if (az.N0) {
                    MediaController.B().l0(0);
                }
                boolean z10 = MusicPlayerService.w;
                a0 a0Var = musicPlayerService.c;
                if (a0Var != null) {
                    a0Var.w(az.N0 ? 1 : 0);
                }
                zi ziVar = MediaController.B().v0;
                if (ziVar != null) {
                    musicPlayerService.a(ziVar, false);
                    break;
                }
                break;
            default:
                super.P(i3);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        switch (this.g) {
            case 0:
                h.v.b("onSkipToNext", new Object[0]);
                g6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        g6.h.t();
                        break;
                    } else {
                        g6.h.x(new g6.i(hVar, 2));
                        break;
                    }
                }
                break;
            default:
                zi ziVar = MediaController.B().v0;
                if (ziVar != null && ziVar.J3()) {
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
                g6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        g6.h.t();
                        break;
                    } else {
                        g6.h.x(new g6.i(hVar, 1));
                        break;
                    }
                }
                break;
            default:
                zi ziVar = MediaController.B().v0;
                if (ziVar != null && ziVar.J3()) {
                    MediaController.B().V();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.s
    public final void f(String str) {
        int i3 = this.g;
        Object obj = this.h;
        switch (i3) {
            case 0:
                h hVar = (h) obj;
                h.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j10 = -hVar.e.c;
                            g6.h hVar2 = hVar.n;
                            if (hVar2 != null) {
                                long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                                g6.h hVar3 = hVar.n;
                                if (hVar3 != null) {
                                    hVar3.q(new p(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            f6.g gVar = hVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            f6.g gVar2 = hVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j11 = hVar.e.c;
                            g6.h hVar4 = hVar.n;
                            if (hVar4 != null) {
                                long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j11));
                                g6.h hVar5 = hVar.n;
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
                    az.E((az.S0 + 1) % 3);
                    boolean z10 = MusicPlayerService.w;
                    musicPlayerService.g();
                    z7 z7Var = z7.Q2;
                    if (z7Var != null) {
                        z7Var.c1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (az.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    boolean z11 = MusicPlayerService.w;
                    a0 a0Var = musicPlayerService.c;
                    if (a0Var != null) {
                        a0Var.w(az.N0 ? 1 : 0);
                    }
                    z7 z7Var2 = z7.Q2;
                    if (z7Var2 != null) {
                        z7Var2.c1();
                    }
                }
                zi ziVar = MediaController.B().v0;
                if (ziVar != null) {
                    boolean z12 = MusicPlayerService.w;
                    musicPlayerService.a(ziVar, false);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public boolean i(Intent intent) {
        g6.h hVar;
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
                g6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    hVar.r();
                    break;
                }
                break;
            default:
                MediaController.B().R(MediaController.B().v0, true);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        switch (this.g) {
            case 0:
                h.v.b("onPlay", new Object[0]);
                g6.h hVar = ((h) this.h).n;
                if (hVar != null) {
                    hVar.r();
                    break;
                }
                break;
            default:
                MediaController.B().S(MediaController.B().v0);
                break;
        }
    }
}
