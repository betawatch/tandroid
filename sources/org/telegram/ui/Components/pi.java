package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.k91;
import org.telegram.ui.me1;
import org.telegram.ui.ne1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.Cells.ua {
    public final /* synthetic */ int x;
    public final /* synthetic */ tk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi(tk0 tk0Var, Context context, int i10) {
        super(context, 5);
        this.x = i10;
        this.y = tk0Var;
    }

    @Override // org.telegram.ui.Cells.ua
    public final void a(int i10, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((qi) ((fa) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((me1) this.y).d, this, obj, i10);
                break;
            default:
                ((ne1) this.y).E.presentFragment(new k91(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ua
    public boolean b(Object obj, int i10) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((me1) this.y).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(fa faVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = faVar;
    }
}
