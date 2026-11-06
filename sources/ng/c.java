package ng;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import fi.n3;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class c extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public boolean f;
    public final Drawable h;
    public final int n;
    public final f6 r;

    public c(Context context, f6 f6Var) {
        super(context);
        this.e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.r = f6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(g0.o());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.n = measureText;
        TextView textView = new TextView(context);
        this.a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        addView(textView, ha.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, ha.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(g0.o());
        textView3.setGravity(8388629);
        addView(textView3, ha.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(g0.o());
        textView4.setGravity(8388629);
        addView(textView4, ha.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(hd.M0(2131742788, null));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(g0.L(4.0f));
        textView2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), g0.L(4.0f));
        textView2.setBackground(k6.J0(g0.L(3.0f), k6.w0(k6.Fi, f6Var)));
        textView4.addOnLayoutChangeListener(new n3(this, 1));
        a();
    }

    public final void a() {
        int i7 = k6.j5;
        TextView textView = this.a;
        f6 f6Var = this.r;
        r6.V(textView, i7, f6Var);
        r6.V(this.b, i7, f6Var);
        r6.V(this.c, i7, f6Var);
        int i10 = k6.Tj;
        r6.V(this.d, i10, f6Var);
        r6.y(this, this.h, i10, f6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j3, long j10) {
        String format;
        boolean z9 = this.e;
        TextView textView = this.b;
        if (!z9) {
            textView.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        if (this.f) {
            j10 += 604800000;
        }
        if (j10 - j3 >= 86400000) {
            format = hd.E0().C0().format(new Date(j3)) + " — " + hd.E0().C0().format(new Date(j10));
        } else {
            format = hd.E0().C0().format(new Date(j3));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z9) {
        this.e = z9;
        TextView textView = this.a;
        if (z9) {
            textView.setLayoutParams(ha.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.n, 0.0f));
            return;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(8);
        textView.setLayoutParams(ha.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
        textView.requestLayout();
    }

    public final void d(long j3, boolean z9) {
        b(j3, j3);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.a;
        if (!z9) {
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
        textView.setPivotY(g0.L(40.0f));
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

    public void setUseWeekInterval(boolean z9) {
        this.f = z9;
    }
}
