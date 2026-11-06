package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class uo {
    public final TL_communities.CommunityPeer a;
    public final TLRPC.Chat b;
    public final TLRPC.User c;
    public final TLRPC.Dialog d;

    public uo(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        this.a = communityPeer;
        this.b = chat;
        this.c = user;
        this.d = dialog;
    }
}
