// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bea implements af7, ee {
    public final /* synthetic */ nha a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ bea(nha nhaVar, TL_stories.StoryItem storyItem) {
        this.a = nhaVar;
        this.b = storyItem;
    }

    @Override // af7
    public final void a(String str) {
        this.a.y0(this.b, str);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        nha nhaVar = this.a;
        d dVar = nhaVar.y1;
        dVar.getMessagesController().N1().r(arrayList, nhaVar.m1);
        c41.b0(dVar).Q(R.raw.ic_delete, 36, jb6.G(1, "StoriesDeleted", new Object[0])).j();
        nhaVar.E(false);
    }
}
