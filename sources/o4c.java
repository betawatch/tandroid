// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
