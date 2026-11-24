// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hh1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lh1 b;

    public /* synthetic */ hh1(lh1 lh1Var, byte b) {
        this.a = b;
        this.b = lh1Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        lh1 lh1Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                if (view instanceof anb) {
                    view.setBackgroundColor(bkb.v0(bkb.h5, lh1Var.b));
                    break;
                }
                break;
            default:
                if (view instanceof anb) {
                    anb anbVar = (anb) view;
                    anbVar.setFallbackWallpaper(anbVar.H.a.b ? null : lh1Var.w);
                    break;
                }
                break;
        }
    }
}
