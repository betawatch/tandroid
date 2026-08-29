package j3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.rm;
import org.telegram.ui.dy;
import org.telegram.ui.em;
import org.telegram.ui.ey;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
import org.telegram.ui.vl;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(int i10, int i11, String str, String str2) {
        this.a = 1;
        this.b = i10;
        this.d = str;
        this.e = str2;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.d;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.e;
                k0 k0Var = h0Var.a;
                Surface surface = new Surface(surfaceTexture);
                k0Var.g0(surface);
                k0Var.S = surface;
                k0Var.a0(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((tn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                vl vlVar = (vl) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                vlVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                em emVar = vlVar.a;
                emVar.M.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == emVar.M.H6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                fn fnVar = (fn) this.d;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                tn tnVar = fnVar.a;
                if (tnVar.w1 != null) {
                    s1Var.getLocationInWindow(new int[2]);
                    tnVar.w1.setTranslationY(org.telegram.ui.b.C(520.0f, r3[1] - r2.getTop(), this.b));
                    tnVar.w1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    tnVar.w1.v();
                    break;
                }
                break;
            default:
                final dy dyVar = (dy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ey eyVar = dyVar.g;
                fy fyVar = dyVar.h;
                ArrayList arrayList = fyVar.N1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    fyVar.S0 = null;
                    eyVar.a.invalidate();
                    int N0 = eyVar.c.N0();
                    if (N0 == this.b - 1) {
                        eyVar.c.m(N0).requestLayout();
                    }
                    if (!fyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = fyVar.getMessagesController().addDialogToFolder(dialog.id, fyVar.R2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            eyVar.x.D();
                            eyVar.q(true);
                        }
                        if (fyVar.R2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                eyVar.x.D();
                                if (i12 == 0) {
                                    fyVar.A4(true, true);
                                    eyVar.q(true);
                                    fyVar.o3();
                                } else {
                                    eyVar.q(true);
                                    if (!SharedConfig.archiveHidden && eyVar.c.L0() == 0) {
                                        fyVar.a2 = true;
                                        eyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                fyVar.N1.add(0, (TLRPC.Dialog) fyVar.R3(i10, eyVar.s, fyVar.R2, false).get(0));
                                eyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                dyVar.h.A4(false, true);
                                                break;
                                            default:
                                                dyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                f2.n1 K = eyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof org.telegram.ui.Cells.p2) {
                                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                                        if (p2Var.W1.n == 2) {
                                            p2Var.X1 = true;
                                            p2Var.Y1 = 0.0f;
                                            g6.u1.Q(0.0f, true);
                                            g6.u1.start();
                                            p2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                dyVar.h.A4(false, true);
                                                break;
                                            default:
                                                dyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            }
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                            if (!z10) {
                                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView Y3 = fyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new rm(dyVar, dialog, i11, 26));
                            }
                        }
                        if (fyVar.R2 != 0 && fyVar.N1.isEmpty()) {
                            eyVar.a.setEmptyView(null);
                            eyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        fyVar.getMessagesController().hidePromoDialog();
                        eyVar.x.D();
                        eyVar.q(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ f0(tn tnVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = tnVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
