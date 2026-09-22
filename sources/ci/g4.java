package ci;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                kg.c cVar = (kg.c) this.b;
                cVar.c.setPivotX(r2.getMeasuredWidth() * 0.7f);
                cVar.b.setPivotX(r1.getMeasuredWidth() * 0.7f);
                break;
        }
    }
}
