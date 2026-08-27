package fh;

import ag.n0;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import d5.g0;
import h3.h0;
import h3.k0;
import hh.i5;
import hh.l1;
import hh.p3;
import java.util.ArrayList;
import lh.c4;
import lh.f6;
import lh.l3;
import lh.s7;
import lh.va;
import oh.q0;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.yo;
import org.telegram.ui.Components.zo;
import org.telegram.ui.hm;
import org.telegram.ui.jo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
        int i11 = 23;
        i iVar = null;
        iVar = null;
        iVar = null;
        int i12 = 1;
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
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i0.a.i(1, arrayList);
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
                l1 l1Var = (l1) obj;
                if (!z10) {
                    l1Var.m0.setVisibility(8);
                    break;
                } else {
                    l1Var.getClass();
                    break;
                }
            case 2:
                i5 i5Var = (i5) obj;
                i5Var.getClass();
                i5Var.o2(i5Var.Y0, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, i5Var.C1())), true);
                break;
            case 3:
                i5 i5Var2 = ((p3) obj).P;
                TL_stars.SavedStarGift H1 = i5Var2.H1(z10);
                if (H1 != null) {
                    i5Var2.X0 = true;
                    i5Var2.j2(H1, i5Var2.z0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = i5Var2.I1(z10);
                    if (I1 != null) {
                        i5Var2.X0 = true;
                        i5Var2.h2(I1.slug, I1, i5Var2.z0);
                    }
                }
                i5Var2.N0 = -1;
                ec ecVar = ec.w;
                if (ecVar != null) {
                    ecVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                ig.o oVar = (ig.o) obj;
                if (!z10) {
                    oVar.getClass();
                    break;
                } else {
                    ((ig.s) oVar.x.c).w.setVisibility(4);
                    break;
                }
            case 5:
                j3.o oVar2 = ((j3.n) obj).b;
                int i13 = g0.a;
                k0 k0Var = ((h0) oVar2).a;
                if (k0Var.b0 != z10) {
                    k0Var.b0 = z10;
                    k0Var.l.e(23, new h3.t(i12, z10));
                    break;
                }
                break;
            case 6:
                kh.r rVar = (kh.r) obj;
                vq0 vq0Var = rVar.S;
                if (!z10) {
                    vq0Var.b(rVar.a.E);
                    break;
                } else {
                    new kh.u(vq0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new n0(vq0Var, i11)).show();
                    break;
                }
            case 7:
                l3 l3Var = (l3) obj;
                if (!z10) {
                    l3Var.E.setVisibility(8);
                    break;
                } else {
                    l3Var.getClass();
                    break;
                }
            case 8:
                ((c4) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 9:
                f6 f6Var = (f6) obj;
                if (!z10) {
                    f6Var.T0.setVisibility(8);
                    break;
                } else {
                    f6Var.getClass();
                    break;
                }
            case 10:
                s7 s7Var = (s7) obj;
                if (!z10) {
                    s7Var.setVisibility(8);
                    break;
                } else {
                    s7Var.getClass();
                    break;
                }
            case 11:
                va vaVar = (va) obj;
                if (!z10) {
                    vaVar.w2.f1.setVisibility(8);
                    break;
                } else {
                    vaVar.getClass();
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
                we.e.s((Context) obj, LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONLink : R.string.MonetizationInfoTONLink));
                break;
            case 24:
                wx0 wx0Var = ((hm) obj).c.Z0;
                if (wx0Var != null && z10) {
                    wx0Var.setVisibility(8);
                    break;
                }
                break;
            case 25:
                jo joVar = (jo) obj;
                joVar.t0.autotranslation = z10;
                joVar.getMessagesController().putChat(joVar.t0, false);
                break;
            case 26:
                ap apVar = (ap) obj;
                yo yoVar = apVar.h;
                if (yoVar != null && yoVar.d != null && !apVar.isDismissed()) {
                    apVar.C(z10, true);
                    if (apVar.I != null) {
                        apVar.L = true;
                        TLRPC.WallPaper wallPaper = apVar.w() ? null : apVar.n.h;
                        b4 b4Var = apVar.I.a;
                        if (b4Var.a) {
                            apVar.n.i(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            apVar.n.i(b4Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (yoVar.d != null) {
                        while (r4 < yoVar.d.size()) {
                            ((zo) yoVar.d.get(r4)).c = z10 ? 1 : 0;
                            r4++;
                        }
                        yoVar.l();
                        break;
                    }
                }
                break;
            case 27:
                mv mvVar = (mv) obj;
                if (!z10) {
                    mvVar.A.setVisibility(8);
                    break;
                }
                break;
            case 28:
                q00 q00Var = (q00) obj;
                q00Var.R(q00Var.u0, z10);
                break;
            default:
                q30 q30Var = (q30) obj;
                if (!z10) {
                    q30Var.r.setVisibility(8);
                    break;
                } else {
                    q30Var.getClass();
                    break;
                }
        }
    }
}
