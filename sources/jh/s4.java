package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.el0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
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
    public final el0 v;
    public ValueAnimator w;
    public final /* synthetic */ c5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(c5 c5Var, Context context) {
        super(context);
        this.x = c5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        b bVar = c5Var.s;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        el0 el0Var = new el0(getContext());
        this.v = el0Var;
        el0Var.r = true;
        el0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(el0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, h7.z5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, h7.z5.n(16, 26));
        addView(linearLayout, h7.z5.c(-2.0f, -2));
        addView(linearLayout2, h7.z5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: jh.p4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c5 c5Var2 = this.b.x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.b) {
                            o4Var.b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.b.x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.b) {
                            o4Var2.b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.b;
                        c5 c5Var4 = s4Var.x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.s);
                        c5Var4.f = r4Var;
                        LinearLayout linearLayout3 = s4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        r4Var.b = true;
                        r4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: jh.p4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c5 c5Var2 = this.b.x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.b) {
                            o4Var.b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.b.x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.b) {
                            o4Var2.b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.b;
                        c5 c5Var4 = s4Var.x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.s);
                        c5Var4.f = r4Var;
                        LinearLayout linearLayout3 = s4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        r4Var.b = true;
                        r4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: jh.p4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        c5 c5Var2 = this.b.x;
                        o4 o4Var = c5Var2.K;
                        if (o4Var.b) {
                            o4Var.b = false;
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            break;
                        }
                        break;
                    case 1:
                        c5 c5Var3 = this.b.x;
                        o4 o4Var2 = c5Var3.K;
                        if (!o4Var2.b) {
                            o4Var2.b = true;
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            break;
                        }
                        break;
                    default:
                        s4 s4Var = this.b;
                        c5 c5Var4 = s4Var.x;
                        r4 r4Var = new r4(s4Var, s4Var.getContext(), c5Var4.s);
                        c5Var4.f = r4Var;
                        LinearLayout linearLayout3 = s4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        r4Var.b = true;
                        r4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.x.P) {
            int i10 = this.s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 0.5f;
                f11 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f10 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.n;
            rectF.set(rect);
            float f12 = this.r;
            if (f12 != 1.0f) {
                f11 = AndroidUtilities.lerp(this.f, f11, f12);
                f10 = AndroidUtilities.lerp(this.h, f10, this.r);
                AndroidUtilities.lerp(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f11);
            textView.setAlpha(f10);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
