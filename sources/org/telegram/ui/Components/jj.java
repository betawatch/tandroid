package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.qj1;
import org.telegram.ui.rj1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Cells.cb {
    public final /* synthetic */ int w;
    public final /* synthetic */ lm0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(lm0 lm0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = lm0Var;
    }

    @Override // org.telegram.ui.Cells.cb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((kj) ((bb) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((qj1) this.x).d, this, obj, i10);
                break;
            default:
                ((rj1) this.x).E.presentFragment(new ce1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.cb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((qj1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(bb bbVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = bbVar;
    }
}
