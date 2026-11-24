// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0c implements zw5, yw5 {
    public final /* synthetic */ b1c a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ z0c c;

    public /* synthetic */ o0c(b1c b1cVar, TL_stories.StoryItem storyItem, z0c z0cVar) {
        this.a = b1cVar;
        this.b = storyItem;
        this.c = z0cVar;
    }

    @Override // zw5
    public final void a(String str) {
        gl.d3(new exa((Object) this.a, (Object) this.b, (Object) str, (Object) this.c, (byte) 16));
    }

    @Override // yw5
    public final void n(Exception exc) {
        gl.d3(new r1b(this.a, this.b, this.c, (byte) 20));
    }
}
