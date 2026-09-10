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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.my;
import org.telegram.ui.eo;
import org.telegram.ui.gm;
import org.telegram.ui.pm;
import org.telegram.ui.pn;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                e0 e0Var = b0Var.a;
                Surface surface = new Surface(surfaceTexture);
                e0Var.t1(surface);
                e0Var.S = surface;
                e0Var.m1(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(this.b, (String) this.d, (String) this.e, this.c);
                break;
            case 2:
                ((eo) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                gm gmVar = (gm) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                gmVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                pm pmVar = gmVar.a;
                pmVar.Q.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == pmVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                pn pnVar = (pn) this.d;
                t1 t1Var = (t1) this.e;
                eo eoVar = pnVar.a;
                if (eoVar.A1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    eoVar.A1.setTranslationY(em.D(520.0f, r3[1] - r2.getTop(), this.b));
                    eoVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    eoVar.A1.u();
                    break;
                }
                break;
            default:
                final uy uyVar = (uy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                vy vyVar = uyVar.g;
                wy wyVar = uyVar.h;
                ArrayList arrayList = wyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    wyVar.W0 = null;
                    vyVar.a.invalidate();
                    int N0 = vyVar.c.N0();
                    if (N0 == this.b - 1) {
                        vyVar.c.m(N0).requestLayout();
                    }
                    if (!wyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = wyVar.getMessagesController().addDialogToFolder(dialog.id, wyVar.V2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            vyVar.x.D();
                            vyVar.q(true);
                        }
                        if (wyVar.V2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                vyVar.x.D();
                                if (i12 == 0) {
                                    wyVar.A4(true, true);
                                    vyVar.q(true);
                                    wyVar.o3();
                                } else {
                                    vyVar.q(true);
                                    if (!SharedConfig.archiveHidden && vyVar.c.L0() == 0) {
                                        wyVar.e2 = true;
                                        vyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((p2) wyVar).currentAccount;
                                wyVar.R1.add(0, (TLRPC.Dialog) wyVar.R3(i10, vyVar.s, wyVar.V2, false).get(0));
                                vyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ty
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                uyVar.h.A4(false, true);
                                                break;
                                            default:
                                                uyVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.c1 K = vyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof r2) {
                                        r2 r2Var = (r2) view;
                                        if (r2Var.a2.n == 2) {
                                            r2Var.b2 = true;
                                            r2Var.c2 = 0.0f;
                                            j6.u1.S(0.0f, true);
                                            j6.u1.start();
                                            r2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ty
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                uyVar.h.A4(false, true);
                                                break;
                                            default:
                                                uyVar.h.A4(false, true);
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
                            UndoView Y3 = wyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new my(uyVar, dialog, i11, 24));
                            }
                        }
                        if (wyVar.V2 != 0 && wyVar.R1.isEmpty()) {
                            vyVar.a.setEmptyView(null);
                            vyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        wyVar.getMessagesController().hidePromoDialog();
                        vyVar.x.D();
                        vyVar.q(true);
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

    public /* synthetic */ z(eo eoVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = eoVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
