package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj1;
import org.telegram.ui.bj1;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Cells.gb {
    public final /* synthetic */ int w;
    public final /* synthetic */ ll0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(ll0 ll0Var, Context context, int i10) {
        super(context, 5);
        this.w = i10;
        this.x = ll0Var;
    }

    @Override // org.telegram.ui.Cells.gb
    public final void a(int i10, Object obj) {
        switch (this.w) {
            case 0:
                q0.a aVar = ((kj) ((za) this.x).f).x;
                if (aVar != null) {
                    aVar.accept(obj);
                    break;
                }
                break;
            case 1:
                WallpapersListActivity.r0(((aj1) this.x).d, this, obj, i10);
                break;
            default:
                ((bj1) this.x).E.presentFragment(new od1(obj, null, true));
                break;
        }
    }

    @Override // org.telegram.ui.Cells.gb
    public boolean b(Object obj, int i10) {
        switch (this.w) {
            case 1:
                return WallpapersListActivity.s0(((aj1) this.x).d, this, obj, i10);
            default:
                return super.b(obj, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(za zaVar, Context context) {
        super(context, 1);
        this.w = 0;
        this.x = zaVar;
    }
}
