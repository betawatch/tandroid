package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class su0 extends bi.yb {
    public final /* synthetic */ uu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(uu0 uu0Var, bi.u8 u8Var, long j3, int i10) {
        super(i10, j3, u8Var);
        this.h = uu0Var;
    }

    @Override // bi.yb
    public final void a(ArrayList arrayList) {
        wr0 wr0Var;
        MessageObject messageObject;
        uu0 uu0Var = this.h;
        xu0 xu0Var = uu0Var.F;
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = xu0Var.k0;
            if (i10 >= qt0VarArr.length) {
                wr0Var = null;
                break;
            }
            wr0 wr0Var2 = qt0VarArr[i10].h;
            if (wr0Var2 != null && wr0Var2.getAdapter() == uu0Var) {
                wr0Var = xu0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (wr0Var != null) {
            for (int i11 = 0; i11 < wr0Var.getChildCount(); i11++) {
                View childAt = wr0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                }
            }
        }
    }

    @Override // bi.yb
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        bi.l8 l8Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        l8Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) l8Var.j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                l8Var.x();
            }
        }
        return true;
    }
}
