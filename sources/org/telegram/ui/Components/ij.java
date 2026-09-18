package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.gj1;
import org.telegram.ui.hj1;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Cells.eb {
    public final /* synthetic */ int w;
    public final /* synthetic */ vl0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij(vl0 vl0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = vl0Var;
    }

    @Override // org.telegram.ui.Cells.eb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((jj) ((za) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((gj1) this.x).d, this, obj, i10);
                break;
            default:
                ((hj1) this.x).E.presentFragment(new vd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.eb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((gj1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(za zaVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = zaVar;
    }
}
