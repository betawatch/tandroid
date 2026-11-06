package org.telegram.messenger;

import android.util.LongSparseArray;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        boolean z9;
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
                        yr messagesStorage = d4Var.getMessagesStorage();
                        ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                        messagesStorage.getClass();
                        messagesStorage.I(new yq(3, messagesStorage, arrayList2));
                        d4Var.getMessagesStorage().m1(tl_chatThemes.users, tl_chatThemes.chats, true, true);
                        d4Var.getMessagesController().Y3(tl_chatThemes.users, false);
                        d4Var.getMessagesController().S3(tl_chatThemes.chats, false);
                        ArrayList<TLRPC.ChatTheme> arrayList3 = tl_chatThemes.themes;
                        int size = arrayList3.size();
                        int i7 = 0;
                        while (i7 < size) {
                            TLRPC.ChatTheme chatTheme = arrayList3.get(i7);
                            i7++;
                            TLRPC.ChatTheme chatTheme2 = chatTheme;
                            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                                arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(arrayList.size());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(d4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i10));
                            r3Var.p(0, null);
                            r3Var.p(1, null);
                            r3Var.n(0, null);
                            r3Var.n(1, null);
                            arrayList4.add(r3Var);
                        }
                        g0.h3(new mn(d4Var, tl_chatThemes, arrayList4, arrayList, soVar, 1));
                        break;
                    } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        g0.h3(new b4(23, d4Var, soVar));
                        break;
                    }
                }
                break;
            case 1:
                CancellationToken cancellationToken = (CancellationToken) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (!cancellationToken.isCancellationRequested()) {
                    if (auth_authorization == null || tL_error2 != null) {
                        taskCompletionSource.trySetException(new ConnectionsManager.RequestException(tL_error2));
                        break;
                    } else {
                        taskCompletionSource.trySetResult(auth_authorization);
                        break;
                    }
                }
                break;
            case 2:
                final w9 w9Var = (w9) this.b;
                final v10 v10Var = (v10) this.c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = w9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    w9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    w9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.id, Boolean.TRUE);
                    w9Var.j(tL_StarGiftAuctionState.gift.id, new c20() { // from class: org.telegram.messenger.o9
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj3) {
                            w9 w9Var2 = w9.this;
                            w9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            w9Var2.d(tL_StarGiftAuctionState2.gift.id).c = (ArrayList) obj3;
                            w9Var2.f(tL_StarGiftAuctionState2.gift.id, tL_StarGiftAuctionState2);
                            v10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    break;
                } else {
                    if (tL_StarGiftAuctionState != null) {
                        w9Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                    }
                    v10Var.a(tL_StarGiftAuctionState, tL_error3);
                    break;
                }
            case 3:
                qp qpVar = (qp) this.b;
                ii.j0 j0Var = (ii.j0) this.c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    qpVar.S3(peerLinkRequests.chats, false);
                    qpVar.Y3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList5 = peerLinkRequests.requests;
                    int size2 = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList5.get(i11);
                        i11++;
                        long j3 = -m5.o(communityPeerRequest.peer);
                        if (qpVar.N0(j3) == null) {
                            qpVar.V2(0, j3, true);
                        }
                    }
                    j0Var.a(peerLinkRequests, null);
                    break;
                } else {
                    j0Var.a(null, tL_error4);
                    break;
                }
            case 4:
                qp qpVar2 = (qp) this.b;
                ii.c cVar = (ii.c) this.c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                if (messages_chats != null) {
                    qpVar2.S3(messages_chats.chats, false);
                    qpVar2.Q7 = messages_chats.chats;
                }
                cVar.a(messages_chats != null ? messages_chats.chats : null);
                break;
            case 5:
                qp qpVar3 = (qp) this.b;
                org.telegram.ui.Components.dr drVar = (org.telegram.ui.Components.dr) this.c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    qpVar3.S3(participantJoinedChats.chats, false);
                    qpVar3.Y3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList6 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList6.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList6.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (qpVar3.N0(longValue) == null) {
                            qpVar3.V2(0, longValue, true);
                        }
                    }
                }
                drVar.a(participantJoinedChats, tL_error5);
                break;
            case 6:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                v10 v10Var2 = (v10) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                u1Var.dismiss();
                if (tL_error6 != null) {
                    v10Var2.a(null, tL_error6.text);
                    break;
                } else {
                    v10Var2.a(passkey, null);
                    break;
                }
            default:
                l10 l10Var = (l10) this.b;
                i10 i10Var = (i10) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                m10 m10Var = l10Var.i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error7 == null) {
                    z9 = true;
                } else {
                    m10Var.getClass();
                    z9 = false;
                }
                i10Var.a(Boolean.valueOf(z9));
                m10Var.getClass();
                break;
        }
    }
}
