package ai;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class ha {
    public int a;

    public ha() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, ca caVar) {
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.a).getInputPeer(j3);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new fa(this, j3, view, caVar, messagesController));
    }
}
