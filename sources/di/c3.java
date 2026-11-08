package di;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.gf;
import org.telegram.messenger.gz;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b40;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c3 implements b40 {
    public final /* synthetic */ i4 a;

    public c3(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.b40
    public final long a() {
        return this.a.k1;
    }

    @Override // org.telegram.ui.Components.b40
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.b40
    public final int getClassGuid() {
        return this.a.i2;
    }

    @Override // org.telegram.ui.Components.b40
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.b40
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.b40
    public final void u(gf gfVar, j20 j20Var, boolean z9, int i7, int i10, boolean z10, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        i4 i4Var = this.a;
        TL_stories.StoryItem storyItem = i4Var.x1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = i4Var.k1;
        if (gfVar.b) {
            if (j20Var != null) {
                accountInstance4 = i4Var.getAccountInstance();
                String str = gfVar.I;
                gz.b0(gfVar.x, i7, i10, i4Var.k1, 0L, j3, 0L, gfVar.a, str, null, gfVar.n, accountInstance4, null, null, null, null, null, j20Var, null, storyItem, null, z9, false, gfVar.M);
            } else {
                accountInstance3 = i4Var.getAccountInstance();
                String str2 = gfVar.I;
                gz.b0(gfVar.x, i7, i10, i4Var.k1, 0L, j3, 0L, gfVar.a, str2, null, gfVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z9, false, gfVar.M);
            }
        } else if (gfVar.h != null) {
            accountInstance2 = i4Var.getAccountInstance();
            gz.Z(accountInstance2, gfVar.h, gfVar.c, null, i4Var.k1, null, null, null, gfVar.n, gfVar.r, null, gfVar.x, null, j20Var, z9, i7, false, gfVar.a, null, 0L, j3, 0L, null);
        } else if (gfVar.I != null) {
            accountInstance = i4Var.getAccountInstance();
            gz.Z(accountInstance, gfVar.I, gfVar.c, null, i4Var.k1, null, null, null, gfVar.n, gfVar.r, null, gfVar.x, null, j20Var, z9, i7, false, gfVar.a, null, 0L, j3, 0L, null);
        }
        i4Var.i0(j3 <= 0);
    }

    @Override // org.telegram.ui.Components.b40
    public final /* synthetic */ boolean z() {
        return false;
    }
}
