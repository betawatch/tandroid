package eh;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import d5.f0;
import gh.k5;
import gh.l1;
import gh.q3;
import h3.h0;
import h3.k0;
import j3.r0;
import java.util.ArrayList;
import kh.d4;
import kh.g6;
import kh.m3;
import kh.t7;
import kh.ya;
import nh.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.gm;
import org.telegram.ui.ho;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        i iVar = null;
        iVar = null;
        iVar = null;
        int i10 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i9) {
            case 0:
                x xVar = (x) obj;
                ArrayList arrayList = xVar.c;
                boolean isEmpty = TextUtils.isEmpty(xVar.t);
                String str = xVar.t;
                xVar.w = true;
                xVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) r0.j(1, arrayList);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    iVar = new i(xVar, 1);
                }
                i iVar2 = iVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                }
                xVar.v = xVar.i.getImporters(xVar.j, str, tL_chatInviteImporter, xVar.d, new k(xVar, isEmpty, iVar2, str, z11));
                break;
            case 1:
                l1 l1Var = (l1) obj;
                if (!z10) {
                    l1Var.m0.setVisibility(8);
                    break;
                } else {
                    l1Var.getClass();
                    break;
                }
            case 2:
                k5 k5Var = (k5) obj;
                k5Var.getClass();
                k5Var.o2(k5Var.Y0, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, k5Var.C1())), true);
                break;
            case 3:
                k5 k5Var2 = ((q3) obj).P;
                TL_stars.SavedStarGift H1 = k5Var2.H1(z10);
                if (H1 != null) {
                    k5Var2.X0 = true;
                    k5Var2.j2(H1, k5Var2.z0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = k5Var2.I1(z10);
                    if (I1 != null) {
                        k5Var2.X0 = true;
                        k5Var2.h2(I1.slug, I1, k5Var2.z0);
                    }
                }
                k5Var2.N0 = -1;
                gc gcVar = gc.w;
                if (gcVar != null) {
                    gcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                hg.o oVar = (hg.o) obj;
                if (!z10) {
                    oVar.getClass();
                    break;
                } else {
                    ((hg.s) oVar.x.b).w.setVisibility(4);
                    break;
                }
            case 5:
                j3.n nVar = ((j3.m) obj).b;
                int i11 = f0.a;
                k0 k0Var = ((h0) nVar).a;
                if (k0Var.b0 != z10) {
                    k0Var.b0 = z10;
                    k0Var.l.e(23, new h3.t(i10, z10));
                    break;
                }
                break;
            case 6:
                jh.q qVar = (jh.q) obj;
                uq0 uq0Var = qVar.S;
                if (!z10) {
                    uq0Var.b(qVar.a.E);
                    break;
                } else {
                    new jh.t(uq0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new bg.i(uq0Var, 21)).show();
                    break;
                }
            case 7:
                m3 m3Var = (m3) obj;
                if (!z10) {
                    m3Var.E.setVisibility(8);
                    break;
                } else {
                    m3Var.getClass();
                    break;
                }
            case 8:
                ((d4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 9:
                g6 g6Var = (g6) obj;
                if (!z10) {
                    g6Var.T0.setVisibility(8);
                    break;
                } else {
                    g6Var.getClass();
                    break;
                }
            case 10:
                t7 t7Var = (t7) obj;
                if (!z10) {
                    t7Var.setVisibility(8);
                    break;
                } else {
                    t7Var.getClass();
                    break;
                }
            case 11:
                ya yaVar = (ya) obj;
                if (!z10) {
                    yaVar.w2.f1.setVisibility(8);
                    break;
                } else {
                    yaVar.getClass();
                    break;
                }
            case 12:
                ((q0) obj).f(z10, false);
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
                ve.e.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 24:
                ux0 ux0Var = ((gm) obj).c.Z0;
                if (ux0Var != null && z10) {
                    ux0Var.setVisibility(8);
                    break;
                }
                break;
            case 25:
                ho hoVar = (ho) obj;
                hoVar.t0.autotranslation = z10;
                hoVar.getMessagesController().putChat(hoVar.t0, false);
                break;
            case 26:
                cp cpVar = (cp) obj;
                ap apVar = cpVar.h;
                if (apVar != null && apVar.d != null && !cpVar.isDismissed()) {
                    cpVar.A(z10, true);
                    if (cpVar.I != null) {
                        cpVar.L = true;
                        TLRPC.WallPaper wallPaper = cpVar.v() ? null : cpVar.n.h;
                        b4 b4Var = cpVar.I.a;
                        if (b4Var.a) {
                            cpVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            cpVar.n.i(b4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (apVar.d != null) {
                        while (r2 < apVar.d.size()) {
                            ((bp) apVar.d.get(r2)).c = z10 ? 1 : 0;
                            r2++;
                        }
                        apVar.l();
                        break;
                    }
                }
                break;
            case 27:
                nv nvVar = (nv) obj;
                if (!z10) {
                    nvVar.A.setVisibility(8);
                    break;
                }
                break;
            case 28:
                n00 n00Var = (n00) obj;
                n00Var.Q(n00Var.u0, z10);
                break;
            default:
                l30 l30Var = (l30) obj;
                if (!z10) {
                    l30Var.r.setVisibility(8);
                    break;
                } else {
                    l30Var.getClass();
                    break;
                }
        }
    }
}
