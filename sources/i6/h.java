package i6;

import android.content.Intent;
import android.support.v4.media.session.a0;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import f6.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.e8;
import q6.m;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h extends s {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i7) {
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
                i.v.b("onSeekTo %d", Long.valueOf(j3));
                h6.h hVar = ((i) obj).n;
                if (hVar != null) {
                    hVar.q(new p(j3));
                    break;
                }
                break;
            default:
                fj fjVar = MediaController.B().v0;
                if (fjVar != null) {
                    MediaController.B().i0(fjVar, (j3 / 1000) / ((float) fjVar.L0()));
                    boolean z10 = MusicPlayerService.s;
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
                bz.E(i7 != 1 ? (i7 == 2 || i7 == 3) ? 1 : 0 : 2);
                MusicPlayerService.g();
                fj fjVar = MediaController.B().v0;
                if (fjVar != null) {
                    musicPlayerService.a(fjVar, false);
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
                    if (!bz.N0) {
                        MediaController.B().l0(2);
                    }
                } else if (bz.N0) {
                    MediaController.B().l0(0);
                }
                a0 a0Var = MusicPlayerService.w;
                if (a0Var != null) {
                    a0Var.x(bz.N0 ? 1 : 0);
                }
                fj fjVar = MediaController.B().v0;
                if (fjVar != null) {
                    musicPlayerService.a(fjVar, false);
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
                i.v.b("onSkipToNext", new Object[0]);
                h6.h hVar = ((i) this.h).n;
                if (hVar != null) {
                    m.e("Must be called from the main thread.");
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
                fj fjVar = MediaController.B().v0;
                if (fjVar != null && fjVar.I3()) {
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
                h6.h hVar = ((i) this.h).n;
                if (hVar != null) {
                    m.e("Must be called from the main thread.");
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
                fj fjVar = MediaController.B().v0;
                if (fjVar != null && fjVar.I3()) {
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
                i iVar = (i) obj;
                i.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j3 = -iVar.e.c;
                            h6.h hVar = iVar.n;
                            if (hVar != null) {
                                long min = Math.min(hVar.g(), Math.max(0L, hVar.a() + j3));
                                h6.h hVar2 = iVar.n;
                                if (hVar2 != null) {
                                    hVar2.q(new p(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            g6.g gVar = iVar.d;
                            if (gVar != null) {
                                gVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            g6.g gVar2 = iVar.d;
                            if (gVar2 != null) {
                                gVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j10 = iVar.e.c;
                            h6.h hVar3 = iVar.n;
                            if (hVar3 != null) {
                                long min2 = Math.min(hVar3.g(), Math.max(0L, hVar3.a() + j10));
                                h6.h hVar4 = iVar.n;
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
                    bz.E((bz.S0 + 1) % 3);
                    MusicPlayerService.g();
                    e8 e8Var = e8.T2;
                    if (e8Var != null) {
                        e8Var.d1();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (bz.N0) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(2);
                    }
                    a0 a0Var = MusicPlayerService.w;
                    if (a0Var != null) {
                        a0Var.x(bz.N0 ? 1 : 0);
                    }
                    e8 e8Var2 = e8.T2;
                    if (e8Var2 != null) {
                        e8Var2.d1();
                    }
                }
                fj fjVar = MediaController.B().v0;
                if (fjVar != null) {
                    boolean z10 = MusicPlayerService.s;
                    musicPlayerService.a(fjVar, false);
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
                h6.h hVar = ((i) this.h).n;
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
                i.v.b("onPlay", new Object[0]);
                h6.h hVar = ((i) this.h).n;
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
