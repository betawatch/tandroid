package di;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lj;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w2 implements lj {
    public final /* synthetic */ j4 a;

    public w2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.f2 f2Var = this.a.s0.f;
            if (f2Var.getParentActivity() == null) {
                return;
            }
            f2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        org.telegram.messenger.c accountInstance;
        j4 j4Var = this.a;
        TL_stories.StoryItem storyItem = j4Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = j4Var.getAccountInstance();
        gz.V(i7, j4Var.k1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z9, false);
        j4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
