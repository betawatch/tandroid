package bi;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
