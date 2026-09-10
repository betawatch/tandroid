package m4;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ((l1) obj).X(this.b);
                break;
            case 1:
                ((l1) obj).o0(this.b);
                break;
            case 2:
                ((l1) obj).x(this.b);
                break;
            default:
                View view = (View) obj;
                if (view instanceof wg.k) {
                    ((wg.k) view).g(this.b, true);
                    break;
                }
                break;
        }
    }
}
