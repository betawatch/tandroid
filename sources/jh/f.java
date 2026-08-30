package jh;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import cg.h0;
import h5.d0;
import j3.c0;
import j3.f0;
import j3.x;
import java.util.ArrayList;
import kh.a2;
import lh.g5;
import lh.j1;
import lh.o3;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.po;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i iVar = null;
        iVar = null;
        iVar = null;
        int i11 = 1;
        boolean z4 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                ArrayList arrayList = vVar.c;
                boolean isEmpty = TextUtils.isEmpty(vVar.t);
                String str = vVar.t;
                vVar.w = true;
                vVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) a2.i(1, arrayList);
                boolean z10 = tL_chatInviteImporter == null;
                if (isEmpty && z10 && z4) {
                    iVar = new i(vVar, 1);
                }
                i iVar2 = iVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                }
                vVar.v = vVar.i.getImporters(vVar.j, str, tL_chatInviteImporter, vVar.d, new j(vVar, isEmpty, iVar2, str, z10));
                break;
            case 1:
                l3.q qVar = (l3.q) ((f7.b) obj).c;
                int i12 = d0.a;
                f0 f0Var = ((c0) qVar).a;
                if (f0Var.Z != z4) {
                    f0Var.Z = z4;
                    f0Var.l.e(23, new x(i11, z4));
                    break;
                }
                break;
            case 2:
                j1 j1Var = (j1) obj;
                if (z4) {
                    j1Var.getClass();
                    break;
                } else {
                    j1Var.n0.setVisibility(8);
                    break;
                }
            case 3:
                g5 g5Var = (g5) obj;
                g5Var.getClass();
                g5Var.o2(g5Var.Z0, AndroidUtilities.replaceTags(LocaleController.formatString(z4 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, g5Var.C1())), true);
                break;
            case 4:
                g5 g5Var2 = ((o3) obj).Q;
                TL_stars.SavedStarGift H1 = g5Var2.H1(z4);
                if (H1 != null) {
                    g5Var2.Y0 = true;
                    g5Var2.j2(H1, g5Var2.A0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = g5Var2.I1(z4);
                    if (I1 != null) {
                        g5Var2.Y0 = true;
                        g5Var2.h2(I1.slug, I1, g5Var2.A0);
                    }
                }
                g5Var2.O0 = -1;
                ic icVar = ic.w;
                if (icVar != null) {
                    icVar.c(0L, false);
                    break;
                }
                break;
            case 5:
                mg.o oVar = (mg.o) obj;
                if (z4) {
                    ((mg.s) oVar.x.c).w.setVisibility(4);
                    break;
                } else {
                    oVar.getClass();
                    break;
                }
            case 6:
                oh.r rVar = (oh.r) obj;
                nr0 nr0Var = rVar.T;
                if (z4) {
                    new oh.u(nr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new h0(nr0Var, 28)).show();
                    break;
                } else {
                    nr0Var.b(rVar.a.E);
                    break;
                }
            case 7:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z4);
                break;
            case 8:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z4);
                break;
            case 9:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z4);
                break;
            case 10:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z4);
                break;
            case 11:
                ((UserConfig) obj).lambda$saveConfig$0(z4);
                break;
            case 12:
                ((CameraController) obj).lambda$recordVideo$11(z4);
                break;
            case 13:
                ((VideoCapturerDevice) obj).lambda$new$0(z4);
                break;
            case 14:
                ((VoIPService) obj).lambda$startGroupCall$27(z4);
                break;
            case 15:
                ((AudioManager) obj).setSpeakerphoneOn(z4);
                break;
            case 16:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z4);
                break;
            case 17:
                af.g.s((Context) obj, LocaleController.getString(z4 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 18:
                qy0 qy0Var = ((nm) obj).c.a1;
                if (qy0Var != null && z4) {
                    qy0Var.setVisibility(8);
                    break;
                }
                break;
            case 19:
                po poVar = (po) obj;
                poVar.u0.autotranslation = z4;
                poVar.getMessagesController().putChat(poVar.u0, false);
                break;
            case 20:
                kp kpVar = (kp) obj;
                ip ipVar = kpVar.h;
                if (ipVar != null && ipVar.d != null && !kpVar.isDismissed()) {
                    kpVar.B(z4, true);
                    if (kpVar.J != null) {
                        kpVar.M = true;
                        TLRPC.WallPaper wallPaper = kpVar.v() ? null : kpVar.n.h;
                        e4 e4Var = kpVar.J.a;
                        if (e4Var.a) {
                            kpVar.n.i(null, wallPaper, false, Boolean.valueOf(z4), false);
                        } else {
                            kpVar.n.i(e4Var, wallPaper, false, Boolean.valueOf(z4), false);
                        }
                    }
                    if (ipVar.d != null) {
                        for (int i13 = 0; i13 < ipVar.d.size(); i13++) {
                            ((jp) ipVar.d.get(i13)).c = z4 ? 1 : 0;
                        }
                        ipVar.l();
                        break;
                    }
                }
                break;
            case 21:
                xv xvVar = (xv) obj;
                if (!z4) {
                    xvVar.B.setVisibility(8);
                    break;
                }
                break;
            case 22:
                c10 c10Var = (c10) obj;
                c10Var.R(c10Var.v0, z4);
                break;
            case 23:
                d40 d40Var = (d40) obj;
                if (z4) {
                    d40Var.getClass();
                    break;
                } else {
                    d40Var.r.setVisibility(8);
                    break;
                }
            case 24:
                x50 x50Var = ((w50) obj).E0;
                if (!x50Var.d0) {
                    try {
                        x50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(x50Var.c.getParentActivity());
                    x50Var.a0 = z4 ? x50Var.c0 : 0L;
                    x50Var.W = System.currentTimeMillis();
                    x50Var.b0 = true;
                    x50Var.r();
                    x50Var.invalidate();
                    NotificationCenter.getInstance(x50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(x50Var.N), Boolean.FALSE);
                    break;
                }
                break;
            case 25:
                da0 da0Var = (da0) obj;
                if (z4) {
                    da0Var.D.setVisibility(8);
                    break;
                } else {
                    da0Var.getClass();
                    break;
                }
            case 26:
                ((dn0) obj).D.presentFragment(new PremiumPreviewFragment(0, z4 ? "upload_speed" : "download_speed"));
                break;
            case 27:
                yu0 yu0Var = (yu0) obj;
                if (z4) {
                    yu0Var.getClass();
                    break;
                } else {
                    yu0Var.j0.setVisibility(8);
                    break;
                }
            case 28:
                or0 or0Var = (or0) obj;
                if (z4) {
                    or0Var.getClass();
                    break;
                } else {
                    or0Var.R.n0.setVisibility(0);
                    break;
                }
            default:
                sr0 sr0Var = (sr0) obj;
                if (z4) {
                    sr0Var.getClass();
                    break;
                } else {
                    sr0Var.E.n0.setVisibility(0);
                    break;
                }
        }
    }
}
