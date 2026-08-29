package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oy0 extends ProfileStoriesView {
    public final /* synthetic */ Context p0;
    public final /* synthetic */ ProfileActivity q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, n0 n0Var, ly0 ly0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context2) {
        super(context, i10, j10, z10, n0Var, ly0Var, c6Var);
        this.q0 = profileActivity;
        this.p0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(ha.c cVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.q0;
        long a2 = profileActivity.a();
        lh.s6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.p0;
        if (I || storiesController.K(a2) || storiesController.N(a2)) {
            profileActivity.getOrCreateStoryViewer().D(context, a2, cVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.r2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.a1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.r2.stories, cVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.q2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.q2.stories, cVar);
        }
    }
}
