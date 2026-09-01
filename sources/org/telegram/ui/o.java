package org.telegram.ui;

import android.text.TextUtils;
import android.view.KeyEvent;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        int size;
        int i10;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i11 = this.a;
        int i12 = 22;
        int i13 = 3;
        int i14 = 27;
        int i15 = 29;
        int i16 = 6;
        int i17 = 2;
        int i18 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1((r) obj, tL_error, tLObject2, i17));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s1((l9) obj, tL_error, tLObject2, i16));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zi((no) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new fc(i15, (rp) obj, tLObject2));
                break;
            case 4:
                qr qrVar = (qr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    qrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new mp(4, qrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gs((os) obj, i17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new iu((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new sq((o00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                h50 h50Var = (h50) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    h50Var.b.d.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    h50Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new v10(i16, (n70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new v10(23, (xb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new sq((af0) obj, tLObject2, tL_error, i14));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new he0(i13, (bf0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new if0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new if0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i17));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new c10((NotificationsSettingsActivity) obj, i15));
                break;
            case 16:
                an0 an0Var = (an0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new he0(i12, an0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new if0((PremiumPreviewFragment) obj, tL_error, tLObject2, i12));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new br0(11, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new br0(13, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                s01 s01Var = (s01) obj;
                int i19 = s01Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i19).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i19).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i20);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i20 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i20 - 1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                        str = l4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                        size = pageblocklist.items.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                String F = l4.F(tL_pageListItemText.text);
                                                String charSequence = l4.B(tL_pageListItemText.text).toString();
                                                if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                    if (str != null) {
                                                        strArr = new String[2];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        strArr[i18] = str;
                                                    } else {
                                                        strArr = new String[i18];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                    i10++;
                                                    i18 = 1;
                                                }
                                            }
                                            i10++;
                                            i18 = 1;
                                        }
                                    }
                                }
                                str = null;
                                TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                size = pageblocklist2.items.size();
                                i10 = 0;
                                while (i10 < size) {
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                s01Var.B = webPage;
                            }
                            i20++;
                            i18 = 1;
                        }
                        s01Var.B = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new br0(i15, s01Var, arrayList));
                }
                s01Var.C = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ia1((StickersActivity) obj, 1));
                break;
            case 22:
                be1 be1Var = (be1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i21 = 0; i21 < tL_messages_inactiveChats.chats.size(); i21++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i21);
                        int currentTime = (be1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i21).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new gd1(be1Var, arrayList2, tL_messages_inactiveChats, i13));
                    break;
                }
                break;
            case 23:
                wg1 wg1Var = (wg1) obj;
                wg1Var.getClass();
                AndroidUtilities.runOnUIThread(new mg1(i18, wg1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.h0;
                AndroidUtilities.runOnUIThread(new xy0((WallpapersListActivity) obj, i14));
                break;
            default:
                si1 si1Var = (si1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new mg1(i16, si1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
