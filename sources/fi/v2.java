package fi;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.az;
import org.telegram.messenger.f20;
import org.telegram.messenger.ff;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p40;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v2 implements p40 {
    public final /* synthetic */ z3 a;

    public v2(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.p40
    public final long a() {
        return this.a.l1;
    }

    @Override // org.telegram.ui.Components.p40
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.p40
    public final int getClassGuid() {
        return this.a.j2;
    }

    @Override // org.telegram.ui.Components.p40
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.p40
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.p40
    public final void u(ff ffVar, f20 f20Var, boolean z10, int i7, int i10, boolean z11, long j3) {
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
        if (ffVar.b) {
            if (f20Var != null) {
                accountInstance4 = z3Var.getAccountInstance();
                String str = ffVar.I;
                az.b0(ffVar.x, i7, i10, z3Var.l1, 0L, j3, 0L, ffVar.a, str, null, ffVar.n, accountInstance4, null, null, null, null, null, f20Var, null, storyItem, null, z10, false, ffVar.M);
            } else {
                accountInstance3 = z3Var.getAccountInstance();
                String str2 = ffVar.I;
                az.b0(ffVar.x, i7, i10, z3Var.l1, 0L, j3, 0L, ffVar.a, str2, null, ffVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, ffVar.M);
            }
        } else if (ffVar.h != null) {
            accountInstance2 = z3Var.getAccountInstance();
            az.Z(accountInstance2, ffVar.h, ffVar.c, null, z3Var.l1, null, null, null, ffVar.n, ffVar.r, null, ffVar.x, null, f20Var, z10, i7, false, ffVar.a, null, 0L, j3, 0L, null);
        } else if (ffVar.I != null) {
            accountInstance = z3Var.getAccountInstance();
            az.Z(accountInstance, ffVar.I, ffVar.c, null, z3Var.l1, null, null, null, ffVar.n, ffVar.r, null, ffVar.x, null, f20Var, z10, i7, false, ffVar.a, null, 0L, j3, 0L, null);
        }
        z3Var.i0(j3 <= 0);
    }

    @Override // org.telegram.ui.Components.p40
    public final /* synthetic */ boolean z() {
        return false;
    }
}
