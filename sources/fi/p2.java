package fi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.zy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class p2 implements ck {
    public final /* synthetic */ z3 a;

    public p2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.ck
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.g2 g2Var = this.a.t0.f;
            if (g2Var.getParentActivity() == null) {
                return;
            }
            g2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ck
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        z3 z3Var = this.a;
        TL_stories.StoryItem storyItem = z3Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = z3Var.getAccountInstance();
        zy.V(i7, z3Var.l1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z10, false);
        z3Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.ck
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.ck
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
