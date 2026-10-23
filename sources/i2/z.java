package i2;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c41;
import org.telegram.ui.cy;
import org.telegram.ui.dn;
import org.telegram.ui.dy;
import org.telegram.ui.em;
import org.telegram.ui.ey;
import org.telegram.ui.sn;
import org.telegram.ui.vl;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z(int i10, int i11, String str, String str2) {
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
                b0 b0Var = (b0) this.d;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.e;
                h0 h0Var = b0Var.a;
                Surface surface = new Surface(surfaceTexture);
                h0Var.x1(surface);
                h0Var.U = surface;
                h0Var.q1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((sn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                vl vlVar = (vl) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                vlVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                em emVar = vlVar.a;
                emVar.Q.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == emVar.Q.X6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                dn dnVar = (dn) this.d;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                sn snVar = dnVar.a;
                if (snVar.M1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    snVar.M1.setTranslationY(sl.D(520.0f, r3[1] - r2.getTop(), this.b));
                    snVar.M1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    snVar.M1.u();
                    break;
                }
                break;
            default:
                final cy cyVar = (cy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                dy dyVar = cyVar.g;
                ey eyVar = cyVar.h;
                ArrayList arrayList = eyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    eyVar.W0 = null;
                    dyVar.a.invalidate();
                    int N0 = dyVar.c.N0();
                    if (N0 == this.b - 1) {
                        dyVar.c.m(N0).requestLayout();
                    }
                    if (!eyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = eyVar.getMessagesController().addDialogToFolder(dialog.id, eyVar.W2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            dyVar.x.D();
                            dyVar.q(true);
                        }
                        if (eyVar.W2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                dyVar.x.D();
                                if (i12 == 0) {
                                    eyVar.y4(true, true);
                                    dyVar.q(true);
                                    eyVar.m3();
                                } else {
                                    dyVar.q(true);
                                    if (!SharedConfig.archiveHidden && dyVar.c.L0() == 0) {
                                        eyVar.e2 = true;
                                        dyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((o2) eyVar).currentAccount;
                                eyVar.R1.add(0, (TLRPC.Dialog) eyVar.P3(i10, dyVar.s, eyVar.W2, false).get(0));
                                dyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ay
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                cyVar.h.y4(false, true);
                                                break;
                                            default:
                                                cyVar.h.y4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.b1 K = dyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof q2) {
                                        q2 q2Var = (q2) view;
                                        if (q2Var.a2.n == 2) {
                                            q2Var.b2 = true;
                                            q2Var.c2 = 0.0f;
                                            k6.u1.T(0.0f, true);
                                            k6.u1.start();
                                            q2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ay
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                cyVar.h.y4(false, true);
                                                break;
                                            default:
                                                cyVar.h.y4(false, true);
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
                            UndoView W3 = eyVar.W3();
                            if (W3 != null) {
                                W3.l(dialog.id, z10 ? 2 : 3, null, new c41(cyVar, dialog, i11, 2));
                            }
                        }
                        if (eyVar.W2 != 0 && eyVar.R1.isEmpty()) {
                            dyVar.a.setEmptyView(null);
                            dyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        eyVar.getMessagesController().hidePromoDialog();
                        dyVar.x.D();
                        dyVar.q(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ z(sn snVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = snVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
