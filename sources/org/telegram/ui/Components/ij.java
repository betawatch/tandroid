package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hj1;
import org.telegram.ui.ij1;
import org.telegram.ui.xd1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Cells.fb {
    public final /* synthetic */ int w;
    public final /* synthetic */ xl0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij(xl0 xl0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = xl0Var;
    }

    @Override // org.telegram.ui.Cells.fb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((jj) ((ya) this.x).f).x;
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
    public ij(ya yaVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = yaVar;
    }
}
