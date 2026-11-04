package ei;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.yy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lj;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z2 implements lj {
    public final /* synthetic */ j4 a;

    public z2(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.d2 d2Var = this.a.t0.f;
            if (d2Var.getParentActivity() == null) {
                return;
            }
            d2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        org.telegram.messenger.c accountInstance;
        j4 j4Var = this.a;
        TL_stories.StoryItem storyItem = j4Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = j4Var.getAccountInstance();
        yy.V(i3, j4Var.l1, 0L, j11, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z10, false);
        j4Var.i0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
