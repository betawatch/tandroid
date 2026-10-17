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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.w31;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.en;
import org.telegram.ui.ey;
import org.telegram.ui.fm;
import org.telegram.ui.sn;
import org.telegram.ui.wl;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y(int i10, int i11, String str, String str2) {
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
                a0 a0Var = (a0) this.d;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.e;
                g0 g0Var = a0Var.a;
                Surface surface = new Surface(surfaceTexture);
                g0Var.x1(surface);
                g0Var.U = surface;
                g0Var.q1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((sn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                wl wlVar = (wl) this.d;
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.e;
                wlVar.getClass();
                MessageObject messageObject = x0Var.getMessageObject();
                fm fmVar = wlVar.a;
                fmVar.Q.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == fmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                en enVar = (en) this.d;
                u1 u1Var = (u1) this.e;
                sn snVar = enVar.a;
                if (snVar.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    snVar.A1.setTranslationY(org.telegram.ui.Cells.t0.e(520.0f, r3[1] - r2.getTop(), this.b));
                    snVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    snVar.A1.u();
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
                                i10 = ((n2) eyVar).currentAccount;
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
                                    if (view instanceof r2) {
                                        r2 r2Var = (r2) view;
                                        if (r2Var.a2.n == 2) {
                                            r2Var.b2 = true;
                                            r2Var.c2 = 0.0f;
                                            h6.u1.T(0.0f, true);
                                            h6.u1.start();
                                            r2Var.invalidate();
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
                                W3.l(dialog.id, z10 ? 2 : 3, null, new w31(cyVar, dialog, i11, 2));
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

    public /* synthetic */ y(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ y(sn snVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = snVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
