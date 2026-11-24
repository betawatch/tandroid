// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ifa extends ifc {
    public final /* synthetic */ kfa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifa(kfa kfaVar, g2b g2bVar, long j, int i) {
        super(i, j, g2bVar);
        this.h = kfaVar;
    }

    @Override // ifc
    public final void a(ArrayList arrayList) {
        sca scaVar;
        k27 messageObject;
        kfa kfaVar = this.h;
        nfa nfaVar = kfaVar.G;
        int i = 0;
        while (true) {
            iea[] ieaVarArr = nfaVar.n0;
            if (i >= ieaVarArr.length) {
                scaVar = null;
                break;
            }
            sca scaVar2 = ieaVarArr[i].h;
            if (scaVar2 != null && scaVar2.getAdapter() == kfaVar) {
                scaVar = nfaVar.n0[i].h;
                break;
            }
            i++;
        }
        if (scaVar != null) {
            for (int i2 = 0; i2 < scaVar.getChildCount(); i2++) {
                View childAt = scaVar.getChildAt(i2);
                if ((childAt instanceof qfa) && (messageObject = ((qfa) childAt).getMessageObject()) != null && messageObject.w4()) {
                    arrayList.add(Integer.valueOf(messageObject.l.id));
                }
            }
        }
    }

    @Override // ifc
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        y1b y1bVar = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        y1bVar.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                num.getClass();
                if (i >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i);
                k27 k27Var = (k27) y1bVar.j.get(num);
                if (k27Var != null && (storyItem = k27Var.l) != null) {
                    storyItem.views = storyViews;
                    z = true;
                }
            }
            if (z) {
                y1bVar.x();
            }
        }
        return true;
    }
}
