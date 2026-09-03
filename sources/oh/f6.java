package oh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f6 extends l6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public f6(int i10, String str, String str2) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // oh.l6
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

    @Override // oh.l6
    public final int g() {
        return this.J;
    }

    @Override // oh.l6
    public final ArrayList h() {
        return this.F;
    }

    @Override // oh.l6
    public final int i() {
        return this.i.size();
    }

    @Override // oh.l6
    public final boolean k() {
        return this.G;
    }

    @Override // oh.l6
    public final boolean l() {
        return false;
    }

    @Override // oh.l6
    public final boolean q(final int i10, final List list, final boolean z4) {
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
                MessagesController.getInstance(i11).getUserNameResolver().resolve(str2, new h5.d() { // from class: oh.e6
                    @Override // h5.d
                    public final void accept(Object obj) {
                        f6 f6Var = f6.this;
                        i6 i6Var = f6Var.q;
                        TLObject userOrChat = MessagesController.getInstance(f6Var.c).getUserOrChat(f6Var.D);
                        f6Var.G = false;
                        if (userOrChat != null) {
                            f6Var.q(i10, list, z4);
                            return;
                        }
                        f6Var.J = 0;
                        f6Var.H = "";
                        AndroidUtilities.cancelRunOnUIThread(i6Var);
                        AndroidUtilities.runOnUIThread(i6Var);
                    }
                });
                return true;
            }
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = MessagesController.getInputPeer(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_searchPosts, new gf.a(this, 12));
        return true;
    }

    @Override // oh.l6
    public final boolean r(int i10) {
        return false;
    }

    public f6(int i10, TL_stories.MediaArea mediaArea) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // oh.l6
    public final void j() {
    }

    @Override // oh.l6
    public final void s() {
    }

    @Override // oh.l6
    public final void x() {
    }
}
