package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.vc1;
import org.telegram.ui.wc1;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oi extends org.telegram.ui.Cells.ua {
    public final /* synthetic */ int x;
    public final /* synthetic */ oj0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(oj0 oj0Var, Context context, int i7) {
        super(context, 5);
        this.x = i7;
        this.y = oj0Var;
    }

    @Override // org.telegram.ui.Cells.ua
    public final void a(int i7, Object obj) {
        switch (this.x) {
            case 0:
                q0.a aVar = ((pi) ((ka) this.y).f).y;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.w0(((vc1) this.y).d, this, obj, i7);
                break;
            default:
                ((wc1) this.y).E.presentFragment(new x71(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ua
    public boolean b(Object obj, int i7) {
        switch (this.x) {
            case 1:
                return WallpapersListActivity.x0(((vc1) this.y).d, this, obj, i7);
            default:
                return super.b(obj, i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(ka kaVar, Context context) {
        super(context, 1);
        this.x = 0;
        this.y = kaVar;
    }
}
