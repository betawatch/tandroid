package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class sv0 extends ci.ia {
    public final /* synthetic */ uv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(uv0 uv0Var, ci.h7 h7Var, long j10, int i10) {
        super(i10, j10, h7Var);
        this.h = uv0Var;
    }

    @Override // ci.ia
    public final void a(ArrayList arrayList) {
        ws0 ws0Var;
        MessageObject messageObject;
        uv0 uv0Var = this.h;
        xv0 xv0Var = uv0Var.F;
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = xv0Var.k0;
            if (i10 >= qu0VarArr.length) {
                ws0Var = null;
                break;
            }
            ws0 ws0Var2 = qu0VarArr[i10].h;
            if (ws0Var2 != null && ws0Var2.getAdapter() == uv0Var) {
                ws0Var = xv0Var.k0[i10].h;
                break;
            }
            i10++;
        }
        if (ws0Var != null) {
            for (int i11 = 0; i11 < ws0Var.getChildCount(); i11++) {
                View childAt = ws0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                }
            }
        }
    }

    @Override // ci.ia
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ci.z6 z6Var = this.h.s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        z6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) z6Var.j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                z6Var.x();
            }
        }
        return true;
    }
}
