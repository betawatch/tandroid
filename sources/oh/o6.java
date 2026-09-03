package oh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o6 extends l6 {
    public final ArrayList C;

    public o6(int i10, ArrayList arrayList) {
        super(i10, 0L, 3, -1, null);
        this.C = new ArrayList();
        F(arrayList);
    }

    public final void F(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = this.i;
        arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            i10 = this.c;
            if (i11 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (storyItem != null) {
                storyItem.messageId = arrayList2.size();
                MessageObject messageObject = new MessageObject(i10, storyItem);
                messageObject.generateThumbs(false);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(arrayList2.size()));
                this.C.add(arrayList3);
                arrayList2.add(messageObject);
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
        }
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
        return this.i.size();
    }

    @Override // oh.l6
    public final ArrayList h() {
        return new ArrayList(this.C);
    }

    @Override // oh.l6
    public final int i() {
        return this.i.size();
    }

    @Override // oh.l6
    public final boolean k() {
        return false;
    }

    @Override // oh.l6
    public final boolean l() {
        return false;
    }

    @Override // oh.l6
    public final boolean q(int i10, List list, boolean z4) {
        return false;
    }

    @Override // oh.l6
    public final boolean r(int i10) {
        return false;
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
