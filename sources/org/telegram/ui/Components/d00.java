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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements nl0, ol0 {
    public final /* synthetic */ n00 a;

    public /* synthetic */ d00(n00 n00Var) {
        this.a = n00Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        n00 n00Var = this.a;
        h00 h00Var = n00Var.J;
        if (((org.telegram.ui.ly) h00Var).b.j2) {
            return;
        }
        l00 l00Var = (l00) view;
        if (!n00Var.n) {
            if (i10 != n00Var.K || h00Var == null) {
                n00Var.f(l00Var.b, i10);
                return;
            } else {
                ((org.telegram.ui.ly) h00Var).b.G4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = l00Var.f;
            float f11 = dp;
            if (rectF.left - f11 >= f7 || rectF.right + f11 <= f7) {
                return;
            }
            org.telegram.ui.ly lyVar = (org.telegram.ui.ly) n00Var.J;
            lyVar.d(lyVar.b.getMessagesController().getDialogFilters().get(l00Var.b.a));
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
    @Override // org.telegram.ui.Components.ol0
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
        n00 n00Var = this.a;
        h00 h00Var = n00Var.J;
        if (!((org.telegram.ui.ly) h00Var).b.j2 && !n00Var.n) {
            l00 l00Var = (l00) view;
            org.telegram.ui.ly lyVar = (org.telegram.ui.ly) h00Var;
            org.telegram.ui.uy uyVar = lyVar.b;
            if (uyVar.R0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (!kVar.s() && uyVar.T == 0.0f) {
                    b80 b80Var = uyVar.L0;
                    if (b80Var != null && b80Var.D()) {
                        uyVar.L0.u();
                        uyVar.L0 = null;
                        return false;
                    }
                    if (l00Var.getId() != uyVar.z0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = uyVar.getMessagesController().getDialogFilters();
                        int id2 = l00Var.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(l00Var.getId());
                            boolean z14 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = uyVar.getMessagesController();
                            arrayList = new ArrayList(!z14 ? messagesController.getDialogs(uyVar.V2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = uyVar.getMessagesController().getDialogFilters().get(l00Var.getId());
                                if (dialogFilter3 != null) {
                                    int i12 = 0;
                                    while (i12 < arrayList.size()) {
                                        boolean z15 = z14;
                                        if (!dialogFilter3.includesDialog(uyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i12)).id)) {
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
                                            if (longValue < 0 && (chat = uyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.f10.g0(chat)) {
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
                                        if (!uyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i14)).id, 0L)) {
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
                                    b80 H = b80.H(uyVar, l00Var);
                                    fw fwVar = new fw(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    fwVar.c = paint;
                                    fwVar.b = new RectF();
                                    paint.setColor(lyVar.b.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                                    H.W(fwVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.bj(lyVar, 25), uyVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z17 = z10;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new ci.y0(lyVar, z17, dialogFilter, 25), false);
                                    H.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new ci.y0(lyVar, arrayList, z12, 26), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.cu(7, lyVar, arrayList), z16);
                                    H.l(R.drawable.msg_share, org.telegram.ui.f10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.uq(lyVar, zArr, dialogFilter2, 3), z11);
                                    H.m(!z17, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.cu(8, lyVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    uyVar.L0 = H;
                                    n00Var.F.d1(true);
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
                            b80 H2 = b80.H(uyVar, l00Var);
                            fw fwVar2 = new fw(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            fwVar2.c = paint2;
                            fwVar2.b = new RectF();
                            paint2.setColor(lyVar.b.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                            H2.W(fwVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.bj(lyVar, 25), uyVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z172 = z10;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new ci.y0(lyVar, z172, dialogFilter, 25), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new ci.y0(lyVar, arrayList, z12, 26), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.cu(7, lyVar, arrayList), z162);
                            H2.l(R.drawable.msg_share, org.telegram.ui.f10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.uq(lyVar, zArr, dialogFilter2, 3), z11);
                            H2.m(!z172, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.cu(8, lyVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            uyVar.L0 = H2;
                            n00Var.F.d1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = uyVar.getMessagesController();
                    arrayList = new ArrayList(!z14 ? messagesController2.getDialogs(uyVar.V2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z12 = false;
                    boolean z1622 = false;
                    while (i11 < arrayList.size()) {
                    }
                    b80 H22 = b80.H(uyVar, l00Var);
                    fw fwVar22 = new fw(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    fwVar22.c = paint22;
                    fwVar22.b = new RectF();
                    paint22.setColor(lyVar.b.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    H22.W(fwVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.bj(lyVar, 25), uyVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1722 = z10;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new ci.y0(lyVar, z1722, dialogFilter, 25), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new ci.y0(lyVar, arrayList, z12, 26), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new org.telegram.ui.cu(7, lyVar, arrayList), z1622);
                    H22.l(R.drawable.msg_share, org.telegram.ui.f10.x0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.uq(lyVar, zArr2, dialogFilter2, 3), z11);
                    H22.m(!z1722, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new org.telegram.ui.cu(8, lyVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    uyVar.L0 = H22;
                    n00Var.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
