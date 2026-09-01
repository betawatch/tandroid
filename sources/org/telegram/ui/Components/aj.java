package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ed1;
import org.telegram.ui.ri1;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class aj extends org.telegram.ui.Cells.za {
    public final /* synthetic */ int w;
    public final /* synthetic */ sl0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(sl0 sl0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = sl0Var;
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
                WallpapersListActivity.r0(((ri1) this.x).d, this, obj, i10);
                break;
            default:
                ((si1) this.x).B.presentFragment(new ed1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.za
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((ri1) this.x).d, this, obj, i10);
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
