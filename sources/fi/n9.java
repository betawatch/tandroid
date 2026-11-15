package fi;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n9 extends jc {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public n9(TL_stories.StoryItem storyItem) {
        for (int i7 = 0; i7 < storyItem.media_areas.size(); i7++) {
            if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new k9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i7)));
            } else if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new m9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i7)));
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((j9) arrayList.get(i7)).c(imageReceiver.e);
            ((j9) arrayList.get(i7)).b(true);
        }
    }
}
