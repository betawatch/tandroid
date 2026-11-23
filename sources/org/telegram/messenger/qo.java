package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class qo {
    public final TL_communities.CommunityPeer a;
    public final TLRPC.Chat b;
    public final TLRPC.User c;
    public final TLRPC.Dialog d;

    public qo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.a = communityPeer;
        this.b = chat;
        this.c = user;
        this.d = dialog;
    }
}
