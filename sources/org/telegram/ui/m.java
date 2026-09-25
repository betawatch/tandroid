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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0178  */
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
        int i12 = 10;
        int i13 = 22;
        int i14 = 29;
        int i15 = 17;
        int i16 = 24;
        int i17 = 2;
        int i18 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1((q) obj, tL_error, tLObject2, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new r1((k9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new aj((no) obj, i12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new fh(i15, (rp) obj, tLObject2));
                break;
            case 4:
                pr prVar = (pr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    prVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new fh(i13, prVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new es((ms) obj, 2));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new fu((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new sq((n00) obj, tL_error, tLObject2, 7));
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
                AndroidUtilities.runOnUIThread(new tt(i16, (o70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new n80(11, (zb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new sq((bf0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new n80(21, (cf0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new jf0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new jf0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, 2));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new c10((NotificationsSettingsActivity) obj, i14));
                break;
            case 16:
                bn0 bn0Var = (bn0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new sj0(i12, bn0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new jf0((PremiumPreviewFragment) obj, tL_error, tLObject2, i13));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new sj0(i14, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new jx0(i18, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                a11 a11Var = (a11) obj;
                int i19 = a11Var.f;
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
                                        str = i4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                        size = pageblocklist.items.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                String F = i4.F(tL_pageListItemText.text);
                                                String charSequence = i4.B(tL_pageListItemText.text).toString();
                                                if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                    if (str != null) {
                                                        strArr = new String[i17];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        strArr[1] = str;
                                                    } else {
                                                        strArr = new String[]{LocaleController.getString(R.string.SettingsSearchFaq)};
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                    i10++;
                                                    i17 = 2;
                                                }
                                            }
                                            i10++;
                                            i17 = 2;
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
                                a11Var.E = webPage;
                            }
                            i20++;
                            i17 = 2;
                        }
                        a11Var.E = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new jx0(i15, a11Var, arrayList));
                }
                a11Var.F = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ta1((StickersActivity) obj, 1));
                break;
            case 22:
                le1 le1Var = (le1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i21 = 0; i21 < tL_messages_inactiveChats.chats.size(); i21++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i21);
                        int currentTime = (le1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i21).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new qd1(le1Var, arrayList2, tL_messages_inactiveChats, 3));
                    break;
                }
                break;
            case 23:
                gh1 gh1Var = (gh1) obj;
                gh1Var.getClass();
                AndroidUtilities.runOnUIThread(new p81(19, gh1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new vz0((WallpapersListActivity) obj, 26));
                break;
            default:
                bj1 bj1Var = (bj1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new p81(i16, bj1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
