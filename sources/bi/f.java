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
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rm;
import org.telegram.ui.wo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                mr0 mr0Var = uVar.W;
                if (!z10) {
                    mr0Var.b(uVar.a.E);
                    break;
                } else {
                    new y(mr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(mr0Var, 4)).show();
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
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = d0.a;
                e0 e0Var = ((b0) jVar).a;
                if (e0Var.a0 != z10) {
                    e0Var.a0 = z10;
                    e0Var.m.e(23, new i2.x(i11, z10));
                    break;
                }
                break;
            case 8:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                break;
            case 9:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                break;
            case 10:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                break;
            case 11:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                break;
            case 12:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                break;
            case 13:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 14:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 15:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 16:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 17:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 18:
                nf.f.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 19:
                ny0 ny0Var = ((rm) obj).c.d1;
                if (ny0Var != null && z10) {
                    ny0Var.setVisibility(8);
                    break;
                }
                break;
            case 20:
                wo woVar = (wo) obj;
                woVar.x0.autotranslation = z10;
                woVar.getMessagesController().putChat(woVar.x0, false);
                break;
            case 21:
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
            case 22:
                cw cwVar = (cw) obj;
                if (!z10) {
                    cwVar.E.setVisibility(8);
                    break;
                }
                break;
            case 23:
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.y0, z10);
                break;
            case 24:
                b40 b40Var = (b40) obj;
                if (!z10) {
                    b40Var.r.setVisibility(8);
                    break;
                } else {
                    b40Var.getClass();
                    break;
                }
            case 25:
                w50 w50Var = ((v50) obj).H0;
                if (!w50Var.g0) {
                    try {
                        w50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(w50Var.c.getParentActivity());
                    w50Var.d0 = z10 ? w50Var.f0 : 0L;
                    w50Var.c0 = System.currentTimeMillis();
                    w50Var.e0 = true;
                    w50Var.r();
                    w50Var.invalidate();
                    NotificationCenter.getInstance(w50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(w50Var.Q), Boolean.FALSE);
                    break;
                }
                break;
            case 26:
                ba0 ba0Var = (ba0) obj;
                if (!z10) {
                    ba0Var.getClass();
                    break;
                } else {
                    ba0Var.G.setVisibility(8);
                    break;
                }
            case 27:
                ((vm0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 28:
                yu0 yu0Var = (yu0) obj;
                if (!z10) {
                    yu0Var.m0.setVisibility(8);
                    break;
                } else {
                    yu0Var.getClass();
                    break;
                }
            default:
                nr0 nr0Var = (nr0) obj;
                if (!z10) {
                    nr0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    nr0Var.getClass();
                    break;
                }
        }
    }
}
