package di;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mj;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w2 implements mj {
    public final /* synthetic */ i4 a;

    public w2(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.mj
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

    @Override // org.telegram.ui.Components.mj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        org.telegram.messenger.c accountInstance;
        i4 i4Var = this.a;
        TL_stories.StoryItem storyItem = i4Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = i4Var.getAccountInstance();
        gz.V(i7, i4Var.k1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z9, false);
        i4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.mj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.mj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
