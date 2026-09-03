package oh;

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
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u4 extends FrameLayout {
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
    public final yl0 v;
    public ValueAnimator w;
    public final /* synthetic */ e5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(e5 e5Var, Context context) {
        super(context);
        this.x = e5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        b bVar = e5Var.s;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, k7.c6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.k6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        yl0 yl0Var = new yl0(getContext());
        this.v = yl0Var;
        yl0Var.r = true;
        yl0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(yl0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, k7.c6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, k7.c6.n(16, 26));
        addView(linearLayout, k7.c6.c(-2.0f, -2));
        addView(linearLayout2, k7.c6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: oh.r4
            public final /* synthetic */ u4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        e5 e5Var2 = this.b.x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.b) {
                            q4Var.b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            break;
                        }
                        break;
                    case 1:
                        e5 e5Var3 = this.b.x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.b) {
                            q4Var2.b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            break;
                        }
                        break;
                    default:
                        u4 u4Var = this.b;
                        e5 e5Var4 = u4Var.x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.s);
                        e5Var4.f = t4Var;
                        LinearLayout linearLayout3 = u4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        t4Var.b = true;
                        t4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: oh.r4
            public final /* synthetic */ u4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        e5 e5Var2 = this.b.x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.b) {
                            q4Var.b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            break;
                        }
                        break;
                    case 1:
                        e5 e5Var3 = this.b.x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.b) {
                            q4Var2.b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            break;
                        }
                        break;
                    default:
                        u4 u4Var = this.b;
                        e5 e5Var4 = u4Var.x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.s);
                        e5Var4.f = t4Var;
                        LinearLayout linearLayout3 = u4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        t4Var.b = true;
                        t4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: oh.r4
            public final /* synthetic */ u4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        e5 e5Var2 = this.b.x;
                        q4 q4Var = e5Var2.L;
                        if (q4Var.b) {
                            q4Var.b = false;
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            break;
                        }
                        break;
                    case 1:
                        e5 e5Var3 = this.b.x;
                        q4 q4Var2 = e5Var3.L;
                        if (!q4Var2.b) {
                            q4Var2.b = true;
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            break;
                        }
                        break;
                    default:
                        u4 u4Var = this.b;
                        e5 e5Var4 = u4Var.x;
                        t4 t4Var = new t4(u4Var, u4Var.getContext(), e5Var4.s);
                        e5Var4.f = t4Var;
                        LinearLayout linearLayout3 = u4Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        t4Var.b = true;
                        t4Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.x.Q) {
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
