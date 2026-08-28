package ih;

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
import org.telegram.ui.Components.bl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w4 extends FrameLayout {
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
    public final bl0 v;
    public ValueAnimator w;
    public final /* synthetic */ g5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(g5 g5Var, Context context) {
        super(context);
        this.x = g5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i9 = org.telegram.ui.ActionBar.f6.i6;
        b bVar = g5Var.s;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.f6.v0(i9, bVar)));
        linearLayout2.setOrientation(0);
        bl0 bl0Var = new bl0(getContext());
        this.v = bl0Var;
        bl0Var.r = true;
        bl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(bl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, g7.e6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, g7.e6.n(16, 26));
        addView(linearLayout, g7.e6.c(-2.0f, -2));
        addView(linearLayout2, g7.e6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ih.t4
            public final /* synthetic */ w4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g5 g5Var2 = this.b.x;
                        s4 s4Var = g5Var2.K;
                        if (s4Var.b) {
                            s4Var.b = false;
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            break;
                        }
                        break;
                    case 1:
                        g5 g5Var3 = this.b.x;
                        s4 s4Var2 = g5Var3.K;
                        if (!s4Var2.b) {
                            s4Var2.b = true;
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            break;
                        }
                        break;
                    default:
                        w4 w4Var = this.b;
                        g5 g5Var4 = w4Var.x;
                        v4 v4Var = new v4(w4Var, w4Var.getContext(), g5Var4.s);
                        g5Var4.f = v4Var;
                        LinearLayout linearLayout3 = w4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        v4Var.b = true;
                        v4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: ih.t4
            public final /* synthetic */ w4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g5 g5Var2 = this.b.x;
                        s4 s4Var = g5Var2.K;
                        if (s4Var.b) {
                            s4Var.b = false;
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            break;
                        }
                        break;
                    case 1:
                        g5 g5Var3 = this.b.x;
                        s4 s4Var2 = g5Var3.K;
                        if (!s4Var2.b) {
                            s4Var2.b = true;
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            break;
                        }
                        break;
                    default:
                        w4 w4Var = this.b;
                        g5 g5Var4 = w4Var.x;
                        v4 v4Var = new v4(w4Var, w4Var.getContext(), g5Var4.s);
                        g5Var4.f = v4Var;
                        LinearLayout linearLayout3 = w4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        v4Var.b = true;
                        v4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ih.t4
            public final /* synthetic */ w4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g5 g5Var2 = this.b.x;
                        s4 s4Var = g5Var2.K;
                        if (s4Var.b) {
                            s4Var.b = false;
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            break;
                        }
                        break;
                    case 1:
                        g5 g5Var3 = this.b.x;
                        s4 s4Var2 = g5Var3.K;
                        if (!s4Var2.b) {
                            s4Var2.b = true;
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            break;
                        }
                        break;
                    default:
                        w4 w4Var = this.b;
                        g5 g5Var4 = w4Var.x;
                        v4 v4Var = new v4(w4Var, w4Var.getContext(), g5Var4.s);
                        g5Var4.f = v4Var;
                        LinearLayout linearLayout3 = w4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        v4Var.b = true;
                        v4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.x.P) {
            int i9 = this.s;
            TextView textView = this.d;
            float f11 = 0.5f;
            TextView textView2 = this.c;
            if (i9 == 0) {
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
