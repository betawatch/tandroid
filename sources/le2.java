// default package

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class le2 implements sh8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ le2(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // sh8
    public final void a(float f, float f2) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                me2 me2Var = (me2) viewGroup;
                FrameLayout frameLayout = me2Var.c;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - f2);
                }
                me2Var.f = f2;
                me2Var.b();
                break;
            default:
                ((bka) viewGroup).invalidate();
                break;
        }
    }
}
