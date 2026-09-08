package ah;

import android.content.Context;
import android.media.AudioManager;
import bi.o1;
import di.h8;
import di.l4;
import di.q6;
import di.rb;
import di.s3;
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
import org.telegram.ui.Components.bw;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.sm;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 4;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                if (!z10) {
                    vVar.getClass();
                    break;
                } else {
                    ((b0) vVar.x.c).w.setVisibility(4);
                    break;
                }
            case 1:
                ci.t tVar = (ci.t) obj;
                lr0 lr0Var = tVar.W;
                if (!z10) {
                    lr0Var.b(tVar.a.E);
                    break;
                } else {
                    new ci.x(lr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(lr0Var, i11)).show();
                    break;
                }
            case 2:
                s3 s3Var = (s3) obj;
                if (!z10) {
                    s3Var.I.setVisibility(8);
                    break;
                } else {
                    s3Var.getClass();
                    break;
                }
            case 3:
                ((l4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 4:
                q6 q6Var = (q6) obj;
                if (!z10) {
                    q6Var.X0.setVisibility(8);
                    break;
                } else {
                    q6Var.getClass();
                    break;
                }
            case 5:
                h8 h8Var = (h8) obj;
                if (!z10) {
                    h8Var.setVisibility(8);
                    break;
                } else {
                    h8Var.getClass();
                    break;
                }
            case 6:
                rb rbVar = (rb) obj;
                if (!z10) {
                    rbVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    rbVar.getClass();
                    break;
                }
            case 7:
                ((gi.t0) obj).f(z10, false);
                break;
            case 8:
                k2.j jVar = (k2.j) ((n4.y) obj).c;
                String str = e2.d0.a;
                i2.f0 f0Var = ((i2.c0) jVar).a;
                if (f0Var.a0 != z10) {
                    f0Var.a0 = z10;
                    f0Var.m.e(23, new i2.y(i12, z10));
                    break;
                }
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
                of.f.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 20:
                my0 my0Var = ((sm) obj).c.d1;
                if (my0Var != null && z10) {
                    my0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                xo xoVar = (xo) obj;
                xoVar.x0.autotranslation = z10;
                xoVar.getMessagesController().putChat(xoVar.x0, false);
                break;
            case 22:
                lp lpVar = (lp) obj;
                jp jpVar = lpVar.h;
                if (jpVar != null && jpVar.d != null && !lpVar.isDismissed()) {
                    lpVar.B(z10, true);
                    if (lpVar.M != null) {
                        lpVar.P = true;
                        TLRPC.WallPaper wallPaper = lpVar.v() ? null : lpVar.n.h;
                        d4 d4Var = lpVar.M.a;
                        if (d4Var.a) {
                            lpVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            lpVar.n.i(d4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (jpVar.d != null) {
                        while (r3 < jpVar.d.size()) {
                            ((kp) jpVar.d.get(r3)).c = z10 ? 1 : 0;
                            r3++;
                        }
                        jpVar.l();
                        break;
                    }
                }
                break;
            case 23:
                bw bwVar = (bw) obj;
                if (!z10) {
                    bwVar.E.setVisibility(8);
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
            case 27:
                ca0 ca0Var = (ca0) obj;
                if (!z10) {
                    ca0Var.getClass();
                    break;
                } else {
                    ca0Var.G.setVisibility(8);
                    break;
                }
            case 28:
                ((vm0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            default:
                xu0 xu0Var = (xu0) obj;
                if (!z10) {
                    xu0Var.m0.setVisibility(8);
                    break;
                } else {
                    xu0Var.getClass();
                    break;
                }
        }
    }
}
