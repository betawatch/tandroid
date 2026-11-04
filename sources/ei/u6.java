package ei;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u6 extends r6 {
    public final ArrayList C;

    public u6(int i3, ArrayList arrayList) {
        super(i3, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i3;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            i3 = this.c;
            if (i10 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                zi ziVar = new zi(i3, storyItem);
                ziVar.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(ziVar);
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            hs.f(i3).k(hs.x5, this);
        }
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
        return this.i.size();
    }

    @Override // ei.r6
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override // ei.r6
    public final int i() {
        return this.i.size();
    }

    @Override // ei.r6
    public final boolean k() {
        return false;
    }

    @Override // ei.r6
    public final boolean l() {
        return false;
    }

    @Override // ei.r6
    public final boolean q(int i3, List list, boolean z10) {
        return false;
    }

    @Override // ei.r6
    public final boolean r(int i3) {
        return false;
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
