package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class nv0 extends ci.ja {
    public final /* synthetic */ pv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(pv0 pv0Var, ci.i7 i7Var, long j10, int i10) {
        super(i10, j10, i7Var);
        this.h = pv0Var;
    }

    @Override // ci.ja
    public final void a(ArrayList arrayList) {
        rs0 rs0Var;
        MessageObject messageObject;
        pv0 pv0Var = this.h;
        sv0 sv0Var = pv0Var.F;
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = sv0Var.k0;
            if (i10 >= lu0VarArr.length) {
                rs0Var = null;
                break;
            }
            rs0 rs0Var2 = lu0VarArr[i10].h;
            if (rs0Var2 != null && rs0Var2.getAdapter() == pv0Var) {
                rs0Var = sv0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (rs0Var != null) {
            for (int i11 = 0; i11 < rs0Var.getChildCount(); i11++) {
                View childAt = rs0Var.getChildAt(i11);
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
