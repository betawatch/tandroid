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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz implements al0, bl0 {
    public final /* synthetic */ f00 a;

    public /* synthetic */ vz(f00 f00Var) {
        this.a = f00Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        f00 f00Var = this.a;
        a00 a00Var = f00Var.F;
        if (((org.telegram.ui.fw) a00Var).b.f2) {
            return;
        }
        d00 d00Var = (d00) view;
        if (!f00Var.n) {
            if (i10 != f00Var.G || a00Var == null) {
                f00Var.f(d00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.fw) a00Var).b.x4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = d00Var.f;
            float f11 = dp;
            if (rectF.left - f11 >= f9 || rectF.right + f11 <= f9) {
                return;
            }
            org.telegram.ui.fw fwVar = (org.telegram.ui.fw) f00Var.F;
            fwVar.d(fwVar.b.getMessagesController().getDialogFilters().get(d00Var.b.a));
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
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
    @Override // org.telegram.ui.Components.bl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i10, View view) {
        org.telegram.ui.ActionBar.l lVar;
        MessagesController.DialogFilter dialogFilter;
        ArrayList arrayList;
        boolean z10;
        MessagesController.DialogFilter dialogFilter2;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        TLRPC.Chat chat;
        f00 f00Var = this.a;
        a00 a00Var = f00Var.F;
        if (!((org.telegram.ui.fw) a00Var).b.f2 && !f00Var.n) {
            d00 d00Var = (d00) view;
            org.telegram.ui.fw fwVar = (org.telegram.ui.fw) a00Var;
            org.telegram.ui.fy fyVar = fwVar.b;
            if (fyVar.N0 == 0) {
                lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (!lVar.s() && fyVar.P == 0.0f) {
                    j70 j70Var = fyVar.H0;
                    if (j70Var != null && j70Var.D()) {
                        fyVar.H0.u();
                        fyVar.H0 = null;
                        return false;
                    }
                    if (d00Var.getId() != fyVar.v0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = fyVar.getMessagesController().getDialogFilters();
                        int id2 = d00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(d00Var.getId());
                            boolean z14 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = fyVar.getMessagesController();
                            arrayList = new ArrayList(!z14 ? messagesController.getDialogs(fyVar.R2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = fyVar.getMessagesController().getDialogFilters().get(d00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i12 = 0;
                                    while (i12 < arrayList.size()) {
                                        boolean z15 = z14;
                                        if (!dialogFilter3.includesDialog(fyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i12)).id)) {
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
                                            if (longValue < 0 && (chat = fyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.p00.g0(chat)) {
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
                                        if (!fyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i14)).id, 0L)) {
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
                                    j70 H = j70.H(fyVar, d00Var);
                                    sv svVar = new sv(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    svVar.c = paint;
                                    svVar.b = new RectF();
                                    paint.setColor(fwVar.b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                                    H.W(svVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ui(fwVar, 23), fyVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z17 = z10;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new jh.r5(fwVar, z17, dialogFilter, 22), false);
                                    H.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new jh.r5(fwVar, arrayList, z12, 23), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.Components.voip.o(11, fwVar, arrayList), z16);
                                    H.l(R.drawable.msg_share, org.telegram.ui.p00.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.lq(fwVar, zArr, dialogFilter2, 3), z11);
                                    H.m(!z17, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.Components.voip.o(12, fwVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    fyVar.H0 = H;
                                    f00Var.B.d1(true);
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
                            j70 H2 = j70.H(fyVar, d00Var);
                            sv svVar2 = new sv(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            svVar2.c = paint2;
                            svVar2.b = new RectF();
                            paint2.setColor(fwVar.b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                            H2.W(svVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ui(fwVar, 23), fyVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z172 = z10;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new jh.r5(fwVar, z172, dialogFilter, 22), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new jh.r5(fwVar, arrayList, z12, 23), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.Components.voip.o(11, fwVar, arrayList), z162);
                            H2.l(R.drawable.msg_share, org.telegram.ui.p00.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.lq(fwVar, zArr, dialogFilter2, 3), z11);
                            H2.m(!z172, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.Components.voip.o(12, fwVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            fyVar.H0 = H2;
                            f00Var.B.d1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = fyVar.getMessagesController();
                    arrayList = new ArrayList(!z14 ? messagesController2.getDialogs(fyVar.R2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z12 = false;
                    boolean z1622 = false;
                    while (i11 < arrayList.size()) {
                    }
                    j70 H22 = j70.H(fyVar, d00Var);
                    sv svVar22 = new sv(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    svVar22.c = paint22;
                    svVar22.b = new RectF();
                    paint22.setColor(fwVar.b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    H22.W(svVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ui(fwVar, 23), fyVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1722 = z10;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new jh.r5(fwVar, z1722, dialogFilter, 22), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new jh.r5(fwVar, arrayList, z12, 23), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.Components.voip.o(11, fwVar, arrayList), z1622);
                    H22.l(R.drawable.msg_share, org.telegram.ui.p00.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.lq(fwVar, zArr2, dialogFilter2, 3), z11);
                    H22.m(!z1722, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.Components.voip.o(12, fwVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    fyVar.H0 = H22;
                    f00Var.B.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
