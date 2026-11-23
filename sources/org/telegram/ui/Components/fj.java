package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.rc1;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.Cells.wa {
    public final /* synthetic */ int x;
    public final /* synthetic */ dk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj(dk0 dk0Var, Context context, int i7) {
        super(context, 5);
        this.x = i7;
        this.y = dk0Var;
    }

    @Override // org.telegram.ui.Cells.wa
    public final void a(int i7, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((gj) ((pa) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((rc1) this.y).d, this, obj, i7);
                break;
            default:
                ((sc1) this.y).F.presentFragment(new org.telegram.ui.v71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.wa
    public boolean b(Object obj, int i7) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((rc1) this.y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(pa paVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = paVar;
    }
}
