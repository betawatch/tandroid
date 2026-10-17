package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.mc1;
import org.telegram.ui.wh1;
import org.telegram.ui.xh1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.Cells.ab {
    public final /* synthetic */ int w;
    public final /* synthetic */ hm0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(hm0 hm0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = hm0Var;
    }

    @Override // org.telegram.ui.Cells.ab
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
                WallpapersListActivity.r0(((wh1) this.x).d, this, obj, i10);
                break;
            default:
                ((xh1) this.x).E.presentFragment(new mc1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ab
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((wh1) this.x).d, this, obj, i10);
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
