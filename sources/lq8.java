// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class lq8 extends ProfileStoriesView {
    public final /* synthetic */ Context u0;
    public final /* synthetic */ ProfileActivity v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq8(ProfileActivity profileActivity, Context context, int i, long j, boolean z, d26 d26Var, iq8 iq8Var, vnb vnbVar, Context context2) {
        super(context, i, j, z, d26Var, iq8Var, vnbVar);
        this.v0 = profileActivity;
        this.u0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(xh4 xh4Var) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.v0;
        long a = profileActivity.a();
        c6b O1 = profileActivity.getMessagesController().O1();
        boolean J = O1.J(a);
        Context context = this.u0;
        if (J || O1.L(a) || O1.P(a)) {
            profileActivity.getOrCreateStoryViewer().H(context, a, xh4Var);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().n) {
            profileActivity.getOrCreateStoryViewer().I(context, profileActivity.w2.stories, xh4Var);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.T1();
        } else {
            profileActivity.getOrCreateStoryViewer().I(context, profileActivity.v2.stories, xh4Var);
        }
    }
}
