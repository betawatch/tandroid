package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aj extends org.telegram.ui.Cells.wa {
    public final /* synthetic */ int w;
    public final /* synthetic */ il0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(il0 il0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = il0Var;
    }

    @Override // org.telegram.ui.Cells.wa
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((bj) ((wa) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((bi1) this.x).d, this, obj, i10);
                break;
            default:
                ((ci1) this.x).A.presentFragment(new qc1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.wa
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((bi1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(wa waVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = waVar;
    }
}
