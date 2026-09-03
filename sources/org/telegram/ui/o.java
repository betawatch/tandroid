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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        int i14 = 29;
        int i15 = 6;
        int i16 = 2;
        int i17 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((r) obj, tL_error, tLObject2, i16));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new u1((n9) obj, tL_error, tLObject2, i15));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bj((po) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hc(i14, (sp) obj, tLObject2));
                break;
            case 4:
                rr rrVar = (rr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    rrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new np(4, rrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new hs((ps) obj, i16));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ju((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new tq((p00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                i50 i50Var = (i50) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    i50Var.b.d.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    i50Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new w10(i15, (o70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new w10(23, (yb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new tq((bf0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ie0(i13, (cf0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new jf0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new jf0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i16));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new d10((NotificationsSettingsActivity) obj, i14));
                break;
            case 16:
                an0 an0Var = (an0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new ie0(i12, an0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new jf0((PremiumPreviewFragment) obj, tL_error, tLObject2, i12));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new gr0(11, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new gr0(13, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                x01 x01Var = (x01) obj;
                int i18 = x01Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i18).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i18).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i19);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i19 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i19 - 1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                        str = n4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                        size = pageblocklist.items.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                String F = n4.F(tL_pageListItemText.text);
                                                String charSequence = n4.B(tL_pageListItemText.text).toString();
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
                            i19++;
                            i17 = 1;
                        }
                        x01Var.B = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new gr0(i14, x01Var, arrayList));
                }
                x01Var.C = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new pa1((StickersActivity) obj, 1));
                break;
            case 22:
                ge1 ge1Var = (ge1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i20 = 0; i20 < tL_messages_inactiveChats.chats.size(); i20++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i20);
                        int currentTime = (ge1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i20).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ld1(ge1Var, arrayList2, tL_messages_inactiveChats, i13));
                    break;
                }
                break;
            case 23:
                ch1 ch1Var = (ch1) obj;
                ch1Var.getClass();
                AndroidUtilities.runOnUIThread(new sg1(i17, ch1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.h0;
                AndroidUtilities.runOnUIThread(new sz0((WallpapersListActivity) obj, 26));
                break;
            default:
                xi1 xi1Var = (xi1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new sg1(i15, xi1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
