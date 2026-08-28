package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oy0 extends ProfileStoriesView {
    public final /* synthetic */ Context p0;
    public final /* synthetic */ ProfileActivity q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(ProfileActivity profileActivity, Context context, int i9, long j10, boolean z10, m0 m0Var, ly0 ly0Var, org.telegram.ui.ActionBar.b6 b6Var, Context context2) {
        super(context, i9, j10, z10, m0Var, ly0Var, b6Var);
        this.q0 = profileActivity;
        this.p0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(k5.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.q0;
        long a2 = profileActivity.a();
        ih.v6 storiesController = profileActivity.getMessagesController().getStoriesController();
        boolean I = storiesController.I(a2);
        Context context = this.p0;
        if (I || storiesController.K(a2) || storiesController.N(a2)) {
            profileActivity.getOrCreateStoryViewer().D(context, a2, iVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.r2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.a1 != profileActivity.getUserConfig().clientUserId) {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.r2.stories, iVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.q2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.K3();
        } else {
            profileActivity.getOrCreateStoryViewer().E(context, profileActivity.q2.stories, iVar);
        }
    }
}
