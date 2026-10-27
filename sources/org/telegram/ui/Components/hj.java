package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.gi1;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.Cells.fb {
    public final /* synthetic */ int w;
    public final /* synthetic */ mm0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(mm0 mm0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = mm0Var;
    }

    @Override // org.telegram.ui.Cells.fb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((ij) ((za) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.s0(((fi1) this.x).d, this, obj, i10);
                break;
            default:
                ((gi1) this.x).E.presentFragment(new vc1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.fb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.t0(((fi1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(za zaVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = zaVar;
    }
}
