package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class eb extends LinearLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final org.telegram.ui.Components.i9 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public eb(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = i7;
        this.b = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(i9Var, c8.ja.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.X(j5Var, i10, e6Var);
        j5Var.setTextSize(16);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        ns.i(j5Var);
        linearLayout.addView(j5Var, c8.ja.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = i20.f(linearLayout, textView, c8.ja.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = f10;
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.q6.U(f10, i11, e6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, c8.ja.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.k5.m(textView2, i10, e6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = i20.f(linearLayout2, textView2, c8.ja.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = f11;
        org.telegram.ui.ActionBar.q6.U(f11, i11, e6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, c8.ja.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.r ? 68.0f : 58.0f), TLObject.FLAG_30));
    }
}
