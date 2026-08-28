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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz implements nk0, ok0 {
    public final /* synthetic */ vz a;

    public /* synthetic */ mz(vz vzVar) {
        this.a = vzVar;
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
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i9, View view) {
        org.telegram.ui.ActionBar.k kVar;
        MessagesController.DialogFilter dialogFilter;
        ArrayList arrayList;
        boolean z10;
        MessagesController.DialogFilter dialogFilter2;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        TLRPC.Chat chat;
        vz vzVar = this.a;
        qz qzVar = vzVar.F;
        if (!((org.telegram.ui.dw) qzVar).b.f2 && !vzVar.n) {
            tz tzVar = (tz) view;
            org.telegram.ui.dw dwVar = (org.telegram.ui.dw) qzVar;
            org.telegram.ui.dy dyVar = dwVar.b;
            if (dyVar.N0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (!kVar.s() && dyVar.P == 0.0f) {
                    x60 x60Var = dyVar.H0;
                    if (x60Var != null && x60Var.D()) {
                        dyVar.H0.u();
                        dyVar.H0 = null;
                        return false;
                    }
                    if (tzVar.getId() != dyVar.v0.getDefaultTabId()) {
                        ArrayList<MessagesController.DialogFilter> dialogFilters = dyVar.getMessagesController().getDialogFilters();
                        int id2 = tzVar.getId();
                        if (dialogFilters != null && id2 >= 0 && id2 < dialogFilters.size()) {
                            dialogFilter = dialogFilters.get(tzVar.getId());
                            boolean z14 = dialogFilter != null;
                            boolean[] zArr = {true};
                            MessagesController messagesController = dyVar.getMessagesController();
                            arrayList = new ArrayList(!z14 ? messagesController.getDialogs(dyVar.R2) : messagesController.getAllDialogs());
                            if (dialogFilter == null) {
                                MessagesController.DialogFilter dialogFilter3 = dyVar.getMessagesController().getDialogFilters().get(tzVar.getId());
                                if (dialogFilter3 != null) {
                                    int i11 = 0;
                                    while (i11 < arrayList.size()) {
                                        boolean z15 = z14;
                                        if (!dialogFilter3.includesDialog(dyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i11)).id)) {
                                            arrayList.remove(i11);
                                            i11--;
                                        }
                                        i11++;
                                        z14 = z15;
                                    }
                                    z10 = z14;
                                    z11 = dialogFilter3.isChatlist() || (dialogFilter3.neverShow.isEmpty() && (dialogFilter3.flags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0);
                                    if (z11) {
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= dialogFilter3.alwaysShow.size()) {
                                                break;
                                            }
                                            long longValue = dialogFilter3.alwaysShow.get(i12).longValue();
                                            if (longValue < 0 && (chat = dyVar.getMessagesController().getChat(Long.valueOf(-longValue))) != null && org.telegram.ui.n00.f0(chat)) {
                                                zArr[0] = false;
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                } else {
                                    z10 = z14;
                                    z11 = false;
                                }
                                if (!arrayList.isEmpty()) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= arrayList.size()) {
                                            dialogFilter2 = dialogFilter3;
                                            z13 = true;
                                            break;
                                        }
                                        dialogFilter2 = dialogFilter3;
                                        int i14 = i13;
                                        if (!dyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i13)).id, 0L)) {
                                            z13 = false;
                                            break;
                                        }
                                        i13 = i14 + 1;
                                        dialogFilter3 = dialogFilter2;
                                    }
                                    z12 = !z13;
                                    boolean z16 = false;
                                    for (i10 = 0; i10 < arrayList.size(); i10++) {
                                        if (((TLRPC.Dialog) arrayList.get(i10)).unread_mark || ((TLRPC.Dialog) arrayList.get(i10)).unread_count > 0) {
                                            z16 = true;
                                        }
                                    }
                                    x60 H = x60.H(dyVar, tzVar);
                                    mv mvVar = new mv(3, (byte) 0);
                                    Paint paint = new Paint(1);
                                    mvVar.c = paint;
                                    mvVar.b = new RectF();
                                    paint.setColor(dwVar.b.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
                                    H.W(mvVar);
                                    H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ri(dwVar, 23), dyVar.getMessagesController().getDialogFilters().size() > 1);
                                    boolean z17 = z10;
                                    H.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new gh.u5(dwVar, z17, dialogFilter, 22), false);
                                    H.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new gh.u5(dwVar, arrayList, z12, 23), dialogFilter == null && !arrayList.isEmpty());
                                    H.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new p61(14, dwVar, arrayList), z16);
                                    H.l(R.drawable.msg_share, org.telegram.ui.n00.w0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.jq(dwVar, zArr, dialogFilter2, 3), z11);
                                    H.m(!z17, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new p61(15, dwVar, dialogFilter));
                                    H.s = 96;
                                    H.i = 3;
                                    H.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                                    H.Z();
                                    dyVar.H0 = H;
                                    vzVar.B.d1(true);
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
                            while (i10 < arrayList.size()) {
                            }
                            x60 H2 = x60.H(dyVar, tzVar);
                            mv mvVar2 = new mv(3, (byte) 0);
                            Paint paint2 = new Paint(1);
                            mvVar2.c = paint2;
                            mvVar2.b = new RectF();
                            paint2.setColor(dwVar.b.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
                            H2.W(mvVar2);
                            H2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ri(dwVar, 23), dyVar.getMessagesController().getDialogFilters().size() > 1);
                            boolean z172 = z10;
                            H2.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new gh.u5(dwVar, z172, dialogFilter, 22), false);
                            if (dialogFilter == null) {
                            }
                            H2.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new gh.u5(dwVar, arrayList, z12, 23), dialogFilter == null && !arrayList.isEmpty());
                            H2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new p61(14, dwVar, arrayList), z162);
                            H2.l(R.drawable.msg_share, org.telegram.ui.n00.w0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.jq(dwVar, zArr, dialogFilter2, 3), z11);
                            H2.m(!z172, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new p61(15, dwVar, dialogFilter));
                            H2.s = 96;
                            H2.i = 3;
                            H2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                            H2.Z();
                            dyVar.H0 = H2;
                            vzVar.B.d1(true);
                            return true;
                        }
                    }
                    dialogFilter = null;
                    if (dialogFilter != null) {
                    }
                    boolean[] zArr2 = {true};
                    MessagesController messagesController2 = dyVar.getMessagesController();
                    arrayList = new ArrayList(!z14 ? messagesController2.getDialogs(dyVar.R2) : messagesController2.getAllDialogs());
                    if (dialogFilter == null) {
                    }
                    z12 = false;
                    boolean z1622 = false;
                    while (i10 < arrayList.size()) {
                    }
                    x60 H22 = x60.H(dyVar, tzVar);
                    mv mvVar22 = new mv(3, (byte) 0);
                    Paint paint22 = new Paint(1);
                    mvVar22.c = paint22;
                    mvVar22.b = new RectF();
                    paint22.setColor(dwVar.b.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
                    H22.W(mvVar22);
                    H22.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ri(dwVar, 23), dyVar.getMessagesController().getDialogFilters().size() > 1);
                    boolean z1722 = z10;
                    H22.c(R.drawable.msg_edit, LocaleController.getString(z10 ? R.string.FilterEditAll : R.string.FilterEdit), new gh.u5(dwVar, z1722, dialogFilter, 22), false);
                    if (dialogFilter == null) {
                    }
                    H22.l(z12 ? R.drawable.msg_mute : R.drawable.msg_unmute, LocaleController.getString(z12 ? R.string.FilterMuteAll : R.string.FilterUnmuteAll), new gh.u5(dwVar, arrayList, z12, 23), dialogFilter == null && !arrayList.isEmpty());
                    H22.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new p61(14, dwVar, arrayList), z1622);
                    H22.l(R.drawable.msg_share, org.telegram.ui.n00.w0((dialogFilter2 == null && dialogFilter2.isMyChatlist()) ? -1 : 0, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.jq(dwVar, zArr2, dialogFilter2, 3), z11);
                    H22.m(!z1722, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new p61(15, dwVar, dialogFilter));
                    H22.s = 96;
                    H22.i = 3;
                    H22.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    H22.Z();
                    dyVar.H0 = H22;
                    vzVar.B.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        vz vzVar = this.a;
        qz qzVar = vzVar.F;
        if (((org.telegram.ui.dw) qzVar).b.f2) {
            return;
        }
        tz tzVar = (tz) view;
        if (!vzVar.n) {
            if (i9 != vzVar.G || qzVar == null) {
                vzVar.f(tzVar.b, i9);
                return;
            } else {
                ((org.telegram.ui.dw) qzVar).b.x4(true, false);
                return;
            }
        }
        if (i9 != 0) {
            int dp = AndroidUtilities.dp(6.0f);
            RectF rectF = tzVar.f;
            float f12 = dp;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.dw dwVar = (org.telegram.ui.dw) vzVar.F;
            dwVar.d(dwVar.b.getMessagesController().getDialogFilters().get(tzVar.b.a));
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
