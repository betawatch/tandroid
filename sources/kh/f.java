package kh;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import h5.d0;
import j3.c0;
import j3.f0;
import j3.x;
import java.util.ArrayList;
import mh.g5;
import mh.i1;
import mh.o3;
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
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.Components.zv;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nm;
import org.telegram.ui.po;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int i12 = 0;
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
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) l.d.i(1, arrayList);
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
                int i13 = d0.a;
                f0 f0Var = ((c0) qVar).a;
                if (f0Var.Z != z4) {
                    f0Var.Z = z4;
                    f0Var.l.e(23, new x(i11, z4));
                    break;
                }
                break;
            case 2:
                i1 i1Var = (i1) obj;
                if (!z4) {
                    i1Var.n0.setVisibility(8);
                    break;
                } else {
                    i1Var.getClass();
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
                ng.o oVar = (ng.o) obj;
                if (!z4) {
                    oVar.getClass();
                    break;
                } else {
                    ((ng.s) oVar.x.c).w.setVisibility(4);
                    break;
                }
            case 6:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z4);
                break;
            case 7:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z4);
                break;
            case 8:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z4);
                break;
            case 9:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z4);
                break;
            case 10:
                ((UserConfig) obj).lambda$saveConfig$0(z4);
                break;
            case 11:
                ((CameraController) obj).lambda$recordVideo$11(z4);
                break;
            case 12:
                ((VideoCapturerDevice) obj).lambda$new$0(z4);
                break;
            case 13:
                ((VoIPService) obj).lambda$startGroupCall$27(z4);
                break;
            case 14:
                ((AudioManager) obj).setSpeakerphoneOn(z4);
                break;
            case 15:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z4);
                break;
            case 16:
                af.g.s((Context) obj, LocaleController.getString(z4 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 17:
                ry0 ry0Var = ((nm) obj).c.a1;
                if (ry0Var != null && z4) {
                    ry0Var.setVisibility(8);
                    break;
                }
                break;
            case 18:
                po poVar = (po) obj;
                poVar.u0.autotranslation = z4;
                poVar.getMessagesController().putChat(poVar.u0, false);
                break;
            case 19:
                mp mpVar = (mp) obj;
                kp kpVar = mpVar.h;
                if (kpVar != null && kpVar.d != null && !mpVar.isDismissed()) {
                    mpVar.B(z4, true);
                    if (mpVar.J != null) {
                        mpVar.M = true;
                        TLRPC.WallPaper wallPaper = mpVar.v() ? null : mpVar.n.h;
                        f4 f4Var = mpVar.J.a;
                        if (f4Var.a) {
                            mpVar.n.i(null, wallPaper, false, Boolean.valueOf(z4), false);
                        } else {
                            mpVar.n.i(f4Var, wallPaper, false, Boolean.valueOf(z4), false);
                        }
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).c = z4 ? 1 : 0;
                            i12++;
                        }
                        kpVar.l();
                        break;
                    }
                }
                break;
            case 20:
                zv zvVar = (zv) obj;
                if (!z4) {
                    zvVar.B.setVisibility(8);
                    break;
                }
                break;
            case 21:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.v0, z4);
                break;
            case 22:
                f40 f40Var = (f40) obj;
                if (!z4) {
                    f40Var.r.setVisibility(8);
                    break;
                } else {
                    f40Var.getClass();
                    break;
                }
            case 23:
                z50 z50Var = ((y50) obj).E0;
                if (!z50Var.d0) {
                    try {
                        z50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(z50Var.c.getParentActivity());
                    z50Var.a0 = z4 ? z50Var.c0 : 0L;
                    z50Var.W = System.currentTimeMillis();
                    z50Var.b0 = true;
                    z50Var.r();
                    z50Var.invalidate();
                    NotificationCenter.getInstance(z50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(z50Var.N), Boolean.FALSE);
                    break;
                }
                break;
            case 24:
                fa0 fa0Var = (fa0) obj;
                if (!z4) {
                    fa0Var.getClass();
                    break;
                } else {
                    fa0Var.D.setVisibility(8);
                    break;
                }
            case 25:
                ((en0) obj).D.presentFragment(new PremiumPreviewFragment(0, z4 ? "upload_speed" : "download_speed"));
                break;
            case 26:
                zu0 zu0Var = (zu0) obj;
                if (!z4) {
                    zu0Var.j0.setVisibility(8);
                    break;
                } else {
                    zu0Var.getClass();
                    break;
                }
            case 27:
                pr0 pr0Var = (pr0) obj;
                if (!z4) {
                    pr0Var.R.n0.setVisibility(0);
                    break;
                } else {
                    pr0Var.getClass();
                    break;
                }
            case 28:
                tr0 tr0Var = (tr0) obj;
                if (!z4) {
                    tr0Var.E.n0.setVisibility(0);
                    break;
                } else {
                    tr0Var.getClass();
                    break;
                }
            default:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList2 = qv0Var.r;
                pv0 pv0Var = qv0Var.n;
                if (pv0Var != null) {
                    pv0Var.G(qv0Var.f, z4);
                }
                while (i12 < arrayList2.size()) {
                    ((pv0) arrayList2.get(i12)).G(qv0Var.f, z4);
                    i12++;
                }
                break;
        }
    }
}
