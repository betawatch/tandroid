package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ro {
    public final TL_communities.CommunityPeer a;
    public final TLRPC.Chat b;
    public final TLRPC.User c;
    public final TLRPC.Dialog d;

    public ro(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.a = communityPeer;
        this.b = chat;
        this.c = user;
        this.d = dialog;
    }
}
