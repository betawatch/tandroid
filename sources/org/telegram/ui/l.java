package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
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
        int i10 = 24;
        int i11 = 6;
        int i12 = 1;
        int i13 = 2;
        boolean z12 = false;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((o) obj, tL_error, tLObject2, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o1((i9) obj, tL_error, tLObject2, i11));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bh((on) obj, 11));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new zg(12, (to) obj, tLObject2));
                break;
            case 4:
                qq qqVar = (qq) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    qqVar.getMessagesController().O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new zg(17, qqVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new fr((pr) obj, 2));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new zs((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new tp((wy) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 9:
                h30 h30Var = (h30) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.np.s1(h30Var.b.o1.a).O3((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    h30Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(28, (l50) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new g50(15, (q90) obj, tLObject2));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new g50(25, (pc0) obj, tL_error));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new lc0((ed0) obj, tL_error, tLObject2, i13));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new lc0((kd0) obj, tLObject2, tL_error, 4));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new ef0((NotificationsSettingsActivity) obj, 2));
                break;
            case 16:
                zj0 zj0Var = (zj0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new jd0(18, zj0Var, tL_error));
                    break;
                }
                break;
            case 17:
                org.telegram.messenger.g0.h3(new lc0((PremiumPreviewFragment) obj, tL_error, tLObject2, i10));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new mp0(i11, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.h3(new mp0(8, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                sw0 sw0Var = (sw0) obj;
                int i14 = sw0Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    org.telegram.messenger.np.s1(i14).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.np.s1(i14).S3(tL_messages_webPage.chats, false);
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
                                                            String[] strArr2 = new String[i13];
                                                            strArr2[z13 ? 1 : 0] = org.telegram.messenger.hd.M0(2131745468, null);
                                                            strArr2[i16] = str;
                                                            strArr = strArr2;
                                                            i12 = i16;
                                                        } else {
                                                            strArr = new String[i12];
                                                            strArr[z13 ? 1 : 0] = org.telegram.messenger.hd.M0(2131745468, null);
                                                        }
                                                        arrayList.add(new org.telegram.messenger.zo(charSequence, strArr, D));
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
                                i15++;
                                z12 = z11;
                                i13 = 2;
                            } else {
                                z11 = z12;
                            }
                        }
                        sw0Var.F = webPage;
                    } else {
                        z11 = false;
                    }
                    org.telegram.messenger.g0.h3(new mp0(25, sw0Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                sw0Var.G = z10;
                break;
            case 21:
                org.telegram.messenger.g0.h3(new b51((StickersActivity) obj, 1));
                break;
            case 22:
                l81 l81Var = (l81) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < tL_messages_inactiveChats.chats.size(); i17++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i17);
                        int currentTime = (l81Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i17).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.hd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.hd.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.hd.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.t3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.hd.a0("InactiveChatSignature", null, 2131749211, org.telegram.messenger.hd.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.t3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.hd.a0("InactiveChannelSignature", null, 2131749212, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.hd.a0("InactiveChatSignature", null, 2131749211, org.telegram.messenger.hd.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.g0.h3(new q21(l81Var, arrayList2, tL_messages_inactiveChats, i11));
                    break;
                }
                break;
            case 23:
                cb1 cb1Var = (cb1) obj;
                cb1Var.getClass();
                org.telegram.messenger.g0.h3(new fy0(i10, cb1Var, tLObject2));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new pu0((WallpapersListActivity) obj, 29));
                break;
            default:
                rc1 rc1Var = (rc1) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(23, rc1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
