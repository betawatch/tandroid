package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dz0 extends ProfileStoriesView {
    public final /* synthetic */ Context t0;
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, k0 k0Var, az0 az0Var, org.telegram.ui.ActionBar.u6 u6Var, Context context2) {
        super(context, i10, j10, z10, k0Var, az0Var, u6Var);
        this.u0 = profileActivity;
        this.t0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(rb.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.u0;
        long a2 = profileActivity.a();
        di.h7 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean K = storiesController.K(a2);
        Context context = this.t0;
        if (K || storiesController.M(a2) || storiesController.Q(a2)) {
            profileActivity.getOrCreateStoryViewer().E(context, a2, cVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().F(context, profileActivity.v2.stories, cVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.u2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.T3();
        } else {
            profileActivity.getOrCreateStoryViewer().F(context, profileActivity.u2.stories, cVar);
        }
    }
}
