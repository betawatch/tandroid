package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z9;
        int i7;
        String str;
        int size;
        int i10;
        int i11;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i12 = this.a;
        int i13 = 24;
        int i14 = 11;
        int i15 = 6;
        int i16 = 29;
        int i17 = 1;
        int i18 = 2;
        int i19 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((o) obj, tL_error, tLObject2, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o1((i9) obj, tL_error, tLObject2, i15));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new dh((pn) obj, i14));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new oe(i13, (uo) obj, tLObject2));
                break;
            case 4:
                rq rqVar = (rq) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    rqVar.getMessagesController().O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new oe(i16, rqVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new gr((qr) obj, 2));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new zs((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new tp((yy) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 9:
                k30 k30Var = (k30) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.qp.s1(k30Var.b.n1.a).O3((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    k30Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.g0.h3(new f10(3, (p50) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new f10(20, (s90) obj, tLObject2));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new tc0(0, (uc0) obj, tL_error));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new pc0((jd0) obj, tL_error, tLObject2, i18));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new pc0((od0) obj, tLObject2, tL_error, 4));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new hf0((NotificationsSettingsActivity) obj, 2));
                break;
            case 16:
                zj0 zj0Var = (zj0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new tc0(23, zj0Var, tL_error));
                    break;
                }
                break;
            case 17:
                org.telegram.messenger.g0.h3(new pc0((PremiumPreviewFragment) obj, tL_error, tLObject2, i13));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new tn0(i14, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.h3(new tn0(13, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                yw0 yw0Var = (yw0) obj;
                int i20 = yw0Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    org.telegram.messenger.qp.s1(i20).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.qp.s1(i20).S3(tL_messages_webPage.chats, false);
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
                                            str = g4.z(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            i10 = i19;
                                            while (i10 < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String D = g4.D(tL_pageListItemText.text);
                                                    String charSequence = g4.z(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(D) && !TextUtils.isEmpty(charSequence)) {
                                                        i11 = i19;
                                                        if (str != null) {
                                                            int i22 = i17;
                                                            String[] strArr2 = new String[i18];
                                                            strArr2[i11] = org.telegram.messenger.id.M0(2131745468, null);
                                                            strArr2[i22] = str;
                                                            strArr = strArr2;
                                                            i17 = i22;
                                                        } else {
                                                            strArr = new String[i17];
                                                            strArr[i11] = org.telegram.messenger.id.M0(2131745468, null);
                                                        }
                                                        arrayList.add(new org.telegram.messenger.cp(charSequence, strArr, D));
                                                        i10++;
                                                        i19 = i11;
                                                        i18 = 2;
                                                    }
                                                }
                                                i11 = i19;
                                                i10++;
                                                i19 = i11;
                                                i18 = 2;
                                            }
                                            i7 = i19;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i10 = i19;
                                    while (i10 < size) {
                                    }
                                    i7 = i19;
                                } else {
                                    i7 = i19;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i21++;
                                i19 = i7;
                                i18 = 2;
                            } else {
                                i7 = i19;
                            }
                        }
                        yw0Var.E = webPage;
                    } else {
                        i7 = 0;
                    }
                    int i23 = i7;
                    org.telegram.messenger.g0.h3(new rw0(i23 == true ? 1 : 0, yw0Var, arrayList));
                    z9 = i23;
                } else {
                    z9 = 0;
                }
                yw0Var.F = z9;
                break;
            case 21:
                org.telegram.messenger.g0.h3(new g51((StickersActivity) obj, 1));
                break;
            case 22:
                p81 p81Var = (p81) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i24 = 0; i24 < tL_messages_inactiveChats.chats.size(); i24++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i24);
                        int currentTime = (p81Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i24).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.id.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.id.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.id.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.t3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.id.a0("InactiveChatSignature", null, 2131749211, org.telegram.messenger.id.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.t3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.id.a0("InactiveChannelSignature", null, 2131749212, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.id.a0("InactiveChatSignature", null, 2131749211, org.telegram.messenger.id.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.g0.h3(new w21(p81Var, arrayList2, tL_messages_inactiveChats, i15));
                    break;
                }
                break;
            case 23:
                hb1 hb1Var = (hb1) obj;
                hb1Var.getClass();
                org.telegram.messenger.g0.h3(new rw0(i16, hb1Var, tLObject2));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new uu0((WallpapersListActivity) obj, i16));
                break;
            default:
                wc1 wc1Var = (wc1) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.h3(new sb1(28, wc1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
