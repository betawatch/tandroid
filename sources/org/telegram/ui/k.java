package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
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
        ?? r13;
        boolean z12;
        String[] strArr;
        int i10 = this.a;
        int i11 = 12;
        int i12 = 22;
        int i13 = 5;
        int i14 = 6;
        int i15 = 20;
        int i16 = 2;
        int i17 = 1;
        boolean z13 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new p1((n) obj, tL_error, tLObject, 2));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new p1((j9) obj, tL_error, tLObject, i14));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new rh((lo) obj, i11));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new zg(17, (qp) obj, tLObject));
                break;
            case 4:
                pr prVar = (pr) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    prVar.getMessagesController().L3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.i0.h3(new zg(i12, prVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.i0.g3(new ds((ns) obj, 2));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new zt((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new qq((wz) obj, tL_error, tLObject, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    break;
                }
                break;
            case 9:
                f40 f40Var = (f40) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.vp.r1(f40Var.b.k1.a).L3((TLRPC.TL_updates) tLObject, false);
                    break;
                } else {
                    f40Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.i0.g3(new xs(25, (k60) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new f70(i11, (ua0) obj, tLObject));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new qd0((wd0) obj, tLObject, tL_error, 0));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new f70(i12, (xd0) obj, tL_error));
                break;
            case 14:
                org.telegram.messenger.i0.g3(new qd0((me0) obj, tL_error, tLObject, false, 3));
                break;
            case 15:
                org.telegram.messenger.i0.g3(new qd0((se0) obj, tLObject, tL_error, i13));
                break;
            case 16:
                org.telegram.messenger.i0.g3(new mg0((NotificationsSettingsActivity) obj, 2));
                break;
            case 17:
                gl0 gl0Var = (gl0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.i0.g3(new uf0(14, gl0Var, tL_error));
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.i0.g3(new qd0((PremiumPreviewFragment) obj, tL_error, tLObject, false, 25));
                break;
            case 19:
                org.telegram.messenger.i0.g3(new et0(3, (PrivacyControlActivity) obj, tLObject));
                break;
            case 20:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new et0(i13, privacySettingsActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            case 21:
                hy0 hy0Var = (hy0) obj;
                int i18 = hy0Var.f;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    org.telegram.messenger.vp.r1(i18).V3(tL_messages_webPage.users, false);
                    org.telegram.messenger.vp.r1(i18).P3(tL_messages_webPage.chats, false);
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
                        int i19 = 0;
                        while (true) {
                            if (i19 < size2) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i19);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i19 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i19 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = h4.z(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r13 = z13; r13 < size; r13++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r13);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String D = h4.D(tL_pageListItemText.text);
                                                    String charSequence = h4.z(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(D) && !TextUtils.isEmpty(charSequence)) {
                                                        z12 = z13;
                                                        if (str != null) {
                                                            int i20 = i17;
                                                            String[] strArr2 = new String[i16];
                                                            strArr2[z12 ? 1 : 0] = org.telegram.messenger.cd.L0(2131745486, null);
                                                            strArr2[i20] = str;
                                                            strArr = strArr2;
                                                            i17 = i20;
                                                        } else {
                                                            strArr = new String[i17];
                                                            strArr[z12 ? 1 : 0] = org.telegram.messenger.cd.L0(2131745486, null);
                                                        }
                                                        arrayList.add(new org.telegram.messenger.hp(charSequence, strArr, D));
                                                        z13 = z12;
                                                        i16 = 2;
                                                    }
                                                }
                                                z12 = z13;
                                                z13 = z12;
                                                i16 = 2;
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
                                i19++;
                                z13 = z11;
                                i16 = 2;
                            } else {
                                z11 = z13;
                            }
                        }
                        hy0Var.E = webPage;
                    } else {
                        z11 = false;
                    }
                    org.telegram.messenger.i0.g3(new et0(21, hy0Var, arrayList));
                    z10 = z11;
                } else {
                    z10 = false;
                }
                hy0Var.F = z10;
                break;
            case 22:
                org.telegram.messenger.i0.g3(new w61((StickersActivity) obj, 1));
                break;
            case 23:
                ea1 ea1Var = (ea1) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i21 = 0; i21 < tL_messages_inactiveChats.chats.size(); i21++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i21);
                        int currentTime = (ea1Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i21).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.cd.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.cd.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.cd.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.w3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.cd.a0("InactiveChatSignature", null, 2131749220, org.telegram.messenger.cd.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.w3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.cd.a0("InactiveChannelSignature", null, 2131749221, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.cd.a0("InactiveChatSignature", null, 2131749220, org.telegram.messenger.cd.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.i0.g3(new k41(ea1Var, arrayList2, tL_messages_inactiveChats, i14));
                    break;
                }
                break;
            case 24:
                zc1 zc1Var = (zc1) obj;
                zc1Var.getClass();
                org.telegram.messenger.i0.g3(new t11(i15, zc1Var, tLObject));
                break;
            case 25:
                org.telegram.messenger.i0.g3(new ce1((WallpapersListActivity) obj, i17));
                break;
            default:
                pe1 pe1Var = (pe1) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k3(i15, pe1Var, tLObject));
                    break;
                }
                break;
        }
    }
}
