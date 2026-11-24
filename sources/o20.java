// default package

import android.view.ContextThemeWrapper;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o20 extends ke1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ jm7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o20(jm7 jm7Var, ContextThemeWrapper contextThemeWrapper, byte b) {
        super(contextThemeWrapper);
        this.b = b;
        this.c = jm7Var;
    }

    @Override // ke1
    public final void c(boolean z) {
        byte b = this.b;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                i30 i30Var = (i30) jm7Var;
                i30Var.updateColors();
                ai2 ai2Var = i30Var.H1;
                if (ai2Var != null) {
                    ai2Var.a(fp.w());
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) jm7Var;
                a8 a8Var = photoViewer.G0;
                if (a8Var != null) {
                    a8Var.f(z);
                    photoViewer.G0.setSelectorColor(z ? 259241196 : 268435455);
                }
                ndc ndcVar = photoViewer.G2;
                if (ndcVar != null) {
                    ndcVar.s0(fp.w() || photoViewer.r);
                }
                ai2 ai2Var2 = photoViewer.x0;
                if (ai2Var2 != null) {
                    ai2Var2.a(fp.w());
                    break;
                }
                break;
        }
    }
}
