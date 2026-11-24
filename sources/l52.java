// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l52 extends rc6 {
    public final /* synthetic */ byte E = 0;
    public final /* synthetic */ jm7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(pc6 pc6Var, Context context, ylb ylbVar, boolean z) {
        super(ylbVar, context, false, z);
        this.F = pc6Var;
    }

    @Override // y59
    public final void f() {
        byte b = this.E;
        jm7 jm7Var = this.F;
        switch (b) {
            case 0:
                n52 n52Var = (n52) jm7Var;
                l52 l52Var = n52Var.O;
                r7 r7Var = n52Var.x;
                if (r7Var != null) {
                    r7Var.setShowSearchProgress(l52Var.w);
                }
                TextView textView = n52Var.w;
                if (textView != null) {
                    textView.setText(jb6.a0(null, null, 2131747899, l52Var.h));
                }
                super.f();
                break;
            default:
                pc6 pc6Var = (pc6) jm7Var;
                zja zjaVar = pc6Var.r;
                if (zjaVar != null) {
                    zjaVar.setShowSearchProgress(pc6Var.T.w);
                }
                TextView textView2 = pc6Var.n;
                if (textView2 != null) {
                    textView2.setText(jb6.a0(null, null, 2131747899, pc6Var.T.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(n52 n52Var, Context context, ylb ylbVar, boolean z) {
        super(ylbVar, context, z, false);
        this.F = n52Var;
    }
}
