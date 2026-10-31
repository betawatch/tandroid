package f6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import c6.p;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import n6.l;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends s {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i10) {
        super(0);
        this.g = i10;
        this.h = obj;
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        int i10 = this.g;
        Object obj = this.h;
        switch (i10) {
            case 0:
                i.v.b("onSeekTo %d", Long.valueOf(j10));
                e6.h hVar = ((i) obj).n;
                if (hVar != null) {
                    hVar.q(new p(j10));
                    break;
                }
                break;
            default:
                jj jjVar = MediaController.B().u0;
                if (jjVar != null) {
                    MediaController.B().i0(jjVar, (j10 / 1000) / ((float) jjVar.L0()));
                    boolean z10 = MusicPlayerService.w;
                    ((MusicPlayerService) obj).f(j10);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public void M(int i10) {
        switch (this.g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                tz.E(i10 != 1 ? (i10 == 2 || i10 == 3) ? 1 : 0 : 2);
                boolean z10 = MusicPlayerService.w;
                musicPlayerService.g();
                jj jjVar = MediaController.B().u0;
                if (jjVar != null) {
                    musicPlayerService.a(jjVar, false);
                    break;
                }
                break;
            default:
                super.M(i10);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public void P(int i10) {
        switch (this.g) {
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i10 == 1 || i10 == 2) {
                    if (!tz.N0) {
                        MediaController.B().l0(2);
                    }
                } else if (tz.N0) {
                    MediaController.B().l0(0);
                }
                boolean z10 = MusicPlayerService.w;
                a0 a0Var = musicPlayerService.c;
                if (a0Var != null) {
                    a0Var.F(tz.N0 ? 1 : 0);
                }
                jj jjVar = MediaController.B().u0;
                if (jjVar != null) {
                    musicPlayerService.a(jjVar, false);
                    break;
                }
                break;
            default:
                super.P(i10);
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        switch (this.g) {
            case 0:
                i.v.b("onSkipToNext", new Object[0]);
                e6.h hVar = ((i) this.h).n;
                if (hVar != null) {
                    l.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        e6.h.t();
                        break;
                    } else {
                        e6.h.x(new e6.i(hVar, 2));
                        break;
                    }
                }
                break;
            default:
                jj jjVar = MediaController.B().u0;
                if (jjVar != null && jjVar.I3()) {
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
                i.v.b("onSkipToPrevious", new Object[0]);
                e6.h hVar = ((i) this.h).n;
                if (hVar != null) {
                    l.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        e6.h.t();
                        break;
                    } else {
                        e6.h.x(new e6.i(hVar, 1));
                        break;
                    }
                }
                break;
            default:
                jj jjVar = MediaController.B().u0;
                if (jjVar != null && jjVar.I3()) {
                    MediaController.B().V();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.s
    public final void f(String str) {
        int i10 = this.g;
        Object obj = this.h;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                i.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j10 = -iVar.e.c;
                            e6.h hVar = iVar.n;
                            if (hVar != null) {
                                long min = Math.min(hVar.g(), Math.max(0L, hVar.a() + j10));
                                e6.h hVar2 = iVar.n;
                                if (hVar2 != null) {
                                    hVar2.q(new p(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            d6.g gVar = iVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            d6.g gVar2 = iVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j11 = iVar.e.c;
                            e6.h hVar3 = iVar.n;
                            if (hVar3 != null) {
                                long min2 = Math.min(hVar3.g(), Math.max(0L, hVar3.a() + j11));
                                e6.h hVar4 = iVar.n;
                                if (hVar4 != null) {
                                    hVar4.q(new p(min2));
                                    break;
                                }
                            }
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(iVar.g);
                iVar.a.sendBroadcast(intent);
                break;
            default:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    tz.E((tz.S0 + 1) % 3);
                    boolean z10 = MusicPlayerService.w;
                    musicPlayerService.g();
                    w7 w7Var = w7.P2;
                    if (w7Var != null) {
                        w7Var.c1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (tz.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    boolean z11 = MusicPlayerService.w;
                    a0 a0Var = musicPlayerService.c;
                    if (a0Var != null) {
                        a0Var.F(tz.N0 ? 1 : 0);
                    }
                    w7 w7Var2 = w7.P2;
                    if (w7Var2 != null) {
                        w7Var2.c1();
                    }
                }
                jj jjVar = MediaController.B().u0;
                if (jjVar != null) {
                    boolean z12 = MusicPlayerService.w;
                    musicPlayerService.a(jjVar, false);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.s
    public boolean i(Intent intent) {
        e6.h hVar;
        switch (this.g) {
            case 0:
                i.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    return true;
                }
                if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (hVar = ((i) this.h).n) == null) {
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
                i.v.b("onPause", new Object[0]);
                e6.h hVar = ((i) this.h).n;
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
                i.v.b("onPlay", new Object[0]);
                e6.h hVar = ((i) this.h).n;
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
