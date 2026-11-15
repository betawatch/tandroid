package fi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.ez;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r2 implements tj {
    public final /* synthetic */ b4 a;

    public r2(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.tj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.e2 e2Var = this.a.t0.f;
            if (e2Var.getParentActivity() == null) {
                return;
            }
            e2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.tj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        b4 b4Var = this.a;
        TL_stories.StoryItem storyItem = b4Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = b4Var.getAccountInstance();
        ez.V(i7, b4Var.l1, 0L, j10, 0L, str, null, arrayList, arrayList, null, null, null, null, accountInstance, null, null, null, null, null, storyItem, null, null, null, z10, false);
        b4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.tj
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.tj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
