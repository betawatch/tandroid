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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
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
        int i12 = 4;
        int i13 = 20;
        int i14 = 2;
        int i15 = 1;
        boolean z13 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((p) obj, tL_error, tLObject2, i14));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t1((m9) obj, tL_error, tLObject2, 6));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ti((go) obj, i11));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new eh(15, (ip) obj, tLObject2));
                break;
            case 4:
                hr hrVar = (hr) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    hrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new eh(i13, hrVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new xr((fs) obj, i14));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new wt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new jq((a00) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                t40 t40Var = (t40) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    t40Var.b.d.getMessagesController().lambda$processUpdates$377((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    t40Var.getClass();
                    break;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new lt(24, (a70) obj, tL_error));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new z70(i11, (ib0) obj, tLObject2));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new jq((ne0) obj, tLObject2, tL_error, 28));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new z70(21, (oe0) obj, tL_error));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ve0((hf0) obj, tL_error, tLObject2, 1));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ve0((mf0) obj, tLObject2, tL_error));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ck0((NotificationsSettingsActivity) obj, 0));
                break;
            case 16:
                qm0 qm0Var = (qm0) obj;
                if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new xg0(13, qm0Var, tL_error));
                    break;
                }
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ve0((PremiumPreviewFragment) obj, tL_error, tLObject2, 23));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new jv0(i14, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new jv0(i12, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                m01 m01Var = (m01) obj;
                int i16 = m01Var.f;
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
                        while (true) {
                            if (i17 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i17);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i17 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i17 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = l4.B(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r13 = z13; r13 < size; r13++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r13);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String F = l4.F(tL_pageListItemText.text);
                                                    String charSequence = l4.B(tL_pageListItemText.text).toString();
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
                                i17++;
                                z13 = z11;
                                i15 = 1;
                            } else {
                                z11 = z13;
                            }
                        }
                        m01Var.E = webPage;
                    } else {
                        z11 = false;
                    }
                    AndroidUtilities.runOnUIThread(new jv0(i13, m01Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                m01Var.F = z10;
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new q91((StickersActivity) obj, 1));
                break;
            case 22:
                gd1 gd1Var = (gd1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i18 = 0; i18 < tL_messages_inactiveChats.chats.size(); i18++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i18);
                        int currentTime = (gd1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i18).intValue()) / 86400;
                        String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                        if (ChatObject.isMegagroup(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        } else if (ChatObject.isChannel(chat)) {
                            arrayList2.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                        } else {
                            arrayList2.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                        }
                    }
                    AndroidUtilities.runOnUIThread(new f71(gd1Var, arrayList2, tL_messages_inactiveChats, i12));
                    break;
                }
                break;
            case 23:
                bg1 bg1Var = (bg1) obj;
                bg1Var.getClass();
                AndroidUtilities.runOnUIThread(new k71(i13, bg1Var, tLObject2));
                break;
            case 24:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new qy0((WallpapersListActivity) obj, 27));
                break;
            default:
                vh1 vh1Var = (vh1) obj;
                if (tLObject2 != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.z3(19, vh1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
