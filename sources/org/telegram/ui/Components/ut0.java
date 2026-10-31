package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ut0 extends th.x7 {
    public final /* synthetic */ wt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(wt0 wt0Var, th.e5 e5Var, long j10, int i10) {
        super(i10, j10, e5Var);
        this.h = wt0Var;
    }

    @Override // th.x7
    public final void a(ArrayList arrayList) {
        dr0 dr0Var;
        org.telegram.messenger.jj messageObject;
        wt0 wt0Var = this.h;
        zt0 zt0Var = wt0Var.F;
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = zt0Var.m0;
            if (i10 >= ss0VarArr.length) {
                dr0Var = null;
                break;
            }
            dr0 dr0Var2 = ss0VarArr[i10].h;
            if (dr0Var2 != null && dr0Var2.getAdapter() == wt0Var) {
                dr0Var = zt0Var.m0[i10].h;
                break;
            }
            i10++;
        }
        if (dr0Var != null) {
            for (int i11 = 0; i11 < dr0Var.getChildCount(); i11++) {
                View childAt = dr0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.l.id));
                }
            }
        }
    }

    @Override // th.x7
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        th.x4 x4Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        x4Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) x4Var.j.get(num);
                if (jjVar != null && (storyItem = jjVar.l) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                x4Var.x();
            }
        }
        return true;
    }
}
