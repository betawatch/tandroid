package di;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.vm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i5 extends FrameLayout {
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
    public final /* synthetic */ t5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(t5 t5Var, Context context) {
        super(context);
        this.x = t5Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = new RectF();
        this.n = new RectF();
        this.r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        b bVar = t5Var.s;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        org.telegram.ui.ActionBar.f7.V(textView2, i11, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, kb1.x(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, kb1.x(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.y6.w0(i10, bVar));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        linearLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(linearLayout2, c02, N, null, bVar);
        linearLayout2.setOrientation(0);
        vm0 vm0Var = new vm0(getContext());
        this.v = vm0Var;
        vm0Var.r = true;
        vm0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(vm0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, kb1.r(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, kb1.r(16, 26));
        addView(linearLayout, kb1.g(-2.0f, -2));
        addView(linearLayout2, kb1.h(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: di.f5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        t5 t5Var2 = this.b.x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.b) {
                            e5Var.b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = this.b.x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.b) {
                            e5Var2.b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            break;
                        }
                        break;
                    default:
                        i5 i5Var = this.b;
                        t5 t5Var4 = i5Var.x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.s);
                        t5Var4.f = h5Var;
                        LinearLayout linearLayout3 = i5Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        h5Var.b = true;
                        h5Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i13 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: di.f5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        t5 t5Var2 = this.b.x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.b) {
                            e5Var.b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = this.b.x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.b) {
                            e5Var2.b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            break;
                        }
                        break;
                    default:
                        i5 i5Var = this.b;
                        t5 t5Var4 = i5Var.x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.s);
                        t5Var4.f = h5Var;
                        LinearLayout linearLayout3 = i5Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        h5Var.b = true;
                        h5Var.a.showAsDropDown(linearLayout3, 0, dp);
                        break;
                }
            }
        });
        final int i14 = 2;
        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: di.f5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        t5 t5Var2 = this.b.x;
                        e5 e5Var = t5Var2.O;
                        if (e5Var.b) {
                            e5Var.b = false;
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            break;
                        }
                        break;
                    case 1:
                        t5 t5Var3 = this.b.x;
                        e5 e5Var2 = t5Var3.O;
                        if (!e5Var2.b) {
                            e5Var2.b = true;
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            break;
                        }
                        break;
                    default:
                        i5 i5Var = this.b;
                        t5 t5Var4 = i5Var.x;
                        h5 h5Var = new h5(i5Var, i5Var.getContext(), t5Var4.s);
                        t5Var4.f = h5Var;
                        LinearLayout linearLayout3 = i5Var.a;
                        int dp = (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f);
                        h5Var.b = true;
                        h5Var.a.showAsDropDown(linearLayout3, 0, dp);
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
