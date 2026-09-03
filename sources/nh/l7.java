package nh;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l7 {
    public int a;

    public l7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, i7 i7Var) {
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new kf.f0(this, j10, view, i7Var, messagesController));
    }
}
