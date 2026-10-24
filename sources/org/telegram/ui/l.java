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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        boolean z11;
        String str;
        int size;
        ?? r13;
        boolean z12;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i10 = this.a;
        int i11 = 11;
        int i12 = 24;
        int i13 = 4;
        int i14 = 20;
        int i15 = 1;
        int i16 = 2;
        boolean z13 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1((o) obj, tL_error, tLObject2, i16));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s1((m9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ti((io) obj, i11));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new eh(15, (kp) obj, tLObject2));
                break;
            case 4:
                jr jrVar = (jr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    jrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new eh(i14, jrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new xr((hs) obj, i16));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lq((d00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 9:
                w40 w40Var = (w40) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    w40Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    w40Var.getClass();
                    break;
                }
            case 10:
                AndroidUtilities.runOnUIThread(new ot(i12, (e70) obj, tL_error));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new f80(i11, (ob0) obj, tLObject2));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new lq((ue0) obj, tLObject2, tL_error, 29));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new f80(21, (ve0) obj, tL_error));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new re0((mf0) obj, tL_error, tLObject2, i16));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new re0((rf0) obj, tLObject2, tL_error, i13));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new oj0((NotificationsSettingsActivity) obj, 1));
                break;
            case 17:
                vm0 vm0Var = (vm0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new bh0(13, vm0Var, tL_error));
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new re0((PremiumPreviewFragment) obj, tL_error, tLObject2, i12));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new mv0(i16, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new mv0(i13, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 21:
                q01 q01Var = (q01) obj;
                int i17 = q01Var.f;
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
                        while (true) {
                            if (i18 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i18);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i18 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i18 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = k4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r13 = z13; r13 < size; r13++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r13);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String F = k4.F(tL_pageListItemText.text);
                                                    String charSequence = k4.B(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(F) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            z12 = z13;
                                                            strArr = new String[2];
                                                            strArr[z12 ? 1 : 0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                            strArr[i15] = str;
                                                        } else {
                                                            z12 = z13;
                                                            strArr = new String[i15];
                                                            strArr[z12 ? 1 : 0] = LocaleController.getString(R.string.SettingsSearchFaq);
                                                        }
                                                        arrayList.add(new MessagesController.FaqSearchResult(charSequence, strArr, F));
                                                        z13 = z12;
                                                        i15 = 1;
                                                    }
                                                }
                                                z12 = z13;
                                                z13 = z12;
                                                i15 = 1;
                                            }
                                            z11 = z13;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    while (r13 < size) {
                                    }
                                    z11 = z13;
                                } else {
                                    z11 = z13;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i18++;
                                z13 = z11;
                                i15 = 1;
                            } else {
                                z11 = z13;
                            }
                        }
                        q01Var.E = webPage;
                    } else {
                        z11 = false;
                    }
                    AndroidUtilities.runOnUIThread(new mv0(i14, q01Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                q01Var.F = z10;
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new v91((StickersActivity) obj, 1));
                break;
            case 23:
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
                    AndroidUtilities.runOnUIThread(new h71(md1Var, arrayList2, tL_messages_inactiveChats, 5));
                    break;
                }
                break;
            case 24:
                hg1 hg1Var = (hg1) obj;
                hg1Var.getClass();
                AndroidUtilities.runOnUIThread(new o71(i14, hg1Var, tLObject2));
                break;
            case 25:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new my0((WallpapersListActivity) obj, 28));
                break;
            default:
                ci1 ci1Var = (ci1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.y3(19, ci1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
