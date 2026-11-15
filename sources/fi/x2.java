package fi;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.ez;
import org.telegram.messenger.ff;
import org.telegram.messenger.g20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x2 implements e40 {
    public final /* synthetic */ b4 a;

    public x2(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.e40
    public final long a() {
        return this.a.l1;
    }

    @Override // org.telegram.ui.Components.e40
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.e40
    public final int getClassGuid() {
        return this.a.j2;
    }

    @Override // org.telegram.ui.Components.e40
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.e40
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.e40
    public final void u(ff ffVar, g20 g20Var, boolean z10, int i7, int i10, boolean z11, long j3) {
        org.telegram.messenger.c accountInstance;
        org.telegram.messenger.c accountInstance2;
        org.telegram.messenger.c accountInstance3;
        org.telegram.messenger.c accountInstance4;
        b4 b4Var = this.a;
        TL_stories.StoryItem storyItem = b4Var.y1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = b4Var.l1;
        if (ffVar.b) {
            if (g20Var != null) {
                accountInstance4 = b4Var.getAccountInstance();
                String str = ffVar.I;
                ez.b0(ffVar.x, i7, i10, b4Var.l1, 0L, j3, 0L, ffVar.a, str, null, ffVar.n, accountInstance4, null, null, null, null, null, g20Var, null, storyItem, null, z10, false, ffVar.M);
            } else {
                accountInstance3 = b4Var.getAccountInstance();
                String str2 = ffVar.I;
                ez.b0(ffVar.x, i7, i10, b4Var.l1, 0L, j3, 0L, ffVar.a, str2, null, ffVar.n, accountInstance3, null, null, null, null, null, null, null, storyItem, null, z10, false, ffVar.M);
            }
        } else if (ffVar.h != null) {
            accountInstance2 = b4Var.getAccountInstance();
            ez.Z(accountInstance2, ffVar.h, ffVar.c, null, b4Var.l1, null, null, null, ffVar.n, ffVar.r, null, ffVar.x, null, g20Var, z10, i7, false, ffVar.a, null, 0L, j3, 0L, null);
        } else if (ffVar.I != null) {
            accountInstance = b4Var.getAccountInstance();
            ez.Z(accountInstance, ffVar.I, ffVar.c, null, b4Var.l1, null, null, null, ffVar.n, ffVar.r, null, ffVar.x, null, g20Var, z10, i7, false, ffVar.a, null, 0L, j3, 0L, null);
        }
        b4Var.i0(j3 <= 0);
    }

    @Override // org.telegram.ui.Components.e40
    public final /* synthetic */ boolean z() {
        return false;
    }
}
