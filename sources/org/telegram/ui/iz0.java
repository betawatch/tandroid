package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class iz0 extends ProfileStoriesView {
    public final /* synthetic */ Context t0;
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ProfileActivity profileActivity, Context context, int i10, long j3, boolean z10, k0 k0Var, fz0 fz0Var, org.telegram.ui.ActionBar.d6 d6Var, Context context2) {
        super(context, i10, j3, z10, k0Var, fz0Var, d6Var);
        this.u0 = profileActivity;
        this.t0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(a6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.u0;
        long a2 = profileActivity.a();
        ai.l9 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.t0;
        if (I || storiesController.K(a2) || storiesController.N(a2)) {
            profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.v2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.v2.stories, iVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.u2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.u2.stories, iVar);
        }
    }
}
