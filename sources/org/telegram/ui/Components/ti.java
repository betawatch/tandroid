package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.nc1;
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ti extends org.telegram.ui.Cells.wa {
    public final /* synthetic */ int w;
    public final /* synthetic */ yk0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti(yk0 yk0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = yk0Var;
    }

    @Override // org.telegram.ui.Cells.wa
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((ui) ((pa) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((yh1) this.x).d, this, obj, i10);
                break;
            default:
                ((ai1) this.x).A.presentFragment(new nc1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.wa
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((yh1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(pa paVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = paVar;
    }
}
