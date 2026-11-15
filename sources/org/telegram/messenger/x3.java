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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) this.c;
                TL_account.ChatThemes chatThemes = (TL_account.ChatThemes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    g0.h3(new b4(22, bpVar, tL_error));
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (chatThemes instanceof TL_account.Tl_chatThemes) {
                        TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
                        vr messagesStorage = d4Var.getMessagesStorage();
                        ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
                        messagesStorage.getClass();
                        messagesStorage.I(new pq(5, messagesStorage, arrayList2));
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
                            org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(d4Var.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i10));
                            p3Var.p(0, null);
                            p3Var.p(1, null);
                            p3Var.n(0, null);
                            p3Var.n(1, null);
                            arrayList4.add(p3Var);
                        }
                        g0.h3(new jn(d4Var, tl_chatThemes, arrayList4, arrayList, bpVar, 1));
                        break;
                    } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                        g0.h3(new b4(23, d4Var, bpVar));
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
                final v9 v9Var = (v9) this.b;
                final s10 s10Var = (s10) this.c;
                final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                final TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = v9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    v9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    v9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(tL_StarGiftAuctionState.gift.id, Boolean.TRUE);
                    v9Var.j(tL_StarGiftAuctionState.gift.id, new z10() { // from class: org.telegram.messenger.n9
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj3) {
                            v9 v9Var2 = v9.this;
                            v9Var2.getClass();
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState2 = tL_StarGiftAuctionState;
                            v9Var2.d(tL_StarGiftAuctionState2.gift.id).c = (ArrayList) obj3;
                            v9Var2.f(tL_StarGiftAuctionState2.gift.id, tL_StarGiftAuctionState2);
                            s10Var.a(tL_StarGiftAuctionState2, tL_error3);
                        }
                    });
                    break;
                } else {
                    if (tL_StarGiftAuctionState != null) {
                        v9Var.f(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
                    }
                    s10Var.a(tL_StarGiftAuctionState, tL_error3);
                    break;
                }
            case 3:
                np npVar = (np) this.b;
                li.i0 i0Var = (li.i0) this.c;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    npVar.S3(peerLinkRequests.chats, false);
                    npVar.Y3(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList5 = peerLinkRequests.requests;
                    int size2 = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList5.get(i11);
                        i11++;
                        long j3 = -m5.o(communityPeerRequest.peer);
                        if (npVar.N0(j3) == null) {
                            npVar.V2(0, j3, true);
                        }
                    }
                    i0Var.a(peerLinkRequests, null);
                    break;
                } else {
                    i0Var.a(null, tL_error4);
                    break;
                }
            case 4:
                np npVar2 = (np) this.b;
                hi.g7 g7Var = (hi.g7) this.c;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                if (messages_chats != null) {
                    npVar2.S3(messages_chats.chats, false);
                    npVar2.R7 = messages_chats.chats;
                }
                g7Var.a(messages_chats != null ? messages_chats.chats : null);
                break;
            case 5:
                np npVar3 = (np) this.b;
                org.telegram.ui.Components.kr krVar = (org.telegram.ui.Components.kr) this.c;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    npVar3.S3(participantJoinedChats.chats, false);
                    npVar3.Y3(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList6 = participantJoinedChats.creator_chat_ids;
                    int size3 = arrayList6.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Long l10 = arrayList6.get(i12);
                        i12++;
                        long longValue = l10.longValue();
                        if (npVar3.N0(longValue) == null) {
                            npVar3.V2(0, longValue, true);
                        }
                    }
                }
                krVar.a(participantJoinedChats, tL_error5);
                break;
            case 6:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                s10 s10Var2 = (s10) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                t1Var.dismiss();
                if (tL_error6 != null) {
                    s10Var2.a(null, tL_error6.text);
                    break;
                } else {
                    s10Var2.a(passkey, null);
                    break;
                }
            default:
                i10 i10Var = (i10) this.b;
                f10 f10Var = (f10) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                j10 j10Var = i10Var.i;
                if ((((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) && tL_error7 == null) {
                    z10 = true;
                } else {
                    j10Var.getClass();
                    z10 = false;
                }
                f10Var.a(Boolean.valueOf(z10));
                j10Var.getClass();
                break;
        }
    }
}
