package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.jd1;
import org.telegram.ui.xi1;
import org.telegram.ui.yi1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class aj extends org.telegram.ui.Cells.za {
    public final /* synthetic */ int w;
    public final /* synthetic */ rl0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(rl0 rl0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = rl0Var;
    }

    @Override // org.telegram.ui.Cells.za
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((bj) ((ra) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((xi1) this.x).d, this, obj, i10);
                break;
            default:
                ((yi1) this.x).B.presentFragment(new jd1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.za
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((xi1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ra raVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = raVar;
    }
}
