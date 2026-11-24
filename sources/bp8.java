// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class bp8 extends ProfileStoriesView {
    public final /* synthetic */ Context u0;
    public final /* synthetic */ ProfileActivity v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp8(ProfileActivity profileActivity, Context context, int i, long j, boolean z, ne6 ne6Var, yo8 yo8Var, ylb ylbVar, Context context2) {
        super(context, i, j, z, ne6Var, yo8Var, ylbVar);
        this.v0 = profileActivity;
        this.u0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(lj4 lj4Var) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.v0;
        long a = profileActivity.a();
        h4b N1 = profileActivity.getMessagesController().N1();
        boolean J = N1.J(a);
        Context context = this.u0;
        if (J || N1.L(a) || N1.P(a)) {
            profileActivity.getOrCreateStoryViewer().H(context, a, lj4Var);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().n) {
            profileActivity.getOrCreateStoryViewer().I(context, profileActivity.w2.stories, lj4Var);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.U1();
        } else {
            profileActivity.getOrCreateStoryViewer().I(context, profileActivity.v2.stories, lj4Var);
        }
    }
}
