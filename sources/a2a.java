// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a2a {
    public final byte a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public a2a(TL_stories.StoryView storyView) {
        this.a = (byte) 1;
        this.b = storyView;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a2a(int i) {
        this.a = i;
        this.b = null;
        this.c = null;
    }

    public a2a(TL_stories.StoryReaction storyReaction) {
        this.a = (byte) 1;
        this.b = null;
        this.c = storyReaction;
    }
}
