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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class cy extends s4.v {
    public s4.b1 d;
    public boolean e;
    public boolean f;
    public final dy g;
    public final /* synthetic */ ey h;

    public cy(ey eyVar, dy dyVar) {
        this.h = eyVar;
        this.g = dyVar;
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
        ey eyVar;
        org.telegram.ui.Cells.q2 q2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (q2Var = (eyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, q2Var), this.g.x.e);
            eyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e3, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) != 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((org.telegram.ui.ActionBar.ActionBarLayout) r2).x() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0130, code lost:
    
        if (org.telegram.messenger.SharedConfig.getChatSwipeAction(r13) == 4) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    @Override // s4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        org.telegram.ui.ActionBar.h5 h5Var;
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
        org.telegram.ui.ActionBar.h5 h5Var2;
        dy dyVar = this.g;
        if (!dyVar.x.k()) {
            ey eyVar = this.h;
            h5Var = ((org.telegram.ui.ActionBar.o2) eyVar).parentLayout;
            if (h5Var != null) {
                h5Var2 = ((org.telegram.ui.ActionBar.o2) eyVar).parentLayout;
            }
            if (!eyVar.G3.c() && eyVar.Y2 == 0) {
                if (this.e && this.f) {
                    View view = b1Var.a;
                    if (view instanceof org.telegram.ui.Cells.q2) {
                        ((org.telegram.ui.Cells.q2) view).w = true;
                    }
                    this.e = false;
                    return 0;
                }
                if (!eyVar.l2 && dyVar.p() && eyVar.W0 == null) {
                    View view2 = b1Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.q2) {
                        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view2;
                        long dialogId = q2Var.getDialogId();
                        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                        MessagesController.DialogFilter dialogFilter = null;
                        if (kVar.t(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (eyVar.Y0 && dialog2 != null && eyVar.e4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.q2 q2Var2 = (org.telegram.ui.Cells.q2) b1Var.a;
                                eyVar.X0 = q2Var2;
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, q2Var2, eyVar.getResourceProvider());
                                this.f = false;
                                return s4.v.l(3, 0);
                            }
                        } else {
                            int i19 = eyVar.R0;
                            try {
                                i19 = dyVar.d.h;
                            } catch (Exception unused) {
                            }
                            cw cwVar = eyVar.z0;
                            if (cwVar != null && cwVar.getVisibility() == 0) {
                                i18 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                            }
                            if (eyVar.c1) {
                                if (dialogId == eyVar.getUserConfig().clientUserId || dialogId == 777000 || i19 == 7 || i19 == 8) {
                                    i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                }
                                if (!eyVar.getMessagesController().isPromoDialog(dialogId, false) || eyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                    if (eyVar.W2 == 0) {
                                        i13 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                        if (!ChatObject.isCommunity(i13, dialogId)) {
                                            i14 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i14) != 3) {
                                                i15 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i15) != 1) {
                                                    i16 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i16) != 0) {
                                                        i17 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                    }
                                                }
                                            }
                                        }
                                        if (!eyVar.G3.c()) {
                                            z10 = true;
                                            i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                                int i20 = eyVar.e0[0].s;
                                                if (i20 == 7 || i20 == 8) {
                                                    dialogFilter = eyVar.getMessagesController().selectedDialogFilter[eyVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                                                }
                                                if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId)) != null) {
                                                    i12 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                    if (!dialogFilter.alwaysShow(i12, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                            this.f = false;
                                            this.e = !(z10 || DialogObject.isFolderDialogId(q2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(q2Var.getDialogId()));
                                            q2Var.setSliding(true);
                                            return s4.v.l(0, 4);
                                        }
                                    }
                                    z10 = false;
                                    i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                    if (SharedConfig.getChatSwipeAction(i11) == 1) {
                                    }
                                    this.f = false;
                                    this.e = !(z10 || DialogObject.isFolderDialogId(q2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(q2Var.getDialogId()));
                                    q2Var.setSliding(true);
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
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10;
        ey eyVar = this.h;
        ArrayList arrayList = eyVar.a1;
        View view = b1Var2.a;
        if (view instanceof org.telegram.ui.Cells.q2) {
            long dialogId = ((org.telegram.ui.Cells.q2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && eyVar.e4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                dy dyVar = this.g;
                if (dyVar.a.getItemAnimator() == null) {
                    dyVar.a.setItemAnimator(dyVar.x);
                }
                lw lwVar = dyVar.d;
                ey eyVar2 = lwVar.R;
                int i11 = lwVar.F;
                ArrayList P3 = eyVar2.P3(i11, lwVar.h, lwVar.r, false);
                int H = lwVar.H(b10);
                int H2 = lwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) P3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) P3.get(H2);
                int i12 = lwVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[lwVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.id);
                    dialogFilter.pinnedDialogs.put(dialog2.id, dialogFilter.pinnedDialogs.get(dialog3.id));
                    dialogFilter.pinnedDialogs.put(dialog3.id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(P3, H, H2);
                lwVar.X(null);
                int i15 = eyVar.e0[0].s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        eyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = eyVar.getMessagesController().selectedDialogFilter[eyVar.e0[0].s == i10 ? (char) 1 : (char) 0];
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
    public final void p(s4.b1 b1Var, int i10) {
        if (b1Var != null) {
            this.g.a.e1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).w = false;
            }
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        int i10;
        ey eyVar = this.h;
        if (b1Var == null) {
            eyVar.W0 = null;
            return;
        }
        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) b1Var.a;
        long dialogId = q2Var.getDialogId();
        boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        dy dyVar = this.g;
        if (isFolderDialogId) {
            zx zxVar = dyVar.a;
            int i11 = zx.w3;
            zxVar.F1(false, q2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!eyVar.getMessagesController().isPromoDialog(dialogId, false) && eyVar.W2 == 0) {
            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            if (SharedConfig.getChatSwipeAction(i10) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                eyVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                eyVar.p4(arrayList, 101, true, false, null);
                return;
            }
        }
        if (ChatObject.isCommunity(eyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            eyVar.p4(arrayList2, 111, true, false, null);
            return;
        }
        eyVar.W0 = q2Var;
        i2.z zVar = new i2.z(this, dialog, dyVar.d.h(), b1Var.b(), 5);
        eyVar.y4(true, true);
        if (Utilities.random.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT) != 1) {
            zVar.run();
            return;
        }
        if (eyVar.V0 == null) {
            zx zxVar2 = dyVar.a;
            org.telegram.ui.Components.xd0 xd0Var = new org.telegram.ui.Components.xd0();
            xd0Var.a = new Paint(1);
            Paint paint = new Paint(1);
            xd0Var.b = paint;
            xd0Var.e = 0L;
            xd0Var.f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            xd0Var.c = zxVar2;
            eyVar.V0 = xd0Var;
        }
        org.telegram.ui.Components.xd0 xd0Var2 = eyVar.V0;
        xd0Var2.d = zVar;
        xd0Var2.h = 0.0f;
        xd0Var2.g = 0.0f;
        xd0Var2.e = System.currentTimeMillis();
        xd0Var2.c.invalidate();
    }
}
