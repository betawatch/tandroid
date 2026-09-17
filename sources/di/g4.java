package di;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                ((j4) this.b).d();
                break;
            default:
                lg.c cVar = (lg.c) this.b;
                cVar.c.setPivotX(r2.getMeasuredWidth() * 0.7f);
                cVar.b.setPivotX(r1.getMeasuredWidth() * 0.7f);
                break;
        }
    }
}
