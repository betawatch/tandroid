package ih;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o7 {
    public int a;

    public o7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, l7 l7Var) {
        int i9 = UserConfig.selectedAccount;
        this.a = i9;
        MessagesController messagesController = MessagesController.getInstance(i9);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new ff.g0(this, j10, view, l7Var, messagesController));
    }
}
