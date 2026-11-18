package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        boolean z11;
        String str;
        int size;
        ?? r14;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i7 = this.a;
        int i10 = 13;
        int i11 = 6;
        int i12 = 1;
        int i13 = 2;
        boolean z12 = false;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new o1((o) obj, tL_error, tLObject2, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new o1((i9) obj, tL_error, tLObject2, i11));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new bh((pn) obj, 11));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new ci(8, (vo) obj, tLObject2));
                break;
            case 4:
                rq rqVar = (rq) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    rqVar.getMessagesController().V3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.h3(new ci(i10, rqVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.g0.g3(new gr((qr) obj, 2));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new bt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new up((zy) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    break;
                }
                break;
            case 9:
                k30 k30Var = (k30) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.mp.u1(k30Var.b.o1.a).V3((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    k30Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.g0.g3(new vs(23, (n50) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new n60(10, (r90) obj, tLObject2));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new n60(20, (pc0) obj, tL_error));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new lc0((gd0) obj, tL_error, tLObject2, i13));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new lc0((ld0) obj, tLObject2, tL_error, 4));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new hf0((NotificationsSettingsActivity) obj, 2));
                break;
            case 16:
                ck0 ck0Var = (ck0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new ve0(i10, ck0Var, tL_error));
                    break;
                }
                break;
            case 17:
                org.telegram.messenger.g0.g3(new lc0((PremiumPreviewFragment) obj, tL_error, tLObject2, 24));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new tr0(1, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.g3(new tr0(3, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                ww0 ww0Var = (ww0) obj;
                int i14 = ww0Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    org.telegram.messenger.mp.u1(i14).f4(tL_messages_webPage.users, false);
                    org.telegram.messenger.mp.u1(i14).Z3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i15);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i15 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i15 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = g4.z(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r14 = z12; r14 < size; r14++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r14);
                                                boolean z13 = z12;
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String D = g4.D(tL_pageListItemText.text);
                                                    String charSequence = g4.z(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(D) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            int i16 = i12;
                                                            strArr = new String[i13];
                                                            strArr[z13 ? 1 : 0] = org.telegram.messenger.gd.M0(2131745273, null);
                                                            strArr[i16] = str;
                                                        } else {
                                                            String[] strArr2 = new String[i12];
                                                            strArr2[z13 ? 1 : 0] = org.telegram.messenger.gd.M0(2131745273, null);
                                                            strArr = strArr2;
                                                        }
                                                        arrayList.add(new org.telegram.messenger.yo(charSequence, strArr, D));
                                                    }
                                                }
                                                z12 = z13 ? 1 : 0;
                                                i12 = 1;
                                                i13 = 2;
                                            }
                                            z11 = z12;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    while (r14 < size) {
                                    }
                                    z11 = z12;
                                } else {
                                    z11 = z12;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i15++;
                                z12 = z11;
                                i12 = 1;
                                i13 = 2;
                            } else {
                                z11 = z12;
                            }
                        }
                        ww0Var.F = webPage;
                    } else {
                        z11 = false;
                    }
                    org.telegram.messenger.g0.g3(new tr0(20, ww0Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                ww0Var.G = z10;
                break;
            case 21:
                org.telegram.messenger.g0.g3(new e51((StickersActivity) obj, 1));
                break;
            case 22:
                p81 p81Var = (p81) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < tL_messages_inactiveChats.chats.size(); i17++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i17);
                        int currentTime = (p81Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i17).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.gd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.gd.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.gd.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.v3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.gd.a0("InactiveChatSignature", null, 2131749019, org.telegram.messenger.gd.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.v3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.gd.a0("InactiveChannelSignature", null, 2131749020, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.gd.a0("InactiveChatSignature", null, 2131749019, org.telegram.messenger.gd.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.g0.g3(new u21(p81Var, arrayList2, tL_messages_inactiveChats, i11));
                    break;
                }
                break;
            case 23:
                gb1 gb1Var = (gb1) obj;
                gb1Var.getClass();
                org.telegram.messenger.g0.g3(new b31(19, gb1Var, tLObject2));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new ru0((WallpapersListActivity) obj, 29));
                break;
            default:
                uc1 uc1Var = (uc1) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.c5(15, uc1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
