package bi;

import ai.y1;
import android.content.Context;
import android.media.AudioManager;
import ci.d8;
import ci.k4;
import ci.mb;
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
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.to;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                es0 es0Var = uVar.W;
                if (!z10) {
                    es0Var.b(uVar.a.E);
                    break;
                } else {
                    new y(es0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(es0Var, 4)).show();
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
                d8 d8Var = (d8) obj;
                if (!z10) {
                    d8Var.setVisibility(8);
                    break;
                } else {
                    d8Var.getClass();
                    break;
                }
            case 5:
                mb mbVar = (mb) obj;
                if (!z10) {
                    mbVar.A2.j1.setVisibility(8);
                    break;
                } else {
                    mbVar.getClass();
                    break;
                }
            case 6:
                ((t0) obj).f(z10, false);
                break;
            case 7:
                k2.k kVar = (k2.k) ((n4.y) obj).c;
                String str = d0.a;
                f0 f0Var = ((c0) kVar).a;
                if (f0Var.a0 != z10) {
                    f0Var.a0 = z10;
                    f0Var.m.e(23, new i2.y(i11, z10));
                    break;
                }
                break;
            case 8:
                ki.i iVar = (ki.i) obj;
                iVar.M = z10;
                iVar.N = iVar.q();
                iVar.O = 0;
                iVar.P = 0;
                iVar.j.b("torch requested: enabled=" + z10 + ", available=" + iVar.q() + ", cameraId=" + iVar.o + ", facing=" + iVar.D);
                iVar.a();
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
                jz0 jz0Var = ((nm) obj).c.b1;
                if (jz0Var != null && z10) {
                    jz0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                to toVar = (to) obj;
                toVar.x0.autotranslation = z10;
                toVar.getMessagesController().putChat(toVar.x0, false);
                break;
            case 22:
                pp ppVar = (pp) obj;
                np npVar = ppVar.h;
                if (npVar != null && npVar.d != null && !ppVar.isDismissed()) {
                    ppVar.A(z10, true);
                    if (ppVar.M != null) {
                        ppVar.P = true;
                        TLRPC.WallPaper wallPaper = ppVar.v() ? null : ppVar.n.h;
                        c4 c4Var = ppVar.M.a;
                        if (c4Var.a) {
                            ppVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            ppVar.n.i(c4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (npVar.d != null) {
                        while (r2 < npVar.d.size()) {
                            ((op) npVar.d.get(r2)).c = z10 ? 1 : 0;
                            r2++;
                        }
                        npVar.l();
                        break;
                    }
                }
                break;
            case 23:
                gw gwVar = (gw) obj;
                if (!z10) {
                    gwVar.E.setVisibility(8);
                    break;
                }
                break;
            case 24:
                f10 f10Var = (f10) obj;
                f10Var.P(f10Var.y0, z10);
                break;
            case 25:
                f40 f40Var = (f40) obj;
                if (!z10) {
                    f40Var.r.setVisibility(8);
                    break;
                } else {
                    f40Var.getClass();
                    break;
                }
            case 26:
                f60 f60Var = ((y50) obj).H0;
                if (!f60Var.l0) {
                    try {
                        f60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(f60Var.n.getParentActivity());
                    f60Var.i0 = z10 ? f60Var.k0 : 0L;
                    f60Var.h0 = System.currentTimeMillis();
                    f60Var.j0 = true;
                    f60Var.u();
                    f60Var.invalidate();
                    NotificationCenter.getInstance(f60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(f60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 27:
                pa0 pa0Var = (pa0) obj;
                if (!z10) {
                    pa0Var.getClass();
                    break;
                } else {
                    pa0Var.G.setVisibility(8);
                    break;
                }
            case 28:
                ((on0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            default:
                qv0 qv0Var = (qv0) obj;
                if (!z10) {
                    qv0Var.m0.setVisibility(8);
                    break;
                } else {
                    qv0Var.getClass();
                    break;
                }
        }
    }
}
