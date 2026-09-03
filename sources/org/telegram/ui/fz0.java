package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fz0 extends ProfileStoriesView {
    public final /* synthetic */ Context q0;
    public final /* synthetic */ ProfileActivity r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z4, n0 n0Var, cz0 cz0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i10, j10, z4, n0Var, cz0Var, f6Var);
        this.r0 = profileActivity;
        this.q0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(bb.b bVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.r0;
        long a2 = profileActivity.a();
        nh.t6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.q0;
        if (I || storiesController.K(a2) || storiesController.N(a2)) {
            profileActivity.getOrCreateStoryViewer().D(context, a2, bVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.s2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.b1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.s2.stories, bVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.r2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.r2.stories, bVar);
        }
    }
}
