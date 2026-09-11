package m4;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                if (view instanceof yg.l) {
                    ((yg.l) view).g(this.b, true);
                    break;
                }
                break;
        }
    }
}
