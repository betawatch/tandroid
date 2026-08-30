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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class my extends f2.b0 {
    public f2.l1 d;
    public boolean e;
    public boolean f;
    public final ny g;
    public final /* synthetic */ oy h;

    public my(oy oyVar, ny nyVar) {
        this.h = oyVar;
        this.g = nyVar;
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
        oy oyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (oyVar = this.h).U0) != null) {
            AndroidUtilities.runOnUIThread(new bh(1, r2Var), this.g.x.e);
            oyVar.U0 = null;
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
        ny nyVar = this.g;
        if (!nyVar.x.k()) {
            oy oyVar = this.h;
            e5Var = ((org.telegram.ui.ActionBar.p2) oyVar).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) oyVar).parentLayout;
            }
            if (!oyVar.C3.c() && oyVar.U2 == 0) {
                if (this.e && this.f) {
                    View view = l1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!oyVar.i2 && nyVar.p() && oyVar.T0 == null) {
                    View view2 = l1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (oyVar.V0 && dialog2 != null && oyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) l1Var.a;
                                oyVar.U0 = r2Var2;
                                r2Var2.setBackgroundColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                                this.f = false;
                                return f2.b0.l(3, 0);
                            }
                        } else {
                            int i19 = oyVar.O0;
                            try {
                                i19 = nyVar.d.h;
                            } catch (Exception unused) {
                            }
                            nw nwVar = oyVar.w0;
                            if (nwVar != null && nwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                            }
                            if (oyVar.Z0) {
                                if (dialogId == oyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                }
                                if (!oyVar.getMessagesController().isPromoDialog(dialogId, false) || oyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (oyVar.S2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!oyVar.C3.c()) {
                                            z4 = true;
                                            i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = oyVar.b0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = oyVar.getMessagesController().selectedDialogFilter[oyVar.b0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z4 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z4 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                            r2Var.setSliding(true);
                                            return f2.b0.l(0, 4);
                                        }
                                    }
                                    z4 = false;
                                    i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z4 || DialogObject.isFolderDialogId(r2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(r2Var.getDialogId()));
                                    r2Var.setSliding(true);
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
        oy oyVar = this.h;
        ArrayList arrayList = oyVar.X0;
        View view = l1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && oyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = l1Var.b();
                int b11 = l1Var2.b();
                ny nyVar = this.g;
                if (nyVar.a.getItemAnimator() == null) {
                    nyVar.a.setItemAnimator(nyVar.x);
                }
                ww wwVar = nyVar.d;
                oy oyVar2 = wwVar.O;
                int i11 = wwVar.C;
                ArrayList R3 = oyVar2.R3(i11, wwVar.h, wwVar.r, false);
                int G = wwVar.G(b10);
                int G2 = wwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = wwVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[wwVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                wwVar.W(null);
                int i15 = oyVar.b0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        oyVar.W0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = oyVar.getMessagesController().selectedDialogFilter[oyVar.b0[0].s == i10 ? (char) 1 : (char) 0];
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
            this.g.a.d1(false);
        }
        this.d = l1Var;
        if (l1Var != null) {
            View view = l1Var.a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).w = false;
            }
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
        int i10;
        oy oyVar = this.h;
        if (l1Var == null) {
            oyVar.T0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) l1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        ny nyVar = this.g;
        if (isFolderDialogId) {
            ky kyVar = nyVar.a;
            int i11 = ky.s3;
            kyVar.z1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!oyVar.getMessagesController().isPromoDialog(dialogId, false) && oyVar.S2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                oyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                oyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(oyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            oyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        oyVar.T0 = r2Var;
        j3.b0 b0Var = new j3.b0(this, dialog, nyVar.d.h(), l1Var.b(), 5);
        oyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            b0Var.run();
            return;
        }
        if (oyVar.S0 == null) {
            ky kyVar2 = nyVar.a;
            org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0();
            cd0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            cd0Var.b = paint;
            cd0Var.e = 0L;
            cd0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            cd0Var.c = kyVar2;
            oyVar.S0 = cd0Var;
        }
        org.telegram.ui.Components.cd0 cd0Var2 = oyVar.S0;
        cd0Var2.d = b0Var;
        cd0Var2.h = 0.0f;
        cd0Var2.g = 0.0f;
        cd0Var2.e = System.currentTimeMillis();
        cd0Var2.c.invalidate();
    }
}
