// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class eh4 extends FrameLayout implements snb {
    public ValueAnimator E;
    public boolean F;
    public final mm G;
    public final Paint H;
    public final /* synthetic */ FiltersSetupActivity I;
    public final ema a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final dh4 n;
    public boolean r;
    public final va6 s;
    public boolean w;
    public float x;
    public ac7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh4(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        vnb vnbVar;
        this.I = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.G = new mm(this, 0L, 420L, k43.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i = aob.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i, null, mode);
        imageView.setContentDescription(ob6.M0(2131750670, null));
        imageView.setClickable(true);
        byte b = 16;
        addView(imageView, tre.d(48, 48.0f, (ob6.a0 ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, tre.d(20, 20.0f, (ob6.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(16);
        emaVar.setMaxLines(1);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        yob.x(this, drawable, i, null, mode);
        emaVar.i(drawable);
        int i2 = aob.Fi;
        vnbVar = ((e) filtersSetupActivity).resourceProvider;
        emaVar.setEmojiColor(aob.v0(i2, vnbVar));
        boolean z = ob6.a0;
        addView(emaVar, tre.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 80.0f : 64.0f, 10.0f, z ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.z6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(ob6.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = ob6.a0;
        addView(textView, tre.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 80.0f : 64.0f, 35.0f, z2 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        va6 va6Var = new va6();
        this.s = va6Var;
        va6Var.D = true;
        va6Var.t = 2.0f;
        int i3 = aob.i6;
        int w0 = aob.w0(null, i3, false);
        va6Var.g(aob.p1(0.4f, w0), aob.p1(1.0f, w0), aob.p1(0.9f, w0), aob.p1(1.7f, w0));
        int L = hl.L(1.0f);
        va6Var.x.setStrokeWidth(L);
        va6Var.j(40.0f);
        dh4 dh4Var = new dh4(this, context, L, (byte) 0);
        this.n = dh4Var;
        va6Var.setCallback(dh4Var);
        dh4Var.setFocusable(false);
        dh4Var.setScaleType(scaleType);
        hf0 f0 = aob.f0(w0, 1, -1);
        uob M = yob.M(i3);
        dh4Var.setBackground(f0);
        yob.j(dh4Var, f0, null, M, null);
        yob.s(dh4Var, i, null, mode);
        dh4Var.setContentDescription(ob6.M0(2131750669, null));
        dh4Var.setVisibility(8);
        dh4Var.setImageResource(R.drawable.msg_link_folder);
        yob.s(dh4Var, i, null, mode);
        boolean z3 = ob6.a0;
        addView(dh4Var, tre.d(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 52.0f : 6.0f, 0.0f, z3 ? 6.0f : 52.0f, 0.0f));
        dh4Var.setOnClickListener(new mh3(this, b));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        hf0 f02 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M2 = yob.M(i3);
        imageView2.setBackground(f02);
        yob.j(imageView2, f02, null, M2, null);
        yob.s(imageView2, i, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(ob6.M0(2131754834, null));
        addView(imageView2, tre.d(40, 40.0f, (ob6.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public ac7 getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.G.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.G.d(this.F);
        if (d > 0.0f) {
            int w0 = aob.w0(null, aob.d6, false);
            Paint paint = this.H;
            paint.setColor(w0);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(hl.L(12.0f) * d, 0.0f, hl.L(3.0f), aob.p1(d, 301989888));
            float L = hl.L(8.0f) * d;
            float L2 = hl.L(12.0f) * d;
            canvas.drawRoundRect(L, 0.0f, getWidth() - L, getHeight(), L2, L2, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = aob.j0.getAlpha();
            aob.j0.setAlpha((int) ((1.0f - d) * alpha));
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(62.0f) : 0), getMeasuredHeight() - 1, aob.j0);
            aob.j0.setAlpha(alpha);
        }
        ac7 ac7Var = this.y;
        if (ac7Var != null) {
            boolean z = ac7Var.p;
            float f = this.x;
            if (z) {
                if (f != 1.0f) {
                    this.x = f + 0.10666667f;
                    invalidate();
                }
            } else if (f != 0.0f) {
                this.x = f - 0.10666667f;
                invalidate();
            }
        }
        float i = Utilities.i(this.x, 1.0f, 0.0f);
        this.x = i;
        ema emaVar = this.a;
        emaVar.setRightDrawableScale(i);
        emaVar.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    public void setDragging(boolean z) {
        if (this.F == z) {
            return;
        }
        this.F = z;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    @Override // snb
    public final void updateColors() {
        vnb vnbVar;
        try {
            ema emaVar = this.a;
            if (emaVar != null) {
                int i = aob.Fi;
                vnbVar = ((e) this.I).resourceProvider;
                emaVar.setEmojiColor(aob.v0(i, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
