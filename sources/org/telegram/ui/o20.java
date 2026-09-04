package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class o20 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public o20(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ll0 ll0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.e6(this);
        this.b = f6Var;
        this.c = ll0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, (org.telegram.ui.ActionBar.f6) this.b));
                org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) this.c;
                if (ll0Var != null) {
                    paint.setAlpha((int) (e6Var.d(ll0Var.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (e6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public o20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.x5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.c = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        d90Var.setGravity(1);
        addView(d90Var, w7.x5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.x5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public o20(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        zh.x6 x6Var = new zh.x6(context, 70, 0);
        frameLayout.addView(x6Var, w7.x5.c(-1.0f, -1));
        tg.e eVar = new tg.e(context, 1, 2);
        this.c = eVar;
        tg.a aVar = eVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        eVar.setStarParticlesView(x6Var);
        frameLayout.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        zh.j7 j7Var = new zh.j7(context, i10, f6Var);
        this.d = j7Var;
        w7.z5.a(j7Var);
        j7Var.setOnClickListener(new ji.m4(this, 28));
        frameLayout.addView(j7Var, w7.x5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.b = textView;
        com.google.android.gms.internal.vision.e2.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setGravity(17);
        addView(textView2, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
