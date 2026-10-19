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
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.x31;
import org.telegram.ui.ay;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.dm;
import org.telegram.ui.qn;
import org.telegram.ui.ul;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(int i10, int i11, String str, String str2) {
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
                c0 c0Var = (c0) this.d;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.e;
                i0 i0Var = c0Var.a;
                Surface surface = new Surface(surfaceTexture);
                i0Var.x1(surface);
                i0Var.U = surface;
                i0Var.q1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((qn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                ul ulVar = (ul) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                ulVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                dm dmVar = ulVar.a;
                dmVar.Q.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == dmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                cn cnVar = (cn) this.d;
                u1 u1Var = (u1) this.e;
                qn qnVar = cnVar.a;
                if (qnVar.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    qnVar.A1.setTranslationY(kk.D(520.0f, r3[1] - r2.getTop(), this.b));
                    qnVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    qnVar.A1.u();
                    break;
                }
                break;
            default:
                final zx zxVar = (zx) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ay ayVar = zxVar.g;
                cy cyVar = zxVar.h;
                ArrayList arrayList = cyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    cyVar.W0 = null;
                    ayVar.a.invalidate();
                    int N0 = ayVar.c.N0();
                    if (N0 == this.b - 1) {
                        ayVar.c.m(N0).requestLayout();
                    }
                    if (!cyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = cyVar.getMessagesController().addDialogToFolder(dialog.id, cyVar.W2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            ayVar.x.D();
                            ayVar.q(true);
                        }
                        if (cyVar.W2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                ayVar.x.D();
                                if (i12 == 0) {
                                    cyVar.y4(true, true);
                                    ayVar.q(true);
                                    cyVar.m3();
                                } else {
                                    ayVar.q(true);
                                    if (!SharedConfig.archiveHidden && ayVar.c.L0() == 0) {
                                        cyVar.e2 = true;
                                        ayVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((n2) cyVar).currentAccount;
                                cyVar.R1.add(0, (TLRPC.Dialog) cyVar.P3(i10, ayVar.s, cyVar.W2, false).get(0));
                                ayVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                zxVar.h.y4(false, true);
                                                break;
                                            default:
                                                zxVar.h.y4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.b1 K = ayVar.a.K(0);
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
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                zxVar.h.y4(false, true);
                                                break;
                                            default:
                                                zxVar.h.y4(false, true);
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
                            UndoView W3 = cyVar.W3();
                            if (W3 != null) {
                                W3.l(dialog.id, z10 ? 2 : 3, null, new x31(zxVar, dialog, i11, 2));
                            }
                        }
                        if (cyVar.W2 != 0 && cyVar.R1.isEmpty()) {
                            ayVar.a.setEmptyView(null);
                            ayVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        cyVar.getMessagesController().hidePromoDialog();
                        ayVar.x.D();
                        ayVar.q(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ a0(qn qnVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = qnVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
