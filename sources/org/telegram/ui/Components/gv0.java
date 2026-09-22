package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gv0 extends ai.sc {
    public final /* synthetic */ iv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(iv0 iv0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = iv0Var;
    }

    @Override // ai.sc
    public final void a(ArrayList arrayList) {
        ks0 ks0Var;
        MessageObject messageObject;
        iv0 iv0Var = this.h;
        lv0 lv0Var = iv0Var.F;
        int i10 = 0;
        while (true) {
            eu0[] eu0VarArr = lv0Var.k0;
            if (i10 >= eu0VarArr.length) {
                ks0Var = null;
                break;
            }
            ks0 ks0Var2 = eu0VarArr[i10].h;
            if (ks0Var2 != null && ks0Var2.getAdapter() == iv0Var) {
                ks0Var = lv0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (ks0Var != null) {
            for (int i11 = 0; i11 < ks0Var.getChildCount(); i11++) {
                View childAt = ks0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.u7) && (messageObject = ((org.telegram.ui.Cells.u7) childAt).getMessageObject()) != null && messageObject.isStory()) {
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
