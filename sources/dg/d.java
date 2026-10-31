package dg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class d extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public final Drawable h;
    public final int n;
    public final p6 r;

    public d(Context context, p6 p6Var) {
        super(context);
        this.e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.r = p6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(i0.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.n = measureText;
        TextView textView = new TextView(context);
        this.a = textView;
        sc.e.t(textView, 1, 15.0f);
        addView(textView, b6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, b6.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(i0.o());
        textView3.setGravity(8388629);
        addView(textView3, b6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(i0.o());
        textView4.setGravity(8388629);
        addView(textView4, b6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(cd.L0(2131742812, null));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(i0.L(4.0f));
        textView2.setPadding(i0.L(8.0f), i0.L(4.0f), i0.L(8.0f), i0.L(4.0f));
        textView2.setBackground(t6.J0(i0.L(3.0f), t6.w0(t6.Fi, p6Var)));
        textView4.addOnLayoutChangeListener(new c(this, 0));
        a();
    }

    public final void a() {
        int i10 = t6.j5;
        TextView textView = this.a;
        p6 p6Var = this.r;
        a7.V(textView, i10, p6Var);
        a7.V(this.b, i10, p6Var);
        a7.V(this.c, i10, p6Var);
        int i11 = t6.Tj;
        a7.V(this.d, i11, p6Var);
        a7.y(this, this.h, i11, p6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j10, long j11) {
        String format;
        boolean z10 = this.e;
        TextView textView = this.b;
        if (!z10) {
            textView.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        if (this.f) {
            j11 += 604800000;
        }
        if (j11 - j10 >= 86400000) {
            format = cd.D0().B0().format(new Date(j10)) + " — " + cd.D0().B0().format(new Date(j11));
        } else {
            format = cd.D0().B0().format(new Date(j10));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z10) {
        this.e = z10;
        TextView textView = this.a;
        if (z10) {
            textView.setLayoutParams(b6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.n, 0.0f));
            return;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(8);
        textView.setLayoutParams(b6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
        textView.requestLayout();
    }

    public final void d(long j10, boolean z10) {
        b(j10, j10);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.a;
        if (!z10) {
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            textView.setScaleX(1.0f);
            textView.setScaleY(1.0f);
            textView2.setAlpha(0.0f);
            return;
        }
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        textView.setPivotX(0.0f);
        textView.setPivotY(i0.L(40.0f));
        textView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
        textView2.setAlpha(1.0f);
        textView2.setTranslationX(0.0f);
        textView2.setTranslationY(0.0f);
        textView2.setScaleX(1.0f);
        textView2.setScaleY(1.0f);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
    }

    public void setTitle(String str) {
        this.a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f = z10;
    }
}
