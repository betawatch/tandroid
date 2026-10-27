package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLObject tLObject2;
        boolean z10;
        int i10;
        String str;
        int size;
        int i11;
        int i12;
        String[] strArr;
        int i13 = this.a;
        int i14 = 7;
        int i15 = 11;
        int i16 = 2;
        int i17 = 1;
        int i18 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1((o) obj, tL_error, tLObject, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q1((o9) obj, tL_error, tLObject, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new xi((mo) obj, i15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ed(26, (pp) obj, tLObject));
                break;
            case 4:
                mr mrVar = (mr) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mrVar.getMessagesController().lambda$processUpdates$379(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new kp(i17, mrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new bs((ls) obj, 2));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new pq((d00) obj, tL_error, tLObject, i14));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 9:
                a50 a50Var = (a50) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    a50Var.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                    break;
                } else {
                    a50Var.getClass();
                    break;
                }
            case 10:
                AndroidUtilities.runOnUIThread(new kz(12, (h70) obj, tL_error));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new kz(29, (ob0) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ne0((te0) obj, tLObject, tL_error, 0));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new kb0(9, (ue0) obj, tL_error));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ne0((lf0) obj, tL_error, tLObject, false, 3));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ne0((qf0) obj, tLObject, tL_error, 5));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new nj0((NotificationsSettingsActivity) obj, i17));
                break;
            case 17:
                fn0 fn0Var = (fn0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new am0(3, fn0Var, tL_error));
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ne0((PremiumPreviewFragment) obj, tL_error, tLObject, false, 26));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new am0(22, (PrivacyControlActivity) obj, tLObject));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new am0(24, privacySettingsActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            case 21:
                w01 w01Var = (w01) obj;
                int i19 = w01Var.f;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i19).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i19).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                } else {
                    tLObject2 = tLObject;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i20);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i20 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i20 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = j4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            i11 = i18;
                                            while (i11 < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i11);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String F = j4.F(tL_pageListItemText.text);
                                                    String charSequence = j4.B(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            i12 = i18;
                                                            strArr = new String[i16];
                                                            strArr[i12] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                            strArr[1] = str;
                                                        } else {
                                                            i12 = i18;
                                                            strArr = new String[1];
                                                            strArr[i12] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        }
                                                        arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                        i11++;
                                                        i18 = i12;
                                                        i16 = 2;
                                                    }
                                                }
                                                i12 = i18;
                                                i11++;
                                                i18 = i12;
                                                i16 = 2;
                                            }
                                            i10 = i18;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i11 = i18;
                                    while (i11 < size) {
                                    }
                                    i10 = i18;
                                } else {
                                    i10 = i18;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i20++;
                                i18 = i10;
                                i16 = 2;
                            } else {
                                i10 = i18;
                            }
                        }
                        w01Var.E = webPage;
                    } else {
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new by0(i15, w01Var, arrayList));
                    z10 = i10;
                } else {
                    z10 = 0;
                }
                w01Var.F = z10;
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new z91((StickersActivity) obj, 1));
                break;
            case 23:
                rd1 rd1Var = (rd1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i21 = 0; i21 < tL_messages_inactiveChats.chats.size(); i21++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i21);
                        int currentTime = (rd1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i21).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new t31(rd1Var, arrayList2, tL_messages_inactiveChats, i14));
                    break;
                }
                break;
            case 24:
                lg1 lg1Var = (lg1) obj;
                lg1Var.getClass();
                AndroidUtilities.runOnUIThread(new yc1(i15, lg1Var, tLObject));
                break;
            case 25:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new xh1((WallpapersListActivity) obj, i18));
                break;
            default:
                gi1 gi1Var = (gi1) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.a6(10, gi1Var, tLObject));
                    break;
                }
                break;
        }
    }
}
