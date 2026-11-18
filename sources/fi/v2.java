package fi;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.messenger.zy;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m40;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v2 implements m40 {
    public final /* synthetic */ z3 a;

    public v2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.m40
    public final long a() {
        return this.a.l1;
    }

    @Override // org.telegram.ui.Components.m40
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.m40
    public final int getClassGuid() {
        return this.a.j2;
    }

    @Override // org.telegram.ui.Components.m40
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.m40
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.m40
    public final void u(ef efVar, e20 e20Var, boolean z10, int i7, int i10, boolean z11, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        z3 z3Var = this.a;
        TL_stories.StoryItem storyItem = z3Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = z3Var.l1;
        if (efVar.b) {
            if (e20Var != null) {
                accountInstance4 = z3Var.getAccountInstance();
                String str = efVar.I;
                zy.b0(efVar.x, i7, i10, z3Var.l1, 0L, j3, 0L, efVar.a, str, null, efVar.n, accountInstance4, null, null, null, null, null, e20Var, null, storyItem, null, z10, false, efVar.M);
            } else {
                accountInstance3 = z3Var.getAccountInstance();
                String str2 = efVar.I;
                zy.b0(efVar.x, i7, i10, z3Var.l1, 0L, j3, 0L, efVar.a, str2, null, efVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, efVar.M);
            }
        } else if (efVar.h != null) {
            accountInstance2 = z3Var.getAccountInstance();
            zy.Z(accountInstance2, efVar.h, efVar.c, null, z3Var.l1, null, null, null, efVar.n, efVar.r, null, efVar.x, null, e20Var, z10, i7, false, efVar.a, null, 0L, j3, 0L, null);
        } else if (efVar.I != null) {
            accountInstance = z3Var.getAccountInstance();
            zy.Z(accountInstance, efVar.I, efVar.c, null, z3Var.l1, null, null, null, efVar.n, efVar.r, null, efVar.x, null, e20Var, z10, i7, false, efVar.a, null, 0L, j3, 0L, null);
        }
        z3Var.i0(j3 <= 0);
    }

    @Override // org.telegram.ui.Components.m40
    public final /* synthetic */ boolean z() {
        return false;
    }
}
