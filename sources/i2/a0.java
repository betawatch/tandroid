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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.xm;
import org.telegram.ui.am;
import org.telegram.ui.in;
import org.telegram.ui.jm;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ((wn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                am amVar = (am) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                amVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                jm jmVar = amVar.a;
                jmVar.Q.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == jmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                in inVar = (in) this.d;
                u1 u1Var = (u1) this.e;
                wn wnVar = inVar.a;
                if (wnVar.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    wnVar.A1.setTranslationY(ok.D(520.0f, r3[1] - r2.getTop(), this.b));
                    wnVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    wnVar.A1.u();
                    break;
                }
                break;
            default:
                final oy oyVar = (oy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                py pyVar = oyVar.g;
                qy qyVar = oyVar.h;
                ArrayList arrayList = qyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    qyVar.W0 = null;
                    pyVar.a.invalidate();
                    int N0 = pyVar.c.N0();
                    if (N0 == this.b - 1) {
                        pyVar.c.m(N0).requestLayout();
                    }
                    if (!qyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = qyVar.getMessagesController().addDialogToFolder(dialog.id, qyVar.V2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            pyVar.x.D();
                            pyVar.q(true);
                        }
                        if (qyVar.V2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                pyVar.x.D();
                                if (i12 == 0) {
                                    qyVar.A4(true, true);
                                    pyVar.q(true);
                                    qyVar.o3();
                                } else {
                                    pyVar.q(true);
                                    if (!SharedConfig.archiveHidden && pyVar.c.L0() == 0) {
                                        qyVar.e2 = true;
                                        pyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((m2) qyVar).currentAccount;
                                qyVar.R1.add(0, (TLRPC.Dialog) qyVar.R3(i10, pyVar.s, qyVar.V2, false).get(0));
                                pyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ny
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                oyVar.h.A4(false, true);
                                                break;
                                            default:
                                                oyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.c1 K = pyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof s2) {
                                        s2 s2Var = (s2) view;
                                        if (s2Var.a2.n == 2) {
                                            s2Var.b2 = true;
                                            s2Var.c2 = 0.0f;
                                            h6.u1.T(0.0f, true);
                                            h6.u1.start();
                                            s2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ny
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                oyVar.h.A4(false, true);
                                                break;
                                            default:
                                                oyVar.h.A4(false, true);
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
                            UndoView Y3 = qyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new xm(oyVar, dialog, i11, 26));
                            }
                        }
                        if (qyVar.V2 != 0 && qyVar.R1.isEmpty()) {
                            pyVar.a.setEmptyView(null);
                            pyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        qyVar.getMessagesController().hidePromoDialog();
                        pyVar.x.D();
                        pyVar.q(true);
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

    public /* synthetic */ a0(wn wnVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = wnVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
