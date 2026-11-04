package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.l71;
import org.telegram.ui.mc1;
import org.telegram.ui.nc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Cells.ta {
    public final /* synthetic */ int x;
    public final /* synthetic */ sj0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(sj0 sj0Var, Context context, int i3) {
        super(context, 5);
        this.x = i3;
        this.y = sj0Var;
    }

    @Override // org.telegram.ui.Cells.ta
    public final void a(int i3, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((qi) ((ka) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((mc1) this.y).d, this, obj, i3);
                break;
            default:
                ((nc1) this.y).F.presentFragment(new l71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ta
    public boolean b(Object obj, int i3) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((mc1) this.y).d, this, obj, i3);
            default:
                return super.b(obj, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(ka kaVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = kaVar;
    }
}
