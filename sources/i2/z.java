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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.im;
import org.telegram.ui.qn;
import org.telegram.ui.rm;
import org.telegram.ui.wy;
import org.telegram.ui.xy;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                ((fo) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                im imVar = (im) this.d;
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.e;
                imVar.getClass();
                MessageObject messageObject = x0Var.getMessageObject();
                rm rmVar = imVar.a;
                rmVar.Q.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == rmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                qn qnVar = (qn) this.d;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.e;
                fo foVar = qnVar.a;
                if (foVar.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    foVar.A1.setTranslationY(org.telegram.ui.Cells.d0.b(520.0f, r3[1] - r2.getTop(), this.b));
                    foVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    foVar.A1.u();
                    break;
                }
                break;
            default:
                final wy wyVar = (wy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                xy xyVar = wyVar.g;
                yy yyVar = wyVar.h;
                ArrayList arrayList = yyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    yyVar.W0 = null;
                    xyVar.a.invalidate();
                    int N0 = xyVar.c.N0();
                    if (N0 == this.b - 1) {
                        xyVar.c.m(N0).requestLayout();
                    }
                    if (!yyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = yyVar.getMessagesController().addDialogToFolder(dialog.id, yyVar.V2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            xyVar.x.D();
                            xyVar.q(true);
                        }
                        if (yyVar.V2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                xyVar.x.D();
                                if (i12 == 0) {
                                    yyVar.x4(true, true);
                                    xyVar.q(true);
                                    yyVar.l3();
                                } else {
                                    xyVar.q(true);
                                    if (!SharedConfig.archiveHidden && xyVar.c.L0() == 0) {
                                        yyVar.e2 = true;
                                        xyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((m2) yyVar).currentAccount;
                                yyVar.R1.add(0, (TLRPC.Dialog) yyVar.O3(i10, xyVar.s, yyVar.V2, false).get(0));
                                xyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                wyVar.h.x4(false, true);
                                                break;
                                            default:
                                                wyVar.h.x4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.b1 K = xyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof s2) {
                                        s2 s2Var = (s2) view;
                                        if (s2Var.a2.n == 2) {
                                            s2Var.b2 = true;
                                            s2Var.c2 = 0.0f;
                                            g6.u1.T(0.0f, true);
                                            g6.u1.start();
                                            s2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                wyVar.h.x4(false, true);
                                                break;
                                            default:
                                                wyVar.h.x4(false, true);
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
                            UndoView V3 = yyVar.V3();
                            if (V3 != null) {
                                V3.l(dialog.id, z10 ? 2 : 3, null, new gm(wyVar, dialog, i11, 28));
                            }
                        }
                        if (yyVar.V2 != 0 && yyVar.R1.isEmpty()) {
                            xyVar.a.setEmptyView(null);
                            xyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        yyVar.getMessagesController().hidePromoDialog();
                        xyVar.x.D();
                        xyVar.q(true);
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

    public /* synthetic */ z(fo foVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = foVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
