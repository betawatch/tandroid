// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class eh6 extends FrameLayout {
    public static final /* synthetic */ int G = 0;
    public final PointF E;
    public int F;
    public final v34 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final w2c f;
    public final zp4 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView w;
    public final FrameLayout x;
    public boolean y;

    public eh6(Context context, ViewGroup viewGroup, View view, String str, final v34 v34Var) {
        super(context);
        PointF pointF = new PointF();
        this.E = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = v34Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new bh6(this));
        addView(view2, tre.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(TLObject.FLAG_30);
        view3.setAlpha(0.0f);
        addView(view3, tre.c(-1.0f, -1));
        w2c w2cVar = new w2c(getContext());
        this.f = w2cVar;
        w2cVar.setTransformType(1);
        final byte b = 0;
        w2cVar.setDrawBackground(false);
        zp4 zp4Var = new zp4(null, context, false);
        this.h = zp4Var;
        zp4Var.addView(w2cVar, tre.e(56, 56, 17));
        zp4Var.a(w2cVar);
        zp4Var.setOnClickListener(new View.OnClickListener() { // from class: ch6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b2 = b;
                v34 v34Var2 = v34Var;
                eh6 eh6Var = this;
                switch (b2) {
                    case 0:
                        v34Var2.N(eh6Var);
                        break;
                    default:
                        v34Var2.N(eh6Var);
                        break;
                }
            }
        });
        zp4Var.setContentDescription(ob6.M0(2131751319, null));
        addView(zp4Var, tre.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, tre.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(ob6.M0(2131751781, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        TextView l = ik8.l(frameLayout, textView, tre.d(-1, -2.0f, ob6.a0 ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = l;
        l.setText(str);
        l.setTextSize(1, 18.0f);
        l.setTypeface(hl.o());
        l.setSingleLine();
        frameLayout.addView(l, tre.d(-1, -2.0f, ob6.a0 ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = hl.L(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(ob6.M0(2131751300, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = hl.L(6.0f);
        int i = aob.Ni;
        textView2.setBackground(aob.H0(L2, aob.w0(null, i, false)));
        textView2.setOnClickListener(new bh6(this, v34Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i2 = L / 2;
        textView2.setPadding(L, i2, L, i2);
        TextView l2 = ik8.l(frameLayout, textView2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 80, 8.0f, 8.0f, 8.0f, 8.0f), context);
        this.w = l2;
        l2.setText(ob6.M0(2131752117, null));
        l2.setSingleLine();
        final byte b2 = 1;
        l2.setTextSize(1, 16.0f);
        l2.setBackground(aob.H0(hl.L(6.0f), aob.w0(null, i, false)));
        l2.setOnClickListener(new View.OnClickListener() { // from class: ch6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b22 = b2;
                v34 v34Var2 = v34Var;
                eh6 eh6Var = this;
                switch (b22) {
                    case 0:
                        v34Var2.N(eh6Var);
                        break;
                    default:
                        v34Var2.N(eh6Var);
                        break;
                }
            }
        });
        l2.setTypeface(typeface);
        l2.setPadding(L, i2, L, i2);
        frameLayout.addView(l2, tre.d(-2, -2.0f, (ob6.a0 ? 3 : 5) | 80, 8.0f, 8.0f, 8.0f, 8.0f));
        yic.b(view, viewGroup, pointF);
        zp4Var.setTranslationX(pointF.x);
        zp4Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((ph6) this.a.b).h0.c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new dh6(this, (byte) 1));
        duration.addUpdateListener(new ah6(this, (byte) 0));
        duration.setInterpolator(k43.f);
        duration.start();
    }

    public final void b() {
        int w0 = aob.w0(null, aob.O9, false);
        w2c w2cVar = this.f;
        w2cVar.setColor(w0);
        w2cVar.setBackgroundColor(aob.w0(null, aob.P9, false));
        int w02 = aob.w0(null, aob.h5, false);
        FrameLayout frameLayout = this.x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(aob.b0(hl.L(12.0f), w02));
        } else if (w02 != this.F) {
            aob.A1(w02, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = w02;
        this.n.setTextColor(aob.w0(null, aob.q5, false));
        this.r.setTextColor(aob.w0(null, aob.j5, false));
        int i = aob.Ni;
        this.s.setTextColor(aob.w0(null, i, false));
        this.w.setTextColor(aob.w0(null, i, false));
        this.h.updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - hl.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
