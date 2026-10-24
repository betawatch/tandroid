package ci;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b8 {
    public int a;
    public View b;

    public b8() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, x7 x7Var) {
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new a8(this, j10, view, x7Var, messagesController));
    }
}
