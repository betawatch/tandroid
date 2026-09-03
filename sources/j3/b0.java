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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.gy;
import org.telegram.ui.bm;
import org.telegram.ui.jm;
import org.telegram.ui.jn;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((xn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                bm bmVar = (bm) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                bmVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                jm jmVar = bmVar.a;
                jmVar.N.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == jmVar.N.I6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                jn jnVar = (jn) this.d;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                xn xnVar = jnVar.a;
                if (xnVar.x1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    xnVar.x1.setTranslationY(org.telegram.ui.b.C(520.0f, r3[1] - r2.getTop(), this.b));
                    xnVar.x1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    xnVar.x1.u();
                    break;
                }
                break;
            default:
                final ny nyVar = (ny) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                oy oyVar = nyVar.g;
                py pyVar = nyVar.h;
                ArrayList arrayList = pyVar.O1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    pyVar.T0 = null;
                    oyVar.a.invalidate();
                    int N0 = oyVar.c.N0();
                    if (N0 == this.b - 1) {
                        oyVar.c.m(N0).requestLayout();
                    }
                    if (!pyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = pyVar.getMessagesController().addDialogToFolder(dialog.id, pyVar.S2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            oyVar.x.D();
                            oyVar.q(true);
                        }
                        if (pyVar.S2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                oyVar.x.D();
                                if (i12 == 0) {
                                    pyVar.A4(true, true);
                                    oyVar.q(true);
                                    pyVar.o3();
                                } else {
                                    oyVar.q(true);
                                    if (!SharedConfig.archiveHidden && oyVar.c.L0() == 0) {
                                        pyVar.b2 = true;
                                        oyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                pyVar.O1.add(0, (TLRPC.Dialog) pyVar.R3(i10, oyVar.s, pyVar.S2, false).get(0));
                                oyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.my
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                nyVar.h.A4(false, true);
                                                break;
                                            default:
                                                nyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                f2.m1 K = oyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof r2) {
                                        r2 r2Var = (r2) view;
                                        if (r2Var.X1.n == 2) {
                                            r2Var.Y1 = true;
                                            r2Var.Z1 = 0.0f;
                                            k6.u1.Q(0.0f, true);
                                            k6.u1.start();
                                            r2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.my
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                nyVar.h.A4(false, true);
                                                break;
                                            default:
                                                nyVar.h.A4(false, true);
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
                            UndoView Y3 = pyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z4 ? 2 : 3, null, new gy(nyVar, dialog, i11, 24));
                            }
                        }
                        if (pyVar.S2 != 0 && pyVar.O1.isEmpty()) {
                            oyVar.a.setEmptyView(null);
                            oyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        pyVar.getMessagesController().hidePromoDialog();
                        oyVar.x.D();
                        oyVar.q(true);
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

    public /* synthetic */ b0(xn xnVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = xnVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
