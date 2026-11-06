package di;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k6 extends q6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public k6(int i7, String str, String str2) {
        super(i7, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // di.q6
    public final ij f(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (ij) arrayList.get(i7);
    }

    @Override // di.q6
    public final int g() {
        return this.J;
    }

    @Override // di.q6
    public final ArrayList h() {
        return this.F;
    }

    @Override // di.q6
    public final int i() {
        return this.i.size();
    }

    @Override // di.q6
    public final boolean k() {
        return this.G;
    }

    @Override // di.q6
    public final boolean l() {
        return false;
    }

    @Override // di.q6
    public final boolean q(int i7, List list, boolean z9) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i7;
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
        TLObject tLObject = null;
        int i10 = this.c;
        if (!isEmpty) {
            TLObject f22 = qp.s1(i10).f2(str2);
            if (f22 == null) {
                qp.s1(i10).d2().a(str2, null, new r2(this, z9, i7, list));
                return true;
            }
            tLObject = f22;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = qp.k1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_searchPosts, new bi.j0(this, 6));
        return true;
    }

    @Override // di.q6
    public final boolean r(int i7) {
        return false;
    }

    public k6(int i7, TL_stories.MediaArea mediaArea) {
        super(i7, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // di.q6
    public final void j() {
    }

    @Override // di.q6
    public final void s() {
    }

    @Override // di.q6
    public final void x() {
    }
}
