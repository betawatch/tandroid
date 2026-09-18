package m4;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ n0(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((j1) obj).X(this.b);
                break;
            case 1:
                ((j1) obj).o0(this.b);
                break;
            case 2:
                ((j1) obj).x(this.b);
                break;
            default:
                View view = (View) obj;
                if (view instanceof xg.l) {
                    ((xg.l) view).g(this.b, true);
                    break;
                }
                break;
        }
    }
}
