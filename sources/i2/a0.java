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
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.xm;
import org.telegram.ui.bm;
import org.telegram.ui.jn;
import org.telegram.ui.km;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.ry;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                f0 f0Var = c0Var.a;
                Surface surface = new Surface(surfaceTexture);
                f0Var.t1(surface);
                f0Var.S = surface;
                f0Var.m1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((xn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                bm bmVar = (bm) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                bmVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                km kmVar = bmVar.a;
                kmVar.Q.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == kmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                jn jnVar = (jn) this.d;
                t1 t1Var = (t1) this.e;
                xn xnVar = jnVar.a;
                if (xnVar.A1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    xnVar.A1.setTranslationY(ul.D(520.0f, r3[1] - r2.getTop(), this.b));
                    xnVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    xnVar.A1.u();
                    break;
                }
                break;
            default:
                final py pyVar = (py) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                qy qyVar = pyVar.g;
                ry ryVar = pyVar.h;
                ArrayList arrayList = ryVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    ryVar.W0 = null;
                    qyVar.a.invalidate();
                    int N0 = qyVar.c.N0();
                    if (N0 == this.b - 1) {
                        qyVar.c.m(N0).requestLayout();
                    }
                    if (!ryVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = ryVar.getMessagesController().addDialogToFolder(dialog.id, ryVar.V2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            qyVar.x.D();
                            qyVar.q(true);
                        }
                        if (ryVar.V2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                qyVar.x.D();
                                if (i12 == 0) {
                                    ryVar.A4(true, true);
                                    qyVar.q(true);
                                    ryVar.o3();
                                } else {
                                    qyVar.q(true);
                                    if (!SharedConfig.archiveHidden && qyVar.c.L0() == 0) {
                                        ryVar.e2 = true;
                                        qyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((n2) ryVar).currentAccount;
                                ryVar.R1.add(0, (TLRPC.Dialog) ryVar.R3(i10, qyVar.s, ryVar.V2, false).get(0));
                                qyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                pyVar.h.A4(false, true);
                                                break;
                                            default:
                                                pyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.c1 K = qyVar.a.K(0);
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
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                pyVar.h.A4(false, true);
                                                break;
                                            default:
                                                pyVar.h.A4(false, true);
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
                            UndoView Y3 = ryVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new xm(pyVar, dialog, i11, 26));
                            }
                        }
                        if (ryVar.V2 != 0 && ryVar.R1.isEmpty()) {
                            qyVar.a.setEmptyView(null);
                            qyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        ryVar.getMessagesController().hidePromoDialog();
                        qyVar.x.D();
                        qyVar.q(true);
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

    public /* synthetic */ a0(xn xnVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = xnVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
