package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.xd1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mj extends org.telegram.ui.Cells.cb {
    public final /* synthetic */ int w;
    public final /* synthetic */ pm0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj(pm0 pm0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = pm0Var;
    }

    @Override // org.telegram.ui.Cells.cb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((nj) ((cb) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((kj1) this.x).d, this, obj, i10);
                break;
            default:
                ((lj1) this.x).E.presentFragment(new xd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.cb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((kj1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(cb cbVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = cbVar;
    }
}
