// default package

import android.view.ContextThemeWrapper;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o10 extends cd1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ gk7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o10(gk7 gk7Var, ContextThemeWrapper contextThemeWrapper, byte b) {
        super(contextThemeWrapper);
        this.b = b;
        this.c = gk7Var;
    }

    @Override // cd1
    public final void c(boolean z) {
        byte b = this.b;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                i20 i20Var = (i20) gk7Var;
                i20Var.updateColors();
                mg2 mg2Var = i20Var.H1;
                if (mg2Var != null) {
                    mg2Var.a(fo.w());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) gk7Var;
                a8 a8Var = photoViewer.G0;
                if (a8Var != null) {
                    a8Var.f(z);
                    photoViewer.G0.setSelectorColor(z ? 259241196 : 268435455);
                }
                lbc lbcVar = photoViewer.G2;
                if (lbcVar != null) {
                    lbcVar.s0(fo.w() || photoViewer.r);
                }
                mg2 mg2Var2 = photoViewer.x0;
                if (mg2Var2 != null) {
                    mg2Var2.a(fo.w());
                    break;
                }
                break;
        }
    }
}
