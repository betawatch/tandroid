package ah;

import android.content.Context;
import android.media.AudioManager;
import bi.o1;
import di.d8;
import di.j4;
import di.mb;
import di.o6;
import di.q3;
import fi.b3;
import fi.i3;
import fi.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zp;
import org.telegram.ui.vm;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 4;
        int i12 = 2;
        int i13 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                if (!z10) {
                    uVar.getClass();
                    break;
                } else {
                    ((a0) uVar.x.c).w.setVisibility(4);
                    break;
                }
            case 1:
                ci.t tVar = (ci.t) obj;
                ms0 ms0Var = tVar.W;
                if (!z10) {
                    ms0Var.b(tVar.a.E);
                    break;
                } else {
                    new ci.x(ms0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(ms0Var, i11)).show();
                    break;
                }
            case 2:
                q3 q3Var = (q3) obj;
                if (!z10) {
                    q3Var.I.setVisibility(8);
                    break;
                } else {
                    q3Var.getClass();
                    break;
                }
            case 3:
                ((j4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 4:
                o6 o6Var = (o6) obj;
                if (!z10) {
                    o6Var.X0.setVisibility(8);
                    break;
                } else {
                    o6Var.getClass();
                    break;
                }
            case 5:
                d8 d8Var = (d8) obj;
                if (!z10) {
                    d8Var.setVisibility(8);
                    break;
                } else {
                    d8Var.getClass();
                    break;
                }
            case 6:
                mb mbVar = (mb) obj;
                if (!z10) {
                    mbVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    mbVar.getClass();
                    break;
                }
            case 7:
                k3 k3Var = (k3) obj;
                i3 i3Var = k3Var.y;
                b3 b3Var = k3Var.x;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().animate().cancel();
                    b3Var.getWebView().animate().alpha(0.0f).start();
                }
                i3Var.setLoadProgress(0.0f);
                i3Var.setAlpha(1.0f);
                i3Var.setVisibility(0);
                b3Var.setBotUser(z10 ? null : MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                if (!z10) {
                    b3Var.s(k3Var.G, k3Var.H);
                }
                NotificationCenter.getInstance(b3Var.M).doOnIdle(new org.telegram.ui.web.s(b3Var, i12));
                break;
            case 8:
                ((gi.t0) obj).f(z10, false);
                break;
            case 9:
                k2.u uVar2 = (k2.u) ((qf.b) obj).c;
                String str = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) uVar2).a;
                if (h0Var.d0 != z10) {
                    h0Var.d0 = z10;
                    h0Var.m.e(23, new i2.x(i13, z10));
                    break;
                }
                break;
            case 10:
                li.l lVar = (li.l) obj;
                lVar.P = z10;
                lVar.Q = lVar.F();
                lVar.R = 0;
                lVar.S = 0;
                lVar.j.b("torch requested: enabled=" + z10 + ", available=" + lVar.F() + ", cameraId=" + lVar.o + ", facing=" + lVar.G);
                lVar.g();
                break;
            case 11:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                break;
            case 12:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                break;
            case 13:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                break;
            case 14:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                break;
            case 15:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                break;
            case 16:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 17:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 18:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 19:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 20:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 21:
                pf.d.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 22:
                kz0 kz0Var = ((vm) obj).c.d1;
                if (kz0Var != null && z10) {
                    kz0Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                zo zoVar = (zo) obj;
                zoVar.x0.autotranslation = z10;
                zoVar.getMessagesController().putChat(zoVar.x0, false);
                break;
            case 24:
                zp zpVar = (zp) obj;
                xp xpVar = zpVar.h;
                if (xpVar != null && xpVar.d != null && !zpVar.isDismissed()) {
                    zpVar.D(z10, true);
                    if (zpVar.M != null) {
                        zpVar.P = true;
                        TLRPC.WallPaper wallPaper = zpVar.x() ? null : zpVar.n.h;
                        b4 b4Var = zpVar.M.a;
                        if (b4Var.a) {
                            zpVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            zpVar.n.i(b4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (xpVar.d != null) {
                        while (r5 < xpVar.d.size()) {
                            ((yp) xpVar.d.get(r5)).c = z10 ? 1 : 0;
                            r5++;
                        }
                        xpVar.l();
                        break;
                    }
                }
                break;
            case 25:
                ow owVar = (ow) obj;
                if (!z10) {
                    owVar.E.setVisibility(8);
                    break;
                }
                break;
            case 26:
                o10 o10Var = (o10) obj;
                o10Var.S(o10Var.y0, z10);
                break;
            case 27:
                o40 o40Var = (o40) obj;
                if (!z10) {
                    o40Var.r.setVisibility(8);
                    break;
                } else {
                    o40Var.getClass();
                    break;
                }
            case 28:
                p60 p60Var = ((i60) obj).H0;
                if (!p60Var.l0) {
                    try {
                        p60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(p60Var.n.getParentActivity());
                    p60Var.i0 = z10 ? p60Var.k0 : 0L;
                    p60Var.h0 = System.currentTimeMillis();
                    p60Var.j0 = true;
                    p60Var.v();
                    p60Var.invalidate();
                    NotificationCenter.getInstance(p60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(p60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            default:
                cb0 cb0Var = (cb0) obj;
                if (!z10) {
                    cb0Var.getClass();
                    break;
                } else {
                    cb0Var.G.setVisibility(8);
                    break;
                }
        }
    }
}
