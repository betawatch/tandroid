// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class m58 implements k32 {
    public final /* synthetic */ o68 a;

    public m58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // k32
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        k5 accountInstance;
        o68 o68Var = this.a;
        TL_stories.StoryItem storyItem = o68Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = o68Var.getAccountInstance();
        r7a.U(i, o68Var.l1, 0L, j2, 0L, accountInstance, null, null, null, null, null, null, null, null, str, null, arrayList, arrayList, null, null, null, null, storyItem, z, false);
        o68Var.a0(j2 <= 0);
    }

    @Override // k32
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            e eVar = this.a.t0.f;
            if (eVar.getParentActivity() == null) {
                return;
            }
            eVar.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // k32
    public final void S() {
    }

    @Override // k32
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
