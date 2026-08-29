package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lu0 extends lh.r9 {
    public final /* synthetic */ nu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(nu0 nu0Var, lh.s6 s6Var, long j10, int i10) {
        super(i10, j10, s6Var);
        this.h = nu0Var;
    }

    @Override // lh.r9
    public final void a(ArrayList arrayList) {
        or0 or0Var;
        MessageObject messageObject;
        nu0 nu0Var = this.h;
        qu0 qu0Var = nu0Var.B;
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = qu0Var.g0;
            if (i10 >= it0VarArr.length) {
                or0Var = null;
                break;
            }
            or0 or0Var2 = it0VarArr[i10].h;
            if (or0Var2 != null && or0Var2.getAdapter() == nu0Var) {
                or0Var = qu0Var.g0[i10].h;
                break;
            }
            i10++;
        }
        if (or0Var != null) {
            for (int i11 = 0; i11 < or0Var.getChildCount(); i11++) {
                View childAt = or0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.p7) && (messageObject = ((org.telegram.ui.Cells.p7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                }
            }
        }
    }

    @Override // lh.r9
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        lh.k6 k6Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        k6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) k6Var.j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                k6Var.x();
            }
        }
        return true;
    }
}
