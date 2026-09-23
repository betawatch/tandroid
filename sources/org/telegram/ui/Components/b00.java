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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements bl0, cl0 {
    public final /* synthetic */ l00 a;

    public /* synthetic */ b00(l00 l00Var) {
        this.a = l00Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        l00 l00Var = this.a;
        f00 f00Var = l00Var.J;
        if (((org.telegram.ui.qw) f00Var).b.j2) {
            return;
        }
        j00 j00Var = (j00) view;
        if (!l00Var.n) {
            if (i10 != l00Var.K || f00Var == null) {
                l00Var.f(j00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.qw) f00Var).b.x4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = j00Var.f;
            float f11 = dp;
            if (rectF.left - f11 >= f7 || rectF.right + f11 <= f7) {
                return;
            }
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) l00Var.J;
            qwVar.d(qwVar.b.getMessagesController().getDialogFilters().get(j00Var.b.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
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
    @Override // org.telegram.ui.Components.cl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10, View view) {
        org.telegram.ui.ActionBar.k kVar;
        MessagesController.DialogFilter dialogFilter;
        ArrayList arrayList;
        boolean z10;
        MessagesController.DialogFilter dialogFilter2;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        TLRPC.Chat chat;
        l00 l00Var = this.a;
        f00 f00Var = l00Var.J;
        if (!((org.telegram.ui.qw) f00Var).b.j2 && !l00Var.n) {
            j00 j00Var = (j00) view;
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
            org.telegram.ui.ry ryVar = qwVar.b;
            if (ryVar.R0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                if (!kVar.s() && ryVar.T == 0.0f) {
                    o70 o70Var = ryVar.L0;
                    if (o70Var != null && o70Var.D()) {
                        ryVar.L0.u();
                        ryVar.L0 = null;
                        return false;
                    }
                    if (j00Var.getId() != ryVar.z0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = ryVar.getMessagesController().getDialogFilters();
                        int id2 = j00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(j00Var.getId());
                            boolean z14 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = ryVar.getMessagesController();
                            arrayList = new ArrayList(!z14 ? messagesController.getDialogs(ryVar.V2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = ryVar.getMessagesController().getDialogFilters().get(j00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i12 = 0;
                                    while (i12 < arrayList.size()) {
                                        boolean z15 = z14;
                                        if (!dialogFilter3.includesDialog(ryVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i12)).id)) {
                                            arrayList.remove(i12);
                                            i12--;
                                        }
                                        i12++;
                                        z14 = z15;
                                    }
                                    z10 = z14;
                                    z11 = dialogFilter3.isChatlist() || (dialogFilter3.neverShow.isEmpty() && (dialogFilter3.flags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0);
                                    if (z11) {
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= dialogFilter3.alwaysShow.size()) {
                                                break;
                                            }
                                            long longValue = dialogFilter3.alwaysShow.get(i13).longValue();
                                            if (longValue < 0 && (chat = ryVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.c10.g0(chat)) {
                                                zArr[0] = false;
                                                break;
                                            }
                                            i13++;
                                        }
                                    }
                                } else {
                                    z10 = z14;
                                    z11 = false;
                                }
                                if (!arrayList.isEmpty()) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= arrayList.size()) {
                                            dialogFilter2 = dialogFilter3;
                                            z13 = true;
                                            break;
                                        }
                                        dialogFilter2 = dialogFilter3;
                                        int i15 = i14;
                                        if (!ryVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i14)).id, 0L)) {
                                            z13 = false;
                                            break;
                                        }
                                        i14 = i15 + 1;
                                        dialogFilter3 = dialogFilter2;
                                    }
                                    z12 = !z13;
                                    boolean z16 = false;
                                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                                        if (((TLRPC.Dialog) arrayList.get(i11)).unread_mark || ((TLRPC.Dialog) arrayList.get(i11)).unread_count > 0) {
                                            z16 = true;
                                        }
                                    }
                                    o70 H = o70.H(ryVar, j00Var);
                                    cw cwVar = new cw(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    cwVar.c = paint;
                                    cwVar.b = new RectF();
                                    paint.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                                    H.W(cwVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.aj(qwVar, 23), ryVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z17 = z10;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new ci.y0(qwVar, z17, dialogFilter, 24), false);
                                    H.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new ci.y0(qwVar, arrayList, z12, 25), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.hw(2, qwVar, arrayList), z16);
                                    H.l(R.drawable.msg_share, org.telegram.ui.c10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.tq(qwVar, zArr, dialogFilter2, 3), z11);
                                    H.m(!z17, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.hw(3, qwVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    ryVar.L0 = H;
                                    l00Var.F.d1(true);
                                    return true;
                                }
                                dialogFilter2 = dialogFilter3;
                            } else {
                                z10 = z14;
                                dialogFilter2 = null;
                                z11 = false;
                            }
                            z12 = false;
                            boolean z162 = false;
                            while (i11 < arrayList.size()) {
                            }
                            o70 H2 = o70.H(ryVar, j00Var);
                            cw cwVar2 = new cw(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            cwVar2.c = paint2;
                            cwVar2.b = new RectF();
                            paint2.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                            H2.W(cwVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.aj(qwVar, 23), ryVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z172 = z10;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new ci.y0(qwVar, z172, dialogFilter, 24), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new ci.y0(qwVar, arrayList, z12, 25), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.hw(2, qwVar, arrayList), z162);
                            H2.l(R.drawable.msg_share, org.telegram.ui.c10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.tq(qwVar, zArr, dialogFilter2, 3), z11);
                            H2.m(!z172, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.hw(3, qwVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            ryVar.L0 = H2;
                            l00Var.F.d1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = ryVar.getMessagesController();
                    arrayList = new ArrayList(!z14 ? messagesController2.getDialogs(ryVar.V2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z12 = false;
                    boolean z1622 = false;
                    while (i11 < arrayList.size()) {
                    }
                    o70 H22 = o70.H(ryVar, j00Var);
                    cw cwVar22 = new cw(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    cwVar22.c = paint22;
                    cwVar22.b = new RectF();
                    paint22.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    H22.W(cwVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.aj(qwVar, 23), ryVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1722 = z10;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new ci.y0(qwVar, z1722, dialogFilter, 24), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new ci.y0(qwVar, arrayList, z12, 25), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.hw(2, qwVar, arrayList), z1622);
                    H22.l(R.drawable.msg_share, org.telegram.ui.c10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.tq(qwVar, zArr2, dialogFilter2, 3), z11);
                    H22.m(!z1722, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.hw(3, qwVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    ryVar.L0 = H22;
                    l00Var.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
