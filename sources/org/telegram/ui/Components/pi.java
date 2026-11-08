package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.rc1;
import org.telegram.ui.sc1;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Cells.ua {
    public final /* synthetic */ int x;
    public final /* synthetic */ oj0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(oj0 oj0Var, Context context, int i7) {
        super(context, 5);
        this.x = i7;
        this.y = oj0Var;
    }

    @Override // org.telegram.ui.Cells.ua
    public final void a(int i7, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((qi) ((la) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((rc1) this.y).d, this, obj, i7);
                break;
            default:
                ((sc1) this.y).E.presentFragment(new v71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ua
    public boolean b(Object obj, int i7) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((rc1) this.y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(la laVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = laVar;
    }
}
