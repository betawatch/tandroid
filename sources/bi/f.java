package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.e8;
import ci.k4;
import ci.nb;
import ci.q6;
import ci.r3;
import e2.d0;
import fi.t0;
import i2.c0;
import i2.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.fw;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.ro;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                zr0 zr0Var = uVar.W;
                if (!z10) {
                    zr0Var.b(uVar.a.E);
                    break;
                } else {
                    new y(zr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(zr0Var, 4)).show();
                    break;
                }
            case 1:
                r3 r3Var = (r3) obj;
                if (!z10) {
                    r3Var.I.setVisibility(8);
                    break;
                } else {
                    r3Var.getClass();
                    break;
                }
            case 2:
                ((k4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 3:
                q6 q6Var = (q6) obj;
                if (!z10) {
                    q6Var.X0.setVisibility(8);
                    break;
                } else {
                    q6Var.getClass();
                    break;
                }
            case 4:
                e8 e8Var = (e8) obj;
                if (!z10) {
                    e8Var.setVisibility(8);
                    break;
                } else {
                    e8Var.getClass();
                    break;
                }
            case 5:
                nb nbVar = (nb) obj;
                if (!z10) {
                    nbVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    nbVar.getClass();
                    break;
                }
            case 6:
                ((t0) obj).f(z10, false);
                break;
            case 7:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = d0.a;
                f0 f0Var = ((c0) jVar).a;
                if (f0Var.a0 != z10) {
                    f0Var.a0 = z10;
                    f0Var.m.e(23, new i2.y(i11, z10));
                    break;
                }
                break;
            case 8:
                ki.i iVar = (ki.i) obj;
                iVar.M = z10;
                iVar.N = iVar.q();
                iVar.O = 0;
                iVar.P = 0;
                iVar.j.b("torch requested: enabled=" + z10 + ", available=" + iVar.q() + ", cameraId=" + iVar.o + ", facing=" + iVar.D);
                iVar.a();
                break;
            case 9:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                break;
            case 10:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                break;
            case 11:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                break;
            case 12:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                break;
            case 13:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                break;
            case 14:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 15:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 16:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 17:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 18:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 19:
                nf.f.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 20:
                zy0 zy0Var = ((nm) obj).c.d1;
                if (zy0Var != null && z10) {
                    zy0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                ro roVar = (ro) obj;
                roVar.x0.autotranslation = z10;
                roVar.getMessagesController().putChat(roVar.x0, false);
                break;
            case 22:
                op opVar = (op) obj;
                mp mpVar = opVar.h;
                if (mpVar != null && mpVar.d != null && !opVar.isDismissed()) {
                    opVar.A(z10, true);
                    if (opVar.M != null) {
                        opVar.P = true;
                        TLRPC.WallPaper wallPaper = opVar.v() ? null : opVar.n.h;
                        b4 b4Var = opVar.M.a;
                        if (b4Var.a) {
                            opVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            opVar.n.i(b4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (mpVar.d != null) {
                        while (r2 < mpVar.d.size()) {
                            ((np) mpVar.d.get(r2)).c = z10 ? 1 : 0;
                            r2++;
                        }
                        mpVar.l();
                        break;
                    }
                }
                break;
            case 23:
                fw fwVar = (fw) obj;
                if (!z10) {
                    fwVar.E.setVisibility(8);
                    break;
                }
                break;
            case 24:
                e10 e10Var = (e10) obj;
                e10Var.R(e10Var.y0, z10);
                break;
            case 25:
                e40 e40Var = (e40) obj;
                if (!z10) {
                    e40Var.r.setVisibility(8);
                    break;
                } else {
                    e40Var.getClass();
                    break;
                }
            case 26:
                e60 e60Var = ((x50) obj).H0;
                if (!e60Var.l0) {
                    try {
                        e60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(e60Var.n.getParentActivity());
                    e60Var.i0 = z10 ? e60Var.k0 : 0L;
                    e60Var.h0 = System.currentTimeMillis();
                    e60Var.j0 = true;
                    e60Var.u();
                    e60Var.invalidate();
                    NotificationCenter.getInstance(e60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(e60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 27:
                pa0 pa0Var = (pa0) obj;
                if (!z10) {
                    pa0Var.getClass();
                    break;
                } else {
                    pa0Var.G.setVisibility(8);
                    break;
                }
            case 28:
                ((kn0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            default:
                lv0 lv0Var = (lv0) obj;
                if (!z10) {
                    lv0Var.m0.setVisibility(8);
                    break;
                } else {
                    lv0Var.getClass();
                    break;
                }
        }
    }
}
