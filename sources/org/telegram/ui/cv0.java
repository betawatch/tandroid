package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class cv0 extends ProfileStoriesView {
    public final /* synthetic */ Context u0;
    public final /* synthetic */ ProfileActivity v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(ProfileActivity profileActivity, Context context, int i7, long j3, boolean z10, k0 k0Var, zu0 zu0Var, org.telegram.ui.ActionBar.h6 h6Var, Context context2) {
        super(context, i7, j3, z10, k0Var, zu0Var, h6Var);
        this.v0 = profileActivity;
        this.u0 = context2;
    }

    @Override // org.telegram.ui.Stories.ProfileStoriesView
    public final void e(d6.i iVar) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ProfileActivity profileActivity = this.v0;
        long a10 = profileActivity.a();
        fi.p6 R1 = profileActivity.getMessagesController().R1();
        boolean K = R1.K(a10);
        Context context = this.u0;
        if (K || R1.M(a10) || R1.Q(a10)) {
            profileActivity.getOrCreateStoryViewer().J(context, a10, iVar);
            return;
        }
        TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.e1 != profileActivity.getUserConfig().n) {
            profileActivity.getOrCreateStoryViewer().K(context, profileActivity.w2.stories, iVar);
            return;
        }
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
            profileActivity.a4();
        } else {
            profileActivity.getOrCreateStoryViewer().K(context, profileActivity.v2.stories, iVar);
        }
    }
}
