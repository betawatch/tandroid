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
import org.telegram.ui.Components.vm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class z6 extends FrameLayout {
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
    public final vm0 v;
    public ValueAnimator w;
    public final /* synthetic */ l7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(l7 l7Var, Context context) {
        super(context);
        this.x = l7Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.i6.i6;
        d dVar = l7Var.s;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i10, dVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, dVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, dVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.i6.w0(i10, dVar)));
        linearLayout2.setOrientation(0);
        vm0 vm0Var = new vm0(getContext());
        this.v = vm0Var;
        vm0Var.r = true;
        vm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(vm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.x5.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.x5.n(16, 26));
        addView(linearLayout, w7.x5.d(-2.0f, -2));
        addView(linearLayout2, w7.x5.a(-2.0f, 13.0f, 6.0f, 13.0f, 6.0f, -2, 5));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ai.w6
            public final /* synthetic */ z6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        l7 l7Var2 = this.b.x;
                        v6 v6Var = l7Var2.O;
                        if (v6Var.b) {
                            v6Var.b = false;
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            break;
                        }
                        break;
                    case 1:
                        l7 l7Var3 = this.b.x;
                        v6 v6Var2 = l7Var3.O;
                        if (!v6Var2.b) {
                            v6Var2.b = true;
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            break;
                        }
                        break;
                    default:
                        z6 z6Var = this.b;
                        l7 l7Var4 = z6Var.x;
                        y6 y6Var = new y6(z6Var, z6Var.getContext(), l7Var4.s);
                        l7Var4.f = y6Var;
                        LinearLayout linearLayout3 = z6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        y6Var.b = true;
                        y6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.w6
            public final /* synthetic */ z6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        l7 l7Var2 = this.b.x;
                        v6 v6Var = l7Var2.O;
                        if (v6Var.b) {
                            v6Var.b = false;
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            break;
                        }
                        break;
                    case 1:
                        l7 l7Var3 = this.b.x;
                        v6 v6Var2 = l7Var3.O;
                        if (!v6Var2.b) {
                            v6Var2.b = true;
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            break;
                        }
                        break;
                    default:
                        z6 z6Var = this.b;
                        l7 l7Var4 = z6Var.x;
                        y6 y6Var = new y6(z6Var, z6Var.getContext(), l7Var4.s);
                        l7Var4.f = y6Var;
                        LinearLayout linearLayout3 = z6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        y6Var.b = true;
                        y6Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.w6
            public final /* synthetic */ z6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        l7 l7Var2 = this.b.x;
                        v6 v6Var = l7Var2.O;
                        if (v6Var.b) {
                            v6Var.b = false;
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            break;
                        }
                        break;
                    case 1:
                        l7 l7Var3 = this.b.x;
                        v6 v6Var2 = l7Var3.O;
                        if (!v6Var2.b) {
                            v6Var2.b = true;
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            break;
                        }
                        break;
                    default:
                        z6 z6Var = this.b;
                        l7 l7Var4 = z6Var.x;
                        y6 y6Var = new y6(z6Var, z6Var.getContext(), l7Var4.s);
                        l7Var4.f = y6Var;
                        LinearLayout linearLayout3 = z6Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        y6Var.b = true;
                        y6Var.a.showAsDropDown(linearLayout3, 0, dp);
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
