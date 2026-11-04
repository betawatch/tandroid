package ei;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dc;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w9 extends dc {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public w9(TL_stories.StoryItem storyItem) {
        for (int i3 = 0; i3 < storyItem.media_areas.size(); i3++) {
            if (storyItem.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new t9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i3)));
            } else if (storyItem.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new v9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i3)));
            }
        }
    }

    @Override // org.telegram.messenger.dc
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((s9) arrayList.get(i3)).c(imageReceiver.e);
            ((s9) arrayList.get(i3)).b(true);
        }
    }
}
