package m4;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ s0(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((l1) obj).f0(this.b);
                break;
            case 1:
                ((l1) obj).N(this.b);
                break;
            case 2:
                ((l1) obj).j(this.b);
                break;
            case 3:
                ((l1) obj).D0(this.b);
                break;
            default:
                zh.k kVar = (zh.k) ((View) obj);
                kVar.invalidate();
                kVar.y.setTextColor(this.b);
                break;
        }
    }
}
