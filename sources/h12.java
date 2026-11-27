// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class h12 extends i12 {
    public byte b;
    public final /* synthetic */ n12 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h12(n12 n12Var, Context context) {
        super(context);
        this.c = n12Var;
        setWillNotDraw(false);
        setFocusable(true);
        int i = n12.G4;
        vnb vnbVar = n12Var.J0;
        uz4 uz4Var = new uz4(context);
        uz4Var.d = vnbVar;
        uz4Var.R = true;
        TextView textView = uz4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        uz4Var.b(false);
        uz4Var.b.setLayoutParams(tre.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        uz4Var.x = aob.v0(aob.Tl, vnbVar);
        uz4Var.s = aob.v0(aob.Rl, vnbVar);
        uz4Var.w = aob.v0(aob.Sl, vnbVar);
        uz4Var.a();
        this.a = uz4Var;
        addView(uz4Var, tre.c(-1.0f, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, String str, tz4 tz4Var) {
        this.a.setText(str);
        this.a.setTabAnimation(tz4Var);
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
