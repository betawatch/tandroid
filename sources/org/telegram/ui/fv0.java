package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fv0 extends ProfileStoriesView {
    public final /* synthetic */ Context t0;
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z9, k0 k0Var, cv0 cv0Var, org.telegram.ui.ActionBar.h6 h6Var, Context context2) {
        super(context, i7, j3, z9, k0Var, cv0Var, h6Var);
        this.u0 = profileActivity;
        this.t0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(aa.n nVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.u0;
        long a10 = profileActivity.a();
        di.z6 P1 = profileActivity.getMessagesController().P1();
        boolean K = P1.K(a10);
        Context context = this.t0;
        if (K || P1.M(a10) || P1.Q(a10)) {
            profileActivity.getOrCreateStoryViewer().J(context, a10, nVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.u2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.d1 != profileActivity.getUserConfig().n) {
            profileActivity.getOrCreateStoryViewer().K(context, profileActivity.u2.stories, nVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.t2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.a4();
        } else {
            profileActivity.getOrCreateStoryViewer().K(context, profileActivity.t2.stories, nVar);
        }
    }
}
