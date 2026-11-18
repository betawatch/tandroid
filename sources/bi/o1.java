package bi;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                a2 a2Var = (a2) this.b;
                if (i12 - i10 != i16 - i14) {
                    org.telegram.messenger.g0.g3(new j1(a2Var, 2));
                    break;
                }
                break;
            case 1:
                ((hi.p3) this.b).d();
                break;
            case 2:
                ng.c cVar = (ng.c) this.b;
                cVar.c.setPivotX(r2.getMeasuredWidth() * 0.7f);
                cVar.b.setPivotX(r1.getMeasuredWidth() * 0.7f);
                break;
            default:
                ((zi.k) this.b).a0();
                break;
        }
    }
}
