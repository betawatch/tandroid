// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class aca implements yc7, ed {
    public final /* synthetic */ nfa a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ aca(nfa nfaVar, TL_stories.StoryItem storyItem) {
        this.a = nfaVar;
        this.b = storyItem;
    }

    @Override // yc7
    public final void a(String str) {
        this.a.y0(this.b, str);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        nfa nfaVar = this.a;
        d dVar = nfaVar.y1;
        dVar.getMessagesController().M1().r(arrayList, nfaVar.m1);
        u21.b0(dVar).Q(R.raw.ic_delete, 36, k96.G(1, "StoriesDeleted", new Object[0])).j();
        nfaVar.E(false);
    }
}
