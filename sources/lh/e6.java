package lh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e6 extends k6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public e6(int i10, String str, String str2) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // lh.k6
    public final MessageObject f(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (MessageObject) arrayList.get(i10);
    }

    @Override // lh.k6
    public final int g() {
        return this.J;
    }

    @Override // lh.k6
    public final ArrayList h() {
        return this.F;
    }

    @Override // lh.k6
    public final int i() {
        return this.i.size();
    }

    @Override // lh.k6
    public final boolean k() {
        return this.G;
    }

    @Override // lh.k6
    public final boolean l() {
        return false;
    }

    @Override // lh.k6
    public final boolean q(final int i10, final List list, final boolean z10) {
        TLObject tLObject;
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i10;
        String str = this.C;
        if (str != null) {
            tL_stories_searchPosts.flags |= 1;
            tL_stories_searchPosts.hashtag = str;
        }
        TL_stories.MediaArea mediaArea = this.E;
        if (mediaArea != null) {
            tL_stories_searchPosts.flags |= 2;
            tL_stories_searchPosts.area = mediaArea;
        }
        this.G = true;
        String str2 = this.D;
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i11 = this.c;
        if (isEmpty) {
            tLObject = null;
        } else {
            tLObject = MessagesController.getInstance(i11).getUserOrChat(str2);
            if (tLObject == null) {
                MessagesController.getInstance(i11).getUserNameResolver().resolve(str2, new f5.d() { // from class: lh.d6
                    @Override // f5.d
                    public final void accept(Object obj) {
                        e6 e6Var = e6.this;
                        h6 h6Var = e6Var.q;
                        TLObject userOrChat = MessagesController.getInstance(e6Var.c).getUserOrChat(e6Var.D);
                        e6Var.G = false;
                        if (userOrChat != null) {
                            e6Var.q(i10, list, z10);
                            return;
                        }
                        e6Var.J = 0;
                        e6Var.H = "";
                        AndroidUtilities.cancelRunOnUIThread(h6Var);
                        AndroidUtilities.runOnUIThread(h6Var);
                    }
                });
                return true;
            }
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = MessagesController.getInputPeer(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_searchPosts, new ef.a(this, 12));
        return true;
    }

    @Override // lh.k6
    public final boolean r(int i10) {
        return false;
    }

    public e6(int i10, TL_stories.MediaArea mediaArea) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // lh.k6
    public final void j() {
    }

    @Override // lh.k6
    public final void s() {
    }

    @Override // lh.k6
    public final void x() {
    }
}
