package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ev0 extends ai.sc {
    public final /* synthetic */ gv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(gv0 gv0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = gv0Var;
    }

    @Override // ai.sc
    public final void a(ArrayList arrayList) {
        is0 is0Var;
        MessageObject messageObject;
        gv0 gv0Var = this.h;
        jv0 jv0Var = gv0Var.F;
        int i10 = 0;
        while (true) {
            cu0[] cu0VarArr = jv0Var.k0;
            if (i10 >= cu0VarArr.length) {
                is0Var = null;
                break;
            }
            is0 is0Var2 = cu0VarArr[i10].h;
            if (is0Var2 != null && is0Var2.getAdapter() == gv0Var) {
                is0Var = jv0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (is0Var != null) {
            for (int i11 = 0; i11 < is0Var.getChildCount(); i11++) {
                View childAt = is0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                }
            }
        }
    }

    @Override // ai.sc
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        d9Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) d9Var.j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                d9Var.x();
            }
        }
        return true;
    }
}
