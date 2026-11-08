package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class wc extends LinearLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final org.telegram.ui.Components.l9 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public wc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i7;
        this.b = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(l9Var, c8.ha.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, f6Var);
        k5Var.setTextSize(16);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        qs.i(k5Var);
        linearLayout.addView(k5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = f10;
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(f10, i11, f6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, c8.ha.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.k5.n(textView2, i10, f6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, textView2, c8.ha.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = f11;
        org.telegram.ui.ActionBar.r6.V(f11, i11, f6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, c8.ha.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.r ? 68.0f : 58.0f), TLObject.FLAG_30));
    }
}
