package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m00 implements bm0, cm0 {
    public final /* synthetic */ w00 a;

    public /* synthetic */ m00(w00 w00Var) {
        this.a = w00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    @Override // org.telegram.ui.Components.cm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i10, View view) {
        org.telegram.ui.ActionBar.k kVar;
        MessagesController.DialogFilter dialogFilter;
        ?? arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        MessagesController.DialogFilter dialogFilter2;
        boolean z13;
        ?? r82;
        boolean z14;
        TLRPC.Chat chat;
        w00 w00Var = this.a;
        q00 q00Var = w00Var.J;
        boolean z15 = false;
        if (!((org.telegram.ui.xw) q00Var).b.j2 && !w00Var.n) {
            u00 u00Var = (u00) view;
            org.telegram.ui.xw xwVar = (org.telegram.ui.xw) q00Var;
            org.telegram.ui.yy yyVar = xwVar.b;
            if (yyVar.R0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                if (!kVar.t() && yyVar.T == 0.0f) {
                    l80 l80Var = yyVar.L0;
                    if (l80Var != null && l80Var.D()) {
                        yyVar.L0.u();
                        yyVar.L0 = null;
                        return false;
                    }
                    if (u00Var.getId() != yyVar.z0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = yyVar.getMessagesController().getDialogFilters();
                        int id2 = u00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(u00Var.getId());
                            boolean z16 = true;
                            boolean z17 = dialogFilter != null;
                            boolean[] zArr = new boolean[1];
                            zArr[0] = true;
                            MessagesController messagesController = yyVar.getMessagesController();
                            arrayList = new ArrayList(!z17 ? messagesController.getDialogs(yyVar.W2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = yyVar.getMessagesController().getDialogFilters().get(u00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i11 = 0;
                                    while (i11 < arrayList.size()) {
                                        boolean z18 = z15;
                                        boolean z19 = z16;
                                        boolean z20 = z17;
                                        if (!dialogFilter3.includesDialog(yyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i11)).id)) {
                                            arrayList.remove(i11);
                                            i11--;
                                        }
                                        i11++;
                                        z15 = z18;
                                        z16 = z19;
                                        z17 = z20;
                                    }
                                    z10 = z15;
                                    z11 = z16;
                                    z12 = z17;
                                    z15 = (dialogFilter3.isChatlist() || (dialogFilter3.neverShow.isEmpty() && (dialogFilter3.flags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0)) ? z11 : z10 ? 1 : 0;
                                    if (z15) {
                                        int i12 = z10 ? 1 : 0;
                                        while (true) {
                                            if (i12 >= dialogFilter3.alwaysShow.size()) {
                                                break;
                                            }
                                            long longValue = dialogFilter3.alwaysShow.get(i12).longValue();
                                            if (longValue < 0 && (chat = yyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.k10.g0(chat)) {
                                                zArr[z10 ? 1 : 0] = z10;
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                } else {
                                    z10 = false;
                                    z11 = true;
                                    z12 = z17;
                                }
                                if (arrayList.isEmpty()) {
                                    dialogFilter2 = dialogFilter3;
                                    z13 = z10 ? 1 : 0;
                                } else {
                                    int i13 = z10 ? 1 : 0;
                                    while (true) {
                                        if (i13 >= arrayList.size()) {
                                            dialogFilter2 = dialogFilter3;
                                            z14 = z11;
                                            break;
                                        }
                                        dialogFilter2 = dialogFilter3;
                                        int i14 = i13;
                                        if (!yyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i13)).id, 0L)) {
                                            z14 = z10 ? 1 : 0;
                                            break;
                                        }
                                        i13 = i14 + 1;
                                        dialogFilter3 = dialogFilter2;
                                    }
                                    z13 = !z14;
                                }
                            } else {
                                z10 = false;
                                z11 = true;
                                z12 = z17;
                                dialogFilter2 = null;
                                z13 = false;
                            }
                            boolean z21 = z10;
                            boolean z22 = z21;
                            for (r82 = z21; r82 < arrayList.size(); r82++) {
                                if (((TLRPC.Dialog) arrayList.get(r82)).unread_mark || ((TLRPC.Dialog) arrayList.get(r82)).unread_count > 0) {
                                    z22 = z11;
                                }
                            }
                            l80 H = l80.H(yyVar, u00Var);
                            nw nwVar = new nw(3, (byte) 0);
                            Paint paint = new Paint(z11 ? 1 : 0);
                            nwVar.c = paint;
                            nwVar.b = new RectF();
                            paint.setColor(xwVar.b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                            H.W(nwVar);
                            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.gj(xwVar, 24), yyVar.getMessagesController().getDialogFilters().size() <= 1 ? true : z10);
                            boolean z23 = z12;
                            H.c(R.drawable.msg_edit, LocaleController.getString(!z12 ? R.string.FilterEditAll : R.string.FilterEdit), new di.x0(xwVar, z23, dialogFilter, 24), z10);
                            H.l(!z13 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(!z13 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new di.x0(xwVar, (Object) arrayList, z13, 25), dialogFilter == null && !arrayList.isEmpty());
                            H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new n51(19, xwVar, arrayList), z22);
                            H.l(R.drawable.msg_share, org.telegram.ui.k10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.br(xwVar, zArr, dialogFilter2, 3), z15);
                            H.m(!z23, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new n51(20, xwVar, dialogFilter));
                            H.s = 96;
                            H.i = 3;
                            H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H.Z();
                            yyVar.L0 = H;
                            w00Var.F.d1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    boolean z162 = true;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    zArr2[0] = true;
                    MessagesController messagesController2 = yyVar.getMessagesController();
                    arrayList = new ArrayList(!z17 ? messagesController2.getDialogs(yyVar.W2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    boolean z212 = z10;
                    boolean z222 = z212;
                    while (r82 < arrayList.size()) {
                    }
                    l80 H2 = l80.H(yyVar, u00Var);
                    nw nwVar2 = new nw(3, (byte) 0);
                    Paint paint2 = new Paint(z11 ? 1 : 0);
                    nwVar2.c = paint2;
                    nwVar2.b = new RectF();
                    paint2.setColor(xwVar.b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    H2.W(nwVar2);
                    H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.gj(xwVar, 24), yyVar.getMessagesController().getDialogFilters().size() <= 1 ? true : z10);
                    boolean z232 = z12;
                    H2.c(R.drawable.msg_edit, LocaleController.getString(!z12 ? R.string.FilterEditAll : R.string.FilterEdit), new di.x0(xwVar, z232, dialogFilter, 24), z10);
                    if (dialogFilter == null) {
                    }
                    H2.l(!z13 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(!z13 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new di.x0(xwVar, (Object) arrayList, z13, 25), dialogFilter == null && !arrayList.isEmpty());
                    H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new n51(19, xwVar, arrayList), z222);
                    H2.l(R.drawable.msg_share, org.telegram.ui.k10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.br(xwVar, zArr2, dialogFilter2, 3), z15);
                    H2.m(!z232, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new n51(20, xwVar, dialogFilter));
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H2.Z();
                    yyVar.L0 = H2;
                    w00Var.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        w00 w00Var = this.a;
        q00 q00Var = w00Var.J;
        if (((org.telegram.ui.xw) q00Var).b.j2) {
            return;
        }
        u00 u00Var = (u00) view;
        if (!w00Var.n) {
            if (i10 != w00Var.K || q00Var == null) {
                w00Var.f(u00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.xw) q00Var).b.v4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = u00Var.f;
            float f11 = dp;
            if (rectF.left - f11 >= f7 || rectF.right + f11 <= f7) {
                return;
            }
            org.telegram.ui.xw xwVar = (org.telegram.ui.xw) w00Var.J;
            xwVar.d(xwVar.b.getMessagesController().getDialogFilters().get(u00Var.b.a));
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
