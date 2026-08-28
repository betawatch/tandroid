package ih;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h6 extends n6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public h6(int i9, String str, String str2) {
        super(i9, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // ih.n6
    public final MessageObject f(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return (MessageObject) arrayList.get(i9);
    }

    @Override // ih.n6
    public final int g() {
        return this.J;
    }

    @Override // ih.n6
    public final ArrayList h() {
        return this.F;
    }

    @Override // ih.n6
    public final int i() {
        return this.i.size();
    }

    @Override // ih.n6
    public final boolean k() {
        return this.G;
    }

    @Override // ih.n6
    public final boolean l() {
        return false;
    }

    @Override // ih.n6
    public final boolean q(final int i9, final List list, final boolean z10) {
        TLObject tLObject;
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i9;
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
        int i10 = this.c;
        if (isEmpty) {
            tLObject = null;
        } else {
            tLObject = MessagesController.getInstance(i10).getUserOrChat(str2);
            if (tLObject == null) {
                MessagesController.getInstance(i10).getUserNameResolver().resolve(str2, new d5.d() { // from class: ih.g6
                    @Override // d5.d
                    public final void accept(Object obj) {
                        h6 h6Var = h6.this;
                        k6 k6Var = h6Var.q;
                        TLObject userOrChat = MessagesController.getInstance(h6Var.c).getUserOrChat(h6Var.D);
                        h6Var.G = false;
                        if (userOrChat != null) {
                            h6Var.q(i9, list, z10);
                            return;
                        }
                        h6Var.J = 0;
                        h6Var.H = "";
                        AndroidUtilities.cancelRunOnUIThread(k6Var);
                        AndroidUtilities.runOnUIThread(k6Var);
                    }
                });
                return true;
            }
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = MessagesController.getInputPeer(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_searchPosts, new bf.a(this, 12));
        return true;
    }

    @Override // ih.n6
    public final boolean r(int i9) {
        return false;
    }

    public h6(int i9, TL_stories.MediaArea mediaArea) {
        super(i9, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // ih.n6
    public final void j() {
    }

    @Override // ih.n6
    public final void s() {
    }

    @Override // ih.n6
    public final void x() {
    }
}
