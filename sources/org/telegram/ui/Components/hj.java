package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.Cells.bb {
    public final /* synthetic */ int w;
    public final /* synthetic */ lm0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(lm0 lm0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = lm0Var;
    }

    @Override // org.telegram.ui.Cells.bb
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
                WallpapersListActivity.r0(((bi1) this.x).d, this, obj, i10);
                break;
            default:
                ((ci1) this.x).E.presentFragment(new qc1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.bb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((bi1) this.x).d, this, obj, i10);
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
