// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class o4c implements ez5, dz5 {
    public final /* synthetic */ a5c a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ y4c c;

    public /* synthetic */ o4c(a5c a5cVar, TL_stories.StoryItem storyItem, y4c y4cVar) {
        this.a = a5cVar;
        this.b = storyItem;
        this.c = y4cVar;
    }

    @Override // ez5
    public final void a(String str) {
        hl.c3(new kta((Object) this.a, (Object) this.b, (Object) str, (Object) this.c, (byte) 17));
    }

    @Override // dz5
    public final void l(Exception exc) {
        hl.c3(new pwa(this.a, this.b, this.c, (byte) 29));
    }
}
