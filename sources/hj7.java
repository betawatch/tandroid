// default package

import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hj7 extends yw6 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj7(Object obj, byte b) {
        super((byte) 1);
        this.g = b;
        this.h = obj;
    }

    @Override // yw6
    public final void G(long j) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    MediaController.w().h0(k47Var, (j / 1000) / ((float) k47Var.L0()));
                    boolean z = MusicPlayerService.s;
                    ((MusicPlayerService) obj).f(j);
                    break;
                }
                break;
            default:
                lif.v.b("onSeekTo %d", Long.valueOf(j));
                k89 k89Var = ((lif) obj).n;
                if (k89Var != null) {
                    k89Var.q(new nw6(j));
                    break;
                }
                break;
        }
    }

    @Override // yw6
    public final void M(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                gda.D(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
                MusicPlayerService.g();
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    musicPlayerService.a(k47Var, false);
                    break;
                }
                break;
            default:
                super.M(i);
                break;
        }
    }

    @Override // yw6
    public final void P(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i == 1 || i == 2) {
                    if (!gda.J0) {
                        MediaController.w().k0(2);
                    }
                } else if (gda.J0) {
                    MediaController.w().k0(0);
                }
                mx6 mx6Var = MusicPlayerService.w;
                if (mx6Var != null) {
                    mx6Var.u0(gda.J0 ? 1 : 0);
                }
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    musicPlayerService.a(k47Var, false);
                    break;
                }
                break;
            default:
                super.P(i);
                break;
        }
    }

    @Override // yw6
    public final void S() {
        switch (this.g) {
            case 0:
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.I3()) {
                    MediaController.w().T(false);
                    break;
                }
                break;
            default:
                lif.v.b("onSkipToNext", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    ite.e("Must be called from the main thread.");
                    if (!k89Var.w()) {
                        k89.t();
                        break;
                    } else {
                        k89.x(new z7d(k89Var, (byte) 2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // yw6
    public final void V() {
        switch (this.g) {
            case 0:
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null && k47Var.I3()) {
                    MediaController.w().U();
                    break;
                }
                break;
            default:
                lif.v.b("onSkipToPrevious", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    ite.e("Must be called from the main thread.");
                    if (!k89Var.w()) {
                        k89.t();
                        break;
                    } else {
                        k89.x(new z7d(k89Var, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yw6
    public final void f(String str) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    gda.D((gda.O0 + 1) % 3);
                    MusicPlayerService.g();
                    i30 i30Var = i30.S2;
                    if (i30Var != null) {
                        i30Var.X0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (gda.J0) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(2);
                    }
                    mx6 mx6Var = MusicPlayerService.w;
                    if (mx6Var != null) {
                        mx6Var.u0(gda.J0 ? 1 : 0);
                    }
                    i30 i30Var2 = i30.S2;
                    if (i30Var2 != null) {
                        i30Var2.X0();
                    }
                }
                k47 k47Var = MediaController.w().v0;
                if (k47Var != null) {
                    boolean z = MusicPlayerService.s;
                    musicPlayerService.a(k47Var, false);
                    break;
                }
                break;
            default:
                lif lifVar = (lif) obj;
                lif.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j = -lifVar.e.c;
                            k89 k89Var = lifVar.n;
                            if (k89Var != null) {
                                long min = Math.min(k89Var.g(), Math.max(0L, k89Var.a() + j));
                                k89 k89Var2 = lifVar.n;
                                if (k89Var2 != null) {
                                    k89Var2.q(new nw6(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            l8a l8aVar = lifVar.d;
                            if (l8aVar != null) {
                                l8aVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            l8a l8aVar2 = lifVar.d;
                            if (l8aVar2 != null) {
                                l8aVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j2 = lifVar.e.c;
                            k89 k89Var3 = lifVar.n;
                            if (k89Var3 != null) {
                                long min2 = Math.min(k89Var3.g(), Math.max(0L, k89Var3.a() + j2));
                                k89 k89Var4 = lifVar.n;
                                if (k89Var4 != null) {
                                    k89Var4.q(new nw6(min2));
                                    break;
                                }
                            }
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(lifVar.g);
                lifVar.a.sendBroadcast(intent);
                break;
        }
    }

    @Override // yw6
    public final boolean i(Intent intent) {
        k89 k89Var;
        switch (this.g) {
            case 1:
                lif.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    return true;
                }
                if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (k89Var = ((lif) this.h).n) == null) {
                    return true;
                }
                k89Var.r();
                return true;
            default:
                return super.i(intent);
        }
    }

    @Override // yw6
    public final void k() {
        switch (this.g) {
            case 0:
                MediaController.w().Q(MediaController.w().v0, true);
                break;
            default:
                lif.v.b("onPause", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    k89Var.r();
                    break;
                }
                break;
        }
    }

    @Override // yw6
    public final void n() {
        switch (this.g) {
            case 0:
                MediaController.w().R(MediaController.w().v0);
                break;
            default:
                lif.v.b("onPlay", new Object[0]);
                k89 k89Var = ((lif) this.h).n;
                if (k89Var != null) {
                    k89Var.r();
                    break;
                }
                break;
        }
    }
}
