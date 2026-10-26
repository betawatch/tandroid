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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        boolean z10;
        int i10;
        String str;
        int size;
        int i11;
        int i12;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i13 = this.a;
        int i14 = 11;
        int i15 = 6;
        int i16 = 10;
        int i17 = 2;
        int i18 = 1;
        int i19 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1((o) obj, tL_error, tLObject2, i17));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q1((o9) obj, tL_error, tLObject2, i15));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ui((ko) obj, i14));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ed(26, (np) obj, tLObject2));
                break;
            case 4:
                kr krVar = (kr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    krVar.getMessagesController().lambda$processUpdates$379(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ip(1, krVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new zr((js) obj, i17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new wt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new nq((b00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 9:
                y40 y40Var = (y40) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    y40Var.b.d.getMessagesController().lambda$processUpdates$379((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    y40Var.getClass();
                    break;
                }
            case 10:
                AndroidUtilities.runOnUIThread(new sz(i14, (f70) obj, tL_error));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new sz(28, (lb0) obj, tLObject2));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new nq((re0) obj, tLObject2, tL_error, 29));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new wb0(8, (se0) obj, tL_error));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new oe0((jf0) obj, tL_error, tLObject2, i17));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new oe0((of0) obj, tLObject2, tL_error, 4));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new lj0((NotificationsSettingsActivity) obj, 1));
                break;
            case 17:
                dn0 dn0Var = (dn0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new yl0(i17, dn0Var, tL_error));
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new oe0((PremiumPreviewFragment) obj, tL_error, tLObject2, 25));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new yl0(21, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new yl0(23, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 21:
                u01 u01Var = (u01) obj;
                int i20 = u01Var.f;
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
                        while (true) {
                            if (i21 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i21);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i21 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i21 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = j4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            i11 = i19;
                                            while (i11 < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i11);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String F = j4.F(tL_pageListItemText.text);
                                                    String charSequence = j4.B(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            i12 = i19;
                                                            strArr = new String[2];
                                                            strArr[i12] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                            strArr[i18] = str;
                                                        } else {
                                                            i12 = i19;
                                                            strArr = new String[i18];
                                                            strArr[i12] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        }
                                                        arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                        i11++;
                                                        i19 = i12;
                                                        i18 = 1;
                                                    }
                                                }
                                                i12 = i19;
                                                i11++;
                                                i19 = i12;
                                                i18 = 1;
                                            }
                                            i10 = i19;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i11 = i19;
                                    while (i11 < size) {
                                    }
                                    i10 = i19;
                                } else {
                                    i10 = i19;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i21++;
                                i19 = i10;
                                i18 = 1;
                            } else {
                                i10 = i19;
                            }
                        }
                        u01Var.E = webPage;
                    } else {
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new fy0(i16, u01Var, arrayList));
                    z10 = i10;
                } else {
                    z10 = 0;
                }
                u01Var.F = z10;
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new x91((StickersActivity) obj, 1));
                break;
            case 23:
                pd1 pd1Var = (pd1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i22 = 0; i22 < tL_messages_inactiveChats.chats.size(); i22++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i22);
                        int currentTime = (pd1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i22).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new h71(pd1Var, arrayList2, tL_messages_inactiveChats, i15));
                    break;
                }
                break;
            case 24:
                jg1 jg1Var = (jg1) obj;
                jg1Var.getClass();
                AndroidUtilities.runOnUIThread(new zc1(i16, jg1Var, tLObject2));
                break;
            case 25:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new vh1((WallpapersListActivity) obj, i19));
                break;
            default:
                ei1 ei1Var = (ei1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(9, ei1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
