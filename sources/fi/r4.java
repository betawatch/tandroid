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
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.mk0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class r4 extends FrameLayout {
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
    public final mk0 w;
    public ValueAnimator x;
    public final /* synthetic */ b5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(b5 b5Var, Context context) {
        super(context);
        this.y = b5Var;
        final int i7 = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        b bVar = b5Var.s;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(gd.N0(2131754283, null));
        int i12 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i12, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(gd.N0(2131751768, null));
        org.telegram.ui.ActionBar.t6.U(textView2, i12, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        linearLayout.addView(textView, ma.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, ma.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(26.0f), org.telegram.ui.ActionBar.m6.w0(i10, bVar));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, d02, M, null, bVar);
        linearLayout2.setOrientation(0);
        mk0 mk0Var = new mk0(getContext());
        this.w = mk0Var;
        mk0Var.r = true;
        mk0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(mk0Var);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        linearLayout2.addView(imageView, ma.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, ma.o(16, 26));
        addView(linearLayout, ma.c(-2.0f, -2));
        addView(linearLayout2, ma.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.o4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        b5 b5Var2 = this.b.y;
                        n4 n4Var = b5Var2.P;
                        if (n4Var.b) {
                            n4Var.b = false;
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            break;
                        }
                        break;
                    case 1:
                        b5 b5Var3 = this.b.y;
                        n4 n4Var2 = b5Var3.P;
                        if (!n4Var2.b) {
                            n4Var2.b = true;
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            break;
                        }
                        break;
                    default:
                        r4 r4Var = this.b;
                        b5 b5Var4 = r4Var.y;
                        q4 q4Var = new q4(r4Var, r4Var.getContext(), b5Var4.s);
                        b5Var4.f = q4Var;
                        LinearLayout linearLayout3 = r4Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f);
                        q4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) q4Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.o4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        b5 b5Var2 = this.b.y;
                        n4 n4Var = b5Var2.P;
                        if (n4Var.b) {
                            n4Var.b = false;
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            break;
                        }
                        break;
                    case 1:
                        b5 b5Var3 = this.b.y;
                        n4 n4Var2 = b5Var3.P;
                        if (!n4Var2.b) {
                            n4Var2.b = true;
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            break;
                        }
                        break;
                    default:
                        r4 r4Var = this.b;
                        b5 b5Var4 = r4Var.y;
                        q4 q4Var = new q4(r4Var, r4Var.getContext(), b5Var4.s);
                        b5Var4.f = q4Var;
                        LinearLayout linearLayout3 = r4Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f);
                        q4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) q4Var.b).showAsDropDown(linearLayout3, 0, L);
                        break;
                }
            }
        });
        final int i13 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.o4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        b5 b5Var2 = this.b.y;
                        n4 n4Var = b5Var2.P;
                        if (n4Var.b) {
                            n4Var.b = false;
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            break;
                        }
                        break;
                    case 1:
                        b5 b5Var3 = this.b.y;
                        n4 n4Var2 = b5Var3.P;
                        if (!n4Var2.b) {
                            n4Var2.b = true;
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            break;
                        }
                        break;
                    default:
                        r4 r4Var = this.b;
                        b5 b5Var4 = r4Var.y;
                        q4 q4Var = new q4(r4Var, r4Var.getContext(), b5Var4.s);
                        b5Var4.f = q4Var;
                        LinearLayout linearLayout3 = r4Var.a;
                        int L = (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f);
                        q4Var.a = true;
                        ((org.telegram.ui.ActionBar.g1) q4Var.b).showAsDropDown(linearLayout3, 0, L);
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
