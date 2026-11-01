package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLObject tLObject2;
        boolean z10;
        boolean z11;
        String str;
        int size;
        ?? r14;
        String[] strArr;
        int i10 = this.a;
        int i11 = 21;
        int i12 = 6;
        int i13 = 2;
        int i14 = 1;
        boolean z12 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new p1((n) obj, tL_error, tLObject, 2));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new p1((j9) obj, tL_error, tLObject, i12));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new rh((lo) obj, 12));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new ch(17, (qp) obj, tLObject));
                break;
            case 4:
                pr prVar = (pr) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    prVar.getMessagesController().L3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.i0.h3(new ch(22, prVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.i0.g3(new ds((ns) obj, 2));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new yt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new qq((vz) obj, tL_error, tLObject, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    break;
                }
                break;
            case 9:
                e40 e40Var = (e40) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.wp.r1(e40Var.b.k1.a).L3((TLRPC.TL_updates) tLObject, false);
                    break;
                } else {
                    e40Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(26, (j60) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new y60(13, (ta0) obj, tLObject));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new pd0((vd0) obj, tLObject, tL_error, 0));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new y60(23, (wd0) obj, tL_error));
                break;
            case 14:
                org.telegram.messenger.i0.g3(new pd0((le0) obj, tL_error, tLObject, false, 3));
                break;
            case 15:
                org.telegram.messenger.i0.g3(new pd0((re0) obj, tLObject, tL_error, 5));
                break;
            case 16:
                org.telegram.messenger.i0.g3(new kg0((NotificationsSettingsActivity) obj, 2));
                break;
            case 17:
                el0 el0Var = (el0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.i0.g3(new if0(15, el0Var, tL_error));
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.i0.g3(new pd0((PremiumPreviewFragment) obj, tL_error, tLObject, false, 25));
                break;
            case 19:
                org.telegram.messenger.i0.g3(new hr0(4, (PrivacyControlActivity) obj, tLObject));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new hr0(i12, privacySettingsActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            case 21:
                gy0 gy0Var = (gy0) obj;
                int i15 = gy0Var.f;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.wp.r1(i15).V3(tL_messages_webPage.users, false);
                    org.telegram.messenger.wp.r1(i15).P3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                } else {
                    tLObject2 = tLObject;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size2 = page.blocks.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i16);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i16 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i16 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = h4.z(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r14 = z12; r14 < size; r14++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r14);
                                                boolean z13 = z12;
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String D = h4.D(tL_pageListItemText.text);
                                                    String charSequence = h4.z(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(D) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            int i17 = i14;
                                                            String[] strArr2 = new String[i13];
                                                            strArr2[z13 ? 1 : 0] = org.telegram.messenger.dd.L0(2131745486, null);
                                                            strArr2[i17] = str;
                                                            strArr = strArr2;
                                                            i14 = i17;
                                                        } else {
                                                            strArr = new String[i14];
                                                            strArr[z13 ? 1 : 0] = org.telegram.messenger.dd.L0(2131745486, null);
                                                        }
                                                        arrayList.add(new org.telegram.messenger.ip(charSequence, strArr, D));
                                                    }
                                                }
                                                z12 = z13 ? 1 : 0;
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
                                i16++;
                                z12 = z11;
                                i13 = 2;
                            } else {
                                z11 = z12;
                            }
                        }
                        gy0Var.E = webPage;
                    } else {
                        z11 = false;
                    }
                    org.telegram.messenger.i0.g3(new hr0(22, gy0Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                gy0Var.F = z10;
                break;
            case 22:
                org.telegram.messenger.i0.g3(new u61((StickersActivity) obj, 1));
                break;
            case 23:
                ca1 ca1Var = (ca1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i18 = 0; i18 < tL_messages_inactiveChats.chats.size(); i18++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i18);
                        int currentTime = (ca1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i18).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.dd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.dd.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.dd.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.w3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.dd.a0("InactiveChatSignature", null, 2131749220, org.telegram.messenger.dd.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.w3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.dd.a0("InactiveChannelSignature", null, 2131749221, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.dd.a0("InactiveChatSignature", null, 2131749220, org.telegram.messenger.dd.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.i0.g3(new i41(ca1Var, arrayList2, tL_messages_inactiveChats, i12));
                    break;
                }
                break;
            case 24:
                xc1 xc1Var = (xc1) obj;
                xc1Var.getClass();
                org.telegram.messenger.i0.g3(new y01(i11, xc1Var, tLObject));
                break;
            case 25:
                org.telegram.messenger.i0.g3(new ae1((WallpapersListActivity) obj, i14));
                break;
            default:
                ne1 ne1Var = (ne1) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.m2(i11, ne1Var, tLObject));
                    break;
                }
                break;
        }
    }
}
