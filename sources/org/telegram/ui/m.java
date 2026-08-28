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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i9) {
        this.a = i9;
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
        int i9;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i10 = this.a;
        int i11 = 29;
        int i12 = 6;
        int i13 = 24;
        int i14 = 28;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((p) obj, tL_error, tLObject2, i15));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((i9) obj, tL_error, tLObject2, i12));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ri((fo) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rd(i13, (hp) obj, tLObject2));
                break;
            case 4:
                jr jrVar = (jr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    jrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rd(i11, jrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new as((is) obj, i15));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new jq((a00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                r40 r40Var = (r40) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    r40Var.b.d.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    r40Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new x20(1, (z60) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new x20(18, (kb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new jq((qe0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new x20(i14, (re0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ye0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ye0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i15));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new o00((NotificationsSettingsActivity) obj, i11));
                break;
            case 16:
                rm0 rm0Var = (rm0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new cf0(17, rm0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ye0((PremiumPreviewFragment) obj, tL_error, tLObject2, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ys0(i12, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new ys0(8, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                f01 f01Var = (f01) obj;
                int i17 = f01Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i17).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i18);
                            if (pageBlock instanceof TL_iv.pageBlockList) {
                                if (i18 != 0) {
                                    TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i18 - 1);
                                    if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                        str = l4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                        size = pageblocklist.items.size();
                                        i9 = 0;
                                        while (i9 < size) {
                                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i9);
                                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                String F = l4.F(tL_pageListItemText.text);
                                                String charSequence = l4.B(tL_pageListItemText.text).toString();
                                                if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                    if (str != null) {
                                                        strArr = new String[2];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        strArr[i16] = str;
                                                    } else {
                                                        strArr = new String[i16];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                    i9++;
                                                    i16 = 1;
                                                }
                                            }
                                            i9++;
                                            i16 = 1;
                                        }
                                    }
                                }
                                str = null;
                                TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                size = pageblocklist2.items.size();
                                i9 = 0;
                                while (i9 < size) {
                                }
                            } else if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                f01Var.A = webPage;
                            }
                            i18++;
                            i16 = 1;
                        }
                        f01Var.A = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new ys0(i13, f01Var, arrayList));
                }
                f01Var.B = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new t91((StickersActivity) obj, 1));
                break;
            case 22:
                kd1 kd1Var = (kd1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i19 = 0; i19 < tL_messages_inactiveChats.chats.size(); i19++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i19);
                        int currentTime = (kd1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i19).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new qc1(kd1Var, arrayList2, tL_messages_inactiveChats, 3));
                    break;
                }
                break;
            case 23:
                gg1 gg1Var = (gg1) obj;
                gg1Var.getClass();
                AndroidUtilities.runOnUIThread(new n21(26, gg1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new ky0((WallpapersListActivity) obj, i14));
                break;
            default:
                bi1 bi1Var = (bi1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new ai1(i16, bi1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
