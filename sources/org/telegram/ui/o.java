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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0170  */
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
        int i12 = 21;
        int i13 = 3;
        int i14 = 28;
        int i15 = 1;
        int i16 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((r) obj, tL_error, tLObject2, i16));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new u1((h9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ui((io) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new vf(i12, (kp) obj, tLObject2));
                break;
            case 4:
                jr jrVar = (jr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    jrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new vf(26, jrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new zr((hs) obj, i16));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lq((c00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                u40 u40Var = (u40) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    u40Var.b.d.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    u40Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(i14, (c70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new x60(15, (mb0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new lq((pe0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new x60(25, (qe0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new xe0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new xe0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i16));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new q00((NotificationsSettingsActivity) obj, 29));
                break;
            case 16:
                qm0 qm0Var = (qm0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new lf0(14, qm0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new xe0((PremiumPreviewFragment) obj, tL_error, tLObject2, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new av0(i13, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new av0(5, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                g01 g01Var = (g01) obj;
                int i17 = g01Var.f;
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
                                        str = m4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                        TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                        size = pageblocklist.items.size();
                                        i10 = 0;
                                        while (i10 < size) {
                                            TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                                            if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                String F = m4.F(tL_pageListItemText.text);
                                                String charSequence = m4.B(tL_pageListItemText.text).toString();
                                                if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                    if (str != null) {
                                                        strArr = new String[2];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        strArr[i15] = str;
                                                    } else {
                                                        strArr = new String[i15];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                    i10++;
                                                    i15 = 1;
                                                }
                                            }
                                            i10++;
                                            i15 = 1;
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
                                g01Var.A = webPage;
                            }
                            i18++;
                            i15 = 1;
                        }
                        g01Var.A = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new av0(i12, g01Var, arrayList));
                }
                g01Var.B = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new u91((StickersActivity) obj, 1));
                break;
            case 22:
                md1 md1Var = (md1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i19 = 0; i19 < tL_messages_inactiveChats.chats.size(); i19++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i19);
                        int currentTime = (md1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i19).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new sc1(md1Var, arrayList2, tL_messages_inactiveChats, i13));
                    break;
                }
                break;
            case 23:
                ig1 ig1Var = (ig1) obj;
                ig1Var.getClass();
                AndroidUtilities.runOnUIThread(new t31(23, ig1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new ky0((WallpapersListActivity) obj, i14));
                break;
            default:
                ci1 ci1Var = (ci1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new t31(i14, ci1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
