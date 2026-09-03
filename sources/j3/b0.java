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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ey;
import org.telegram.ui.dm;
import org.telegram.ui.lm;
import org.telegram.ui.ln;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(int i10, int i11, String str, String str2) {
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
                f0Var.Z(surface);
                f0Var.Q = surface;
                f0Var.T(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((zn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                dm dmVar = (dm) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                dmVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                lm lmVar = dmVar.a;
                lmVar.N.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == lmVar.N.I6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                ln lnVar = (ln) this.d;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                zn znVar = lnVar.a;
                if (znVar.x1 != null) {
                    s1Var.getLocationInWindow(new int[2]);
                    znVar.x1.setTranslationY(org.telegram.ui.b.C(520.0f, r3[1] - r2.getTop(), this.b));
                    znVar.x1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    znVar.x1.u();
                    break;
                }
                break;
            default:
                final oy oyVar = (oy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                py pyVar = oyVar.g;
                qy qyVar = oyVar.h;
                ArrayList arrayList = qyVar.O1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    qyVar.T0 = null;
                    pyVar.a.invalidate();
                    int N0 = pyVar.c.N0();
                    if (N0 == this.b - 1) {
                        pyVar.c.m(N0).requestLayout();
                    }
                    if (!qyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = qyVar.getMessagesController().addDialogToFolder(dialog.id, qyVar.S2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            pyVar.x.D();
                            pyVar.q(true);
                        }
                        if (qyVar.S2 == 0) {
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
                                        qyVar.b2 = true;
                                        pyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                qyVar.O1.add(0, (TLRPC.Dialog) qyVar.R3(i10, pyVar.s, qyVar.S2, false).get(0));
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
                                f2.l1 K = pyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof org.telegram.ui.Cells.q2) {
                                        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                                        if (q2Var.X1.n == 2) {
                                            q2Var.Y1 = true;
                                            q2Var.Z1 = 0.0f;
                                            j6.u1.Q(0.0f, true);
                                            j6.u1.start();
                                            q2Var.invalidate();
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
                            boolean z4 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                            if (!z4) {
                                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                            }
                            UndoView Y3 = qyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z4 ? 2 : 3, null, new ey(oyVar, dialog, i11, 24));
                            }
                        }
                        if (qyVar.S2 != 0 && qyVar.O1.isEmpty()) {
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

    public /* synthetic */ b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ b0(zn znVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = znVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
