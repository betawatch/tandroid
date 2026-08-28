package h3;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ay;
import org.telegram.ui.bm;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
import org.telegram.ui.rl;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(int i9, int i10, String str, String str2) {
        this.a = 1;
        this.b = i9;
        this.d = str;
        this.e = str2;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
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
                ((qn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                tl tlVar = (tl) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                tlVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                bm bmVar = tlVar.a;
                bmVar.M.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == bmVar.M.H6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                cn cnVar = (cn) this.d;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                qn qnVar = cnVar.a;
                if (qnVar.w1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    qnVar.w1.setTranslationY(ll.D(520.0f, r3[1] - r2.getTop(), this.b));
                    qnVar.w1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    qnVar.w1.v();
                    break;
                }
                break;
            default:
                final ay ayVar = (ay) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                cy cyVar = ayVar.g;
                dy dyVar = ayVar.h;
                ArrayList arrayList = dyVar.N1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i10 = dialog.pinnedNum;
                    dyVar.S0 = null;
                    cyVar.a.invalidate();
                    int N0 = cyVar.c.N0();
                    if (N0 == this.b - 1) {
                        cyVar.c.m(N0).requestLayout();
                    }
                    if (!dyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = dyVar.getMessagesController().addDialogToFolder(dialog.id, dyVar.R2 == 0 ? 1 : 0, -1, 0L);
                        int i11 = this.c;
                        if (addDialogToFolder != 2 || i11 != 0) {
                            cyVar.x.D();
                            cyVar.q(true);
                        }
                        if (dyVar.R2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                cyVar.x.D();
                                if (i11 == 0) {
                                    dyVar.A4(true, true);
                                    cyVar.q(true);
                                    dyVar.o3();
                                } else {
                                    cyVar.q(true);
                                    if (!SharedConfig.archiveHidden && cyVar.c.L0() == 0) {
                                        dyVar.a2 = true;
                                        cyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                dyVar.N1.add(0, (TLRPC.Dialog) dyVar.R3(i9, cyVar.s, dyVar.R2, false).get(0));
                                cyVar.q(true);
                                final int i12 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                ayVar.h.A4(false, true);
                                                break;
                                            default:
                                                ayVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                f2.q1 K = cyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof org.telegram.ui.Cells.r2) {
                                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                                        if (r2Var.W1.n == 2) {
                                            r2Var.X1 = true;
                                            r2Var.Y1 = 0.0f;
                                            f6.u1.Q(0.0f, true);
                                            f6.u1.start();
                                            r2Var.invalidate();
                                        }
                                    }
                                }
                                final int i13 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                ayVar.h.A4(false, true);
                                                break;
                                            default:
                                                ayVar.h.A4(false, true);
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
                            UndoView Y3 = dyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new rl(ayVar, dialog, i10, 27));
                            }
                        }
                        if (dyVar.R2 != 0 && dyVar.N1.isEmpty()) {
                            cyVar.a.setEmptyView(null);
                            cyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        dyVar.getMessagesController().hidePromoDialog();
                        cyVar.x.D();
                        cyVar.q(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, int i9, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i9;
        this.c = i10;
    }

    public /* synthetic */ e0(qn qnVar, int i9, int i10, Object[] objArr) {
        this.a = 2;
        this.d = qnVar;
        this.b = i9;
        this.c = i10;
        this.e = objArr;
    }
}
