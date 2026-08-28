package ih;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q6 extends n6 {
    public final ArrayList C;

    public q6(int i9, ArrayList arrayList) {
        super(i9, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i9;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            i9 = this.c;
            if (i10 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                MessageObject messageObject = new MessageObject(i9, storyItem);
                messageObject.generateThumbs(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(messageObject);
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
        }
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
        return this.i.size();
    }

    @Override // ih.n6
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override // ih.n6
    public final int i() {
        return this.i.size();
    }

    @Override // ih.n6
    public final boolean k() {
        return false;
    }

    @Override // ih.n6
    public final boolean l() {
        return false;
    }

    @Override // ih.n6
    public final boolean q(int i9, List list, boolean z10) {
        return false;
    }

    @Override // ih.n6
    public final boolean r(int i9) {
        return false;
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
