package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s4 extends FrameLayout {
    public final LinearLayout a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final RectF e;
    public float f;
    public float h;
    public final RectF n;
    public float r;
    public int s;
    public final ck0 w;
    public ValueAnimator x;
    public final /* synthetic */ c5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(c5 c5Var, Context context) {
        super(context);
        this.y = c5Var;
        final int i7 = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        b bVar = c5Var.s;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(hd.M0(2131754286, null));
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i12, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(hd.M0(2131751780, null));
        org.telegram.ui.ActionBar.q6.U(textView2, i12, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, ja.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, ja.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.j6.w0(i10, bVar));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        ck0 ck0Var = new ck0(getContext());
        this.w = ck0Var;
        ck0Var.r = true;
        ck0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(ck0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, ja.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, ja.o(16, 26));
        addView(linearLayout, ja.c(-2.0f, -2));
        addView(linearLayout2, ja.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c5 c5Var2 = this.b.y;
                        o4 o4Var = c5Var2.P;
                        if (o4Var.b) {
                            o4Var.b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.b.y;
                        o4 o4Var2 = c5Var3.P;
                        if (!o4Var2.b) {
                            o4Var2.b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.b;
                        c5 c5Var4 = s4Var.y;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.s);
                        c5Var4.f = r4Var;
                        LinearLayout linearLayout3 = s4Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f);
                        r4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) r4Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        c5 c5Var2 = this.b.y;
                        o4 o4Var = c5Var2.P;
                        if (o4Var.b) {
                            o4Var.b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.b.y;
                        o4 o4Var2 = c5Var3.P;
                        if (!o4Var2.b) {
                            o4Var2.b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.b;
                        c5 c5Var4 = s4Var.y;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.s);
                        c5Var4.f = r4Var;
                        LinearLayout linearLayout3 = s4Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f);
                        r4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) r4Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        final int i13 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c5 c5Var2 = this.b.y;
                        o4 o4Var = c5Var2.P;
                        if (o4Var.b) {
                            o4Var.b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.b.y;
                        o4 o4Var2 = c5Var3.P;
                        if (!o4Var2.b) {
                            o4Var2.b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.b;
                        c5 c5Var4 = s4Var.y;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.s);
                        c5Var4.f = r4Var;
                        LinearLayout linearLayout3 = s4Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f);
                        r4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) r4Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.y.U) {
            int i7 = this.s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.c;
            if (i7 == 0) {
                textView2.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.g0.Q);
                f10 = 1.0f;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            RectF rectF = this.n;
            rectF.set(rect);
            float f12 = this.r;
            if (f12 != 1.0f) {
                f11 = org.telegram.messenger.g0.T1(this.f, f11, f12);
                f10 = org.telegram.messenger.g0.T1(this.h, f10, this.r);
                org.telegram.messenger.g0.Z1(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
