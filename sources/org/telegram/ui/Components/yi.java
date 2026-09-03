package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.jd1;
import org.telegram.ui.wi1;
import org.telegram.ui.xi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yi extends org.telegram.ui.Cells.ya {
    public final /* synthetic */ int w;
    public final /* synthetic */ ql0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi(ql0 ql0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = ql0Var;
    }

    @Override // org.telegram.ui.Cells.ya
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
                WallpapersListActivity.r0(((wi1) this.x).d, this, obj, i10);
                break;
            default:
                ((xi1) this.x).B.presentFragment(new jd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ya
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((wi1) this.x).d, this, obj, i10);
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
