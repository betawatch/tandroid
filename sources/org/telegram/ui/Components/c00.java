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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements jl0, kl0 {
    public final /* synthetic */ l00 a;

    public /* synthetic */ c00(l00 l00Var) {
        this.a = l00Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        l00 l00Var = this.a;
        g00 g00Var = l00Var.G;
        if (((org.telegram.ui.pw) g00Var).b.g2) {
            return;
        }
        j00 j00Var = (j00) view;
        if (!l00Var.n) {
            if (i10 != l00Var.H || g00Var == null) {
                l00Var.f(j00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.pw) g00Var).b.x4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = j00Var.f;
            float f12 = dp;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) l00Var.G;
            pwVar.d(pwVar.b.getMessagesController().getDialogFilters().get(j00Var.b.a));
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
        l00 l00Var = this.a;
        g00 g00Var = l00Var.G;
        if (!((org.telegram.ui.pw) g00Var).b.g2 && !l00Var.n) {
            j00 j00Var = (j00) view;
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
            org.telegram.ui.py pyVar = pwVar.b;
            if (pyVar.O0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (!kVar.s() && pyVar.Q == 0.0f) {
                    q70 q70Var = pyVar.I0;
                    if (q70Var != null && q70Var.D()) {
                        pyVar.I0.u();
                        pyVar.I0 = null;
                        return false;
                    }
                    if (j00Var.getId() != pyVar.w0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = pyVar.getMessagesController().getDialogFilters();
                        int id2 = j00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(j00Var.getId());
                            boolean z13 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = pyVar.getMessagesController();
                            arrayList = new ArrayList(!z13 ? messagesController.getDialogs(pyVar.S2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = pyVar.getMessagesController().getDialogFilters().get(j00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i12 = 0;
                                    while (i12 < arrayList.size()) {
                                        boolean z14 = z13;
                                        if (!dialogFilter3.includesDialog(pyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i12)).id)) {
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
                                            if (longValue < 0 && (chat = pyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.b10.g0(chat)) {
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
                                        if (!pyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i14)).id, 0L)) {
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
                                    q70 H = q70.H(pyVar, j00Var);
                                    yv yvVar = new yv(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    yvVar.c = paint;
                                    yvVar.b = new RectF();
                                    paint.setColor(pwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                                    H.W(yvVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.zi(pwVar, 23), pyVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z16 = z4;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new mh.r5(pwVar, z16, dialogFilter, 20), false);
                                    H.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new mh.r5(pwVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new q51(18, pwVar, arrayList), z15);
                                    H.l(R.drawable.msg_share, org.telegram.ui.b10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.sq(pwVar, zArr, dialogFilter2, 3), z10);
                                    H.m(!z16, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new q51(19, pwVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    pyVar.I0 = H;
                                    l00Var.C.c1(true);
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
                            q70 H2 = q70.H(pyVar, j00Var);
                            yv yvVar2 = new yv(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            yvVar2.c = paint2;
                            yvVar2.b = new RectF();
                            paint2.setColor(pwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                            H2.W(yvVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.zi(pwVar, 23), pyVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z162 = z4;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new mh.r5(pwVar, z162, dialogFilter, 20), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new mh.r5(pwVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new q51(18, pwVar, arrayList), z152);
                            H2.l(R.drawable.msg_share, org.telegram.ui.b10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.sq(pwVar, zArr, dialogFilter2, 3), z10);
                            H2.m(!z162, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new q51(19, pwVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            pyVar.I0 = H2;
                            l00Var.C.c1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = pyVar.getMessagesController();
                    arrayList = new ArrayList(!z13 ? messagesController2.getDialogs(pyVar.S2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z11 = false;
                    boolean z1522 = false;
                    while (i11 < arrayList.size()) {
                    }
                    q70 H22 = q70.H(pyVar, j00Var);
                    yv yvVar22 = new yv(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    yvVar22.c = paint22;
                    yvVar22.b = new RectF();
                    paint22.setColor(pwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                    H22.W(yvVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.zi(pwVar, 23), pyVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1622 = z4;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z4 ? R.string.FilterEditAll : R.string.FilterEdit), new mh.r5(pwVar, z1622, dialogFilter, 20), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z11 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z11 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new mh.r5(pwVar, arrayList, z11, 21), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new q51(18, pwVar, arrayList), z1522);
                    H22.l(R.drawable.msg_share, org.telegram.ui.b10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.sq(pwVar, zArr2, dialogFilter2, 3), z10);
                    H22.m(!z1622, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new q51(19, pwVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    pyVar.I0 = H22;
                    l00Var.C.c1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
