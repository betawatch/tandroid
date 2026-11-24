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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hh4 extends FrameLayout implements vlb {
    public ValueAnimator E;
    public boolean F;
    public final ln G;
    public final Paint H;
    public final /* synthetic */ FiltersSetupActivity I;
    public final lka a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final gh4 n;
    public boolean r;
    public final qa6 s;
    public boolean w;
    public float x;
    public ub7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh4(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        ylb ylbVar;
        this.I = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.G = new ln(this, 0L, 420L, d53.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i = cmb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i, null, mode);
        imageView.setContentDescription(jb6.M0(2131750642, null));
        imageView.setClickable(true);
        addView(imageView, qoe.d(48, 48.0f, (jb6.a0 ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, qoe.d(20, 20.0f, (jb6.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(16);
        lkaVar.setMaxLines(1);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        anb.x(this, drawable, i, null, mode);
        lkaVar.i(drawable);
        int i2 = cmb.Ei;
        ylbVar = ((d) filtersSetupActivity).resourceProvider;
        lkaVar.setEmojiColor(cmb.v0(i2, ylbVar));
        boolean z = jb6.a0;
        addView(lkaVar, qoe.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 80.0f : 64.0f, 10.0f, z ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.y6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(jb6.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = jb6.a0;
        addView(textView, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 80.0f : 64.0f, 35.0f, z2 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        qa6 qa6Var = new qa6();
        this.s = qa6Var;
        qa6Var.D = true;
        qa6Var.t = 2.0f;
        int i3 = cmb.h6;
        int w0 = cmb.w0(null, i3, false);
        qa6Var.g(cmb.p1(0.4f, w0), cmb.p1(1.0f, w0), cmb.p1(0.9f, w0), cmb.p1(1.7f, w0));
        int L = gm.L(1.0f);
        qa6Var.x.setStrokeWidth(L);
        qa6Var.j(40.0f);
        gh4 gh4Var = new gh4(this, context, L, (byte) 0);
        this.n = gh4Var;
        qa6Var.setCallback(gh4Var);
        gh4Var.setFocusable(false);
        gh4Var.setScaleType(scaleType);
        fg0 f0 = cmb.f0(w0, 1, -1);
        wmb M = anb.M(i3);
        gh4Var.setBackground(f0);
        anb.j(gh4Var, f0, null, M, null);
        anb.s(gh4Var, i, null, mode);
        gh4Var.setContentDescription(jb6.M0(2131750641, null));
        gh4Var.setVisibility(8);
        gh4Var.setImageResource(R.drawable.msg_link_folder);
        anb.s(gh4Var, i, null, mode);
        boolean z3 = jb6.a0;
        addView(gh4Var, qoe.d(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 52.0f : 6.0f, 0.0f, z3 ? 6.0f : 52.0f, 0.0f));
        gh4Var.setOnClickListener(new sf3(this, (byte) 17));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        fg0 f02 = cmb.f0(cmb.w0(null, i3, false), 1, -1);
        wmb M2 = anb.M(i3);
        imageView2.setBackground(f02);
        anb.j(imageView2, f02, null, M2, null);
        anb.s(imageView2, i, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(jb6.M0(2131754838, null));
        addView(imageView2, qoe.d(40, 40.0f, (jb6.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public ub7 getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.G.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.G.d(this.F);
        if (d > 0.0f) {
            int w0 = cmb.w0(null, cmb.c6, false);
            Paint paint = this.H;
            paint.setColor(w0);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(gm.L(12.0f) * d, 0.0f, gm.L(3.0f), cmb.p1(d, 301989888));
            float L = gm.L(8.0f) * d;
            float L2 = gm.L(12.0f) * d;
            canvas.drawRoundRect(L, 0.0f, getWidth() - L, getHeight(), L2, L2, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = cmb.j0.getAlpha();
            cmb.j0.setAlpha((int) ((1.0f - d) * alpha));
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(62.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
            cmb.j0.setAlpha(alpha);
        }
        ub7 ub7Var = this.y;
        if (ub7Var != null) {
            boolean z = ub7Var.p;
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
        lka lkaVar = this.a;
        lkaVar.setRightDrawableScale(i);
        lkaVar.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
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

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar;
        try {
            lka lkaVar = this.a;
            if (lkaVar != null) {
                int i = cmb.Ei;
                ylbVar = ((d) this.I).resourceProvider;
                lkaVar.setEmojiColor(cmb.v0(i, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
