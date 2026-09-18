package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v8 extends d9 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public v8(int i10, String str, String str2) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // ai.d9
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

    @Override // ai.d9
    public final int g() {
        return this.J;
    }

    @Override // ai.d9
    public final ArrayList h() {
        return this.F;
    }

    @Override // ai.d9
    public final int i() {
        return this.i.size();
    }

    @Override // ai.d9
    public final boolean k() {
        return this.G;
    }

    @Override // ai.d9
    public final boolean l() {
        return false;
    }

    @Override // ai.d9
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
                MessagesController.getInstance(i11).getUserNameResolver().resolve(str2, new e2.h() { // from class: ai.u8
                    @Override // e2.h
                    public final void accept(Object obj) {
                        v8 v8Var = v8.this;
                        y8 y8Var = v8Var.q;
                        TLObject userOrChat = MessagesController.getInstance(v8Var.c).getUserOrChat(v8Var.D);
                        v8Var.G = false;
                        if (userOrChat != null) {
                            v8Var.q(i10, list, z10);
                            return;
                        }
                        v8Var.J = 0;
                        v8Var.H = "";
                        AndroidUtilities.cancelRunOnUIThread(y8Var);
                        AndroidUtilities.runOnUIThread(y8Var);
                    }
                });
                return true;
            }
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = MessagesController.getInputPeer(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_searchPosts, new m8(this, 1));
        return true;
    }

    @Override // ai.d9
    public final boolean r(int i10) {
        return false;
    }

    public v8(int i10, TL_stories.MediaArea mediaArea) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // ai.d9
    public final void j() {
    }

    @Override // ai.d9
    public final void s() {
    }

    @Override // ai.d9
    public final void x() {
    }
}
