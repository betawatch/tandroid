package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.e8;
import ci.j4;
import ci.nb;
import ci.q3;
import ci.q6;
import e2.d0;
import ei.b3;
import ei.i3;
import ei.k3;
import fi.t0;
import i2.c0;
import i2.f0;
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
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.t60;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qm;
import org.telegram.ui.uo;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int i11 = 2;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                u uVar = (u) obj;
                qs0 qs0Var = uVar.W;
                if (!z10) {
                    qs0Var.b(uVar.a.E);
                    break;
                } else {
                    new y(qs0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(qs0Var, 4)).show();
                    break;
                }
            case 1:
                q3 q3Var = (q3) obj;
                if (!z10) {
                    q3Var.I.setVisibility(8);
                    break;
                } else {
                    q3Var.getClass();
                    break;
                }
            case 2:
                ((j4) obj).b.setVisibility(z10 ? 0 : 8);
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
                NotificationCenter.getInstance(b3Var.M).doOnIdle(new org.telegram.ui.web.s(b3Var, i11));
                break;
            case 7:
                ((t0) obj).f(z10, false);
                break;
            case 8:
                k2.j jVar = (k2.j) ((n4.x) obj).c;
                String str = d0.a;
                f0 f0Var = ((c0) jVar).a;
                if (f0Var.a0 != z10) {
                    f0Var.a0 = z10;
                    f0Var.m.e(23, new i2.y(i12, z10));
                    break;
                }
                break;
            case 9:
                ki.j jVar2 = (ki.j) obj;
                jVar2.M = z10;
                jVar2.N = jVar2.x();
                jVar2.O = 0;
                jVar2.P = 0;
                jVar2.j.b("torch requested: enabled=" + z10 + ", available=" + jVar2.x() + ", cameraId=" + jVar2.o + ", facing=" + jVar2.D);
                jVar2.c();
                break;
            case 10:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                break;
            case 11:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                break;
            case 12:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                break;
            case 13:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                break;
            case 14:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                break;
            case 15:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 16:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 17:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 18:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 19:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 20:
                of.f.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 21:
                oz0 oz0Var = ((qm) obj).c.d1;
                if (oz0Var != null && z10) {
                    oz0Var.setVisibility(8);
                    break;
                }
                break;
            case 22:
                uo uoVar = (uo) obj;
                uoVar.x0.autotranslation = z10;
                uoVar.getMessagesController().putChat(uoVar.x0, false);
                break;
            case 23:
                cq cqVar = (cq) obj;
                aq aqVar = cqVar.h;
                if (aqVar != null && aqVar.d != null && !cqVar.isDismissed()) {
                    cqVar.D(z10, true);
                    if (cqVar.M != null) {
                        cqVar.P = true;
                        TLRPC.WallPaper wallPaper = cqVar.x() ? null : cqVar.n.h;
                        c4 c4Var = cqVar.M.a;
                        if (c4Var.a) {
                            cqVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            cqVar.n.i(c4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (aqVar.d != null) {
                        while (r4 < aqVar.d.size()) {
                            ((bq) aqVar.d.get(r4)).c = z10 ? 1 : 0;
                            r4++;
                        }
                        aqVar.l();
                        break;
                    }
                }
                break;
            case 24:
                sw swVar = (sw) obj;
                if (!z10) {
                    swVar.E.setVisibility(8);
                    break;
                }
                break;
            case 25:
                s10 s10Var = (s10) obj;
                s10Var.S(s10Var.y0, z10);
                break;
            case 26:
                s40 s40Var = (s40) obj;
                if (!z10) {
                    s40Var.r.setVisibility(8);
                    break;
                } else {
                    s40Var.getClass();
                    break;
                }
            case 27:
                t60 t60Var = ((l60) obj).H0;
                if (!t60Var.l0) {
                    try {
                        t60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(t60Var.n.getParentActivity());
                    t60Var.i0 = z10 ? t60Var.k0 : 0L;
                    t60Var.h0 = System.currentTimeMillis();
                    t60Var.j0 = true;
                    t60Var.v();
                    t60Var.invalidate();
                    NotificationCenter.getInstance(t60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(t60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 28:
                db0 db0Var = (db0) obj;
                if (!z10) {
                    db0Var.getClass();
                    break;
                } else {
                    db0Var.G.setVisibility(8);
                    break;
                }
            default:
                ((bo0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
        }
    }
}
