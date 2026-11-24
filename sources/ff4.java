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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ff4 extends FrameLayout implements tjb {
    public ValueAnimator E;
    public boolean F;
    public final lm G;
    public final Paint H;
    public final /* synthetic */ FiltersSetupActivity I;
    public final jia a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final ef4 n;
    public boolean r;
    public final r86 s;
    public boolean w;
    public float x;
    public t97 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff4(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        wjb wjbVar;
        this.I = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.G = new lm(this, 0L, 420L, s33.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i = bkb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i, null, mode);
        imageView.setContentDescription(k96.M0(2131750693, null));
        imageView.setClickable(true);
        addView(imageView, nme.d(48, 48.0f, (k96.a0 ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, nme.d(20, 20.0f, (k96.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(16);
        jiaVar.setMaxLines(1);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        zkb.x(this, drawable, i, null, mode);
        jiaVar.i(drawable);
        int i2 = bkb.Ei;
        wjbVar = ((d) filtersSetupActivity).resourceProvider;
        jiaVar.setEmojiColor(bkb.v0(i2, wjbVar));
        boolean z = k96.a0;
        addView(jiaVar, nme.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 80.0f : 64.0f, 10.0f, z ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.y6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(k96.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z2 = k96.a0;
        addView(textView, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 80.0f : 64.0f, 35.0f, z2 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        r86 r86Var = new r86();
        this.s = r86Var;
        r86Var.D = true;
        r86Var.t = 2.0f;
        int i3 = bkb.h6;
        int w0 = bkb.w0(null, i3, false);
        r86Var.g(bkb.p1(0.4f, w0), bkb.p1(1.0f, w0), bkb.p1(0.9f, w0), bkb.p1(1.7f, w0));
        int L = gl.L(1.0f);
        r86Var.x.setStrokeWidth(L);
        r86Var.j(40.0f);
        ef4 ef4Var = new ef4(this, context, L, (byte) 0);
        this.n = ef4Var;
        r86Var.setCallback(ef4Var);
        ef4Var.setFocusable(false);
        ef4Var.setScaleType(scaleType);
        ff0 f0 = bkb.f0(w0, 1, -1);
        vkb M = zkb.M(i3);
        ef4Var.setBackground(f0);
        zkb.j(ef4Var, f0, null, M, null);
        zkb.s(ef4Var, i, null, mode);
        ef4Var.setContentDescription(k96.M0(2131750692, null));
        ef4Var.setVisibility(8);
        ef4Var.setImageResource(R.drawable.msg_link_folder);
        zkb.s(ef4Var, i, null, mode);
        boolean z3 = k96.a0;
        addView(ef4Var, nme.d(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 52.0f : 6.0f, 0.0f, z3 ? 6.0f : 52.0f, 0.0f));
        ef4Var.setOnClickListener(new yj3(this, (byte) 14));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        ff0 f02 = bkb.f0(bkb.w0(null, i3, false), 1, -1);
        vkb M2 = zkb.M(i3);
        imageView2.setBackground(f02);
        zkb.j(imageView2, f02, null, M2, null);
        zkb.s(imageView2, i, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(k96.M0(2131754838, null));
        addView(imageView2, nme.d(40, 40.0f, (k96.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public t97 getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.G.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.G.d(this.F);
        if (d > 0.0f) {
            int w0 = bkb.w0(null, bkb.c6, false);
            Paint paint = this.H;
            paint.setColor(w0);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(gl.L(12.0f) * d, 0.0f, gl.L(3.0f), bkb.p1(d, 301989888));
            float L = gl.L(8.0f) * d;
            float L2 = gl.L(12.0f) * d;
            canvas.drawRoundRect(L, 0.0f, getWidth() - L, getHeight(), L2, L2, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = bkb.j0.getAlpha();
            bkb.j0.setAlpha((int) ((1.0f - d) * alpha));
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(62.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
            bkb.j0.setAlpha(alpha);
        }
        t97 t97Var = this.y;
        if (t97Var != null) {
            boolean z = t97Var.p;
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
        jia jiaVar = this.a;
        jiaVar.setRightDrawableScale(i);
        jiaVar.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
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

    @Override // tjb
    public final void updateColors() {
        wjb wjbVar;
        try {
            jia jiaVar = this.a;
            if (jiaVar != null) {
                int i = bkb.Ei;
                wjbVar = ((d) this.I).resourceProvider;
                jiaVar.setEmojiColor(bkb.v0(i, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
