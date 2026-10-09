package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wv0 extends ai.tc {
    public final /* synthetic */ yv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(yv0 yv0Var, ai.m9 m9Var, long j3, int i10) {
        super(i10, j3, m9Var);
        this.h = yv0Var;
    }

    @Override // ai.tc
    public final void a(ArrayList arrayList) {
        at0 at0Var;
        MessageObject messageObject;
        yv0 yv0Var = this.h;
        bw0 bw0Var = yv0Var.F;
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = bw0Var.k0;
            if (i10 >= uu0VarArr.length) {
                at0Var = null;
                break;
            }
            at0 at0Var2 = uu0VarArr[i10].h;
            if (at0Var2 != null && at0Var2.getAdapter() == yv0Var) {
                at0Var = bw0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (at0Var != null) {
            for (int i11 = 0; i11 < at0Var.getChildCount(); i11++) {
                View childAt = at0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                }
            }
        }
    }

    @Override // ai.tc
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        e9Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) e9Var.j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                e9Var.x();
            }
        }
        return true;
    }
}
