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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
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
        int i13 = 10;
        int i14 = 28;
        int i15 = 3;
        int i16 = 5;
        int i17 = 1;
        int i18 = 2;
        int i19 = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1((r) obj, tL_error, tLObject2, i18));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s1((l9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zi((no) obj, i13));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new xc(i14, (rp) obj, tLObject2));
                break;
            case 4:
                qr qrVar = (qr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    qrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new mp(i15, qrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gs((os) obj, i18));
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
                AndroidUtilities.runOnUIThread(new z10(i16, (n70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new z10(i12, (xb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new sq((af0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ue0(i18, (bf0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new if0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new if0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i18));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new c10((NotificationsSettingsActivity) obj, 29));
                break;
            case 16:
                an0 an0Var = (an0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ue0(21, an0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new if0((PremiumPreviewFragment) obj, tL_error, tLObject2, i12));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new pr0(i13, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new pr0(12, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                x01 x01Var = (x01) obj;
                int i20 = x01Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i20).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i20).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i21);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i21 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i21 - 1);
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
                                                        strArr[i17] = str;
                                                    } else {
                                                        strArr = new String[i17];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                    i10++;
                                                    i17 = 1;
                                                }
                                            }
                                            i10++;
                                            i17 = 1;
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
                                x01Var.B = webPage;
                            }
                            i21++;
                            i17 = 1;
                        }
                        x01Var.B = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new pr0(i14, x01Var, arrayList));
                }
                x01Var.C = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new oa1((StickersActivity) obj, 1));
                break;
            case 22:
                he1 he1Var = (he1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i22 = 0; i22 < tL_messages_inactiveChats.chats.size(); i22++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i22);
                        int currentTime = (he1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i22).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ld1(he1Var, arrayList2, tL_messages_inactiveChats, i15));
                    break;
                }
                break;
            case 23:
                ch1 ch1Var = (ch1) obj;
                ch1Var.getClass();
                AndroidUtilities.runOnUIThread(new bh1(i19, ch1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.h0;
                AndroidUtilities.runOnUIThread(new sz0((WallpapersListActivity) obj, 26));
                break;
            default:
                yi1 yi1Var = (yi1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new bh1(i16, yi1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
