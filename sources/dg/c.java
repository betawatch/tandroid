package dg;

import android.view.View;
import li.l;
import vh.r2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                dVar.c.setPivotX(r2.getMeasuredWidth() * 0.7f);
                dVar.b.setPivotX(r1.getMeasuredWidth() * 0.7f);
                break;
            case 1:
                ((l) this.b).d0();
                break;
            default:
                ((r2) this.b).d();
                break;
        }
    }
}
