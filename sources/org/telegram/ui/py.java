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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class py extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f;
    public final qy g;
    public final /* synthetic */ ry h;

    public py(ry ryVar, qy qyVar) {
        this.h = ryVar;
        this.g = qyVar;
    }

    @Override // s4.v
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // s4.v
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ry ryVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (ryVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new gh(1, r2Var), this.g.x.e);
            ryVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
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
    @Override // s4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        org.telegram.ui.ActionBar.c5 c5Var;
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
        org.telegram.ui.ActionBar.c5 c5Var2;
        qy qyVar = this.g;
        if (!qyVar.x.k()) {
            ry ryVar = this.h;
            c5Var = ((org.telegram.ui.ActionBar.n2) ryVar).parentLayout;
            if (c5Var != null) {
                c5Var2 = ((org.telegram.ui.ActionBar.n2) ryVar).parentLayout;
            }
            if (!ryVar.F3.c() && ryVar.X2 == 0) {
                if (this.e && this.f) {
                    View view = c1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!ryVar.l2 && qyVar.p() && ryVar.W0 == null) {
                    View view2 = c1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) ryVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (ryVar.Y0 && dialog2 != null && ryVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) c1Var.a;
                                ryVar.X0 = r2Var2;
                                r2Var2.setBackgroundColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                                this.f = false;
                                return s4.v.l(3, 0);
                            }
                        } else {
                            int i19 = ryVar.R0;
                            try {
                                i19 = qyVar.d.h;
                            } catch (Exception unused) {
                            }
                            pw pwVar = ryVar.z0;
                            if (pwVar != null && pwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                            }
                            if (ryVar.c1) {
                                if (dialogId == ryVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                }
                                if (!ryVar.getMessagesController().isPromoDialog(dialogId, false) || ryVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (ryVar.V2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!ryVar.F3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = ryVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = ryVar.getMessagesController().selectedDialogFilter[ryVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) ryVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                            r2Var.setSliding(true);
                                            return s4.v.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                    r2Var.setSliding(true);
                                    return s4.v.l(0, 4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.v
    public final float f(float f7) {
        return 3500.0f;
    }

    @Override // s4.v
    public final float g() {
        return 0.45f;
    }

    @Override // s4.v
    public final float h(float f7) {
        return Float.MAX_VALUE;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10;
        ry ryVar = this.h;
        ArrayList arrayList = ryVar.a1;
        View view = c1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ryVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && ryVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                qy qyVar = this.g;
                if (qyVar.a.getItemAnimator() == null) {
                    qyVar.a.setItemAnimator(qyVar.x);
                }
                yw ywVar = qyVar.d;
                ry ryVar2 = ywVar.R;
                int i11 = ywVar.F;
                ArrayList R3 = ryVar2.R3(i11, ywVar.h, ywVar.r, false);
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
                int i15 = ryVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        ryVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = ryVar.getMessagesController().selectedDialogFilter[ryVar.e0[0].s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        if (c1Var != null) {
            this.g.a.d1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).w = false;
            }
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        int i10;
        ry ryVar = this.h;
        if (c1Var == null) {
            ryVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        qy qyVar = this.g;
        if (isFolderDialogId) {
            ny nyVar = qyVar.a;
            int i11 = ny.v3;
            nyVar.z1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) ryVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!ryVar.getMessagesController().isPromoDialog(dialogId, false) && ryVar.V2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                ryVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                ryVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(ryVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            ryVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        ryVar.W0 = r2Var;
        i2.a0 a0Var = new i2.a0(this, dialog, qyVar.d.h(), c1Var.b(), 5);
        ryVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            a0Var.run();
            return;
        }
        if (ryVar.V0 == null) {
            ny nyVar2 = qyVar.a;
            org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0();
            ad0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            ad0Var.b = paint;
            ad0Var.e = 0L;
            ad0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            ad0Var.c = nyVar2;
            ryVar.V0 = ad0Var;
        }
        org.telegram.ui.Components.ad0 ad0Var2 = ryVar.V0;
        ad0Var2.d = a0Var;
        ad0Var2.h = 0.0f;
        ad0Var2.g = 0.0f;
        ad0Var2.e = System.currentTimeMillis();
        ad0Var2.c.invalidate();
    }
}
