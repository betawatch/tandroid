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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.zk;
import org.telegram.ui.dm;
import org.telegram.ui.ln;
import org.telegram.ui.mm;
import org.telegram.ui.ry;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                f0Var.v1(surface);
                f0Var.S = surface;
                f0Var.o1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((zn) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                dm dmVar = (dm) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                dmVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                mm mmVar = dmVar.a;
                mmVar.Q.bb(this.b, messageObject.getId(), true, messageObject.getDialogId() == mmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                ln lnVar = (ln) this.d;
                u1 u1Var = (u1) this.e;
                zn znVar = lnVar.a;
                if (znVar.A1 != null) {
                    u1Var.getLocationInWindow(new int[2]);
                    znVar.A1.setTranslationY(bi.D(520.0f, r3[1] - r2.getTop(), this.b));
                    znVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    znVar.A1.u();
                    break;
                }
                break;
            default:
                final ry ryVar = (ry) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                sy syVar = ryVar.g;
                ty tyVar = ryVar.h;
                ArrayList arrayList = tyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    tyVar.W0 = null;
                    syVar.a.invalidate();
                    int N0 = syVar.c.N0();
                    if (N0 == this.b - 1) {
                        syVar.c.m(N0).requestLayout();
                    }
                    if (!tyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = tyVar.getMessagesController().addDialogToFolder(dialog.id, tyVar.V2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            syVar.x.D();
                            syVar.q(true);
                        }
                        if (tyVar.V2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                syVar.x.D();
                                if (i12 == 0) {
                                    tyVar.x4(true, true);
                                    syVar.q(true);
                                    tyVar.l3();
                                } else {
                                    syVar.q(true);
                                    if (!SharedConfig.archiveHidden && syVar.c.L0() == 0) {
                                        tyVar.e2 = true;
                                        syVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((n2) tyVar).currentAccount;
                                tyVar.R1.add(0, (TLRPC.Dialog) tyVar.O3(i10, syVar.s, tyVar.V2, false).get(0));
                                syVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                ryVar.h.x4(false, true);
                                                break;
                                            default:
                                                ryVar.h.x4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.d1 K = syVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof s2) {
                                        s2 s2Var = (s2) view;
                                        if (s2Var.a2.n == 2) {
                                            s2Var.b2 = true;
                                            s2Var.c2 = 0.0f;
                                            i6.u1.T(0.0f, true);
                                            i6.u1.start();
                                            s2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ryVar.h.x4(false, true);
                                                break;
                                            default:
                                                ryVar.h.x4(false, true);
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
                            UndoView V3 = tyVar.V3();
                            if (V3 != null) {
                                V3.l(dialog.id, z10 ? 2 : 3, null, new zk(ryVar, dialog, i11, 27));
                            }
                        }
                        if (tyVar.V2 != 0 && tyVar.R1.isEmpty()) {
                            syVar.a.setEmptyView(null);
                            syVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        tyVar.getMessagesController().hidePromoDialog();
                        syVar.x.D();
                        syVar.q(true);
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

    public /* synthetic */ a0(zn znVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = znVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
