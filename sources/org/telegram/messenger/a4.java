package org.telegram.messenger;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    i0.g3(new e4(20, apVar, tL_error));
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (chatThemes instanceof TL_account.Tl_chatThemes) {
                        TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                        hs messagesStorage = g4Var.getMessagesStorage();
                        ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                        messagesStorage.getClass();
                        messagesStorage.I(new hr(2, messagesStorage, arrayList2));
                        g4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                        g4Var.getMessagesController().V3(tl_chatThemes.users, false);
                        g4Var.getMessagesController().P3(tl_chatThemes.chats, false);
                        ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.ChatTheme chatTheme = arrayList3.get(i10);
                            i10++;
                            TLRPC.ChatTheme chatTheme2 = chatTheme;
                            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                                arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(arrayList.size());
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(g4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i11));
                            y3Var.p(0, null);
                            y3Var.p(1, null);
                            y3Var.n(0, null);
                            y3Var.n(1, null);
                            arrayList4.add(y3Var);
                        }
                        i0.g3(new cn(g4Var, tl_chatThemes, arrayList4, arrayList, apVar, 1));
                        break;
                    } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        i0.g3(new e4(21, g4Var, apVar));
                        break;
                    }
                }
                break;
            case 1:
                final x9 x9Var = (x9) this.b;
                final j20 j20Var = (j20) this.c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = x9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    x9Var.getMessagesController().V3(tL_StarGiftAuctionState.users, false);
                    x9Var.getMessagesController().P3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.id, Boolean.TRUE);
                    x9Var.j(tL_StarGiftAuctionState.gift.id, new q20() { // from class: org.telegram.messenger.p9
                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj3) {
                            x9 x9Var2 = x9.this;
                            x9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            x9Var2.d(tL_StarGiftAuctionState2.gift.id).c = (ArrayList) obj3;
                            x9Var2.f(tL_StarGiftAuctionState2.gift.id, tL_StarGiftAuctionState2);
                            j20Var.a(tL_StarGiftAuctionState2, tL_error2);
                        }
                    });
                    break;
                } else {
                    if (tL_StarGiftAuctionState != null) {
                        x9Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                    }
                    j20Var.a(tL_StarGiftAuctionState, tL_error2);
                    break;
                }
            case 2:
                vp vpVar = (vp) this.b;
                yh.c0 c0Var = (yh.c0) this.c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    vpVar.P3(peerLinkRequests.chats, false);
                    vpVar.V3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList5 = peerLinkRequests.requests;
                    int size2 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList5.get(i12);
                        i12++;
                        long j10 = -o5.o(communityPeerRequest.peer);
                        if (vpVar.M0(j10) == null) {
                            vpVar.T2(0, j10, true);
                        }
                    }
                    c0Var.a(peerLinkRequests, null);
                    break;
                } else {
                    c0Var.a(null, tL_error3);
                    break;
                }
            case 3:
                vp vpVar2 = (vp) this.b;
                vh.m6 m6Var = (vh.m6) this.c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                if (messages_chats != null) {
                    vpVar2.P3(messages_chats.chats, false);
                    vpVar2.R7 = messages_chats.chats;
                }
                m6Var.a(messages_chats != null ? messages_chats.chats : null);
                break;
            case 4:
                vp vpVar3 = (vp) this.b;
                org.telegram.ui.Components.nr nrVar = (org.telegram.ui.Components.nr) this.c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    vpVar3.P3(participantJoinedChats.chats, false);
                    vpVar3.V3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList6 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Long l4 = arrayList6.get(i13);
                        i13++;
                        long longValue = l4.longValue();
                        if (vpVar3.M0(longValue) == null) {
                            vpVar3.T2(0, longValue, true);
                        }
                    }
                }
                nrVar.a(participantJoinedChats, tL_error4);
                break;
            case 5:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                j20 j20Var2 = (j20) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                x1Var.dismiss();
                if (tL_error5 != null) {
                    j20Var2.a(null, tL_error5.text);
                    break;
                } else {
                    j20Var2.a(passkey, null);
                    break;
                }
            default:
                z10 z10Var = (z10) this.b;
                w10 w10Var = (w10) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                a20 a20Var = z10Var.i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error6 == null) {
                    z10 = true;
                } else {
                    a20Var.getClass();
                    z10 = false;
                }
                w10Var.a(Boolean.valueOf(z10));
                a20Var.getClass();
                break;
        }
    }
}
