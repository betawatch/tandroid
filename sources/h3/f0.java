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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.km;
import org.telegram.ui.dm;
import org.telegram.ui.dn;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.ul;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ((rn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                ul ulVar = (ul) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                ulVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                dm dmVar = ulVar.a;
                dmVar.M.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == dmVar.M.H6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                dn dnVar = (dn) this.d;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                rn rnVar = dnVar.a;
                if (rnVar.w1 != null) {
                    s1Var.getLocationInWindow(new int[2]);
                    rnVar.w1.setTranslationY(rl.C(520.0f, r3[1] - r2.getTop(), this.b));
                    rnVar.w1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    rnVar.w1.v();
                    break;
                }
                break;
            default:
                final ey eyVar = (ey) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                fy fyVar = eyVar.g;
                gy gyVar = eyVar.h;
                ArrayList arrayList = gyVar.N1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    gyVar.S0 = null;
                    fyVar.a.invalidate();
                    int N0 = fyVar.c.N0();
                    if (N0 == this.b - 1) {
                        fyVar.c.m(N0).requestLayout();
                    }
                    if (!gyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = gyVar.getMessagesController().addDialogToFolder(dialog.id, gyVar.R2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            fyVar.x.D();
                            fyVar.q(true);
                        }
                        if (gyVar.R2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                fyVar.x.D();
                                if (i12 == 0) {
                                    gyVar.A4(true, true);
                                    fyVar.q(true);
                                    gyVar.o3();
                                } else {
                                    fyVar.q(true);
                                    if (!SharedConfig.archiveHidden && fyVar.c.L0() == 0) {
                                        gyVar.a2 = true;
                                        fyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                gyVar.N1.add(0, (TLRPC.Dialog) gyVar.R3(i10, fyVar.s, gyVar.R2, false).get(0));
                                fyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                eyVar.h.A4(false, true);
                                                break;
                                            default:
                                                eyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                f2.o1 K = fyVar.a.K(0);
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
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                eyVar.h.A4(false, true);
                                                break;
                                            default:
                                                eyVar.h.A4(false, true);
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
                            UndoView Y3 = gyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new km(eyVar, dialog, i11, 26));
                            }
                        }
                        if (gyVar.R2 != 0 && gyVar.N1.isEmpty()) {
                            fyVar.a.setEmptyView(null);
                            fyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        gyVar.getMessagesController().hidePromoDialog();
                        fyVar.x.D();
                        fyVar.q(true);
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

    public /* synthetic */ f0(rn rnVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = rnVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
