package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p20 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public p20(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.vl0 vl0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.d6(this);
        this.b = f6Var;
        this.c = vl0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, (org.telegram.ui.ActionBar.f6) this.b));
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) this.c;
                if (vl0Var != null) {
                    paint.setAlpha((int) (d6Var.d(vl0Var.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (d6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public p20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.a6.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.a6.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, null);
        this.c = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m90Var.setGravity(1);
        addView(m90Var, w7.a6.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.a6.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public p20(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        xh.b7 b7Var = new xh.b7(context, 70, 0);
        frameLayout.addView(b7Var, w7.a6.c(-1.0f, -1));
        rg.f fVar = new rg.f(context, 1, 2);
        this.c = fVar;
        rg.a aVar = fVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        fVar.setStarParticlesView(b7Var);
        frameLayout.addView(fVar, w7.a6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        fVar.setPaused(false);
        xh.n7 n7Var = new xh.n7(context, i10, f6Var);
        this.d = n7Var;
        w7.c6.a(n7Var);
        n7Var.setOnClickListener(new org.telegram.ui.web.c(this, 22));
        frameLayout.addView(n7Var, w7.a6.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.a6.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        com.google.android.gms.internal.vision.e2.k(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setGravity(17);
        addView(textView, w7.a6.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setGravity(17);
        addView(textView2, w7.a6.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
