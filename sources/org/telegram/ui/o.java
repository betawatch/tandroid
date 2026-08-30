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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
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
        int i12 = 7;
        int i13 = 1;
        int i14 = 2;
        int i15 = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1((r) obj, tL_error, tLObject2, i14));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s1((l9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zi((no) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hp(i15, (qp) obj, tLObject2));
                break;
            case 4:
                pr prVar = (pr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    prVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new hp(5, prVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new fs((ns) obj, i14));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new hu((DataSettingsActivity) obj, i15));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new rq((o00) obj, tL_error, tLObject2, i12));
                break;
            case 8:
                g50 g50Var = (g50) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    g50Var.b.d.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    g50Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new g00(i12, (m70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new g00(24, (wb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new rq((ze0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new fe0(4, (af0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new hf0(obj, (Object) tL_error, (Object) tLObject2, i15));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new hf0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i14));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new c10((NotificationsSettingsActivity) obj, 29));
                break;
            case 16:
                ym0 ym0Var = (ym0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new fe0(23, ym0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new hf0((PremiumPreviewFragment) obj, tL_error, tLObject2, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zq0(12, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new zq0(14, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                r01 r01Var = (r01) obj;
                int i16 = r01Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i16).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i17);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i17 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i17 - 1);
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
                                                        strArr[i13] = str;
                                                    } else {
                                                        strArr = new String[i13];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                }
                                            }
                                            i10++;
                                            i13 = 1;
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
                                r01Var.B = webPage;
                            }
                            i17++;
                            i13 = 1;
                        }
                        r01Var.B = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new l01(i15, r01Var, arrayList));
                }
                r01Var.C = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ha1((StickersActivity) obj, 1));
                break;
            case 22:
                yd1 yd1Var = (yd1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i18 = 0; i18 < tL_messages_inactiveChats.chats.size(); i18++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i18);
                        int currentTime = (yd1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i18).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ed1(yd1Var, arrayList2, tL_messages_inactiveChats, 3));
                    break;
                }
                break;
            case 23:
                ug1 ug1Var = (ug1) obj;
                ug1Var.getClass();
                AndroidUtilities.runOnUIThread(new kg1(i14, ug1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.h0;
                AndroidUtilities.runOnUIThread(new vy0((WallpapersListActivity) obj, 28));
                break;
            default:
                pi1 pi1Var = (pi1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new kg1(i12, pi1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
