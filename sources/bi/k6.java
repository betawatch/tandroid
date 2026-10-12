package bi;

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
import org.telegram.ui.Components.rm0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class k6 extends FrameLayout {
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
    public final rm0 v;
    public ValueAnimator w;
    public final /* synthetic */ w6 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(w6 w6Var, Context context) {
        super(context);
        this.x = w6Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        b bVar = w6Var.s;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.g6.w0(i10, bVar)));
        linearLayout2.setOrientation(0);
        rm0 rm0Var = new rm0(getContext());
        this.v = rm0Var;
        rm0Var.r = true;
        rm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(rm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.a6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.a6.n(16, 26));
        addView(linearLayout, w7.a6.d(-2.0f, -2));
        addView(linearLayout2, w7.a6.a(-2.0f, 13.0f, 6.0f, 13.0f, 6.0f, -2, 5));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.h6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        w6 w6Var2 = this.b.x;
                        g6 g6Var = w6Var2.O;
                        if (g6Var.b) {
                            g6Var.b = false;
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            break;
                        }
                        break;
                    case 1:
                        w6 w6Var3 = this.b.x;
                        g6 g6Var2 = w6Var3.O;
                        if (!g6Var2.b) {
                            g6Var2.b = true;
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            break;
                        }
                        break;
                    default:
                        k6 k6Var = this.b;
                        w6 w6Var4 = k6Var.x;
                        j6 j6Var = new j6(k6Var, k6Var.getContext(), w6Var4.s);
                        w6Var4.f = j6Var;
                        LinearLayout linearLayout3 = k6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        j6Var.b = true;
                        j6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.h6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        w6 w6Var2 = this.b.x;
                        g6 g6Var = w6Var2.O;
                        if (g6Var.b) {
                            g6Var.b = false;
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            break;
                        }
                        break;
                    case 1:
                        w6 w6Var3 = this.b.x;
                        g6 g6Var2 = w6Var3.O;
                        if (!g6Var2.b) {
                            g6Var2.b = true;
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            break;
                        }
                        break;
                    default:
                        k6 k6Var = this.b;
                        w6 w6Var4 = k6Var.x;
                        j6 j6Var = new j6(k6Var, k6Var.getContext(), w6Var4.s);
                        w6Var4.f = j6Var;
                        LinearLayout linearLayout3 = k6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        j6Var.b = true;
                        j6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.h6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        w6 w6Var2 = this.b.x;
                        g6 g6Var = w6Var2.O;
                        if (g6Var.b) {
                            g6Var.b = false;
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            break;
                        }
                        break;
                    case 1:
                        w6 w6Var3 = this.b.x;
                        g6 g6Var2 = w6Var3.O;
                        if (!g6Var2.b) {
                            g6Var2.b = true;
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            break;
                        }
                        break;
                    default:
                        k6 k6Var = this.b;
                        w6 w6Var4 = k6Var.x;
                        j6 j6Var = new j6(k6Var, k6Var.getContext(), w6Var4.s);
                        w6Var4.f = j6Var;
                        LinearLayout linearLayout3 = k6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        j6Var.b = true;
                        j6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.x.T) {
            int i10 = this.s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.n;
            rectF.set(rect);
            float f11 = this.r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.r);
                AndroidUtilities.lerp(this.e, rectF, this.r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.b);
        }
        super.dispatchDraw(canvas);
    }
}
