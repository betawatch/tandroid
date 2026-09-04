package bi;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class o9 {
    public int a;

    public o9() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, j9 j9Var) {
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.a).getInputPeer(j3);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new m9(this, j3, view, j9Var, messagesController));
    }
}
