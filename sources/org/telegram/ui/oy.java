package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oy extends f2.b0 {
    public f2.l1 d;
    public boolean e;
    public boolean f;
    public final py g;
    public final /* synthetic */ qy h;

    public oy(qy qyVar, py pyVar) {
        this.h = qyVar;
        this.g = pyVar;
    }

    @Override // f2.b0
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // f2.b0
    public final long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        qy qyVar;
        org.telegram.ui.Cells.q2 q2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (q2Var = (qyVar = this.h).U0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, q2Var), this.g.x.e);
            qyVar.U0 = null;
        }
        return super.d(recyclerView, i10, f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e5, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r14) != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) != 5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).y() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r14) == 4) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    @Override // f2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        boolean z4;
        int i11;
        TLRPC.Dialog dialog;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.e5 e5Var2;
        py pyVar = this.g;
        if (!pyVar.x.k()) {
            qy qyVar = this.h;
            e5Var = ((org.telegram.ui.ActionBar.p2) qyVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) qyVar).parentLayout;
            }
            if (!qyVar.C3.c() && qyVar.U2 == 0) {
                if (this.e && this.f) {
                    View view = l1Var.a;
                    if (view instanceof org.telegram.ui.Cells.q2) {
                        ((org.telegram.ui.Cells.q2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!qyVar.i2 && pyVar.p() && qyVar.T0 == null) {
                    View view2 = l1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.q2) {
                        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view2;
                        long dialogId = q2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (qyVar.V0 && dialog2 != null && qyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.q2 q2Var2 = (org.telegram.ui.Cells.q2) l1Var.a;
                                qyVar.U0 = q2Var2;
                                q2Var2.setBackgroundColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                this.f = false;
                                return f2.b0.l(3, 0);
                            }
                        } else {
                            int i19 = qyVar.O0;
                            try {
                                i19 = pyVar.d.h;
                            } catch (Exception unused) {
                            }
                            pw pwVar = qyVar.w0;
                            if (pwVar != null && pwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            }
                            if (qyVar.Z0) {
                                if (dialogId == qyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                }
                                if (!qyVar.getMessagesController().isPromoDialog(dialogId, false) || qyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (qyVar.S2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!qyVar.C3.c()) {
                                            z4 = true;
                                            i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = qyVar.b0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = qyVar.getMessagesController().selectedDialogFilter[qyVar.b0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z4 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z4 || DialogObject.isFolderDialogId(q2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(q2Var.getDialogId()));
                                            q2Var.setSliding(true);
                                            return f2.b0.l(0, 4);
                                        }
                                    }
                                    z4 = false;
                                    i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z4 || DialogObject.isFolderDialogId(q2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(q2Var.getDialogId()));
                                    q2Var.setSliding(true);
                                    return f2.b0.l(0, 4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // f2.b0
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // f2.b0
    public final float g() {
        return 0.45f;
    }

    @Override // f2.b0
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int i10;
        qy qyVar = this.h;
        ArrayList arrayList = qyVar.X0;
        View view = l1Var2.a;
        if (view instanceof org.telegram.ui.Cells.q2) {
            long dialogId = ((org.telegram.ui.Cells.q2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && qyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = l1Var.b();
                int b11 = l1Var2.b();
                py pyVar = this.g;
                if (pyVar.a.getItemAnimator() == null) {
                    pyVar.a.setItemAnimator(pyVar.x);
                }
                yw ywVar = pyVar.d;
                qy qyVar2 = ywVar.O;
                int i11 = ywVar.C;
                ArrayList R3 = qyVar2.R3(i11, ywVar.h, ywVar.r, false);
                int G = ywVar.G(b10);
                int G2 = ywVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = ywVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[ywVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                ywVar.W(null);
                int i15 = qyVar.b0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        qyVar.W0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = qyVar.getMessagesController().selectedDialogFilter[qyVar.b0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        if (l1Var != null) {
            this.g.a.c1(false);
        }
        this.d = l1Var;
        if (l1Var != null) {
            View view = l1Var.a;
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).w = false;
            }
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
        int i10;
        qy qyVar = this.h;
        if (l1Var == null) {
            qyVar.T0 = null;
            return;
        }
        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) l1Var.a;
        long dialogId = q2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        py pyVar = this.g;
        if (isFolderDialogId) {
            my myVar = pyVar.a;
            int i11 = my.s3;
            myVar.y1(false, q2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!qyVar.getMessagesController().isPromoDialog(dialogId, false) && qyVar.S2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                qyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                qyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(qyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            qyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        qyVar.T0 = q2Var;
        j3.b0 b0Var = new j3.b0(this, dialog, pyVar.d.h(), l1Var.b(), 5);
        qyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            b0Var.run();
            return;
        }
        if (qyVar.S0 == null) {
            my myVar2 = pyVar.a;
            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0();
            dd0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            dd0Var.b = paint;
            dd0Var.e = 0L;
            dd0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            dd0Var.c = myVar2;
            qyVar.S0 = dd0Var;
        }
        org.telegram.ui.Components.dd0 dd0Var2 = qyVar.S0;
        dd0Var2.d = b0Var;
        dd0Var2.h = 0.0f;
        dd0Var2.g = 0.0f;
        dd0Var2.e = System.currentTimeMillis();
        dd0Var2.c.invalidate();
    }
}
