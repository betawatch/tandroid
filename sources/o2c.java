// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class o2c implements zy5, yy5 {
    public final /* synthetic */ b3c a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ z2c c;

    public /* synthetic */ o2c(b3c b3cVar, TL_stories.StoryItem storyItem, z2c z2cVar) {
        this.a = b3cVar;
        this.b = storyItem;
        this.c = z2cVar;
    }

    @Override // zy5
    public final void a(String str) {
        gm.c3(new hza((Object) this.a, (Object) this.b, (Object) str, (Object) this.c, (byte) 16));
    }

    @Override // yy5
    public final void o(Exception exc) {
        gm.c3(new j2b(this.a, this.b, this.c, (byte) 23));
    }
}
