// default package

import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eh7 extends yu6 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh7(Object obj, byte b) {
        super((byte) 1);
        this.g = b;
        this.h = obj;
    }

    @Override // yu6
    public final void G(long j) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    MediaController.w().h0(k27Var, (j / 1000) / ((float) k27Var.L0()));
                    boolean z = MusicPlayerService.s;
                    ((MusicPlayerService) obj).f(j);
                    break;
                }
                break;
            default:
                kgf.v.b("onSeekTo %d", Long.valueOf(j));
                i69 i69Var = ((kgf) obj).n;
                if (i69Var != null) {
                    i69Var.q(new nu6(j));
                    break;
                }
                break;
        }
    }

    @Override // yu6
    public final void M(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                gba.D(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
                MusicPlayerService.g();
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    musicPlayerService.a(k27Var, false);
                    break;
                }
                break;
            default:
                super.M(i);
                break;
        }
    }

    @Override // yu6
    public final void P(int i) {
        switch (this.g) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.h;
                if (i == 1 || i == 2) {
                    if (!gba.K0) {
                        MediaController.w().k0(2);
                    }
                } else if (gba.K0) {
                    MediaController.w().k0(0);
                }
                mv6 mv6Var = MusicPlayerService.w;
                if (mv6Var != null) {
                    mv6Var.q0(gba.K0 ? 1 : 0);
                }
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    musicPlayerService.a(k27Var, false);
                    break;
                }
                break;
            default:
                super.P(i);
                break;
        }
    }

    @Override // yu6
    public final void S() {
        switch (this.g) {
            case 0:
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.I3()) {
                    MediaController.w().T(false);
                    break;
                }
                break;
            default:
                kgf.v.b("onSkipToNext", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    fre.e("Must be called from the main thread.");
                    if (!i69Var.w()) {
                        i69.t();
                        break;
                    } else {
                        i69.x(new x5d(i69Var, (byte) 2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // yu6
    public final void V() {
        switch (this.g) {
            case 0:
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null && k27Var.I3()) {
                    MediaController.w().U();
                    break;
                }
                break;
            default:
                kgf.v.b("onSkipToPrevious", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    fre.e("Must be called from the main thread.");
                    if (!i69Var.w()) {
                        i69.t();
                        break;
                    } else {
                        i69.x(new x5d(i69Var, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yu6
    public final void f(String str) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                MusicPlayerService musicPlayerService = (MusicPlayerService) obj;
                if ("org.telegram.android.musicplayer.repeat".equals(str)) {
                    gba.D((gba.P0 + 1) % 3);
                    MusicPlayerService.g();
                    i20 i20Var = i20.S2;
                    if (i20Var != null) {
                        i20Var.X0();
                    }
                } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
                    if (gba.K0) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(2);
                    }
                    mv6 mv6Var = MusicPlayerService.w;
                    if (mv6Var != null) {
                        mv6Var.q0(gba.K0 ? 1 : 0);
                    }
                    i20 i20Var2 = i20.S2;
                    if (i20Var2 != null) {
                        i20Var2.X0();
                    }
                }
                k27 k27Var = MediaController.w().v0;
                if (k27Var != null) {
                    boolean z = MusicPlayerService.s;
                    musicPlayerService.a(k27Var, false);
                    break;
                }
                break;
            default:
                kgf kgfVar = (kgf) obj;
                kgf.v.b("onCustomAction with action = %s", str);
                switch (str.hashCode()) {
                    case -1699820260:
                        if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                            long j = -kgfVar.e.c;
                            i69 i69Var = kgfVar.n;
                            if (i69Var != null) {
                                long min = Math.min(i69Var.g(), Math.max(0L, i69Var.a() + j));
                                i69 i69Var2 = kgfVar.n;
                                if (i69Var2 != null) {
                                    i69Var2.q(new nu6(min));
                                    break;
                                }
                            }
                        }
                        break;
                    case -668151673:
                        if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            j6a j6aVar = kgfVar.d;
                            if (j6aVar != null) {
                                j6aVar.b(true);
                                break;
                            }
                        }
                        break;
                    case -124479363:
                        if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            j6a j6aVar2 = kgfVar.d;
                            if (j6aVar2 != null) {
                                j6aVar2.b(false);
                                break;
                            }
                        }
                        break;
                    case 1362116196:
                        if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                            long j2 = kgfVar.e.c;
                            i69 i69Var3 = kgfVar.n;
                            if (i69Var3 != null) {
                                long min2 = Math.min(i69Var3.g(), Math.max(0L, i69Var3.a() + j2));
                                i69 i69Var4 = kgfVar.n;
                                if (i69Var4 != null) {
                                    i69Var4.q(new nu6(min2));
                                    break;
                                }
                            }
                        }
                        break;
                }
                Intent intent = new Intent(str);
                intent.setComponent(kgfVar.g);
                kgfVar.a.sendBroadcast(intent);
                break;
        }
    }

    @Override // yu6
    public final boolean i(Intent intent) {
        i69 i69Var;
        switch (this.g) {
            case 1:
                kgf.v.b("onMediaButtonEvent", new Object[0]);
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    return true;
                }
                if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (i69Var = ((kgf) this.h).n) == null) {
                    return true;
                }
                i69Var.r();
                return true;
            default:
                return super.i(intent);
        }
    }

    @Override // yu6
    public final void k() {
        switch (this.g) {
            case 0:
                MediaController.w().Q(MediaController.w().v0, true);
                break;
            default:
                kgf.v.b("onPause", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    i69Var.r();
                    break;
                }
                break;
        }
    }

    @Override // yu6
    public final void n() {
        switch (this.g) {
            case 0:
                MediaController.w().R(MediaController.w().v0);
                break;
            default:
                kgf.v.b("onPlay", new Object[0]);
                i69 i69Var = ((kgf) this.h).n;
                if (i69Var != null) {
                    i69Var.r();
                    break;
                }
                break;
        }
    }
}
