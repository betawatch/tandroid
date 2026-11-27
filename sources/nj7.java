// default package

import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nj7 extends dx6 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj7(Object obj, byte b) {
        super((byte) 1);
        this.g = b;
        this.h = obj;
    }

    @Override // dx6
    public final void G(long j) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    MediaController.z().k0(r47Var, (j / 1000) / ((float) r47Var.L0()));
                    boolean z = MusicPlayerService.s;
                    ((MusicPlayerService) obj).f(j);
                    break;
                }
                break;
            default:
                alf.v.b("onSeekTo %d", Long.valueOf(j));
                v99 v99Var = ((alf) obj).n;
                if (v99Var != null) {
                    v99Var.q(new sw6(j));
                    break;
                }
                break;
        }
    }

    @Override // dx6
    public final void M(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                xea.D(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
                MusicPlayerService.g();
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    musicPlayerService.a(r47Var, false);
                    break;
                }
                break;
            default:
                super.M(i);
                break;
        }
    }

    @Override // dx6
    public final void P(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i == 1 || i == 2) {
                    if (!xea.J0) {
                        MediaController.z().n0(2);
                    }
                } else if (xea.J0) {
                    MediaController.z().n0(0);
                }
                rx6 rx6Var = MusicPlayerService.w;
                if (rx6Var != null) {
                    rx6Var.v0(xea.J0 ? 1 : 0);
                }
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    musicPlayerService.a(r47Var, false);
                    break;
                }
                break;
            default:
                super.P(i);
                break;
        }
    }

    @Override // dx6
    public final void S() {
        switch (this.g) {
            case 0:
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.I3()) {
                    MediaController.z().X(false);
                    break;
                }
                break;
            default:
                alf.v.b("onSkipToNext", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    xve.e("Must be called from the main thread.");
                    if (!v99Var.w()) {
                        v99.t();
                        break;
                    } else {
                        v99.x(new qad(v99Var, (byte) 2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // dx6
    public final void V() {
        switch (this.g) {
            case 0:
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.I3()) {
                    MediaController.z().Y();
                    break;
                }
                break;
            default:
                alf.v.b("onSkipToPrevious", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    xve.e("Must be called from the main thread.");
                    if (!v99Var.w()) {
                        v99.t();
                        break;
                    } else {
                        v99.x(new qad(v99Var, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // dx6
    public final void f(String str) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    xea.D((xea.O0 + 1) % 3);
                    MusicPlayerService.g();
                    j20 j20Var = j20.S2;
                    if (j20Var != null) {
                        j20Var.Y0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (xea.J0) {
                        MediaController.z().n0(0);
                    } else {
                        MediaController.z().n0(2);
                    }
                    rx6 rx6Var = MusicPlayerService.w;
                    if (rx6Var != null) {
                        rx6Var.v0(xea.J0 ? 1 : 0);
                    }
                    j20 j20Var2 = j20.S2;
                    if (j20Var2 != null) {
                        j20Var2.Y0();
                    }
                }
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null) {
                    boolean z = MusicPlayerService.s;
                    musicPlayerService.a(r47Var, false);
                    break;
                }
                break;
            default:
                alf alfVar = (alf) obj;
                alf.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j = -alfVar.e.c;
                            v99 v99Var = alfVar.n;
                            if (v99Var != null) {
                                long min = Math.min(v99Var.g(), Math.max(0L, v99Var.a() + j));
                                v99 v99Var2 = alfVar.n;
                                if (v99Var2 != null) {
                                    v99Var2.q(new sw6(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            baa baaVar = alfVar.d;
                            if (baaVar != null) {
                                baaVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            baa baaVar2 = alfVar.d;
                            if (baaVar2 != null) {
                                baaVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j2 = alfVar.e.c;
                            v99 v99Var3 = alfVar.n;
                            if (v99Var3 != null) {
                                long min2 = Math.min(v99Var3.g(), Math.max(0L, v99Var3.a() + j2));
                                v99 v99Var4 = alfVar.n;
                                if (v99Var4 != null) {
                                    v99Var4.q(new sw6(min2));
                                    break;
                                }
                            }
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(alfVar.g);
                alfVar.a.sendBroadcast(intent);
                break;
        }
    }

    @Override // dx6
    public final boolean i(Intent intent) {
        v99 v99Var;
        switch (this.g) {
            case 1:
                alf.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    return true;
                }
                if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (v99Var = ((alf) this.h).n) == null) {
                    return true;
                }
                v99Var.r();
                return true;
            default:
                return super.i(intent);
        }
    }

    @Override // dx6
    public final void k() {
        switch (this.g) {
            case 0:
                MediaController.z().U(MediaController.z().v0, true);
                break;
            default:
                alf.v.b("onPause", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    v99Var.r();
                    break;
                }
                break;
        }
    }

    @Override // dx6
    public final void n() {
        switch (this.g) {
            case 0:
                MediaController.z().V(MediaController.z().v0);
                break;
            default:
                alf.v.b("onPlay", new Object[0]);
                v99 v99Var = ((alf) this.h).n;
                if (v99Var != null) {
                    v99Var.r();
                    break;
                }
                break;
        }
    }
}
