package ei;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l6 extends r6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public l6(int i3, String str, String str2) {
        super(i3, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override // ei.r6
    public final zi f(int i3) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i3 >= arrayList.size()) {
            return null;
        }
        return (zi) arrayList.get(i3);
    }

    @Override // ei.r6
    public final int g() {
        return this.J;
    }

    @Override // ei.r6
    public final ArrayList h() {
        return this.F;
    }

    @Override // ei.r6
    public final int i() {
        return this.i.size();
    }

    @Override // ei.r6
    public final boolean k() {
        return this.G;
    }

    @Override // ei.r6
    public final boolean l() {
        return false;
    }

    @Override // ei.r6
    public final boolean q(int i3, List list, boolean z10) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i3;
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
            TLObject f22 = hp.s1(i10).f2(str2);
            if (f22 == null) {
                hp.s1(i10).d2().a(str2, null, new v2(this, z10, i3, list));
                return true;
            }
            tLObject = f22;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = hp.k1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_searchPosts, new ci.d0(this, 6));
        return true;
    }

    @Override // ei.r6
    public final boolean r(int i3) {
        return false;
    }

    public l6(int i3, TL_stories.MediaArea mediaArea) {
        super(i3, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override // ei.r6
    public final void j() {
    }

    @Override // ei.r6
    public final void s() {
    }

    @Override // ei.r6
    public final void x() {
    }
}
