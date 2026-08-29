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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dy extends f2.b0 {
    public f2.n1 d;
    public boolean e;
    public boolean f;
    public final ey g;
    public final /* synthetic */ fy h;

    public dy(fy fyVar, ey eyVar) {
        this.h = fyVar;
        this.g = eyVar;
    }

    @Override // f2.b0
    public final int b(int i10, int i11) {
        if (this.f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override // f2.b0
    public final long d(RecyclerView recyclerView, int i10, float f9, float f10) {
        fy fyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (fyVar = this.h).T0) != null) {
            AndroidUtilities.runOnUIThread(new wg(1, p2Var), this.g.x.e);
            fyVar.T0 = null;
        }
        return super.d(recyclerView, i10, f9, f10);
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
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.l lVar;
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
        ey eyVar = this.g;
        if (!eyVar.x.k()) {
            fy fyVar = this.h;
            b5Var = ((org.telegram.ui.ActionBar.o2) fyVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) fyVar).parentLayout;
            }
            if (!fyVar.B3.c() && fyVar.T2 == 0) {
                if (this.e && this.f) {
                    View view = n1Var.a;
                    if (view instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!fyVar.h2 && eyVar.p() && fyVar.S0 == null) {
                    View view2 = n1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.p2) {
                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view2;
                        long dialogId = p2Var.getDialogId();
                        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (lVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (fyVar.U0 && dialog2 != null && fyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.p2 p2Var2 = (org.telegram.ui.Cells.p2) n1Var.a;
                                fyVar.T0 = p2Var2;
                                p2Var2.setBackgroundColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                                this.f = false;
                                return f2.b0.l(3, 0);
                            }
                        } else {
                            int i19 = fyVar.N0;
                            try {
                                i19 = eyVar.d.h;
                            } catch (Exception unused) {
                            }
                            ew ewVar = fyVar.v0;
                            if (ewVar != null && ewVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                            }
                            if (fyVar.Y0) {
                                if (dialogId == fyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                }
                                if (!fyVar.getMessagesController().isPromoDialog(dialogId, false) || fyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (fyVar.R2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!fyVar.B3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = fyVar.a0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = fyVar.getMessagesController().selectedDialogFilter[fyVar.a0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                            p2Var.setSliding(true);
                                            return f2.b0.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                    p2Var.setSliding(true);
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
    public final float f(float f9) {
        return 3500.0f;
    }

    @Override // f2.b0
    public final float g() {
        return 0.45f;
    }

    @Override // f2.b0
    public final float h(float f9) {
        return Float.MAX_VALUE;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int i10;
        fy fyVar = this.h;
        ArrayList arrayList = fyVar.W0;
        View view = n1Var2.a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && fyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = n1Var.b();
                int b11 = n1Var2.b();
                ey eyVar = this.g;
                if (eyVar.a.getItemAnimator() == null) {
                    eyVar.a.setItemAnimator(eyVar.x);
                }
                nw nwVar = eyVar.d;
                fy fyVar2 = nwVar.N;
                int i11 = nwVar.B;
                ArrayList R3 = fyVar2.R3(i11, nwVar.h, nwVar.r, false);
                int G = nwVar.G(b10);
                int G2 = nwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = nwVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[nwVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                nwVar.W(null);
                int i15 = fyVar.a0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        fyVar.V0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = fyVar.getMessagesController().selectedDialogFilter[fyVar.a0[0].s == i10 ? (char) 1 : (char) 0];
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
    public final void p(f2.n1 n1Var, int i10) {
        if (n1Var != null) {
            this.g.a.d1(false);
        }
        this.d = n1Var;
        if (n1Var != null) {
            View view = n1Var.a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).w = false;
            }
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
        int i10;
        fy fyVar = this.h;
        if (n1Var == null) {
            fyVar.S0 = null;
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) n1Var.a;
        long dialogId = p2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        ey eyVar = this.g;
        if (isFolderDialogId) {
            ay ayVar = eyVar.a;
            int i11 = ay.r3;
            ayVar.z1(false, p2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!fyVar.getMessagesController().isPromoDialog(dialogId, false) && fyVar.R2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                fyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                fyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(fyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            fyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        fyVar.S0 = p2Var;
        j3.f0 f0Var = new j3.f0(this, dialog, eyVar.d.h(), n1Var.b(), 5);
        fyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            f0Var.run();
            return;
        }
        if (fyVar.R0 == null) {
            ay ayVar2 = eyVar.a;
            org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0();
            wc0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            wc0Var.b = paint;
            wc0Var.e = 0L;
            wc0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            wc0Var.c = ayVar2;
            fyVar.R0 = wc0Var;
        }
        org.telegram.ui.Components.wc0 wc0Var2 = fyVar.R0;
        wc0Var2.d = f0Var;
        wc0Var2.h = 0.0f;
        wc0Var2.g = 0.0f;
        wc0Var2.e = System.currentTimeMillis();
        wc0Var2.c.invalidate();
    }
}
