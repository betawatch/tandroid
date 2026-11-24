// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gi7 extends j1a {
    public final /* synthetic */ byte L;
    public boolean M;
    public final /* synthetic */ mz0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi7(mz0 mz0Var, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.L = b;
        this.N = mz0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.L;
        mz0 mz0Var = this.N;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ji7 ji7Var = (ji7) mz0Var;
                ji7Var.g2 = gm.L(64.0f) + getMeasuredHeight();
                ji7Var.f2.G();
                boolean z2 = this.M;
                boolean z3 = ji7Var.d;
                if (z2 != z3) {
                    this.M = z3;
                    if (z3) {
                        r59 r59Var = ji7Var.n1;
                        w46 w46Var = new w46(ji7Var.getContext(), 2, 0.6f);
                        w46Var.a = 1;
                        w46Var.p = gm.L(36.0f);
                        r59Var.getLayoutManager().v0(w46Var);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                t9c t9cVar = (t9c) mz0Var;
                t9cVar.k2 = gm.L(64.0f) + getMeasuredHeight();
                t9cVar.j2.G();
                boolean z4 = this.M;
                boolean z5 = t9cVar.d;
                if (z4 != z5) {
                    this.M = z5;
                    if (z5) {
                        r59 r59Var2 = t9cVar.n1;
                        w46 w46Var2 = new w46(t9cVar.getContext(), 2, 0.6f);
                        w46Var2.a = 1;
                        w46Var2.p = gm.L(36.0f);
                        r59Var2.getLayoutManager().v0(w46Var2);
                        break;
                    }
                }
                break;
        }
    }
}
