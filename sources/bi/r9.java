package bi;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class r9 {
    public int a;
    public View b;

    public r9() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, m9 m9Var) {
        int i10 = UserConfig.selectedAccount;
        this.a = i10;
        this.b = view;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getStoriesController().e0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = MessagesController.getInstance(this.a).getInputPeer(j10);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new p9(this, j10, view, m9Var, messagesController));
    }
}
