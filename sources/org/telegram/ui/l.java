package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
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
        boolean z9;
        boolean z10;
        String str;
        int size;
        ?? r14;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        int i7 = this.a;
        int i10 = 6;
        int i11 = 29;
        int i12 = 28;
        int i13 = 1;
        int i14 = 2;
        boolean z11 = false;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new o1((o) obj, tL_error, tLObject2, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o1((i9) obj, tL_error, tLObject2, i10));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new dh((pn) obj, 11));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new rf(23, (uo) obj, tLObject2));
                break;
            case 4:
                qq qqVar = (qq) obj;
                if (tLObject2 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    qqVar.getMessagesController().O3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.g0.i3(new rf(i12, qqVar, updates), 1000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.g0.h3(new fr((pr) obj, 2));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ys((DataSettingsActivity) obj, 0));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new tp((xy) obj, tL_error, tLObject2, 7));
                break;
            case 8:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 9:
                j30 j30Var = (j30) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    org.telegram.messenger.qp.s1(j30Var.b.k1.a).O3((TLRPC.TL_updates) tLObject2, false);
                    break;
                } else {
                    j30Var.getClass();
                    break;
                }
            case 10:
                org.telegram.messenger.g0.h3(new s10(2, (o50) obj, tL_error));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new s10(19, (r90) obj, tLObject2));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new s10(29, (sc0) obj, tL_error));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new oc0((id0) obj, tL_error, tLObject2, i14));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new oc0((nd0) obj, tLObject2, tL_error, 4));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new gf0((NotificationsSettingsActivity) obj, 2));
                break;
            case 16:
                yj0 yj0Var = (yj0) obj;
                if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new bd0(22, yj0Var, tL_error));
                    break;
                }
                break;
            case 17:
                org.telegram.messenger.g0.h3(new oc0((PremiumPreviewFragment) obj, tL_error, tLObject2, 24));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new sn0(10, (PrivacyControlActivity) obj, tLObject2));
                break;
            case 19:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.h3(new sn0(12, privacySettingsActivity, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            case 20:
                ww0 ww0Var = (ww0) obj;
                int i15 = ww0Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    org.telegram.messenger.qp.s1(i15).Y3(tL_messages_webPage.users, false);
                    org.telegram.messenger.qp.s1(i15).S3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
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
                                            str = g4.z(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            for (r14 = z11; r14 < size; r14++) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(r14);
                                                boolean z12 = z11;
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String D = g4.D(tL_pageListItemText.text);
                                                    String charSequence = g4.z(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(D) && !TextUtils.isEmpty(charSequence)) {
                                                        if (str != null) {
                                                            int i17 = i13;
                                                            String[] strArr2 = new String[i14];
                                                            strArr2[z12 ? 1 : 0] = org.telegram.messenger.id.M0(2131745468, null);
                                                            strArr2[i17] = str;
                                                            strArr = strArr2;
                                                            i13 = i17;
                                                        } else {
                                                            strArr = new String[i13];
                                                            strArr[z12 ? 1 : 0] = org.telegram.messenger.id.M0(2131745468, null);
                                                        }
                                                        arrayList.add(new org.telegram.messenger.cp(charSequence, strArr, D));
                                                    }
                                                }
                                                z11 = z12 ? 1 : 0;
                                                i14 = 2;
                                            }
                                            z10 = z11;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    while (r14 < size) {
                                    }
                                    z10 = z11;
                                } else {
                                    z10 = z11;
                                    if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                                    }
                                }
                                i16++;
                                z11 = z10;
                                i14 = 2;
                            } else {
                                z10 = z11;
                            }
                        }
                        ww0Var.E = webPage;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.h3(new sn0(29, ww0Var, arrayList));
                    z9 = z10;
                } else {
                    z9 = false;
                }
                ww0Var.F = z9;
                break;
            case 21:
                org.telegram.messenger.g0.h3(new f51((StickersActivity) obj, 1));
                break;
            case 22:
                o81 o81Var = (o81) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i18 = 0; i18 < tL_messages_inactiveChats.chats.size(); i18++) {
                        TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i18);
                        int currentTime = (o81Var.getConnectionsManager().getCurrentTime() - tL_messages_inactiveChats.dates.get(i18).intValue()) / 86400;
                        String G = currentTime < 30 ? org.telegram.messenger.id.G(currentTime, "Days", new Object[0]) : currentTime < 365 ? org.telegram.messenger.id.G(currentTime / 30, "Months", new Object[0]) : org.telegram.messenger.id.G(currentTime / 365, "Years", new Object[0]);
                        if (org.telegram.messenger.t3.n0(chat)) {
                            arrayList2.add(org.telegram.messenger.id.a0("InactiveChatSignature", null, 2131749211, org.telegram.messenger.id.G(chat.participants_count, "Members", new Object[0]), G));
                        } else if (org.telegram.messenger.t3.T(chat)) {
                            arrayList2.add(org.telegram.messenger.id.a0("InactiveChannelSignature", null, 2131749212, G));
                        } else {
                            arrayList2.add(org.telegram.messenger.id.a0("InactiveChatSignature", null, 2131749211, org.telegram.messenger.id.G(chat.participants_count, "Members", new Object[0]), G));
                        }
                    }
                    org.telegram.messenger.g0.h3(new v21(o81Var, arrayList2, tL_messages_inactiveChats, i10));
                    break;
                }
                break;
            case 23:
                gb1 gb1Var = (gb1) obj;
                gb1Var.getClass();
                org.telegram.messenger.g0.h3(new ax0(i12, gb1Var, tLObject2));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new tu0((WallpapersListActivity) obj, i11));
                break;
            default:
                vc1 vc1Var = (vc1) obj;
                if (tLObject2 != null) {
                    org.telegram.messenger.g0.h3(new wb1(i12, vc1Var, tLObject2));
                    break;
                }
                break;
        }
    }
}
