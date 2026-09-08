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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.co;
import org.telegram.ui.dm;
import org.telegram.ui.fm;
import org.telegram.ui.om;
import org.telegram.ui.on;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                ((co) this.d).didReceivedNotification(this.b, this.c, (Object[]) this.e);
                break;
            case 3:
                fm fmVar = (fm) this.d;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.e;
                fmVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                om omVar = fmVar.a;
                omVar.Q.Xa(this.b, messageObject.getId(), true, messageObject.getDialogId() == omVar.Q.L6 ? 1 : 0, true, 0, Integer.valueOf(this.c), null, null);
                break;
            case 4:
                on onVar = (on) this.d;
                t1 t1Var = (t1) this.e;
                co coVar = onVar.a;
                if (coVar.A1 != null) {
                    t1Var.getLocationInWindow(new int[2]);
                    coVar.A1.setTranslationY(wl.D(520.0f, r3[1] - r2.getTop(), this.b));
                    coVar.A1.m(0.0f, (-AndroidUtilities.dp(16.0f)) + r3[0] + this.c);
                    coVar.A1.u();
                    break;
                }
                break;
            default:
                final sy syVar = (sy) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                ty tyVar = syVar.g;
                uy uyVar = syVar.h;
                ArrayList arrayList = uyVar.R1;
                if (arrayList != null) {
                    arrayList.remove(dialog);
                    int i11 = dialog.pinnedNum;
                    uyVar.W0 = null;
                    tyVar.a.invalidate();
                    int N0 = tyVar.c.N0();
                    if (N0 == this.b - 1) {
                        tyVar.c.m(N0).requestLayout();
                    }
                    if (!uyVar.getMessagesController().isPromoDialog(dialog.id, false)) {
                        int addDialogToFolder = uyVar.getMessagesController().addDialogToFolder(dialog.id, uyVar.V2 == 0 ? 1 : 0, -1, 0L);
                        int i12 = this.c;
                        if (addDialogToFolder != 2 || i12 != 0) {
                            tyVar.x.D();
                            tyVar.q(true);
                        }
                        if (uyVar.V2 == 0) {
                            if (addDialogToFolder == 2) {
                                if (SharedConfig.archiveHidden) {
                                    SharedConfig.toggleArchiveHidden();
                                }
                                tyVar.x.D();
                                if (i12 == 0) {
                                    uyVar.A4(true, true);
                                    tyVar.q(true);
                                    uyVar.o3();
                                } else {
                                    tyVar.q(true);
                                    if (!SharedConfig.archiveHidden && tyVar.c.L0() == 0) {
                                        uyVar.e2 = true;
                                        tyVar.a.v0(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f), null);
                                    }
                                }
                                i10 = ((n2) uyVar).currentAccount;
                                uyVar.R1.add(0, (TLRPC.Dialog) uyVar.R3(i10, tyVar.s, uyVar.V2, false).get(0));
                                tyVar.q(true);
                                final int i13 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ry
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                syVar.h.A4(false, true);
                                                break;
                                            default:
                                                syVar.h.A4(false, true);
                                                break;
                                        }
                                    }
                                }, 300L);
                            } else if (addDialogToFolder == 1) {
                                s4.c1 K = tyVar.a.K(0);
                                if (K != null) {
                                    View view = K.a;
                                    if (view instanceof r2) {
                                        r2 r2Var = (r2) view;
                                        if (r2Var.a2.n == 2) {
                                            r2Var.b2 = true;
                                            r2Var.c2 = 0.0f;
                                            j6.u1.Q(0.0f, true);
                                            j6.u1.start();
                                            r2Var.invalidate();
                                        }
                                    }
                                }
                                final int i14 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ry
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                syVar.h.A4(false, true);
                                                break;
                                            default:
                                                syVar.h.A4(false, true);
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
                            UndoView Y3 = uyVar.Y3();
                            if (Y3 != null) {
                                Y3.l(dialog.id, z10 ? 2 : 3, null, new dm(syVar, dialog, i11, 27));
                            }
                        }
                        if (uyVar.V2 != 0 && uyVar.R1.isEmpty()) {
                            tyVar.a.setEmptyView(null);
                            tyVar.w.setVisibility(4);
                            break;
                        }
                    } else {
                        uyVar.getMessagesController().hidePromoDialog();
                        tyVar.x.D();
                        tyVar.q(true);
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

    public /* synthetic */ a0(co coVar, int i10, int i11, Object[] objArr) {
        this.a = 2;
        this.d = coVar;
        this.b = i10;
        this.c = i11;
        this.e = objArr;
    }
}
