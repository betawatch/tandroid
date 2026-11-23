package fi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class k6 extends h6 {
    public final ArrayList C;

    public k6(int i7, ArrayList arrayList) {
        super(i7, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i7;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            i7 = this.c;
            if (i10 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                gj gjVar = new gj(i7, storyItem);
                gjVar.r0(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(gjVar);
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            ls.f(i7).k(ls.A5, this);
        }
    }

    @Override // fi.h6
    public final gj f(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (gj) arrayList.get(i7);
    }

    @Override // fi.h6
    public final int g() {
        return this.i.size();
    }

    @Override // fi.h6
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override // fi.h6
    public final int i() {
        return this.i.size();
    }

    @Override // fi.h6
    public final boolean k() {
        return false;
    }

    @Override // fi.h6
    public final boolean l() {
        return false;
    }

    @Override // fi.h6
    public final boolean q(int i7, List list, boolean z10) {
        return false;
    }

    @Override // fi.h6
    public final boolean r(int i7) {
        return false;
    }

    @Override // fi.h6
    public final void j() {
    }

    @Override // fi.h6
    public final void s() {
    }

    @Override // fi.h6
    public final void x() {
    }
}
