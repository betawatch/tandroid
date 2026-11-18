package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bt0 extends fi.o9 {
    public final /* synthetic */ dt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(dt0 dt0Var, fi.p6 p6Var, long j3, int i7) {
        super(i7, j3, p6Var);
        this.h = dt0Var;
    }

    @Override // fi.o9
    public final void a(ArrayList arrayList) {
        lq0 lq0Var;
        org.telegram.messenger.fj messageObject;
        dt0 dt0Var = this.h;
        gt0 gt0Var = dt0Var.G;
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = gt0Var.n0;
            if (i7 >= bs0VarArr.length) {
                lq0Var = null;
                break;
            }
            lq0 lq0Var2 = bs0VarArr[i7].h;
            if (lq0Var2 != null && lq0Var2.getAdapter() == dt0Var) {
                lq0Var = gt0Var.n0[i7].h;
                break;
            }
            i7++;
        }
        if (lq0Var != null) {
            for (int i10 = 0; i10 < lq0Var.getChildCount(); i10++) {
                View childAt = lq0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.o7) && (messageObject = ((org.telegram.ui.Cells.o7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.l.id));
                }
            }
        }
    }

    @Override // fi.o9
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        h6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Integer num = (Integer) arrayList.get(i7);
                num.intValue();
                if (i7 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i7);
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) h6Var.j.get(num);
                if (fjVar != null && (storyItem = fjVar.l) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                h6Var.x();
            }
        }
        return true;
    }
}
