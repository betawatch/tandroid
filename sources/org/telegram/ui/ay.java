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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ay extends f2.d0 {
    public f2.q1 d;
    public boolean e;
    public boolean f;
    public final cy g;
    public final /* synthetic */ dy h;

    public ay(dy dyVar, cy cyVar) {
        this.h = dyVar;
        this.g = cyVar;
    }

    @Override // f2.d0
    public final int b(int i9, int i10) {
        if (this.f) {
            return 0;
        }
        return super.b(i9, i10);
    }

    @Override // f2.d0
    public final long d(RecyclerView recyclerView, int i9, float f10, float f11) {
        dy dyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i9 == 4) {
            return 200L;
        }
        if (i9 == 8 && (r2Var = (dyVar = this.h).T0) != null) {
            AndroidUtilities.runOnUIThread(new xg(1, r2Var), this.g.x.e);
            dyVar.T0 = null;
        }
        return super.d(recyclerView, i9, f10, f11);
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
    @Override // f2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        boolean z10;
        int i10;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.b5 b5Var2;
        cy cyVar = this.g;
        if (!cyVar.x.k()) {
            dy dyVar = this.h;
            b5Var = ((org.telegram.ui.ActionBar.o2) dyVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) dyVar).parentLayout;
            }
            if (!dyVar.B3.c() && dyVar.T2 == 0) {
                if (this.e && this.f) {
                    View view = q1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!dyVar.h2 && cyVar.p() && dyVar.S0 == null) {
                    View view2 = q1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (dyVar.U0 && dialog2 != null && dyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) q1Var.a;
                                dyVar.T0 = r2Var2;
                                r2Var2.setBackgroundColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                                this.f = false;
                                return f2.d0.l(3, 0);
                            }
                        } else {
                            int i18 = dyVar.N0;
                            try {
                                i18 = cyVar.d.h;
                            } catch (Exception unused) {
                            }
                            cw cwVar = dyVar.v0;
                            if (cwVar != null && cwVar.getVisibility() == 0) {
                                i17 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                            }
                            if (dyVar.Y0) {
                                if (dialogId == dyVar.getUserConfig().clientUserId || dialogId == 777000 || i18 == 7 || i18 == 8) {
                                    i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                }
                                if (!dyVar.getMessagesController().isPromoDialog(dialogId, false) || dyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (dyVar.R2 == 0) {
                                        i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i12, dialogId)) {
                                            i13 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i13) != 3) {
                                                i14 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i14) != 1) {
                                                    i15 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i15) != 0) {
                                                        i16 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!dyVar.B3.c()) {
                                            z10 = true;
                                            i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                                int i19 = dyVar.a0[0].s;
                                                if (i19 == 7 || i19 == 8) {
                                                    dialogFilter = dyVar.getMessagesController().selectedDialogFilter[dyVar.a0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i11, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                            r2Var.setSliding(true);
                                            return f2.d0.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                    r2Var.setSliding(true);
                                    return f2.d0.l(0, 4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // f2.d0
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // f2.d0
    public final float g() {
        return 0.45f;
    }

    @Override // f2.d0
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int i9;
        dy dyVar = this.h;
        ArrayList arrayList = dyVar.W0;
        View view = q1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && dyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = q1Var.b();
                int b11 = q1Var2.b();
                cy cyVar = this.g;
                if (cyVar.a.getItemAnimator() == null) {
                    cyVar.a.setItemAnimator(cyVar.x);
                }
                lw lwVar = cyVar.d;
                dy dyVar2 = lwVar.N;
                int i10 = lwVar.B;
                ArrayList R3 = dyVar2.R3(i10, lwVar.h, lwVar.r, false);
                int G = lwVar.G(b10);
                int G2 = lwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i11 = lwVar.h;
                if (i11 == 7 || i11 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i10).selectedDialogFilter[lwVar.h == 8 ? (char) 1 : (char) 0];
                    int i12 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i12);
                } else {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                }
                Collections.swap(R3, G, G2);
                lwVar.W(null);
                int i14 = dyVar.a0[0].s;
                if (i14 != 7) {
                    i9 = 8;
                    if (i14 != 8) {
                        dyVar.V0 = true;
                        return true;
                    }
                } else {
                    i9 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = dyVar.getMessagesController().selectedDialogFilter[dyVar.a0[0].s == i9 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        if (q1Var != null) {
            this.g.a.d1(false);
        }
        this.d = q1Var;
        if (q1Var != null) {
            View view = q1Var.a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).w = false;
            }
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
        int i9;
        dy dyVar = this.h;
        if (q1Var == null) {
            dyVar.S0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) q1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        cy cyVar = this.g;
        if (isFolderDialogId) {
            yx yxVar = cyVar.a;
            int i10 = yx.r3;
            yxVar.z1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!dyVar.getMessagesController().isPromoDialog(dialogId, false) && dyVar.R2 == 0) {
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i9) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                dyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                dyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(dyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            dyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        dyVar.S0 = r2Var;
        h3.e0 e0Var = new h3.e0(this, dialog, cyVar.d.h(), q1Var.b(), 5);
        dyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            e0Var.run();
            return;
        }
        if (dyVar.R0 == null) {
            yx yxVar2 = cyVar.a;
            org.telegram.ui.Components.hc0 hc0Var = new org.telegram.ui.Components.hc0();
            hc0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            hc0Var.b = paint;
            hc0Var.e = 0L;
            hc0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            hc0Var.c = yxVar2;
            dyVar.R0 = hc0Var;
        }
        org.telegram.ui.Components.hc0 hc0Var2 = dyVar.R0;
        hc0Var2.d = e0Var;
        hc0Var2.h = 0.0f;
        hc0Var2.g = 0.0f;
        hc0Var2.e = System.currentTimeMillis();
        hc0Var2.c.invalidate();
    }
}
