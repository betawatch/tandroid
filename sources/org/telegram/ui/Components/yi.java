package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cd1;
import org.telegram.ui.oi1;
import org.telegram.ui.pi1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.Cells.za {
    public final /* synthetic */ int w;
    public final /* synthetic */ rl0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi(rl0 rl0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = rl0Var;
    }

    @Override // org.telegram.ui.Cells.za
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((zi) ((ra) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((oi1) this.x).d, this, obj, i10);
                break;
            default:
                ((pi1) this.x).B.presentFragment(new cd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.za
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((oi1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(ra raVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = raVar;
    }
}
