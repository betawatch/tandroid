package bi;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i6 {
    public final int a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public i6(int i10) {
        this.a = i10;
        this.b = null;
        this.c = null;
    }

    public i6(TL_stories.StoryView storyView) {
        this.a = 1;
        this.b = storyView;
        this.c = null;
    }

    public i6(TL_stories.StoryReaction storyReaction) {
        this.a = 1;
        this.b = null;
        this.c = storyReaction;
    }
}
