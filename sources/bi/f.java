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
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.ro;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                xr0 xr0Var = uVar.W;
                if (!z10) {
                    xr0Var.b(uVar.a.E);
                    break;
                } else {
                    new y(xr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(xr0Var, 4)).show();
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
                ki.h hVar = (ki.h) obj;
                hVar.L = z10;
                hVar.M = hVar.p();
                hVar.N = 0;
                hVar.O = 0;
                hVar.j.b("torch requested: enabled=" + z10 + ", available=" + hVar.p() + ", cameraId=" + hVar.o + ", facing=" + hVar.C);
                hVar.a();
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
                xy0 xy0Var = ((nm) obj).c.d1;
                if (xy0Var != null && z10) {
                    xy0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                ro roVar = (ro) obj;
                roVar.x0.autotranslation = z10;
                roVar.getMessagesController().putChat(roVar.x0, false);
                break;
            case 22:
                np npVar = (np) obj;
                lp lpVar = npVar.h;
                if (lpVar != null && lpVar.d != null && !npVar.isDismissed()) {
                    npVar.A(z10, true);
                    if (npVar.M != null) {
                        npVar.P = true;
                        TLRPC.WallPaper wallPaper = npVar.v() ? null : npVar.n.h;
                        b4 b4Var = npVar.M.a;
                        if (b4Var.a) {
                            npVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            npVar.n.i(b4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (lpVar.d != null) {
                        while (r2 < lpVar.d.size()) {
                            ((mp) lpVar.d.get(r2)).c = z10 ? 1 : 0;
                            r2++;
                        }
                        lpVar.l();
                        break;
                    }
                }
                break;
            case 23:
                ew ewVar = (ew) obj;
                if (!z10) {
                    ewVar.E.setVisibility(8);
                    break;
                }
                break;
            case 24:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.y0, z10);
                break;
            case 25:
                c40 c40Var = (c40) obj;
                if (!z10) {
                    c40Var.r.setVisibility(8);
                    break;
                } else {
                    c40Var.getClass();
                    break;
                }
            case 26:
                c60 c60Var = ((v50) obj).H0;
                if (!c60Var.l0) {
                    try {
                        c60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(c60Var.n.getParentActivity());
                    c60Var.i0 = z10 ? c60Var.k0 : 0L;
                    c60Var.h0 = System.currentTimeMillis();
                    c60Var.j0 = true;
                    c60Var.u();
                    c60Var.invalidate();
                    NotificationCenter.getInstance(c60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(c60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 27:
                na0 na0Var = (na0) obj;
                if (!z10) {
                    na0Var.getClass();
                    break;
                } else {
                    na0Var.G.setVisibility(8);
                    break;
                }
            case 28:
                ((in0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            default:
                jv0 jv0Var = (jv0) obj;
                if (!z10) {
                    jv0Var.m0.setVisibility(8);
                    break;
                } else {
                    jv0Var.getClass();
                    break;
                }
        }
    }
}
