package org.telegram.messenger;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) this.c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.h3(new b4(22, soVar, tL_error));
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (chatThemes instanceof TL_account.Tl_chatThemes) {
                        TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                        qr messagesStorage = d4Var.getMessagesStorage();
                        ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                        messagesStorage.getClass();
                        messagesStorage.I(new pq(3, messagesStorage, arrayList2));
                        d4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                        d4Var.getMessagesController().Y3(tl_chatThemes.users, false);
                        d4Var.getMessagesController().S3(tl_chatThemes.chats, false);
                        ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.ChatTheme chatTheme = arrayList3.get(i3);
                            i3++;
                            TLRPC.ChatTheme chatTheme2 = chatTheme;
                            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                                arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(arrayList.size());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(d4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i10));
                            p3Var.p(0, null);
                            p3Var.p(1, null);
                            p3Var.n(0, null);
                            p3Var.n(1, null);
                            arrayList4.add(p3Var);
                        }
                        g0.h3(new cn(d4Var, tl_chatThemes, arrayList4, arrayList, soVar, 1));
                        break;
                    } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        g0.h3(new b4(23, d4Var, soVar));
                        break;
                    }
                }
                break;
            case 1:
                final q9 q9Var = (q9) this.b;
                final n10 n10Var = (n10) this.c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = q9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    q9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    q9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.id, Boolean.TRUE);
                    q9Var.j(tL_StarGiftAuctionState.gift.id, new u10() { // from class: org.telegram.messenger.i9
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj3) {
                            q9 q9Var2 = q9.this;
                            q9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            q9Var2.d(tL_StarGiftAuctionState2.gift.id).c = (ArrayList) obj3;
                            q9Var2.f(tL_StarGiftAuctionState2.gift.id, tL_StarGiftAuctionState2);
                            n10Var.a(tL_StarGiftAuctionState2, tL_error2);
                        }
                    });
                    break;
                } else {
                    if (tL_StarGiftAuctionState != null) {
                        q9Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                    }
                    n10Var.a(tL_StarGiftAuctionState, tL_error2);
                    break;
                }
            case 2:
                hp hpVar = (hp) this.b;
                ji.g0 g0Var = (ji.g0) this.c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    hpVar.S3(peerLinkRequests.chats, false);
                    hpVar.Y3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList5 = peerLinkRequests.requests;
                    int size2 = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList5.get(i11);
                        i11++;
                        long j10 = -m5.o(communityPeerRequest.peer);
                        if (hpVar.N0(j10) == null) {
                            hpVar.V2(0, j10, true);
                        }
                    }
                    g0Var.a(peerLinkRequests, null);
                    break;
                } else {
                    g0Var.a(null, tL_error3);
                    break;
                }
            case 3:
                hp hpVar2 = (hp) this.b;
                gi.j8 j8Var = (gi.j8) this.c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                if (messages_chats != null) {
                    hpVar2.S3(messages_chats.chats, false);
                    hpVar2.Q7 = messages_chats.chats;
                }
                j8Var.a(messages_chats != null ? messages_chats.chats : null);
                break;
            case 4:
                hp hpVar3 = (hp) this.b;
                org.telegram.ui.Components.dr drVar = (org.telegram.ui.Components.dr) this.c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    hpVar3.S3(participantJoinedChats.chats, false);
                    hpVar3.Y3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList6 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList6.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList6.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (hpVar3.N0(longValue) == null) {
                            hpVar3.V2(0, longValue, true);
                        }
                    }
                }
                drVar.a(participantJoinedChats, tL_error4);
                break;
            case 5:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.b;
                n10 n10Var2 = (n10) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                s1Var.dismiss();
                if (tL_error5 != null) {
                    n10Var2.a(null, tL_error5.text);
                    break;
                } else {
                    n10Var2.a(passkey, null);
                    break;
                }
            default:
                d10 d10Var = (d10) this.b;
                a10 a10Var = (a10) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                e10 e10Var = d10Var.i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error6 == null) {
                    z10 = true;
                } else {
                    e10Var.getClass();
                    z10 = false;
                }
                a10Var.a(Boolean.valueOf(z10));
                e10Var.getClass();
                break;
        }
    }
}
