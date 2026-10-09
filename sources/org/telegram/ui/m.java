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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
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
        int i12 = 22;
        int i13 = 27;
        int i14 = 1;
        int i15 = 2;
        int i16 = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1((q) obj, tL_error, tLObject2, i15));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new r1((j9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cj((qo) obj, 11));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new sg(20, (up) obj, tLObject2));
                break;
            case 4:
                tr trVar = (tr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    trVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new sg(25, trVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new is((qs) obj, i15));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new iu((DataSettingsActivity) obj, i16));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new vq((r00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                j50 j50Var = (j50) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    j50Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    j50Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new m70(i16, (s70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new m70(17, (ec0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new vq((gf0) obj, tLObject2, tL_error, i13));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new m70(i13, (hf0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new of0(obj, (Object) tL_error, (Object) tLObject2, i16));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new of0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i15));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new tk0((NotificationsSettingsActivity) obj, i16));
                break;
            case 16:
                in0 in0Var = (in0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new tf0(19, in0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new of0((PremiumPreviewFragment) obj, tL_error, tLObject2, i12));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new rt0(8, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new rt0(10, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                i11 i11Var = (i11) obj;
                int i17 = i11Var.f;
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
                                                        strArr[i14] = str;
                                                    } else {
                                                        strArr = new String[i14];
                                                        strArr[0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                    }
                                                    arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                }
                                            }
                                            i10++;
                                            i14 = 1;
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
                                i11Var.E = webPage;
                            }
                            i18++;
                            i14 = 1;
                        }
                        i11Var.E = webPage;
                    }
                    AndroidUtilities.runOnUIThread(new rt0(26, i11Var, arrayList));
                }
                i11Var.F = false;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new cb1((StickersActivity) obj, 1));
                break;
            case 22:
                ue1 ue1Var = (ue1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i19 = 0; i19 < tL_messages_inactiveChats.chats.size(); i19++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i19);
                        int currentTime = (ue1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i19).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new zd1(ue1Var, arrayList2, tL_messages_inactiveChats, 3));
                    break;
                }
                break;
            case 23:
                ph1 ph1Var = (ph1) obj;
                ph1Var.getClass();
                AndroidUtilities.runOnUIThread(new n31(28, ph1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new nz0((WallpapersListActivity) obj, i13));
                break;
            default:
                lj1 lj1Var = (lj1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new ii1(i12, lj1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
