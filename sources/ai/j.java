package ai;

import android.content.Context;
import android.media.AudioManager;
import bi.ad;
import bi.f5;
import bi.j4;
import bi.j9;
import bi.r7;
import ei.t0;
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
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.tm;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj, boolean z10) {
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
                a0 a0Var = (a0) obj;
                vr0 vr0Var = a0Var.W;
                if (!z10) {
                    vr0Var.b(a0Var.a.E);
                    break;
                } else {
                    new f0(vr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new b(vr0Var, r2)).show();
                    break;
                }
            case 1:
                j4 j4Var = (j4) obj;
                if (!z10) {
                    j4Var.I.setVisibility(8);
                    break;
                } else {
                    j4Var.getClass();
                    break;
                }
            case 2:
                ((f5) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 3:
                r7 r7Var = (r7) obj;
                if (!z10) {
                    r7Var.X0.setVisibility(8);
                    break;
                } else {
                    r7Var.getClass();
                    break;
                }
            case 4:
                j9 j9Var = (j9) obj;
                if (!z10) {
                    j9Var.setVisibility(8);
                    break;
                } else {
                    j9Var.getClass();
                    break;
                }
            case 5:
                ad adVar = (ad) obj;
                if (!z10) {
                    adVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    adVar.getClass();
                    break;
                }
            case 6:
                ((t0) obj).f(z10, false);
                break;
            case 7:
                k2.j jVar = (k2.j) ((of.b) obj).c;
                String str = e2.d0.a;
                i2.e0 e0Var = ((i2.b0) jVar).a;
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
                zy0 zy0Var = ((tm) obj).c.d1;
                if (zy0Var != null && z10) {
                    zy0Var.setVisibility(8);
                    break;
                }
                break;
            case 20:
                yo yoVar = (yo) obj;
                yoVar.x0.autotranslation = z10;
                yoVar.getMessagesController().putChat(yoVar.x0, false);
                break;
            case 21:
                sp spVar = (sp) obj;
                qp qpVar = spVar.h;
                if (qpVar != null && qpVar.d != null && !spVar.isDismissed()) {
                    spVar.A(z10, true);
                    if (spVar.M != null) {
                        spVar.P = true;
                        TLRPC.WallPaper wallPaper = spVar.v() ? null : spVar.n.h;
                        f4 f4Var = spVar.M.a;
                        if (f4Var.a) {
                            spVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            spVar.n.i(f4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (qpVar.d != null) {
                        while (r2 < qpVar.d.size()) {
                            ((rp) qpVar.d.get(r2)).c = z10 ? 1 : 0;
                            r2++;
                        }
                        qpVar.l();
                        break;
                    }
                }
                break;
            case 22:
                gw gwVar = (gw) obj;
                if (!z10) {
                    gwVar.E.setVisibility(8);
                    break;
                }
                break;
            case 23:
                k10 k10Var = (k10) obj;
                k10Var.R(k10Var.y0, z10);
                break;
            case 24:
                l40 l40Var = (l40) obj;
                if (!z10) {
                    l40Var.r.setVisibility(8);
                    break;
                } else {
                    l40Var.getClass();
                    break;
                }
            case 25:
                f60 f60Var = ((e60) obj).H0;
                if (!f60Var.g0) {
                    try {
                        f60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(f60Var.c.getParentActivity());
                    f60Var.d0 = z10 ? f60Var.f0 : 0L;
                    f60Var.c0 = System.currentTimeMillis();
                    f60Var.e0 = true;
                    f60Var.r();
                    f60Var.invalidate();
                    NotificationCenter.getInstance(f60Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(f60Var.Q), Boolean.FALSE);
                    break;
                }
                break;
            case 26:
                la0 la0Var = (la0) obj;
                if (!z10) {
                    la0Var.getClass();
                    break;
                } else {
                    la0Var.G.setVisibility(8);
                    break;
                }
            case 27:
                ((fn0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 28:
                iv0 iv0Var = (iv0) obj;
                if (!z10) {
                    iv0Var.m0.setVisibility(8);
                    break;
                } else {
                    iv0Var.getClass();
                    break;
                }
            default:
                wr0 wr0Var = (wr0) obj;
                if (!z10) {
                    wr0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    wr0Var.getClass();
                    break;
                }
        }
    }
}
