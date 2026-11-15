package fi;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t4 {
    public final int a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public t4(int i7) {
        this.a = i7;
        this.b = null;
        this.c = null;
    }

    public t4(TL_stories.StoryView storyView) {
        this.a = 1;
        this.b = storyView;
        this.c = null;
    }

    public t4(TL_stories.StoryReaction storyReaction) {
        this.a = 1;
        this.b = null;
        this.c = storyReaction;
    }
}
