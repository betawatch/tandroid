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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ey extends f2.c0 {
    public f2.o1 d;
    public boolean e;
    public boolean f;
    public final fy g;
    public final /* synthetic */ gy h;

    public ey(gy gyVar, fy fyVar) {
        this.h = gyVar;
        this.g = fyVar;
    }

    @Override // f2.c0
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // f2.c0
    public final long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        gy gyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (gyVar = this.h).T0) != null) {
            AndroidUtilities.runOnUIThread(new zg(1, p2Var), this.g.x.e);
            gyVar.T0 = null;
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
    @Override // f2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Dialog dialog;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.b5 b5Var2;
        fy fyVar = this.g;
        if (!fyVar.x.k()) {
            gy gyVar = this.h;
            b5Var = ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout;
            }
            if (!gyVar.B3.c() && gyVar.T2 == 0) {
                if (this.e && this.f) {
                    View view = o1Var.a;
                    if (view instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!gyVar.h2 && fyVar.p() && gyVar.S0 == null) {
                    View view2 = o1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.p2) {
                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view2;
                        long dialogId = p2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.u(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (gyVar.U0 && dialog2 != null && gyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.p2 p2Var2 = (org.telegram.ui.Cells.p2) o1Var.a;
                                gyVar.T0 = p2Var2;
                                p2Var2.setBackgroundColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                this.f = false;
                                return f2.c0.l(3, 0);
                            }
                        } else {
                            int i19 = gyVar.N0;
                            try {
                                i19 = fyVar.d.h;
                            } catch (Exception unused) {
                            }
                            fw fwVar = gyVar.v0;
                            if (fwVar != null && fwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                            }
                            if (gyVar.Y0) {
                                if (dialogId == gyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                }
                                if (!gyVar.getMessagesController().isPromoDialog(dialogId, false) || gyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (gyVar.R2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!gyVar.B3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = gyVar.a0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = gyVar.getMessagesController().selectedDialogFilter[gyVar.a0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                            p2Var.setSliding(true);
                                            return f2.c0.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                    p2Var.setSliding(true);
                                    return f2.c0.l(0, 4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // f2.c0
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override // f2.c0
    public final float g() {
        return 0.45f;
    }

    @Override // f2.c0
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int i10;
        gy gyVar = this.h;
        ArrayList arrayList = gyVar.W0;
        View view = o1Var2.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && gyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = o1Var.b();
                int b11 = o1Var2.b();
                fy fyVar = this.g;
                if (fyVar.a.getItemAnimator() == null) {
                    fyVar.a.setItemAnimator(fyVar.x);
                }
                ow owVar = fyVar.d;
                gy gyVar2 = owVar.N;
                int i11 = owVar.B;
                ArrayList R3 = gyVar2.R3(i11, owVar.h, owVar.r, false);
                int G = owVar.G(b10);
                int G2 = owVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = owVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[owVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                owVar.W(null);
                int i15 = gyVar.a0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        gyVar.V0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = gyVar.getMessagesController().selectedDialogFilter[gyVar.a0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        if (o1Var != null) {
            this.g.a.d1(false);
        }
        this.d = o1Var;
        if (o1Var != null) {
            View view = o1Var.a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).w = false;
            }
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
        int i10;
        gy gyVar = this.h;
        if (o1Var == null) {
            gyVar.S0 = null;
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) o1Var.a;
        long dialogId = p2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        fy fyVar = this.g;
        if (isFolderDialogId) {
            cy cyVar = fyVar.a;
            int i11 = cy.r3;
            cyVar.z1(false, p2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!gyVar.getMessagesController().isPromoDialog(dialogId, false) && gyVar.R2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                gyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                gyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(gyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            gyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        gyVar.S0 = p2Var;
        h3.f0 f0Var = new h3.f0(this, dialog, fyVar.d.h(), o1Var.b(), 5);
        gyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            f0Var.run();
            return;
        }
        if (gyVar.R0 == null) {
            cy cyVar2 = fyVar.a;
            org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0();
            lc0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            lc0Var.b = paint;
            lc0Var.e = 0L;
            lc0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            lc0Var.c = cyVar2;
            gyVar.R0 = lc0Var;
        }
        org.telegram.ui.Components.lc0 lc0Var2 = gyVar.R0;
        lc0Var2.d = f0Var;
        lc0Var2.h = 0.0f;
        lc0Var2.g = 0.0f;
        lc0Var2.e = System.currentTimeMillis();
        lc0Var2.c.invalidate();
    }
}
