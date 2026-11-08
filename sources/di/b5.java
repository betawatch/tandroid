package di;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b5 {
    public final int a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public b5(int i7) {
        this.a = i7;
        this.b = null;
        this.c = null;
    }

    public b5(TL_stories.StoryView storyView) {
        this.a = 1;
        this.b = storyView;
        this.c = null;
    }

    public b5(TL_stories.StoryReaction storyReaction) {
        this.a = 1;
        this.b = null;
        this.c = storyReaction;
    }
}
