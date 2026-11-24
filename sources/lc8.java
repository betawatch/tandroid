// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lc8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc8 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ lc8(mc8 mc8Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = mc8Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        mc8 mc8Var = this.b;
        switch (b) {
            case 0:
                bka bkaVar = mc8Var.d;
                if (bkaVar.I) {
                    mc8Var.I = runnable;
                    bkaVar.a(true);
                    break;
                }
                break;
            default:
                bka bkaVar2 = mc8Var.d;
                if (bkaVar2.I) {
                    mc8Var.I = runnable;
                    bkaVar2.a(true);
                    break;
                }
                break;
        }
    }
}
