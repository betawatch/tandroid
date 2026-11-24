// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c22 extends d22 {
    public byte b;
    public final /* synthetic */ i22 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(i22 i22Var, Context context) {
        super(context);
        this.c = i22Var;
        setWillNotDraw(false);
        setFocusable(true);
        int i = i22.G4;
        ylb ylbVar = i22Var.J0;
        qz4 qz4Var = new qz4(context);
        qz4Var.d = ylbVar;
        qz4Var.R = true;
        TextView textView = qz4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        qz4Var.b(false);
        qz4Var.b.setLayoutParams(qoe.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        qz4Var.x = cmb.v0(cmb.Sl, ylbVar);
        qz4Var.s = cmb.v0(cmb.Ql, ylbVar);
        qz4Var.w = cmb.v0(cmb.Rl, ylbVar);
        qz4Var.a();
        this.a = qz4Var;
        addView(qz4Var, qoe.c(-1.0f, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, String str, pz4 pz4Var) {
        this.a.setText(str);
        this.a.setTabAnimation(pz4Var);
        this.b = i;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f(((long) this.b) == this.c.T2, false);
    }
}
