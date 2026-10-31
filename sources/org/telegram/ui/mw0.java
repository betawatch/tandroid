package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mw0 extends ProfileStoriesView {
    public final /* synthetic */ Context t0;
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(ProfileActivity profileActivity, Context context, int i10, long j10, boolean z10, l0 l0Var, jw0 jw0Var, org.telegram.ui.ActionBar.p6 p6Var, Context context2) {
        super(context, i10, j10, z10, l0Var, jw0Var, p6Var);
        this.u0 = profileActivity;
        this.t0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(r2.y yVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.u0;
        long a2 = profileActivity.a();
        th.e5 O1 = profileActivity.getMessagesController().O1();
        boolean K = O1.K(a2);
        Context context = this.t0;
        if (K || O1.M(a2) || O1.Q(a2)) {
            profileActivity.getOrCreateStoryViewer().R(context, a2, yVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.u2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.d1 != profileActivity.getUserConfig().n) {
            profileActivity.getOrCreateStoryViewer().S(context, profileActivity.u2.stories, yVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.t2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.Z3();
        } else {
            profileActivity.getOrCreateStoryViewer().S(context, profileActivity.t2.stories, yVar);
        }
    }
}
