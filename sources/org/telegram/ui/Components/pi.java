package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.qc1;
import org.telegram.ui.rc1;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                WallpapersListActivity.w0(((qc1) this.y).d, this, obj, i7);
                break;
            default:
                ((rc1) this.y).E.presentFragment(new u71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ua
    public boolean b(Object obj, int i7) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((qc1) this.y).d, this, obj, i7);
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
