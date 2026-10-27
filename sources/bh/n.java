package bh;

import android.content.Context;
import android.media.AudioManager;
import bi.d5;
import bi.h7;
import bi.x1;
import fi.b4;
import fi.e6;
import fi.k3;
import fi.p7;
import fi.ta;
import hi.e3;
import hi.m3;
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
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zp;
import org.telegram.ui.lm;
import org.telegram.ui.oo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x6 t10;
        int i10 = this.a;
        char c10 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                if (!z10) {
                    oVar.getClass();
                    break;
                } else {
                    ((u) oVar.x.c).v.setVisibility(4);
                    break;
                }
            case 1:
                x1 x1Var = (x1) obj;
                if (!z10) {
                    x1Var.q0.setVisibility(8);
                    break;
                } else {
                    x1Var.getClass();
                    break;
                }
            case 2:
                h7 h7Var = (h7) obj;
                h7Var.getClass();
                h7Var.R2(h7Var.j1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, h7Var.W1())), true);
                break;
            case 3:
                h7 h7Var2 = ((d5) obj).V;
                TL_stars.SavedStarGift b22 = h7Var2.b2(z10);
                if (b22 != null) {
                    h7Var2.e1 = true;
                    h7Var2.L2(b22, h7Var2.G0);
                } else {
                    TL_stars.TL_starGiftUnique c22 = h7Var2.c2(z10);
                    if (c22 != null) {
                        h7Var2.e1 = true;
                        h7Var2.J2(c22.slug, c22, h7Var2.G0);
                    }
                }
                h7Var2.U0 = -1;
                qc qcVar = qc.x;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                ei.r rVar = (ei.r) obj;
                vs0 vs0Var = rVar.W;
                if (!z10) {
                    vs0Var.b(rVar.a.E);
                    break;
                } else {
                    new ei.u(vs0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.i(vs0Var, 14)).show();
                    break;
                }
            case 5:
                k3 k3Var = (k3) obj;
                if (!z10) {
                    k3Var.I.setVisibility(8);
                    break;
                } else {
                    k3Var.getClass();
                    break;
                }
            case 6:
                ((b4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 7:
                e6 e6Var = (e6) obj;
                if (!z10) {
                    e6Var.M0.setVisibility(8);
                    break;
                } else {
                    e6Var.getClass();
                    break;
                }
            case 8:
                p7 p7Var = (p7) obj;
                if (!z10) {
                    p7Var.setVisibility(8);
                    break;
                } else {
                    p7Var.getClass();
                    break;
                }
            case 9:
                ta taVar = (ta) obj;
                if (!z10) {
                    taVar.p2.j1.setVisibility(8);
                    break;
                } else {
                    taVar.getClass();
                    break;
                }
            case 10:
                m3 m3Var = (m3) obj;
                hi.k3 k3Var2 = m3Var.E;
                e3 e3Var = m3Var.y;
                if (e3Var.getWebView() != null) {
                    e3Var.getWebView().animate().cancel();
                    e3Var.getWebView().animate().alpha(0.0f).start();
                }
                k3Var2.setLoadProgress(0.0f);
                k3Var2.setAlpha(1.0f);
                k3Var2.setVisibility(0);
                e3Var.setBotUser(z10 ? null : MessagesController.getInstance(m3Var.H).getUser(Long.valueOf(m3Var.I)));
                if (!z10) {
                    e3Var.s(m3Var.H, m3Var.I);
                }
                NotificationCenter.getInstance(e3Var.M).doOnIdle(new org.telegram.ui.web.t(e3Var, 2));
                break;
            case 11:
                ((ii.r0) obj).f(z10, false);
                break;
            case 12:
                k2.v vVar = (k2.v) ((rf.b) obj).c;
                String str = e2.n0.a;
                i2.j0 j0Var = ((i2.d0) vVar).a;
                if (j0Var.d0 != z10) {
                    j0Var.d0 = z10;
                    j0Var.m.e(23, new i2.y(c10 == true ? 1 : 0, z10));
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
                qf.d.r((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 24:
                uz0 uz0Var = ((lm) obj).c.p1;
                if (uz0Var != null && z10) {
                    uz0Var.setVisibility(8);
                    break;
                }
                break;
            case 25:
                oo ooVar = (oo) obj;
                ooVar.w0.autotranslation = z10;
                ooVar.getMessagesController().putChat(ooVar.w0, false);
                break;
            case 26:
                zp zpVar = (zp) obj;
                xp xpVar = zpVar.h;
                if (xpVar != null && xpVar.d != null && !zpVar.isDismissed()) {
                    zpVar.G(z10, true);
                    if (zpVar.L != null) {
                        zpVar.O = true;
                        TLRPC.WallPaper wallPaper = zpVar.A() ? null : zpVar.n.g;
                        h4 h4Var = zpVar.L.a;
                        if (h4Var.a) {
                            zpVar.n.q(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            zpVar.n.q(h4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (AndroidUtilities.isTablet() && (t10 = zp.t(z10)) != null && t10 != y6.I) {
                        zpVar.i0 = z10 != zpVar.s;
                        zpVar.J(t10);
                    }
                    if (xpVar.d != null) {
                        while (r3 < xpVar.d.size()) {
                            ((yp) xpVar.d.get(r3)).c = z10 ? 1 : 0;
                            r3++;
                        }
                        xpVar.l();
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
                n10 n10Var = (n10) obj;
                n10Var.S(n10Var.y0, z10);
                break;
            default:
                m40 m40Var = (m40) obj;
                if (!z10) {
                    m40Var.r.setVisibility(8);
                    break;
                } else {
                    m40Var.getClass();
                    break;
                }
        }
    }
}
