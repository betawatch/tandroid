package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cv0 extends ProfileStoriesView {
    public final /* synthetic */ Context t0;
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z9, k0 k0Var, zu0 zu0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context2) {
        super(context, i7, j3, z9, k0Var, zu0Var, f6Var);
        this.u0 = profileActivity;
        this.t0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(aa.n nVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.u0;
        long a10 = profileActivity.a();
        di.y6 P1 = profileActivity.getMessagesController().P1();
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
