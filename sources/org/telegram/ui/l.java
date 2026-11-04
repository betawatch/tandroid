package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i3) {
        this.a = i3;
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
        int i3 = this.a;
        int i10 = 28;
        int i11 = 7;
        int i12 = 1;
        int i13 = 2;
        boolean z12 = false;
        Object obj = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new p1((o) obj, tL_error, tLObject, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new p1((h9) obj, tL_error, tLObject, 6));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new xg((jn) obj, 11));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new sc(i10, (qo) obj, tLObject));
                break;
            case 4:
                nq nqVar = (nq) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    nqVar.getMessagesController().O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new lo(3, nqVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new br((lr) obj, 2));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new us((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new pp((sy) obj, tL_error, tLObject, i11));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 9:
                c30 c30Var = (c30) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.hp.s1(c30Var.b.l1.a).O3((TLRPC.TL_updates) tLObject, false);
                    break;
                } else {
                    c30Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.g0.h3(new ly(i11, (g50) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new ly(24, (m90) obj, tLObject));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new hc0((nc0) obj, tLObject, tL_error, 0));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new tb0(4, (oc0) obj, tL_error));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new hc0((dd0) obj, tL_error, tLObject, false, 3));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new hc0((id0) obj, tLObject, tL_error, 5));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new sg0((NotificationsSettingsActivity) obj, 1));
                break;
            case 17:
                tj0 tj0Var = (tj0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new tb0(26, tj0Var, tL_error));
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.g0.h3(new hc0((PremiumPreviewFragment) obj, tL_error, tLObject, false, 25));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new hk0(15, (PrivacyControlActivity) obj, tLObject));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new hk0(17, privacySettingsActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            case 21:
                lw0 lw0Var = (lw0) obj;
                int i14 = lw0Var.f;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.hp.s1(i14).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.hp.s1(i14).S3(tL_messages_webPage.chats, false);
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
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i15);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i15 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i15 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = i4.z(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r14 = z12; r14 < size; r14++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r14);
                                                boolean z13 = z12;
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String D = i4.D(tL_pageListItemText.text);
                                                    String charSequence = i4.z(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(D) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            int i16 = i12;
                                                            strArr = new String[i13];
                                                            strArr[z13 ? 1 : 0] = org.telegram.messenger.bd.M0(2131745478, null);
                                                            strArr[i16] = str;
                                                        } else {
                                                            String[] strArr2 = new String[i12];
                                                            strArr2[z13 ? 1 : 0] = org.telegram.messenger.bd.M0(2131745478, null);
                                                            strArr = strArr2;
                                                        }
                                                        arrayList.add(new org.telegram.messenger.to(charSequence, strArr, D));
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
                        lw0Var.F = webPage;
                    } else {
                        z11 = false;
                    }
                    org.telegram.messenger.g0.h3(new qv0(3, lw0Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                lw0Var.G = z10;
                break;
            case 22:
                org.telegram.messenger.g0.h3(new t41((StickersActivity) obj, 1));
                break;
            case 23:
                d81 d81Var = (d81) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < tL_messages_inactiveChats.chats.size(); i17++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i17);
                        int currentTime = (d81Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i17).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.bd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.bd.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.bd.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.t3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.bd.a0("InactiveChatSignature", null, 2131749219, org.telegram.messenger.bd.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.t3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.bd.a0("InactiveChannelSignature", null, 2131749220, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.bd.a0("InactiveChatSignature", null, 2131749219, org.telegram.messenger.bd.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.g0.h3(new wy0(d81Var, arrayList2, tL_messages_inactiveChats, i11));
                    break;
                }
                break;
            case 24:
                wa1 wa1Var = (wa1) obj;
                wa1Var.getClass();
                org.telegram.messenger.g0.h3(new ma1(i13, wa1Var, tLObject));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new pu0((WallpapersListActivity) obj, i10));
                break;
            default:
                nc1 nc1Var = (nc1) obj;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new hc1(i13, nc1Var, tLObject));
                    break;
                }
                break;
        }
    }
}
