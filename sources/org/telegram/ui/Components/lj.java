package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ae1;
import org.telegram.ui.mj1;
import org.telegram.ui.nj1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.Cells.gb {
    public final /* synthetic */ int w;
    public final /* synthetic */ ul0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj(ul0 ul0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = ul0Var;
    }

    @Override // org.telegram.ui.Cells.gb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((mj) ((ya) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((mj1) this.x).d, this, obj, i10);
                break;
            default:
                ((nj1) this.x).E.presentFragment(new ae1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.gb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((mj1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(ya yaVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = yaVar;
    }
}
