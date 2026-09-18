package m4;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ o0(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((k1) obj).X(this.b);
                break;
            case 1:
                ((k1) obj).o0(this.b);
                break;
            case 2:
                ((k1) obj).x(this.b);
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
