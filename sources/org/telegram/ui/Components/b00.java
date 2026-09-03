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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements il0, jl0 {
    public final /* synthetic */ k00 a;

    public /* synthetic */ b00(k00 k00Var) {
        this.a = k00Var;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        k00 k00Var = this.a;
        f00 f00Var = k00Var.G;
        if (((org.telegram.ui.qw) f00Var).b.g2) {
            return;
        }
        i00 i00Var = (i00) view;
        if (!k00Var.n) {
            if (i10 != k00Var.H || f00Var == null) {
                k00Var.f(i00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.qw) f00Var).b.x4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = i00Var.f;
            float f12 = dp;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) k00Var.G;
            qwVar.d(qwVar.b.getMessagesController().getDialogFilters().get(i00Var.b.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    @Override // org.telegram.ui.Components.jl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10, View view) {
        org.telegram.ui.ActionBar.k kVar;
        MessagesController.DialogFilter dialogFilter;
        ArrayList arrayList;
        boolean z4;
        MessagesController.DialogFilter dialogFilter2;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        TLRPC.Chat chat;
        k00 k00Var = this.a;
        f00 f00Var = k00Var.G;
        if (!((org.telegram.ui.qw) f00Var).b.g2 && !k00Var.n) {
            i00 i00Var = (i00) view;
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
            org.telegram.ui.qy qyVar = qwVar.b;
            if (qyVar.O0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                if (!kVar.s() && qyVar.Q == 0.0f) {
                    p70 p70Var = qyVar.I0;
                    if (p70Var != null && p70Var.D()) {
                        qyVar.I0.u();
                        qyVar.I0 = null;
                        return false;
                    }
                    if (i00Var.getId() != qyVar.w0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = qyVar.getMessagesController().getDialogFilters();
                        int id2 = i00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(i00Var.getId());
                            boolean z13 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = qyVar.getMessagesController();
                            arrayList = new ArrayList(!z13 ? messagesController.getDialogs(qyVar.S2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = qyVar.getMessagesController().getDialogFilters().get(i00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i12 = 0;
                                    while (i12 < arrayList.size()) {
                                        boolean z14 = z13;
                                        if (!dialogFilter3.includesDialog(qyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i12)).id)) {
                                            arrayList.remove(i12);
                                            i12--;
                                        }
                                        i12++;
                                        z13 = z14;
                                    }
                                    z4 = z13;
                                    z10 = dialogFilter3.isChatlist() || (dialogFilter3.neverShow.isEmpty() && (dialogFilter3.flags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0);
                                    if (z10) {
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= dialogFilter3.alwaysShow.size()) {
                                                break;
                                            }
                                            long longValue = dialogFilter3.alwaysShow.get(i13).longValue();
                                            if (longValue < 0 && (chat = qyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.c10.g0(chat)) {
                                                zArr[0] = false;
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                } else {
                                    z4 = z13;
                                    z10 = false;
                                }
                                if (!arrayList.isEmpty()) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= arrayList.size()) {
                                            dialogFilter2 = dialogFilter3;
                                            z12 = true;
                                            break;
                                        }
                                        dialogFilter2 = dialogFilter3;
                                        int i15 = i14;
                                        if (!qyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i14)).id, 0L)) {
                                            z12 = false;
                                            break;
                                        }
                                        i14 = i15 + 1;
                                        dialogFilter3 = dialogFilter2;
                                    }
                                    z11 = !z12;
                                    boolean z15 = false;
                                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                                        if (((TLRPC.Dialog) arrayList.get(i11)).unread_mark || ((TLRPC.Dialog) arrayList.get(i11)).unread_count > 0) {
                                            z15 = true;
                                        }
                                    }
                                    p70 H = p70.H(qyVar, i00Var);
                                    vv vvVar = new vv(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    vvVar.c = paint;
                                    vvVar.b = new RectF();
                                    paint.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                                    H.W(vvVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.bj(qwVar, 23), qyVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z16 = z4;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new lh.r5(qwVar, z16, dialogFilter, 20), false);
                                    H.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new lh.r5(qwVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new k41(19, qwVar, arrayList), z15);
                                    H.l(R.drawable.msg_share, org.telegram.ui.c10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.tq(qwVar, zArr, dialogFilter2, 3), z10);
                                    H.m(!z16, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new k41(20, qwVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    qyVar.I0 = H;
                                    k00Var.C.c1(true);
                                    return true;
                                }
                                dialogFilter2 = dialogFilter3;
                            } else {
                                z4 = z13;
                                dialogFilter2 = null;
                                z10 = false;
                            }
                            z11 = false;
                            boolean z152 = false;
                            while (i11 < arrayList.size()) {
                            }
                            p70 H2 = p70.H(qyVar, i00Var);
                            vv vvVar2 = new vv(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            vvVar2.c = paint2;
                            vvVar2.b = new RectF();
                            paint2.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                            H2.W(vvVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.bj(qwVar, 23), qyVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z162 = z4;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new lh.r5(qwVar, z162, dialogFilter, 20), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new lh.r5(qwVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new k41(19, qwVar, arrayList), z152);
                            H2.l(R.drawable.msg_share, org.telegram.ui.c10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.tq(qwVar, zArr, dialogFilter2, 3), z10);
                            H2.m(!z162, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new k41(20, qwVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            qyVar.I0 = H2;
                            k00Var.C.c1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = qyVar.getMessagesController();
                    arrayList = new ArrayList(!z13 ? messagesController2.getDialogs(qyVar.S2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z11 = false;
                    boolean z1522 = false;
                    while (i11 < arrayList.size()) {
                    }
                    p70 H22 = p70.H(qyVar, i00Var);
                    vv vvVar22 = new vv(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    vvVar22.c = paint22;
                    vvVar22.b = new RectF();
                    paint22.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    H22.W(vvVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.bj(qwVar, 23), qyVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1622 = z4;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new lh.r5(qwVar, z1622, dialogFilter, 20), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new lh.r5(qwVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new k41(19, qwVar, arrayList), z1522);
                    H22.l(R.drawable.msg_share, org.telegram.ui.c10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.tq(qwVar, zArr2, dialogFilter2, 3), z10);
                    H22.m(!z1622, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new k41(20, qwVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    qyVar.I0 = H22;
                    k00Var.C.c1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
