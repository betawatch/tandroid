package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rs0 extends ei.aa {
    public final /* synthetic */ ts0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(ts0 ts0Var, ei.z6 z6Var, long j10, int i3) {
        super(i3, j10, z6Var);
        this.h = ts0Var;
    }

    @Override // ei.aa
    public final void a(ArrayList arrayList) {
        cq0 cq0Var;
        org.telegram.messenger.zi messageObject;
        ts0 ts0Var = this.h;
        ws0 ws0Var = ts0Var.G;
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = ws0Var.n0;
            if (i3 >= rr0VarArr.length) {
                cq0Var = null;
                break;
            }
            cq0 cq0Var2 = rr0VarArr[i3].h;
            if (cq0Var2 != null && cq0Var2.getAdapter() == ts0Var) {
                cq0Var = ws0Var.n0[i3].h;
                break;
            }
            i3++;
        }
        if (cq0Var != null) {
            for (int i10 = 0; i10 < cq0Var.getChildCount(); i10++) {
                View childAt = cq0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.n7) && (messageObject = ((org.telegram.ui.Cells.n7) childAt).getMessageObject()) != null && messageObject.y4()) {
                    arrayList.add(Integer.valueOf(messageObject.l.id));
                }
            }
        }
    }

    @Override // ei.aa
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ei.r6 r6Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        r6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Integer num = (Integer) arrayList.get(i3);
                num.intValue();
                if (i3 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i3);
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) r6Var.j.get(num);
                if (ziVar != null && (storyItem = ziVar.l) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                r6Var.x();
            }
        }
        return true;
    }
}
