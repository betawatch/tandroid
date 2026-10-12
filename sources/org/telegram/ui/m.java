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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
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
        int i14 = 6;
        int i15 = 11;
        int i16 = 7;
        int i17 = 27;
        int i18 = 3;
        int i19 = 2;
        int i20 = 1;
        int i21 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((p) obj, tL_error, tLObject2, i19));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((n9) obj, tL_error, tLObject2, i14));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gj((wo) obj, i15));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rp(1, (aq) obj, tLObject2));
                break;
            case 4:
                yr yrVar = (yr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    yrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rp(i14, yrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new os((ws) obj, i19));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ou((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new br((x00) obj, tL_error, tLObject2, i16));
                break;
            case 8:
                q50 q50Var = (q50) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    q50Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    q50Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new o00(i15, (y70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new o00(28, (jc0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new br((mf0) obj, tLObject2, tL_error, i17));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new wc0(8, (nf0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new uf0(obj, (Object) tL_error, (Object) tLObject2, i21));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new uf0((KeyEvent.Callback) obj, tLObject2, (Object) tL_error, i19));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new yk0((NotificationsSettingsActivity) obj, i21));
                break;
            case 16:
                pn0 pn0Var = (pn0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new on0(0, pn0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new uf0((PremiumPreviewFragment) obj, tL_error, tLObject2, 22));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new on0(19, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new on0(21, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                p11 p11Var = (p11) obj;
                int i22 = p11Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i22).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i22).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i23 = 0;
                        while (true) {
                            if (i23 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i23);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i23 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i23 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = k4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            i11 = i21;
                                            while (i11 < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i11);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String F = k4.F(tL_pageListItemText.text);
                                                    String charSequence = k4.B(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            i12 = i21;
                                                            strArr = new String[2];
                                                            strArr[i12] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                            strArr[i20] = str;
                                                        } else {
                                                            i12 = i21;
                                                            strArr = new String[i20];
                                                            strArr[i12] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        }
                                                        arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                        i11++;
                                                        i21 = i12;
                                                        i20 = 1;
                                                    }
                                                }
                                                i12 = i21;
                                                i11++;
                                                i21 = i12;
                                                i20 = 1;
                                            }
                                            i10 = i21;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i11 = i21;
                                    while (i11 < size) {
                                    }
                                    i10 = i21;
                                } else {
                                    i10 = i21;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i23++;
                                i21 = i10;
                                i20 = 1;
                            } else {
                                i10 = i21;
                            }
                        }
                        p11Var.E = webPage;
                    } else {
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new hz0(i16, p11Var, arrayList));
                    z10 = i10;
                } else {
                    z10 = 0;
                }
                p11Var.F = z10;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ib1((StickersActivity) obj, 1));
                break;
            case 22:
                af1 af1Var = (af1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i24 = 0; i24 < tL_messages_inactiveChats.chats.size(); i24++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i24);
                        int currentTime = (af1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i24).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ee1(af1Var, arrayList2, tL_messages_inactiveChats, i18));
                    break;
                }
                break;
            case 23:
                vh1 vh1Var = (vh1) obj;
                vh1Var.getClass();
                AndroidUtilities.runOnUIThread(new je1(9, vh1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new uz0((WallpapersListActivity) obj, i17));
                break;
            default:
                sj1 sj1Var = (sj1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t8(i18, sj1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
