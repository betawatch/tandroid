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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
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
        int i12 = 6;
        int i13 = 12;
        int i14 = 26;
        int i15 = 19;
        int i16 = 1;
        int i17 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1((p) obj, tL_error, tLObject2, i17));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new r1((k9) obj, tL_error, tLObject2, i12));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new aj((oo) obj, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rh(i13, (sp) obj, tLObject2));
                break;
            case 4:
                qr qrVar = (qr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    qrVar.getMessagesController().processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rh(17, qrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new fs((ns) obj, i17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gu((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new tq((o00) obj, tL_error, tLObject2, 7));
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
                AndroidUtilities.runOnUIThread(new hw(i15, (q70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ia0(i12, (ac0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new tq((cf0) obj, tLObject2, tL_error, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ia0(16, (df0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new kf0(obj, (Object) tL_error, (Object) tLObject2, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new kf0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i17));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new d10((NotificationsSettingsActivity) obj, 29));
                break;
            case 16:
                dn0 dn0Var = (dn0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new gl0(5, dn0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new kf0((PremiumPreviewFragment) obj, tL_error, tLObject2, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new gl0(24, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new gl0(i14, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                c11 c11Var = (c11) obj;
                int i18 = c11Var.f;
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
                                                        strArr = new String[2];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        strArr[i16] = str;
                                                    } else {
                                                        strArr = new String[i16];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                    i10++;
                                                    i16 = 1;
                                                }
                                            }
                                            i10++;
                                            i16 = 1;
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
                                c11Var.E = webPage;
                            }
                            i19++;
                            i16 = 1;
                        }
                        c11Var.E = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new by0(i13, c11Var, arrayList));
                }
                c11Var.F = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new sa1((StickersActivity) obj, 1));
                break;
            case 22:
                le1 le1Var = (le1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i20 = 0; i20 < tL_messages_inactiveChats.chats.size(); i20++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i20);
                        int currentTime = (le1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i20).intValue()) / 86400;
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
                AndroidUtilities.runOnUIThread(new hb1(14, gh1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new xz0((WallpapersListActivity) obj, i14));
                break;
            default:
                bj1 bj1Var = (bj1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new hb1(i15, bj1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
