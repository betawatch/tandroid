// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jj8 extends LinearLayout {
    public int a;
    public final TextView b;
    public final l66 c;
    public LinearLayout d;
    public final rt7 e;
    public final ViewGroup f;
    public boolean h;
    public final /* synthetic */ kj8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, jj8] */
    /* JADX WARN: Type inference failed for: r15v10, types: [sk8] */
    /* JADX WARN: Type inference failed for: r15v9, types: [zi8] */
    /* JADX WARN: Type inference failed for: r3v5, types: [bec] */
    public jj8(kj8 kj8Var, Context context, int i) {
        super(context);
        lh0 lh0Var;
        this.n = kj8Var;
        byte b = 1;
        setOrientation(1);
        hk8 hk8Var = (hk8) kj8Var.n1.get(i);
        byte b2 = hk8Var.a;
        byte b3 = 0;
        if (b2 == 0) {
            lh0 kq3Var = new kq3(context, kj8Var.J0);
            kq3Var.b.setOnScrollListener(new ej8(kj8Var, b));
            lh0Var = kq3Var;
        } else if (b2 == 14 || b2 == 28) {
            lh0 aa4Var = new aa4(b2 == 28 ? 1 : 0, kj8Var.J0, context);
            aa4Var.b.setOnScrollListener(new ej8(kj8Var, b3));
            lh0Var = aa4Var;
        } else {
            lh0Var = b2 == 5 ? new fj8(context, kj8Var.a) : b2 == 10 ? new zi8(context, kj8Var.J0) : new bec(context, kj8Var.w1, kj8Var.a, hk8Var.a, kj8Var.J0);
        }
        this.f = lh0Var;
        addView(lh0Var);
        this.e = lh0Var;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i2 = cmb.i5;
        td4.x(textView, i2, kj8Var.J0, 1, 20.0f);
        addView(textView, qoe.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l66 l66Var = new l66(context, null);
        this.c = l66Var;
        l66Var.setGravity(1);
        l66Var.setTextSize(1, 15.0f);
        anb.X(l66Var, i2, kj8Var.J0);
        if (!kj8Var.y1) {
            l66Var.setLines(2);
        }
        addView(l66Var, qoe.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.f) {
            return super.drawChild(canvas, view, j);
        }
        if (view instanceof lh0) {
            setTranslationY(0.0f);
            return super.drawChild(canvas, view, j);
        }
        setTranslationY(this.n.F1);
        canvas.save();
        canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z = viewGroup instanceof lh0;
        kj8 kj8Var = this.n;
        if (z) {
            ((lh0) viewGroup).setTopOffset(kj8Var.F1);
        }
        viewGroup.getLayoutParams().height = kj8Var.t1;
        l66 l66Var = this.c;
        l66Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - gm.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = gm.L(16.0f);
            textView.setVisibility(8);
            l66Var.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
