package ei;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.b20;
import org.telegram.messenger.ye;
import org.telegram.messenger.yy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f3 implements x30 {
    public final /* synthetic */ j4 a;

    public f3(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.x30
    public final long a() {
        return this.a.l1;
    }

    @Override // org.telegram.ui.Components.x30
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.x30
    public final int getClassGuid() {
        return this.a.j2;
    }

    @Override // org.telegram.ui.Components.x30
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.x30
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.x30
    public final void u(ye yeVar, b20 b20Var, boolean z10, int i3, int i10, boolean z11, long j10) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        j4 j4Var = this.a;
        TL_stories.StoryItem storyItem = j4Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = j4Var.l1;
        if (yeVar.b) {
            if (b20Var != null) {
                accountInstance4 = j4Var.getAccountInstance();
                String str = yeVar.I;
                yy.b0(yeVar.x, i3, i10, j4Var.l1, 0L, j10, 0L, yeVar.a, str, null, yeVar.n, accountInstance4, null, null, null, null, null, b20Var, null, storyItem, null, z10, false, yeVar.M);
            } else {
                accountInstance3 = j4Var.getAccountInstance();
                String str2 = yeVar.I;
                yy.b0(yeVar.x, i3, i10, j4Var.l1, 0L, j10, 0L, yeVar.a, str2, null, yeVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, yeVar.M);
            }
        } else if (yeVar.h != null) {
            accountInstance2 = j4Var.getAccountInstance();
            yy.Z(accountInstance2, yeVar.h, yeVar.c, null, j4Var.l1, null, null, null, yeVar.n, yeVar.r, null, yeVar.x, null, b20Var, z10, i3, false, yeVar.a, null, 0L, j10, 0L, null);
        } else if (yeVar.I != null) {
            accountInstance = j4Var.getAccountInstance();
            yy.Z(accountInstance, yeVar.I, yeVar.c, null, j4Var.l1, null, null, null, yeVar.n, yeVar.r, null, yeVar.x, null, b20Var, z10, i3, false, yeVar.a, null, 0L, j10, 0L, null);
        }
        j4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.x30
    public final /* synthetic */ boolean z() {
        return false;
    }
}
