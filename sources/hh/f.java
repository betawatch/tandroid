package hh;

import ag.i0;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import f5.d0;
import j3.h0;
import j3.k0;
import j7.l1;
import java.util.ArrayList;
import jh.h5;
import jh.j1;
import jh.p3;
import nh.h7;
import nh.j3;
import nh.ja;
import nh.t5;
import nh.y3;
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
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.z30;
import org.telegram.ui.im;
import org.telegram.ui.ko;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
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
        i iVar = null;
        iVar = null;
        iVar = null;
        int i11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                v vVar = (v) obj;
                ArrayList arrayList = vVar.c;
                boolean isEmpty = TextUtils.isEmpty(vVar.t);
                String str = vVar.t;
                vVar.w = true;
                vVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) l1.i(1, arrayList);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    iVar = new i(vVar, 1);
                }
                i iVar2 = iVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(iVar2, 300L);
                }
                vVar.v = vVar.i.getImporters(vVar.j, str, tL_chatInviteImporter, vVar.d, new j(vVar, isEmpty, iVar2, str, z11));
                break;
            case 1:
                j1 j1Var = (j1) obj;
                if (!z10) {
                    j1Var.m0.setVisibility(8);
                    break;
                } else {
                    j1Var.getClass();
                    break;
                }
            case 2:
                h5 h5Var = (h5) obj;
                h5Var.getClass();
                h5Var.o2(h5Var.Y0, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, h5Var.C1())), true);
                break;
            case 3:
                h5 h5Var2 = ((p3) obj).P;
                TL_stars.SavedStarGift H1 = h5Var2.H1(z10);
                if (H1 != null) {
                    h5Var2.X0 = true;
                    h5Var2.j2(H1, h5Var2.z0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = h5Var2.I1(z10);
                    if (I1 != null) {
                        h5Var2.X0 = true;
                        h5Var2.h2(I1.slug, I1, h5Var2.z0);
                    }
                }
                h5Var2.N0 = -1;
                mc mcVar = mc.w;
                if (mcVar != null) {
                    mcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                kg.o oVar = (kg.o) obj;
                if (!z10) {
                    oVar.getClass();
                    break;
                } else {
                    ((kg.s) oVar.x.c).w.setVisibility(4);
                    break;
                }
            case 5:
                l3.o oVar2 = ((l3.n) obj).b;
                int i12 = d0.a;
                k0 k0Var = ((h0) oVar2).a;
                if (k0Var.b0 != z10) {
                    k0Var.b0 = z10;
                    k0Var.l.e(23, new j3.t(i11, z10));
                    break;
                }
                break;
            case 6:
                mh.r rVar = (mh.r) obj;
                fr0 fr0Var = rVar.S;
                if (!z10) {
                    fr0Var.b(rVar.a.E);
                    break;
                } else {
                    new mh.u(fr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new i0(fr0Var, 28)).show();
                    break;
                }
            case 7:
                j3 j3Var = (j3) obj;
                if (!z10) {
                    j3Var.E.setVisibility(8);
                    break;
                } else {
                    j3Var.getClass();
                    break;
                }
            case 8:
                ((y3) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 9:
                t5 t5Var = (t5) obj;
                if (!z10) {
                    t5Var.T0.setVisibility(8);
                    break;
                } else {
                    t5Var.getClass();
                    break;
                }
            case 10:
                h7 h7Var = (h7) obj;
                if (!z10) {
                    h7Var.setVisibility(8);
                    break;
                } else {
                    h7Var.getClass();
                    break;
                }
            case 11:
                ja jaVar = (ja) obj;
                if (!z10) {
                    jaVar.w2.f1.setVisibility(8);
                    break;
                } else {
                    jaVar.getClass();
                    break;
                }
            case 12:
                ((FileLoader) obj).lambda$onNetworkChanged$4(z10);
                break;
            case 13:
                ((FileUploadOperation) obj).lambda$onNetworkChanged$1(z10);
                break;
            case 14:
                ((LocationController) obj).lambda$startFusedLocationRequest$5(z10);
                break;
            case 15:
                ((RichMessageLayout.RichBlock) obj).lambda$toggleCheckbox$1(z10);
                break;
            case 16:
                ((UserConfig) obj).lambda$saveConfig$0(z10);
                break;
            case 17:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 18:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 19:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 20:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 21:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 22:
                ye.d.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 23:
                fy0 fy0Var = ((im) obj).c.Z0;
                if (fy0Var != null && z10) {
                    fy0Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                ko koVar = (ko) obj;
                koVar.t0.autotranslation = z10;
                koVar.getMessagesController().putChat(koVar.t0, false);
                break;
            case 25:
                gp gpVar = (gp) obj;
                ep epVar = gpVar.h;
                if (epVar != null && epVar.d != null && !gpVar.isDismissed()) {
                    gpVar.B(z10, true);
                    if (gpVar.I != null) {
                        gpVar.L = true;
                        TLRPC.WallPaper wallPaper = gpVar.v() ? null : gpVar.n.h;
                        b4 b4Var = gpVar.I.a;
                        if (b4Var.a) {
                            gpVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            gpVar.n.i(b4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (epVar.d != null) {
                        while (r5 < epVar.d.size()) {
                            ((fp) epVar.d.get(r5)).c = z10 ? 1 : 0;
                            r5++;
                        }
                        epVar.l();
                        break;
                    }
                }
                break;
            case 26:
                tv tvVar = (tv) obj;
                if (!z10) {
                    tvVar.A.setVisibility(8);
                    break;
                }
                break;
            case 27:
                y00 y00Var = (y00) obj;
                y00Var.R(y00Var.u0, z10);
                break;
            case 28:
                z30 z30Var = (z30) obj;
                if (!z10) {
                    z30Var.r.setVisibility(8);
                    break;
                } else {
                    z30Var.getClass();
                    break;
                }
            default:
                s50 s50Var = ((r50) obj).D0;
                if (!s50Var.c0) {
                    try {
                        s50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(s50Var.c.getParentActivity());
                    s50Var.W = z10 ? s50Var.b0 : 0L;
                    s50Var.V = System.currentTimeMillis();
                    s50Var.a0 = true;
                    s50Var.r();
                    s50Var.invalidate();
                    NotificationCenter.getInstance(s50Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(s50Var.M), Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
