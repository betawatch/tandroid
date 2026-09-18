package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hj1;
import org.telegram.ui.ij1;
import org.telegram.ui.xd1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Cells.fb {
    public final /* synthetic */ int w;
    public final /* synthetic */ ll0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij(ll0 ll0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = ll0Var;
    }

    @Override // org.telegram.ui.Cells.fb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((jj) ((xa) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((hj1) this.x).d, this, obj, i10);
                break;
            default:
                ((ij1) this.x).E.presentFragment(new xd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.fb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((hj1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(xa xaVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = xaVar;
    }
}
