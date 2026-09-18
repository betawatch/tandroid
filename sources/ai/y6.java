package ai;

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
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class y6 extends FrameLayout {
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
    public final rl0 v;
    public ValueAnimator w;
    public final /* synthetic */ j7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(j7 j7Var, Context context) {
        super(context);
        this.x = j7Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        d dVar = j7Var.s;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, dVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, dVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, dVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.v0(i10, dVar)));
        linearLayout2.setOrientation(0);
        rl0 rl0Var = new rl0(getContext());
        this.v = rl0Var;
        rl0Var.r = true;
        rl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(rl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.x5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.x5.n(16, 26));
        addView(linearLayout, w7.x5.c(-2.0f, -2));
        addView(linearLayout2, w7.x5.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ai.v6
            public final /* synthetic */ y6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        j7 j7Var2 = this.b.x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.b) {
                            u6Var.b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            break;
                        }
                        break;
                    case 1:
                        j7 j7Var3 = this.b.x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.b) {
                            u6Var2.b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            break;
                        }
                        break;
                    default:
                        y6 y6Var = this.b;
                        j7 j7Var4 = y6Var.x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.s);
                        j7Var4.f = x6Var;
                        LinearLayout linearLayout3 = y6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        x6Var.b = true;
                        x6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.v6
            public final /* synthetic */ y6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        j7 j7Var2 = this.b.x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.b) {
                            u6Var.b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            break;
                        }
                        break;
                    case 1:
                        j7 j7Var3 = this.b.x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.b) {
                            u6Var2.b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            break;
                        }
                        break;
                    default:
                        y6 y6Var = this.b;
                        j7 j7Var4 = y6Var.x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.s);
                        j7Var4.f = x6Var;
                        LinearLayout linearLayout3 = y6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        x6Var.b = true;
                        x6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.v6
            public final /* synthetic */ y6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        j7 j7Var2 = this.b.x;
                        u6 u6Var = j7Var2.O;
                        if (u6Var.b) {
                            u6Var.b = false;
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            break;
                        }
                        break;
                    case 1:
                        j7 j7Var3 = this.b.x;
                        u6 u6Var2 = j7Var3.O;
                        if (!u6Var2.b) {
                            u6Var2.b = true;
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            break;
                        }
                        break;
                    default:
                        y6 y6Var = this.b;
                        j7 j7Var4 = y6Var.x;
                        x6 x6Var = new x6(y6Var, y6Var.getContext(), j7Var4.s);
                        j7Var4.f = x6Var;
                        LinearLayout linearLayout3 = y6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        x6Var.b = true;
                        x6Var.a.showAsDropDown(linearLayout3, 0, dp);
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
