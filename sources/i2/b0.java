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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.d3;
import org.telegram.ui.fm;
import org.telegram.ui.fn;
import org.telegram.ui.un;
import org.telegram.ui.wl;
import org.telegram.ui.yx;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                d0 d0Var = (d0) this.d;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.e;
                j0 j0Var = d0Var.a;
                Surface surface = new Surface(surfaceTexture);
                j0Var.x1(surface);
                j0Var.U = surface;
                j0Var.q1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((un) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                wl wlVar = (wl) this.d;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.e;
                wlVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                fm fmVar = wlVar.a;
                fmVar.Q.gb(this.b, messageObject.getId(), true, messageObject.getDialogId() == fmVar.Q.X6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                fn fnVar = (fn) this.d;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.e;
                un unVar = fnVar.a;
                if (unVar.M1 != null) {
                    s1Var.getLocationInWindow(new int[2]);
                    unVar.M1.setTranslationY(d3.w(520.0f, r3[1] - r2.getTop(), this.b));
                    unVar.M1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    unVar.M1.u();
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
                                    cyVar.I4(true, true);
                                    ayVar.q(true);
                                    cyVar.w3();
                                } else {
                                    ayVar.q(true);
                                    if (!SharedConfig.archiveHidden && ayVar.c.L0() == 0) {
                                        cyVar.e2 = true;
                                        ayVar.a.w0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((r2) cyVar).currentAccount;
                                cyVar.R1.add(0, (TLRPC.Dialog) cyVar.Z3(i10, ayVar.s, cyVar.W2, false).get(0));
                                ayVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                zxVar.h.I4(false, true);
                                                break;
                                            default:
                                                zxVar.h.I4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.e1 K = ayVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof p2) {
                                        p2 p2Var = (p2) view;
                                        if (p2Var.a2.n == 2) {
                                            p2Var.b2 = true;
                                            p2Var.c2 = 0.0f;
                                            y6.u1.T(0.0f, true);
                                            y6.u1.start();
                                            p2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                zxVar.h.I4(false, true);
                                                break;
                                            default:
                                                zxVar.h.I4(false, true);
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
                            UndoView g42 = cyVar.g4();
                            if (g42 != null) {
                                g42.l(dialog.id, z10 ? 2 : 3, null, new yx(zxVar, dialog, i11, 0));
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

    public /* synthetic */ b0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ b0(un unVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = unVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
