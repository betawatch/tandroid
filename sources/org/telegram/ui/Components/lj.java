package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.pd1;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.Cells.eb {
    public final /* synthetic */ int w;
    public final /* synthetic */ yl0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj(yl0 yl0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = yl0Var;
    }

    @Override // org.telegram.ui.Cells.eb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((mj) ((ab) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((yi1) this.x).d, this, obj, i10);
                break;
            default:
                ((zi1) this.x).E.presentFragment(new pd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.eb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((yi1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(ab abVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = abVar;
    }
}
