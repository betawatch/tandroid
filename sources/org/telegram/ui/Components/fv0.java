package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fv0 extends ai.sc {
    public final /* synthetic */ hv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(hv0 hv0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = hv0Var;
    }

    @Override // ai.sc
    public final void a(ArrayList arrayList) {
        js0 js0Var;
        MessageObject messageObject;
        hv0 hv0Var = this.h;
        kv0 kv0Var = hv0Var.F;
        int i10 = 0;
        while (true) {
            du0[] du0VarArr = kv0Var.k0;
            if (i10 >= du0VarArr.length) {
                js0Var = null;
                break;
            }
            js0 js0Var2 = du0VarArr[i10].h;
            if (js0Var2 != null && js0Var2.getAdapter() == hv0Var) {
                js0Var = kv0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (js0Var != null) {
            for (int i11 = 0; i11 < js0Var.getChildCount(); i11++) {
                View childAt = js0Var.getChildAt(i11);
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
