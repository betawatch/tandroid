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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ny extends f2.b0 {
    public f2.m1 d;
    public boolean e;
    public boolean f;
    public final oy g;
    public final /* synthetic */ py h;

    public ny(py pyVar, oy oyVar) {
        this.h = pyVar;
        this.g = oyVar;
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
        py pyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (pyVar = this.h).U0) != null) {
            AndroidUtilities.runOnUIThread(new bh(1, r2Var), this.g.x.e);
            pyVar.U0 = null;
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
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        org.telegram.ui.ActionBar.f5 f5Var;
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
        org.telegram.ui.ActionBar.f5 f5Var2;
        oy oyVar = this.g;
        if (!oyVar.x.k()) {
            py pyVar = this.h;
            f5Var = ((org.telegram.ui.ActionBar.p2) pyVar).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) pyVar).parentLayout;
            }
            if (!pyVar.C3.c() && pyVar.U2 == 0) {
                if (this.e && this.f) {
                    View view = m1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!pyVar.i2 && oyVar.p() && pyVar.T0 == null) {
                    View view2 = m1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.r2) {
                        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                        long dialogId = r2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (pyVar.V0 && dialog2 != null && pyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.r2 r2Var2 = (org.telegram.ui.Cells.r2) m1Var.a;
                                pyVar.U0 = r2Var2;
                                r2Var2.setBackgroundColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                                this.f = false;
                                return f2.b0.l(3, 0);
                            }
                        } else {
                            int i19 = pyVar.O0;
                            try {
                                i19 = oyVar.d.h;
                            } catch (Exception unused) {
                            }
                            ow owVar = pyVar.w0;
                            if (owVar != null && owVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            }
                            if (pyVar.Z0) {
                                if (dialogId == pyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                }
                                if (!pyVar.getMessagesController().isPromoDialog(dialogId, false) || pyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (pyVar.S2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!pyVar.C3.c()) {
                                            z4 = true;
                                            i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = pyVar.b0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = pyVar.getMessagesController().selectedDialogFilter[pyVar.b0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
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
                                    i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
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
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10;
        py pyVar = this.h;
        ArrayList arrayList = pyVar.X0;
        View view = m1Var2.a;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && pyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = m1Var.b();
                int b11 = m1Var2.b();
                oy oyVar = this.g;
                if (oyVar.a.getItemAnimator() == null) {
                    oyVar.a.setItemAnimator(oyVar.x);
                }
                xw xwVar = oyVar.d;
                py pyVar2 = xwVar.O;
                int i11 = xwVar.C;
                ArrayList R3 = pyVar2.R3(i11, xwVar.h, xwVar.r, false);
                int G = xwVar.G(b10);
                int G2 = xwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = xwVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[xwVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(R3, G, G2);
                xwVar.W(null);
                int i15 = pyVar.b0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        pyVar.W0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = pyVar.getMessagesController().selectedDialogFilter[pyVar.b0[0].s == i10 ? (char) 1 : (char) 0];
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
    public final void p(f2.m1 m1Var, int i10) {
        if (m1Var != null) {
            this.g.a.c1(false);
        }
        this.d = m1Var;
        if (m1Var != null) {
            View view = m1Var.a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).w = false;
            }
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
        int i10;
        py pyVar = this.h;
        if (m1Var == null) {
            pyVar.T0 = null;
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) m1Var.a;
        long dialogId = r2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        oy oyVar = this.g;
        if (isFolderDialogId) {
            ly lyVar = oyVar.a;
            int i11 = ly.s3;
            lyVar.y1(false, r2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!pyVar.getMessagesController().isPromoDialog(dialogId, false) && pyVar.S2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                pyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                pyVar.r4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(pyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            pyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        pyVar.T0 = r2Var;
        j3.b0 b0Var = new j3.b0(this, dialog, oyVar.d.h(), m1Var.b(), 5);
        pyVar.A4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            b0Var.run();
            return;
        }
        if (pyVar.S0 == null) {
            ly lyVar2 = oyVar.a;
            org.telegram.ui.Components.ed0 ed0Var = new org.telegram.ui.Components.ed0();
            ed0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            ed0Var.b = paint;
            ed0Var.e = 0L;
            ed0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            ed0Var.c = lyVar2;
            pyVar.S0 = ed0Var;
        }
        org.telegram.ui.Components.ed0 ed0Var2 = pyVar.S0;
        ed0Var2.d = b0Var;
        ed0Var2.h = 0.0f;
        ed0Var2.g = 0.0f;
        ed0Var2.e = System.currentTimeMillis();
        ed0Var2.c.invalidate();
    }
}
