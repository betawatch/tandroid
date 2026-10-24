package ah;

import ai.a2;
import ai.i5;
import ai.l7;
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
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.wp;
import org.telegram.ui.im;
import org.telegram.ui.ko;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        j6 u10;
        int i10 = this.a;
        char c10 = 1;
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
                l7 l7Var = (l7) obj;
                l7Var.getClass();
                l7Var.R2(l7Var.j1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, l7Var.W1())), true);
                break;
            case 3:
                l7 l7Var2 = ((i5) obj).T;
                TL_stars.SavedStarGift b22 = l7Var2.b2(z10);
                if (b22 != null) {
                    l7Var2.e1 = true;
                    l7Var2.L2(b22, l7Var2.G0);
                } else {
                    TL_stars.TL_starGiftUnique c22 = l7Var2.c2(z10);
                    if (c22 != null) {
                        l7Var2.e1 = true;
                        l7Var2.J2(c22.slug, c22, l7Var2.G0);
                    }
                }
                l7Var2.U0 = -1;
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                di.r rVar = (di.r) obj;
                ms0 ms0Var = rVar.W;
                if (!z10) {
                    ms0Var.b(rVar.a.E);
                    break;
                } else {
                    new di.u(ms0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new ai.r0(ms0Var, 10)).show();
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
                b3 b3Var = d3Var.E;
                v2 v2Var = d3Var.y;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().animate().cancel();
                    v2Var.getWebView().animate().alpha(0.0f).start();
                }
                b3Var.setLoadProgress(0.0f);
                b3Var.setAlpha(1.0f);
                b3Var.setVisibility(0);
                v2Var.setBotUser(z10 ? null : MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I)));
                if (!z10) {
                    v2Var.s(d3Var.H, d3Var.I);
                }
                NotificationCenter.getInstance(v2Var.M).doOnIdle(new org.telegram.ui.web.t(v2Var, 2));
                break;
            case 11:
                ((hi.s0) obj).f(z10, false);
                break;
            case 12:
                k2.v vVar = (k2.v) ((qf.b) obj).c;
                String str = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) vVar).a;
                if (h0Var.d0 != z10) {
                    h0Var.d0 = z10;
                    h0Var.m.e(23, new i2.x(c10 == true ? 1 : 0, z10));
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
                lz0 lz0Var = ((im) obj).c.p1;
                if (lz0Var != null && z10) {
                    lz0Var.setVisibility(8);
                    break;
                }
                break;
            case 25:
                ko koVar = (ko) obj;
                koVar.w0.autotranslation = z10;
                koVar.getMessagesController().putChat(koVar.w0, false);
                break;
            case 26:
                wp wpVar = (wp) obj;
                up upVar = wpVar.h;
                if (upVar != null && upVar.d != null && !wpVar.isDismissed()) {
                    wpVar.F(z10, true);
                    if (wpVar.L != null) {
                        wpVar.O = true;
                        TLRPC.WallPaper wallPaper = wpVar.A() ? null : wpVar.n.g;
                        f4 f4Var = wpVar.L.a;
                        if (f4Var.a) {
                            wpVar.n.q(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            wpVar.n.q(f4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (AndroidUtilities.isTablet() && (u10 = wp.u(z10)) != null && u10 != k6.I) {
                        wpVar.i0 = z10 != wpVar.s;
                        wpVar.J(u10);
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
