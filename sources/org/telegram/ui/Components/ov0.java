package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ov0 extends ci.ja {
    public final /* synthetic */ qv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(qv0 qv0Var, ci.i7 i7Var, long j10, int i10) {
        super(i10, j10, i7Var);
        this.h = qv0Var;
    }

    @Override // ci.ja
    public final void a(ArrayList arrayList) {
        ss0 ss0Var;
        MessageObject messageObject;
        qv0 qv0Var = this.h;
        tv0 tv0Var = qv0Var.F;
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = tv0Var.k0;
            if (i10 >= mu0VarArr.length) {
                ss0Var = null;
                break;
            }
            ss0 ss0Var2 = mu0VarArr[i10].h;
            if (ss0Var2 != null && ss0Var2.getAdapter() == qv0Var) {
                ss0Var = tv0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (ss0Var != null) {
            for (int i11 = 0; i11 < ss0Var.getChildCount(); i11++) {
                View childAt = ss0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                }
            }
        }
    }

    @Override // ci.ja
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        a7Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) a7Var.j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                a7Var.x();
            }
        }
        return true;
    }
}
