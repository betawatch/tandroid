package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Message> arrayList;
        int i10;
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                ArrayList arrayList2 = eVar.b;
                eVar.f = -1;
                eVar.g = System.currentTimeMillis();
                if (tones instanceof TL_aicompose.TL_tones) {
                    vp.r1(eVar.a).V3(tones.users, false);
                    arrayList2.clear();
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    arrayList2.addAll(tL_tones.tones);
                    eVar.c = tL_tones.hash;
                    eVar.d();
                    eVar.c();
                    break;
                }
                break;
            case 1:
                g4 g4Var = (g4) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    g4Var.getMessagesController().L3(updates, false);
                    break;
                } else {
                    g4Var.getClass();
                    break;
                }
            case 2:
                x9 x9Var = (x9) this.b;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x9Var.getClass();
                if (starGiftActiveAuctions != null && tL_error == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    int i11 = 0;
                    x9Var.getMessagesController().V3(tL_starGiftActiveAuctions.users, false);
                    x9Var.getMessagesController().P3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList3 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList3.size();
                    while (i11 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList3.get(i11);
                        i11++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        x9Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    break;
                }
                break;
            case 3:
                ui uiVar = (ui) this.b;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    uiVar.getMessagesController().V3(tL_contacts_topPeers.users, false);
                    uiVar.getMessagesController().P3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i12 = 0; i12 < tL_contacts_topPeers.categories.size(); i12++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i12);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                            uiVar.j1 = tL_topPeerCategoryPeers.peers;
                            uiVar.getUserConfig().E = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            uiVar.l1 = tL_topPeerCategoryPeers.peers;
                            uiVar.getUserConfig().G = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            uiVar.k1 = tL_topPeerCategoryPeers.peers;
                            uiVar.getUserConfig().F = currentTimeMillis;
                        } else {
                            uiVar.i1 = tL_topPeerCategoryPeers.peers;
                            long e = uiVar.getUserConfig().e();
                            int i13 = 0;
                            while (true) {
                                if (i13 < uiVar.i1.size()) {
                                    if (((TLRPC.TL_topPeer) uiVar.i1.get(i13)).peer.user_id == e) {
                                        uiVar.i1.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            uiVar.getUserConfig().D = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    uiVar.getUserConfig().v(false);
                    uiVar.m();
                    uiVar.getNotificationCenter().k(81, new Object[0]);
                    uiVar.getNotificationCenter().k(82, new Object[0]);
                    uiVar.getNotificationCenter().k(83, new Object[0]);
                    uiVar.getNotificationCenter().k(84, new Object[0]);
                    uiVar.getMessagesStorage().a.c(new t6(25, uiVar, tL_contacts_topPeers));
                    break;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    uiVar.getUserConfig().V = false;
                    uiVar.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                    uiVar.getUserConfig().v(false);
                    uiVar.F();
                    break;
                }
                break;
            case 4:
                q0.a aVar = (q0.a) this.b;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                int i14 = 0;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList = messages_messages.messages) != null && !arrayList.isEmpty()) {
                    i14 = messages_messages.messages.get(0).id;
                }
                i0.g3(new in(aVar, i14, 1));
                break;
            case 5:
                yh.a aVar2 = (yh.a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    aVar2.a(null, tL_error2);
                    break;
                } else {
                    aVar2.a(new TLRPC.TL_boolTrue(), null);
                    break;
                }
            case 6:
                a3 a3Var = (a3) this.b;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    a3Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    break;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Boolean bool = Boolean.TRUE;
                    a3Var.a(bool, null, 0L, bool);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("getting web settings error ");
                    sb2.append(tL_error3 != null ? tL_error3.code + " " + tL_error3.text : "");
                    f8.d(sb2.toString());
                    a3Var.a(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error3 == null || !((i10 = tL_error3.code) == -2000 || i10 == -2001)));
                    break;
                }
            default:
                qz qzVar = (qz) this.b;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                if (updates2 != null) {
                    qzVar.getMessagesController().L3(updates2, false);
                    break;
                } else {
                    qzVar.getClass();
                    break;
                }
        }
    }
}
