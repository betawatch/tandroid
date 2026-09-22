package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.h8;
import ci.l4;
import ci.qb;
import ci.r6;
import ci.s3;
import e2.d0;
import fi.t0;
import i2.b0;
import i2.e0;
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
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pm;
import org.telegram.ui.uo;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                s3 s3Var = (s3) obj;
                if (!z10) {
                    s3Var.I.setVisibility(8);
                    break;
                } else {
                    s3Var.getClass();
                    break;
                }
            case 2:
                ((l4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 3:
                r6 r6Var = (r6) obj;
                if (!z10) {
                    r6Var.X0.setVisibility(8);
                    break;
                } else {
                    r6Var.getClass();
                    break;
                }
            case 4:
                h8 h8Var = (h8) obj;
                if (!z10) {
                    h8Var.setVisibility(8);
                    break;
                } else {
                    h8Var.getClass();
                    break;
                }
            case 5:
                qb qbVar = (qb) obj;
                if (!z10) {
                    qbVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    qbVar.getClass();
                    break;
                }
            case 6:
                ((t0) obj).f(z10, false);
                break;
            case 7:
                k2.k kVar = (k2.k) ((n4.y) obj).b;
                String str = d0.a;
                e0 e0Var = ((b0) kVar).a;
                if (e0Var.a0 != z10) {
                    e0Var.a0 = z10;
                    e0Var.m.e(23, new i2.x(i11, z10));
                    break;
                }
                break;
            case 8:
                ki.h hVar = (ki.h) obj;
                hVar.L = z10;
                hVar.M = hVar.q();
                hVar.N = 0;
                hVar.O = 0;
                ki.k kVar2 = hVar.j;
                StringBuilder sb2 = new StringBuilder("torch requested: enabled=");
                sb2.append(z10);
                sb2.append(", available=");
                sb2.append(hVar.q());
                sb2.append(", cameraId=");
                sb2.append(hVar.o);
                sb2.append(", facing=");
                sb2.append(hVar.C);
                sb2.append(", sessionMode=");
                sb2.append(hVar.b0 ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
                kVar2.b(sb2.toString());
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
                az0 az0Var = ((pm) obj).c.d1;
                if (az0Var != null && z10) {
                    az0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                uo uoVar = (uo) obj;
                uoVar.x0.autotranslation = z10;
                uoVar.getMessagesController().putChat(uoVar.x0, false);
                break;
            case 22:
                mp mpVar = (mp) obj;
                kp kpVar = mpVar.h;
                if (kpVar != null && kpVar.d != null && !mpVar.isDismissed()) {
                    mpVar.A(z10, true);
                    if (mpVar.M != null) {
                        mpVar.P = true;
                        TLRPC.WallPaper wallPaper = mpVar.v() ? null : mpVar.n.h;
                        d4 d4Var = mpVar.M.a;
                        if (d4Var.a) {
                            mpVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            mpVar.n.i(d4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (r2 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(r2)).c = z10 ? 1 : 0;
                            r2++;
                        }
                        kpVar.l();
                        break;
                    }
                }
                break;
            case 23:
                dw dwVar = (dw) obj;
                if (!z10) {
                    dwVar.E.setVisibility(8);
                    break;
                }
                break;
            case 24:
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.y0, z10);
                break;
            case 25:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.r.setVisibility(8);
                    break;
                } else {
                    b40Var.getClass();
                    break;
                }
            case 26:
                c60 c60Var = ((u50) obj).H0;
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
                ma0 ma0Var = (ma0) obj;
                if (!z10) {
                    ma0Var.getClass();
                    break;
                } else {
                    ma0Var.G.setVisibility(8);
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
