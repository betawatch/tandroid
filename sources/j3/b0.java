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
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ey;
import org.telegram.ui.bm;
import org.telegram.ui.jm;
import org.telegram.ui.jn;
import org.telegram.ui.my;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                    xnVar.x1.n(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    xnVar.x1.v();
                    break;
                }
                break;
            default:
                final my myVar = (my) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ny nyVar = myVar.g;
                oy oyVar = myVar.h;
                ArrayList arrayList = oyVar.O1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    oyVar.T0 = null;
                    nyVar.a.invalidate();
                    int N0 = nyVar.c.N0();
                    if (N0 == this.b - 1) {
                        nyVar.c.m(N0).requestLayout();
                    }
                    if (!oyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = oyVar.getMessagesController().addDialogToFolder(dialog.id, oyVar.S2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            nyVar.x.D();
                            nyVar.q(true);
                        }
                        if (oyVar.S2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                nyVar.x.D();
                                if (i12 == 0) {
                                    oyVar.A4(true, true);
                                    nyVar.q(true);
                                    oyVar.o3();
                                } else {
                                    nyVar.q(true);
                                    if (!SharedConfig.archiveHidden && nyVar.c.L0() == 0) {
                                        oyVar.b2 = true;
                                        nyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                oyVar.O1.add(0, (TLRPC.Dialog) oyVar.R3(i10, nyVar.s, oyVar.S2, false).get(0));
                                nyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ly
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                myVar.h.A4(false, true);
                                                break;
                                            default:
                                                myVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                f2.l1 K = nyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof r2) {
                                        r2 r2Var = (r2) view;
                                        if (r2Var.X1.n == 2) {
                                            r2Var.Y1 = true;
                                            r2Var.Z1 = 0.0f;
                                            j6.u1.Q(0.0f, true);
                                            j6.u1.start();
                                            r2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ly
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                myVar.h.A4(false, true);
                                                break;
                                            default:
                                                myVar.h.A4(false, true);
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
                            UndoView Y3 = oyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z4 ? 2 : 3, null, new ey(myVar, dialog, i11, 24));
                            }
                        }
                        if (oyVar.S2 != 0 && oyVar.O1.isEmpty()) {
                            nyVar.a.setEmptyView(null);
                            nyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        oyVar.getMessagesController().hidePromoDialog();
                        nyVar.x.D();
                        nyVar.q(true);
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
