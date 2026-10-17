package ah;

import ai.a2;
import ai.h5;
import ai.k7;
import android.content.Context;
import android.media.AudioManager;
import ei.d4;
import ei.f6;
import ei.m3;
import ei.t7;
import ei.xa;
import gi.b3;
import gi.d3;
import gi.v2;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wp;
import org.telegram.ui.jm;
import org.telegram.ui.ko;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        int i11 = 1;
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
                a2 a2Var = (a2) obj;
                if (!z10) {
                    a2Var.q0.setVisibility(8);
                    break;
                } else {
                    a2Var.getClass();
                    break;
                }
            case 2:
                k7 k7Var = (k7) obj;
                k7Var.getClass();
                k7Var.I2(k7Var.j1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, k7Var.P1())), true);
                break;
            case 3:
                k7 k7Var2 = ((h5) obj).T;
                TL_stars.SavedStarGift U1 = k7Var2.U1(z10);
                if (U1 != null) {
                    k7Var2.e1 = true;
                    k7Var2.C2(U1, k7Var2.G0);
                } else {
                    TL_stars.TL_starGiftUnique V1 = k7Var2.V1(z10);
                    if (V1 != null) {
                        k7Var2.e1 = true;
                        k7Var2.A2(V1.slug, V1, k7Var2.G0);
                    }
                }
                k7Var2.U0 = -1;
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                di.r rVar = (di.r) obj;
                hs0 hs0Var = rVar.W;
                if (!z10) {
                    hs0Var.b(rVar.a.E);
                    break;
                } else {
                    new di.u(hs0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.r0(hs0Var, 10)).show();
                    break;
                }
            case 5:
                m3 m3Var = (m3) obj;
                if (!z10) {
                    m3Var.I.setVisibility(8);
                    break;
                } else {
                    m3Var.getClass();
                    break;
                }
            case 6:
                ((d4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 7:
                f6 f6Var = (f6) obj;
                if (!z10) {
                    f6Var.X0.setVisibility(8);
                    break;
                } else {
                    f6Var.getClass();
                    break;
                }
            case 8:
                t7 t7Var = (t7) obj;
                if (!z10) {
                    t7Var.setVisibility(8);
                    break;
                } else {
                    t7Var.getClass();
                    break;
                }
            case 9:
                xa xaVar = (xa) obj;
                if (!z10) {
                    xaVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    xaVar.getClass();
                    break;
                }
            case 10:
                d3 d3Var = (d3) obj;
                b3 b3Var = d3Var.y;
                v2 v2Var = d3Var.x;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().animate().cancel();
                    v2Var.getWebView().animate().alpha(0.0f).start();
                }
                b3Var.setLoadProgress(0.0f);
                b3Var.setAlpha(1.0f);
                b3Var.setVisibility(0);
                v2Var.setBotUser(z10 ? null : MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H)));
                if (!z10) {
                    v2Var.s(d3Var.G, d3Var.H);
                }
                NotificationCenter.getInstance(v2Var.M).doOnIdle(new org.telegram.ui.web.s(v2Var, 2));
                break;
            case 11:
                ((hi.s0) obj).f(z10, false);
                break;
            case 12:
                k2.u uVar2 = (k2.u) ((qf.b) obj).c;
                String str = e2.m0.a;
                i2.g0 g0Var = ((i2.a0) uVar2).a;
                if (g0Var.d0 != z10) {
                    g0Var.d0 = z10;
                    g0Var.m.e(23, new i2.w(i11, z10));
                    break;
                }
                break;
            case 13:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                break;
            case 14:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                break;
            case 15:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                break;
            case 16:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                break;
            case 17:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                break;
            case 18:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 19:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 20:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 21:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 22:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 23:
                pf.d.r((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 24:
                gz0 gz0Var = ((jm) obj).c.d1;
                if (gz0Var != null && z10) {
                    gz0Var.setVisibility(8);
                    break;
                }
                break;
            case 25:
                ko koVar = (ko) obj;
                koVar.x0.autotranslation = z10;
                koVar.getMessagesController().putChat(koVar.x0, false);
                break;
            case 26:
                wp wpVar = (wp) obj;
                up upVar = wpVar.h;
                if (upVar != null && upVar.d != null && !wpVar.isDismissed()) {
                    wpVar.C(z10, true);
                    if (wpVar.M != null) {
                        wpVar.P = true;
                        TLRPC.WallPaper wallPaper = wpVar.x() ? null : wpVar.n.h;
                        c4 c4Var = wpVar.M.a;
                        if (c4Var.a) {
                            wpVar.n.k(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            wpVar.n.k(c4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (upVar.d != null) {
                        while (r3 < upVar.d.size()) {
                            ((vp) upVar.d.get(r3)).c = z10 ? 1 : 0;
                            r3++;
                        }
                        upVar.l();
                        break;
                    }
                }
                break;
            case 27:
                kw kwVar = (kw) obj;
                if (!z10) {
                    kwVar.E.setVisibility(8);
                    break;
                }
                break;
            case 28:
                k10 k10Var = (k10) obj;
                k10Var.S(k10Var.y0, z10);
                break;
            default:
                k40 k40Var = (k40) obj;
                if (!z10) {
                    k40Var.r.setVisibility(8);
                    break;
                } else {
                    k40Var.getClass();
                    break;
                }
        }
    }
}
