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
import kf.k0;
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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.pm;
import org.telegram.ui.ro;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) k0.i(1, arrayList);
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
                ze.d.s((Context) obj, LocaleController.getString(z4 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 18:
                qy0 qy0Var = ((pm) obj).c.a1;
                if (qy0Var != null && z4) {
                    qy0Var.setVisibility(8);
                    break;
                }
                break;
            case 19:
                ro roVar = (ro) obj;
                roVar.u0.autotranslation = z4;
                roVar.getMessagesController().putChat(roVar.u0, false);
                break;
            case 20:
                jp jpVar = (jp) obj;
                hp hpVar = jpVar.h;
                if (hpVar != null && hpVar.d != null && !jpVar.isDismissed()) {
                    jpVar.B(z4, true);
                    if (jpVar.J != null) {
                        jpVar.M = true;
                        TLRPC.WallPaper wallPaper = jpVar.v() ? null : jpVar.n.h;
                        e4 e4Var = jpVar.J.a;
                        if (e4Var.a) {
                            jpVar.n.i(null, wallPaper, false, Boolean.valueOf(z4), false);
                        } else {
                            jpVar.n.i(e4Var, wallPaper, false, Boolean.valueOf(z4), false);
                        }
                    }
                    if (hpVar.d != null) {
                        for (int i13 = 0; i13 < hpVar.d.size(); i13++) {
                            ((ip) hpVar.d.get(i13)).c = z4 ? 1 : 0;
                        }
                        hpVar.l();
                        break;
                    }
                }
                break;
            case 21:
                wv wvVar = (wv) obj;
                if (!z4) {
                    wvVar.B.setVisibility(8);
                    break;
                }
                break;
            case 22:
                d10 d10Var = (d10) obj;
                d10Var.R(d10Var.v0, z4);
                break;
            case 23:
                e40 e40Var = (e40) obj;
                if (z4) {
                    e40Var.getClass();
                    break;
                } else {
                    e40Var.r.setVisibility(8);
                    break;
                }
            case 24:
                y50 y50Var = ((x50) obj).E0;
                if (!y50Var.d0) {
                    try {
                        y50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(y50Var.c.getParentActivity());
                    y50Var.a0 = z4 ? y50Var.c0 : 0L;
                    y50Var.W = System.currentTimeMillis();
                    y50Var.b0 = true;
                    y50Var.r();
                    y50Var.invalidate();
                    NotificationCenter.getInstance(y50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(y50Var.N), Boolean.FALSE);
                    break;
                }
                break;
            case 25:
                ea0 ea0Var = (ea0) obj;
                if (z4) {
                    ea0Var.D.setVisibility(8);
                    break;
                } else {
                    ea0Var.getClass();
                    break;
                }
            case 26:
                ((cn0) obj).D.presentFragment(new PremiumPreviewFragment(0, z4 ? "upload_speed" : "download_speed"));
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
