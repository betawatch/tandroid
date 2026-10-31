package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m10 extends LinearLayout {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public m10(Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.tk0 tk0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.t5(this);
        this.b = p6Var;
        this.c = tk0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, (org.telegram.ui.ActionBar.p6) this.b));
                org.telegram.ui.Components.tk0 tk0Var = (org.telegram.ui.Components.tk0) this.c;
                if (tk0Var != null) {
                    paint.setAlpha((int) (t5Var.e(false, tk0Var.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
                } else {
                    paint.setAlpha((int) (t5Var.e(false, 1.0f) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.f1(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public m10(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.b6.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        addView(textView, w7.b6.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.c = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        p80Var.setGravity(1);
        addView(p80Var, w7.b6.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.b6.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public m10(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, w7.b6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        ph.i iVar = new ph.i(2, context, p6Var, true);
        this.c = iVar;
        iVar.setMinWidth(org.telegram.messenger.i0.L(200.0f));
        iVar.i(org.telegram.messenger.cd.L0(2131746730, null), false, true);
        addView(iVar, w7.b6.r(-2, 44, 17));
        bi.j6 j6Var = new bi.j6(context, p6Var);
        this.d = j6Var;
        org.telegram.ui.ActionBar.a7.V(j6Var, i10, p6Var);
        j6Var.setText(org.telegram.messenger.cd.L0(2131746718, null));
        j6Var.setTextSize(1, 14.0f);
        j6Var.setTextAlignment(4);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.i0.o());
        addView(j6Var, w7.b6.t(org.telegram.messenger.zs.v2, -2, 17, 0, 17, 0, 12));
        vh.d dVar = new vh.d(context, p6Var, false);
        this.e = dVar;
        dVar.setMinWidth(org.telegram.messenger.i0.L(200.0f));
        addView(dVar, w7.b6.r(-2, 44, 17));
    }

    public m10(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        rh.o7 o7Var = new rh.o7(context, 70, 0, 0);
        frameLayout.addView(o7Var, w7.b6.c(-1.0f, -1));
        lg.q qVar = new lg.q(context, 1, 2);
        this.c = qVar;
        lg.h hVar = qVar.b;
        hVar.z = org.telegram.ui.ActionBar.t6.Tk;
        hVar.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar.b();
        qVar.setStarParticlesView(o7Var);
        frameLayout.addView(qVar, w7.b6.d(org.telegram.messenger.zs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        qVar.setPaused(false);
        rh.w7 w7Var = new rh.w7(i10, context, p6Var);
        this.d = w7Var;
        w7.e6.a(w7Var);
        w7Var.setOnClickListener(new rh.s(this, 9));
        frameLayout.addView(w7Var, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.b6.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        sc.e.t(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setGravity(17);
        addView(textView, w7.b6.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
        textView2.setGravity(17);
        addView(textView2, w7.b6.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
