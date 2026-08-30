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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements jl0, kl0 {
    public final /* synthetic */ j00 a;

    public /* synthetic */ a00(j00 j00Var) {
        this.a = j00Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        j00 j00Var = this.a;
        e00 e00Var = j00Var.G;
        if (((org.telegram.ui.ow) e00Var).b.g2) {
            return;
        }
        h00 h00Var = (h00) view;
        if (!j00Var.n) {
            if (i10 != j00Var.H || e00Var == null) {
                j00Var.f(h00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.ow) e00Var).b.x4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = h00Var.f;
            float f12 = dp;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.ow owVar = (org.telegram.ui.ow) j00Var.G;
            owVar.d(owVar.b.getMessagesController().getDialogFilters().get(h00Var.b.a));
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
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
    @Override // org.telegram.ui.Components.kl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i10, View view) {
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
        j00 j00Var = this.a;
        e00 e00Var = j00Var.G;
        if (!((org.telegram.ui.ow) e00Var).b.g2 && !j00Var.n) {
            h00 h00Var = (h00) view;
            org.telegram.ui.ow owVar = (org.telegram.ui.ow) e00Var;
            org.telegram.ui.oy oyVar = owVar.b;
            if (oyVar.O0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (!kVar.s() && oyVar.Q == 0.0f) {
                    o70 o70Var = oyVar.I0;
                    if (o70Var != null && o70Var.D()) {
                        oyVar.I0.u();
                        oyVar.I0 = null;
                        return false;
                    }
                    if (h00Var.getId() != oyVar.w0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = oyVar.getMessagesController().getDialogFilters();
                        int id2 = h00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(h00Var.getId());
                            boolean z13 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = oyVar.getMessagesController();
                            arrayList = new ArrayList(!z13 ? messagesController.getDialogs(oyVar.S2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = oyVar.getMessagesController().getDialogFilters().get(h00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i12 = 0;
                                    while (i12 < arrayList.size()) {
                                        boolean z14 = z13;
                                        if (!dialogFilter3.includesDialog(oyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i12)).id)) {
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
                                            if (longValue < 0 && (chat = oyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.b10.g0(chat)) {
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
                                        if (!oyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i14)).id, 0L)) {
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
                                    o70 H = o70.H(oyVar, h00Var);
                                    wv wvVar = new wv(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    wvVar.c = paint;
                                    wvVar.b = new RectF();
                                    paint.setColor(owVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                                    H.W(wvVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.zi(owVar, 23), oyVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z16 = z4;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new lh.r5(owVar, z16, dialogFilter, 20), false);
                                    H.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new lh.r5(owVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new k41(20, owVar, arrayList), z15);
                                    H.l(R.drawable.msg_share, org.telegram.ui.b10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.rq(owVar, zArr, dialogFilter2, 3), z10);
                                    H.m(!z16, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new k41(21, owVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    oyVar.I0 = H;
                                    j00Var.C.d1(true);
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
                            o70 H2 = o70.H(oyVar, h00Var);
                            wv wvVar2 = new wv(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            wvVar2.c = paint2;
                            wvVar2.b = new RectF();
                            paint2.setColor(owVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                            H2.W(wvVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.zi(owVar, 23), oyVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z162 = z4;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new lh.r5(owVar, z162, dialogFilter, 20), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new lh.r5(owVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new k41(20, owVar, arrayList), z152);
                            H2.l(R.drawable.msg_share, org.telegram.ui.b10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.rq(owVar, zArr, dialogFilter2, 3), z10);
                            H2.m(!z162, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new k41(21, owVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            oyVar.I0 = H2;
                            j00Var.C.d1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = oyVar.getMessagesController();
                    arrayList = new ArrayList(!z13 ? messagesController2.getDialogs(oyVar.S2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z11 = false;
                    boolean z1522 = false;
                    while (i11 < arrayList.size()) {
                    }
                    o70 H22 = o70.H(oyVar, h00Var);
                    wv wvVar22 = new wv(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    wvVar22.c = paint22;
                    wvVar22.b = new RectF();
                    paint22.setColor(owVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    H22.W(wvVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.zi(owVar, 23), oyVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1622 = z4;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new lh.r5(owVar, z1622, dialogFilter, 20), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new lh.r5(owVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new k41(20, owVar, arrayList), z1522);
                    H22.l(R.drawable.msg_share, org.telegram.ui.b10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.rq(owVar, zArr2, dialogFilter2, 3), z10);
                    H22.m(!z1622, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new k41(21, owVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    oyVar.I0 = H22;
                    j00Var.C.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
